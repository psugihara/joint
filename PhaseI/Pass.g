grammar Pass;

tokens {
  DEDENT;
  INDENT;
}

@lexer::members {
  int indentLevel = 0;
  int DENT_SIZE = 2;

  boolean EOFTerminated = false; // Have we placed a terminal character at the EOL?

  java.util.Queue<Token> tokens = new java.util.LinkedList<Token>();

  // Note that this will occur at the end of each production if it is not
  // called explicitly.
  @Override
  public void emit(Token t) {
    state.token = t;
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    super.nextToken();
    
    if (tokens.isEmpty()) { // Clean up and return EOF

      
      if (indentLevel != 0) {
        indentLevel--;
        return new CommonToken(DEDENT, "DEDENT");
      }
      
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
    System.out.println("reindent()");
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
      for (int i = 0; i < (indentLevel - indents); i++)
        emit(new CommonToken(DEDENT, "DEDENT"));
    else
      skip();
    
    indentLevel = indents;
  }
}

prog:   block EOF
    ;

block
    :   (stmt|LT)+
    ;
    
stmt:   expr (LT|EOF)
    |   control
    ;   
    
iblock
    :   INDENT block DEDENT
    ;

args:   '(' (argument (',' argument)*)? ')'
    ;
    
func:   args '~' (expr|(LT iblock))
    ;         

expr:   (ID access? ('='|ARITH_ASSIGN)) => ID access? assign
    |   (args '~')=>  func
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

bool:   logic (CMP logic)*
    ;

logic
    :   eval (BOP eval)*
    ;

eval:   term (('+'|'-') term)*
    ;
 
term:   factor (('*'|'/'|'%') factor)*
    ;
 
factor
    :   '(' factor_p
    |    value
    ;

/** factor_p tests whether an open parenthesis is either a lambda expression or a regular parenthesized statement**/
factor_p
    :   (args '~')=>  func ')'args
    |   bool ')'
    ;   
    
access
    :   '[' NUMBER ']'
    |   '.' ID
    ;

value
    :   atom
    |   ID mod*
    ;

mod :   (args)=> args
    |   access
    ;

atom:   NUMBER
    |   STRING
    ;

control
    :   'for' ID 'in' ID mod? LT iblock
    |   'while' bool LT iblock
    |   'if' bool (return_stmt LT|LT iblock) else_test
    ;

/** dangling else solution **/
else_test
    :    'else' else_p
    |
    ;

else_p
    :    'if' bool (return_stmt LT|LT iblock) else_test
    |    (return_stmt LT|LT iblock)
    ;
    
assign
    :   '=' (argument|dictionary_definition|array_definition)
    |   ARITH_ASSIGN bool
    ;

dictionary_definition
    :   '{' (dictionary_entry (',' dictionary_entry)*)? '}'
    ;

dictionary_entry
    :   ID':'atom 
    ;
    
array_definition
    :   '[' (argument (',' argument)*)? ']'
    ;
    
argument
    :   (args '~')=> func
    |   ('(' args '~')=> '(' func ')'args
    |   bool
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
    :   '\n'
        {getCharStream().mark();}
        (~' ')
        { 
          emit(new CommonToken(LT, "\n"));
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

// Line termination.
LT  :   ('\n'|'\r\n')+
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
