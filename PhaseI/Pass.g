grammar Pass;
options {
  output=AST;
}
tokens {
  DEDENT;
  INDENT;
}

@lexer::members {
  int DENT_SIZE = 2;

  int indentLevel = 0;
  java.util.Queue<Token> tokens = new java.util.LinkedList<Token>();
  
  java.util.Stack<String> parensAndIndents = new java.util.Stack<String>();
  
  boolean lineTerminatedEOF = false;

  // Note that this will occur at the end of each production if it is not
  // called explicitly.
  @Override
  public void emit(Token t) {   
  
    // Dedent when we hit a close paren to where we were when we opened it.
    String text = t.getText();
    if (text.equals("INDENT") || text.equals("("))
      parensAndIndents.push(text);
    else if (t.getText().equals(")")) {
      while (!(parensAndIndents.isEmpty() || parensAndIndents.pop().equals("("))) {
        tokens.offer(new CommonToken(LT, "LT"));
        tokens.offer(new CommonToken(DEDENT, "DEDENT"));
        indentLevel--;
      }
    }
     
    state.token = t;
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    super.nextToken();
    
    if (tokens.isEmpty()) { // Clean up and return EOF
      
      if (indentLevel != 0) {
        emit(new CommonToken(LT, "LT"));
        reindent(0);
      }

      if (!lineTerminatedEOF) {
        emit(new CommonToken(LT, "LT"));
        lineTerminatedEOF = true;
      }

      if (tokens.isEmpty()) // Still empty
        return Token.EOF_TOKEN;
    }

    return tokens.poll();
  }
  
  
  // This is rediculous but for some reason the modulo operator isn't working here.
  int mod(int a, int b) {
   while (a >= b)
      a -= b;
    return (a > 0)? a : 0;
  }

  void reindent(int spaces) {
    if (mod(spaces, DENT_SIZE) != 0) {
      System.out.println("Odd indentation (" + spaces + " spaces).");
      // TODO: report an error... sloppy indentation
    }
    
    int indents = spaces / DENT_SIZE;
      if ((indents - indentLevel) > 1) {
        System.out.println("too many indents");
        // TODO: report an error... too many indents
      }

    if (indents > indentLevel)
      for (int i = 0; i < (indents - indentLevel); i++)
        emit(new CommonToken(INDENT, "INDENT"));              
    else if (indents < indentLevel)
      for (int i = 0; i < (indentLevel - indents); i++) {
        emit(new CommonToken(DEDENT, "DEDENT"));
        emit(new CommonToken(LT, "LT"));
      }
    else
      skip();
      
    indentLevel = indents;
  }
}

prog:   block? EOF
    ;

block
    :   stmt+ LT*
    ;
    
stmt:   expr (LT|EOF)
    |   control
    ;   
    
iblock
    :   INDENT block DEDENT
    ;

args:   '(' (argument (',' argument)*)? (LT+)?')'
    ;
    
func:   args '~' (expr|LT iblock)
    ;

expr:   (ID access* ('='|ARITH_ASSIGN))=> ID access* assign
    |   short_stmt
    |   bool
    ;

short_stmt
    :   return_stmt
    |   break_stmt
    ;
    
break_stmt
    :   'break'
    ;

return_stmt
    :   'return' argument
    ;

bool:   (args '~')=> func
    |   logic (CMP logic)*
    ;

logic
    :   eval (BOP eval)*
    ;

eval:   term (('+'|'-') term)*
    ;

term:   factor (('*'|'/'|'%') factor)*
    ;

factor
    :   modable mod*
    |   atom
    ;

access
    :   '[' NUMBER ']'
    |   '.' ID
    ;

mod :   args
    |   access
    ;
    
modable
    :   ID
    |   '(' bool ')'
    ;

atom:   NUMBER
    |   STRING
    ;

control
    :   'for' ID 'in' ID mod? LT iblock LT
    |   'while' bool LT iblock LT
    |   'if' bool LT iblock LT (else_test LT)?
    ;

/** dangling else solution **/
else_test
    :   'else' else_p
    ;

else_p
    :   'if' bool (return_stmt LT|LT iblock) else_test
    |    (return_stmt LT|LT iblock)
    ;
    
assign
    :   '=' (expr|dictionary_definition|array_definition)
    |   ARITH_ASSIGN bool
    ;

dictionary_definition
    :   '{' (dictionary_entry (',' dictionary_entry)*)? '}'
    ;

dictionary_entry
    :   ID ':' atom 
    ;
    
array_definition
    :   '[' (argument (',' argument)*)? ']'
    ;
    
argument
    :   LT? bool
    ;

LT  :   ('\n'|'r\n')+
    ;

INDENT
    :   
       {getCharPositionInLine()==0}?=>
        (' ')+
        {
          reindent(getText().length());
          skip();
        }
    ;

DEDENT
    :   LT
        {getCharStream().mark();}
        (~' ')
        {
          emit(new CommonToken(LT, "LT"));
          reindent(0);
          getCharStream().rewind();
        }
    ;

ARITH_ASSIGN
    :   '+='|'-='|'*='|'/='|'%='
    ;

// Comparator
CMP :   '<'|'>'|'=='|'>='|'<='|'<>'|'!='
    ;
    
// Boolean operation
BOP :   '||'|'&&'
    ;

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

NUMBER
    :   '-'?('0'..'9')+
    |   '-'?('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '-'?'.' ('0'..'9')+ EXPONENT?
    |   '-'?('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
    
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
EXPONENT
    :   ('e'|'E') ('+'|'-')? ('0'..'9')+
    ;

fragment
HEX_DIGIT
    :   ('0'..'9'|'a'..'f'|'A'..'F')
    ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
