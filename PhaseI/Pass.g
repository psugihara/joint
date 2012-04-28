//todo make RETURN AND GENERIC_OP custom nodes
grammar Pass;
options {
  output=AST;
}
tokens {
  DEDENT;
  INDENT;
  GEN_OP;
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
    else if (t.getText().equals("DEDENT"))
          parensAndIndents.pop();
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

prog:   block EOF -> ^(PROG block)
    ;

block
    :   LT* stmt*
    ;
    
stmt:   expr (LT!+|EOF)
    |   control LT+
    ;   
    
iblock
    :   INDENT block DEDENT -> ^(IBLOCK block)
    ;

args:   '(' (argument (',' argument)*)? (LT+)?')' -> ^(ARGUMENTS argument*)
    ;
    
func:   args '~' (expr -> ^(FUNCTION args expr)
				 |LT iblock -> ^(FUNCTION args iblock)
				 )
    ;

expr:   (ID access* ('='|ARITH_ASSIGN))=> ID access* assign -> ^(ASSIGNMENT ^(ID access*) assign)
    |   short_stmt
    |   bool
    ;

short_stmt
    :   return_stmt
    |   break_stmt
    ;
    
break_stmt
    :   'break' -> ^(BREAK)
    ;

return_stmt
    :   'return' argument -> ^(RETURN argument)
    ;

bool:   (args '~')=> func
    |   (logic -> logic) 
    					(operator=CMP logic -> ^(GENERIC_OP $bool $operator logic))*
    ;

logic
    :   (eval->eval) 
    				(operator=BOP eval -> ^(GENERIC_OP $logic $operator eval))* 
    ;

eval:   (term->term) 
					(operator='+' term -> ^(GENERIC_OP $eval $operator term)
					|operator='-' term -> ^(GENERIC_OP $eval $operator term)
				    )*
    ;

term:   (exponent -> exponent)
				(operator='*' exponent -> ^(GENERIC_OP $term $operator exponent)
				|operator='/' exponent -> ^(GENERIC_OP $term $operator exponent)
				|operator='%' exponent -> ^(GENERIC_OP $term $operator exponent))*
    ;

exponent
	:	(factor -> factor) (operator='^' factor -> ^(GENERIC_OP $exponent $operator factor))*
	;

factor
    :   (modable -> modable) (args -> ^(FUNC_CALL $factor args*)
    						 |access -> ^($factor access*)
    						 )*
    |   atom
    ;

access
    :   '[' NUMBER ']' -> ^(ARRAY_ACCESS NUMBER)
    |   '.' def=ID -> ^(DICT_ACCESS $def)
    ;

mod :   args
    |   access
    ;
    
modable
    :   ID
    |   '(' bool ')' -> bool
    ;

atom:   NUMBER
    |   STRING
    ;

control
    :   'for' iterator=ID 'in' 
    					(container=ID args+ LT+ iblock -> ^(FOR $iterator ^(FUNC_CALL $container args*) iblock)
    					|container=ID access+ LT+ iblock -> ^(FOR $iterator ^($container access*) iblock)
    				    |array_definition LT+ iblock -> ^(FOR $iterator array_definition iblock)
    				    |container=ID LT+ iblock -> ^(FOR $iterator $container iblock)
    				    )
    |   'while' bool LT+ iblock -> ^(WHILE bool iblock)
    |   'if' bool LT+ iblock (LT+ else_test)? -> ^(IF_CONDITIONS ^(IF bool iblock) else_test*)
    ;    

else_body
	:	return_stmt LT
	| LT iblock
	;

else_if_body
	:  return_stmt
	| LT iblock
	;

/** dangling else solution **/
else_test
    : ('else if')=> 'else if' bool else_if_body (LT+ else_test)? -> ^(ELSE_IF bool else_if_body)(else_test)*
    | 'else' else_body -> ^(ELSE else_body)
    ;

    
assign
    :   '=' (expr|dictionary_definition|array_definition)
    |   ARITH_ASSIGN bool
    ;

dictionary_definition
    :   '{' (dictionary_entry (',' dictionary_entry)*)? '}' -> ^(DICTIONARY_DECLARATION dictionary_entry*)
    ;

dictionary_entry
    :   ID ':' atom -> ^(DICTIONARY_DEFINITION ID atom)
    ;
    
array_definition
    :   '[' (argument (',' argument)*)? ']' -> ^(ARRAY_DECLARATION argument*)
    ;
    
argument
    :   LT? bool
    ;

//AST IMAGINARY NODE TOKENS

OP
	: 'OP'
	;

PROG
	: 'PROG'
	;  

RETURN
	: 'RETURN'
	;

FUNCTION
	: 'FUNCTION'
	;

ASSIGNMENT
	: 'ASSIGNMENT'
	;

BREAK
	: 'BREAK'
	;

GENERIC_OP
	:'GENERIC_OP'
	;

ARRAY_ACCESS
	: 'ARRAY ENTRY'
	;

DICTIONARY_DEFINITION
	: 'DICTIONARY DEFINITION'
	;

DICT_ACCESS
	: 'DICTIONARY ENTRY'
	;
	
IF_CONDITIONS
	: 'IF_CONDITIONS'
	;

IF
	: 'IF'
	;
	
ELSE_IF
	: 'ELSE_IF'
	;

ELSE
	: 'ELSE'
	;
	
WHILE
	: 'WHILE'
	;

FOR
	: 'FOR'
	;

FUNC_CALL
	: 'FUNC_CALL'
	;

ARGUMENTS
	: 'ARGUMENTS'
	;

IBLOCK
	: 'IBLOCK'
	;

ARRAY_DECLARATION
	: 'ARRAY_DECLARATION'
	;

DICTIONARY_DECLARATION
	: 'DICTIONARY_DECLARATIOn'
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
    :   '#' ( options {greedy=false;} : . )* '#' {$channel=HIDDEN;}
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
    
      
    
    
