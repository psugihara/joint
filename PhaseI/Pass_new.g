grammar Pass_new;

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
    if (mod(spaces, DENT_SIZE) != 0)
      System.out.println("Odd indentation (" + spaces + " spaces).");
      // TODO: report an error... sloppy indentation
            
    int indents = spaces / DENT_SIZE;
      if ((indents - indentLevel) > 1)
        System.out.println("too many indents");
        // TODO: report an error... too many indents

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

//do we want an empty program to compile? if so, change + to *
block: (statement|LT)+
	|comment 
	;
	
statement: short_statement LT 
	| complex_statement
	;

comment: '#' atom* '#'
	;

iblock:	INDENT block DEDENT
	;

//one line 
short_statement:   return_stmt 
	| break_stmt 
	| expression
	;

return_stmt: 'return' expression
	;

break_stmt: 'break'
	;


assign_type
	:	ARITH_ASSIGN eval
	| '=' (eval|array|dictionary)
	;

array
	:	'[' (eval (',' eval)*)?']'
	;

dictionary
	:	'{' (ID ':'(STRING|NUMBER) (','ID ':'(STRING|NUMBER))*)? '}'
	;
	
	/** here is where we need work **/
complex_statement
    :   iteration_statement 
	|   (args '~')=> func 
	|   control 
	;

iteration_statement:  'for' ID 'in' sub_statement
	| 'while' expression iblock
	;

sub_statement: short_statement 
	| (LT iblock)
	;

func:  args '~' sub_statement
    ;

atom:   NUMBER
    |	STRING
    | 	ID access
    |   '(' eval ')'
    ;

arg	:   eval
    |   (args '~')=> func 
	;

args:  '('(arg (',' arg)*)? ')'
    ;

expression
	: ID assign_type 
	| eval
	;

//eval is going to be for statements that can be evaluated with boolean logic
eval
	: or_eval (CMP or_eval)*
//	|	func
	;
	
or_eval	:	and_eval (B_OR and_eval)*
	;
	
and_eval:	bang_eval (B_AND bang_eval)*
	;

bang_eval:	arithmetic
	|	'!' bang_eval
	;


arithmetic
    :   mult_term (('+'|'-') mult_term)*
    ;
 
mult_term:   atom (('*'|'/'|'%') atom)*
    ;
 
    
access
    : '.' ID
    | '[' NUMBER ']'
    |
    ;

control
    :   'if' eval LT iblock ('else if' eval LT iblock)* ('else' LT iblock)?
    ;

//random grammar

// LEXER RULES



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
    :  '\n'
       {getCharStream().mark();}
       (~' ')
       { 
         emit(new CommonToken(LT, "\n"));
         reindent(0);
         getCharStream().rewind();
       }
    ;

// Comparator
CMP	:	'<'|'>'|'=='|'>='|'<='|'<>'|'!='
	;
	
// Boolean operation
B_OR
	:	'||'
	;
B_AND
	:	'&&'
	;

ARR_INIT
	:	'['']'
;
DICT_INIT
	:	'{''}'
	;

ARITH_ASSIGN
	: '\=' 
	| '+='
	| '-='
	| '*='
	| '%='
	; 

ID  :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

NUMBER
    :   '-'?('0'..'9')+
    |   '-'?('0'..'9')+ '.' ('0'..'9')+ EXPONENT?
    |   '-'?'.' ('0'..'9')+ EXPONENT?
    |   '-'?('0'..'9')+ EXPONENT
    ;

COMMENT:  '#' ( options {greedy=false;} : . )* '#' {$channel=HIDDEN;}

    //|   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

// Line termination.
LT  :   ('\n'|';')+
    ;

WS  :  ( ' '
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