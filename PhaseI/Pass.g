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
    
      if (!EOFTerminated) {
        EOFTerminated = true;
        return new CommonToken(LT, "\n");
      }
      
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
      if ((indentLevel - indents) > 1)
        System.out.println("too many indents");
        // TODO: report an error... too many indents

    System.out.println("indentLevel: " + indentLevel + "\nindents: " + indents);
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

prog:	(block|expr)* EOF
	;

block
	:   INDENT (block|expr)+ DEDENT
	;

expr:	assign LT
	;
	
assign
    :	ID '=' atom
    ;
	
atom:	NUMBER
	|	STRING
	;

INDENT
    :   
    	{getCharPositionInLine()==0}?=>
        (' ')+
        {
          reindent(getText().length());
        }
    ;

DEDENT
	:   '\n'
		{getCharStream().mark();}
	    (~' ')
	    { 
	      emit(new CommonToken(LT, "LT"));
	      reindent(0);
	      getCharStream().rewind();
	    }
	;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

NUMBER
    :   ('0'..'9')+
    |   ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    |   '.' ('0'..'9')+ EXPONENT?
    |   ('0'..'9')+ EXPONENT
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// Line termination.
LT  :   ('\n'|';')
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
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

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