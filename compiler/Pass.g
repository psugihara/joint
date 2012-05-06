//todo make RETURN AND GENERIC_OP custom nodes
grammar Pass;
options {
  output=AST;
}
tokens {
  DEDENT;
  INDENT;
  GEN_OP;
  ACCESS;
}

@header {
	import java.util.Iterator;
	import java.util.Set;
	import java.util.Arrays;
	import java.util.HashSet;
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
      System.out.println("line " + getLine());
      System.out.println("    " + getText());
      System.out.println("odd indentation (" + spaces + " spaces)");
      System.exit(-1);
    }
    
    int indents = spaces / DENT_SIZE;
      if ((indents - indentLevel) > 1) {
        System.out.println("too many indents on line " + getLine());
        System.exit(-1);
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
@members {
	//declare useful types
	Set<String> reserved = new HashSet<String>(Arrays.asList(
        new String[] {"getTag","getTags","contains","pushTag","popTag","setTag","clearTag","untag","conns","conn","log","server","channel"}));

	ArrayList errors = new ArrayList();
	public int i = 0;
	boolean inFunc = false;
	private final String NUM = "number";
	private final String STR = "string";
	
	public boolean isLive(String variable) {
		if(reserved.contains(variable)) {
			return true;
		}
		
		for(int z = $block.size() - 1; z >= 0; z--) {
			if($block[z]::ST.get(variable) != null) {
				return true;
				}
		}
		
		return false;
	}
	
	public String makeError(Token culprit, String culpritName, String message) {
		return String.format(position(culprit) + ": " + message, culpritName);
	}
	
	public void addError(String error) {
		errors.add(error);
	}
	
	public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e) {
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        addError(hdr);
    }
	
	
	
	public void returnErrors() {
		int numErrors = errors.size();
		String s = numErrors + ((numErrors == 1)? " Error has occured\n" : " Errors have occured\n");
		Iterator<String> it = errors.listIterator();
		while(it.hasNext()) {
			s += it.next() + "\n";
		}
		System.err.println(s);
		//System.exit(1);
	}
	
	public String position(Token i) {
		return "Line " + i.getLine() + ":" + i.getTokenIndex();
	}

	public void addToST(List l) {
		Iterator<String> it =  l.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			$block::ST.put(tmp,"formal argument");
		}
	}
	
	public void removeFromST(List l) {
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			$block::ST.remove(tmp);
		}
	}
	
	public String getST(HashMap symbolTable){
		String s = "~~~Symbol Table~~~\n";
		Iterator it = symbolTable.keySet().iterator();
		while(it.hasNext()) {
			String key = (String) it.next();
			String value = (String) symbolTable.get(key);
			s += key + " : " + value + "\n";
		}
		return s;
	}
}

prog
	@after{if(!errors.isEmpty()) {
				returnErrors();
			}}
	: block EOF -> ^(PROG block EOF)
    ;

block
	scope {HashMap ST;}
	@init {$block::ST = new HashMap(); int order = i++;}
	@after {i--;
		//System.out.println("Symbol Table for block " + order + "\n" + getST($block::ST));
		}
    :   LT!* stmt* 
    ;
   
stmt:   expr (LT+ -> expr LT
			 |EOF -> expr)
    |   control LT+ -> control 
    ;   
   
iblock
    :   INDENT block DEDENT -> ^(IBLOCK block)
    ;
	catch [MismatchedTokenException mme] {
		System.err.println("missing indent");
	}
	
args returns [List arguments]
	@init {List argList = new ArrayList();}
	:   '(' (ar1=argument {if($ar1.isVariable) argList.add($ar1.id);} (',' argn=argument {if($argn.isVariable) argList.add($argn.id);})*)? (LT+)?')' 	{$arguments = argList;}
														-> ^(ARGUMENTS argument*)
    ;
    
func
	@init {inFunc = true;}
	@after {inFunc = false;
			removeFromST($parameters.payload);}
	:   parameters=formal_parameters '~' {addToST($parameters.payload);}
				 (expr -> ^(FUNCTION $parameters ^(IBLOCK expr))
				 |LT iblock -> ^(FUNCTION $parameters iblock)
				 )
    ;

formal_parameters returns [List payload]
	@init {List paramList = new ArrayList();}
	: '(' (parameters=ID {paramList.add($parameters.text);}(',' parameters=ID {paramList.add($parameters.text);})*)? ')' {$payload = paramList;} -> ^(FORMAL_PARAMETERS ID*)
	;

expr:   (accessid ('='|ARITH_ASSIGN))=> accessid assign {$block::ST.put($accessid.id, $accessid.type);}
								-> ^(ASSIGNMENT accessid assign)
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
    :   ('return' -> RETURN) (argument -> ^(RETURN argument))?
    ;

bool returns [String type, String id]
	:   (formal_parameters '~')=> func
    |   (l1=logic {$type = $l1.type; $id = $l1.id;} -> logic) 
    				(operator=CMP logic {$type = NUM;} -> ^(GENERIC_OP $bool $operator logic))*
    ;
    

logic returns [String type, String id]
    :   (e1=negate {$id = $e1.id; $type = $e1.type;} -> negate) 
    				(operator=BOP negate {$type = NUM;}-> ^(GENERIC_OP $logic $operator negate))* 
    ;

negate returns [String type, String id]
	:   NOT ev1=eval {$id = $ev1.text;} -> ^(NEGATION eval)
	|   ev1=eval {$id = $ev1.text;} -> eval
	;

eval returns [String type, String id]
	:   (t1=term {$id = $t1.id; $type = $t1.type;} ->term) 
					(operator='+' t2=term { if($t2.type != null && $t2.type.equals(STR)) {
												$type = STR;
											}}										  
						-> ^(GENERIC_OP $eval $operator term) 
					|operator='-' t2=term { if($t1.type.equals(STR)) {
												addError(makeError($t1.start,$t1.id,"Cannot substract String '\%s'"));
											} else if ($t2.type.equals(STR)) {
												addError(makeError($t1.start,$t1.id,"Cannot substract String '\%s'"));
											}
											}
						-> ^(GENERIC_OP $eval $operator term)
				    )*
    ;

term returns [String type, String id]
	:   
		(e1=exponent {$id = $e1.id; $type = $e1.type;} -> exponent)
				(operator='*' e2=exponent   {if($e1.type != null && $e1.type.equals(STR)) {
												addError(makeError($e1.start, $e1.id, "Cannot use String '\%s' as a factor")); 
												}
											 else if($e2.type != null && $e2.type.equals(STR)) {
											 	addError(makeError($e2.start, $e2.id,"Cannot use String '\%s' as a factor"));
											 	}
												}
				
											-> ^(GENERIC_OP $term $operator exponent) 		
				|operator='/' exponent 		{if($e1.type != null && $e1.type.equals(STR)) {
												addError(makeError($e1.start, $e1.id, "Cannot use String '\%s' as a divisor")); 
												}
											 else if($e2.type != null && $e2.type.equals(STR)) {
											 	addError(makeError($e2.start, $e2.id,"Cannot use String '\%s' as a divisor"));
											 	}
												}
											-> ^(GENERIC_OP $term $operator exponent)
				|operator='%' exponent {if($e1.type != null && $e1.type.equals(STR)) {
												addError(makeError($e1.start, $e1.id, "Cannot use String '\%s' in mod statement")); 
												}
											 else if($e2.type != null && $e2.type.equals(STR)) {
											 	addError(makeError($e2.start, $e2.id,"Cannot use String '\%s' in mod statement"));
											 	}
												}
											-> ^(GENERIC_OP $term $operator exponent))*
    ;

exponent returns [String type, String id]
	:	(f1=factor {$id = $f1.id; $type = $f1.type;} -> factor) 
									(operator='^' f2=factor 
										{ 
										  if($f1.id != null && $f1.type.equals(STR)) {
										 	addError(makeError($f1.start,$f1.id, "Cannot use String '\%s' as base of exponent"));
											}
										  else if($f2.id != null && $f2.type.equals(STR)) {
										 	addError(makeError($f2.start,$f2.id,"Cannot use String '\%s' as exponent"));
										  }
										}
										-> ^(GENERIC_OP $exponent $operator factor))*
	;

factor returns [String type, String id]
    :   accessid {	if(!isLive($accessid.id)) {
    					addError(makeError($accessid.start,$accessid.id,"undefined variable '\%s'"));
    				   }
    				else {
    					$type = $accessid.type;
    					$id = $accessid.id;
    				}
    			  }
    |   '(' bool {$type = $bool.type; $id = $bool.id;}  ')'
    					-> ^(BPARENS bool)
    |   atom {$type = $atom.type;
    		  $id = $atom.id;}
    ;
    
array_access
	:   '[' 
			(NUMBER ']' -> NUMBER 
		    |accessid ']' -> accessid
		    )
	;

dictionary_access
	:   '.' def=ID ->  $def
	;

atom returns [String type, String id]
	:   num=NUMBER {$type = NUM; $id = $num.text;}
    |   str=STRING {$type = STR; $id = $str.text;}
    ;

control
	@after {if($iterator != null) {
			$block::ST.remove($iterator.getText());}}
    :   'for' iterator=ID 'in' 	{$block::ST.put($iterator.getText(), "iterator");}
    				    		(accessid LT+ iblock -> ^(FOR $iterator accessid  iblock)
    				    		|array_definition LT+ iblock -> ^(FOR $iterator array_definition  iblock)
    				    		)
    |   'while' bool LT+ iblock -> ^(WHILE bool iblock)
    |   'if' bool LT+ iblock (LT else_test)? -> ^(IF_CONDITIONS ^(IF bool iblock) else_test*)
    ;    

accessid returns [String id, String type]
	:   (ID {$id = $ID.text; $type = "variable";}
			->ID) 
	( args	{$type = "function";}
			->  ^(FUNC_CALL $accessid args)
    | array_access 	{$type = "array";}
    		-> ^(ARRAY_ACCESS $accessid array_access)
    | dictionary_access	{$type = "dictionary";}
    		-> ^(DICT_ACCESS $accessid dictionary_access)
    )*
	;

else_body
	:	return_stmt LT -> return_stmt
	|   LT iblock -> iblock
	;

else_if_body
	:   return_stmt
	|   LT iblock -> iblock
	;

/** dangling else solution **/
else_test
    :   'else if' bool else_if_body (LT+ else_test)? -> ^(ELSE_IF bool else_if_body) else_test*
    |   'else' else_body -> ^(ELSE else_body)
    ;

assign returns [String type]
    :   '=' (expr 
    		|dictionary_definition
    		|array_definition) 
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
    
argument returns [Boolean isVariable, String id]
    :  bool {	$id = $bool.id;
    				$isVariable = false;
    				if($bool.type != null && $bool.type.equals("variable")) {
    					$isVariable = true;
    				}
    			}
    ;

//AST IMAGINARY NODE TOKENS

fragment
PROG
	: 'PROG'
	;  

fragment
RETURN
	: 'RETURN'
	;

fragment
FUNCTION
	: 'FUNCTION'
	;

fragment
ASSIGNMENT
	: 'ASSIGNMENT'
	;

fragment
BREAK
	: 'BREAK'
	;
	
fragment
NEGATION
	: 'NEGATION'
	;

fragment
GENERIC_OP
	:'GENERIC_OP'
	;

fragment
ARRAY_ACCESS
	: 'ARRAY ENTRY'
	;

fragment
DICTIONARY_DEFINITION
	: 'DICTIONARY DEFINITION'
	;

fragment
DICT_ACCESS
	: 'DICTIONARY ENTRY'
	;

fragment
IF_CONDITIONS
	: 'IF_CONDITIONS'
	;

fragment
IF  : 'IF'
    ;

fragment
ELSE_IF
	: 'ELSE_IF'
	;

fragment
WHILE
	: 'WHILE'
	;

fragment
BPARENS
	: 'BPARENS'
	;

fragment
FOR
	: 'FOR'
	;

fragment
FUNC_CALL
	: 'FUNC_CALL'
	;
	
fragment
ARGUMENTS
	: 'ARGUMENTS'
	;
	
fragment
FORMAL_PARAMETERS
	: 'FORMAL_PARAMETERS'
	;

fragment
IBLOCK
	: 'IBLOCK'
	;

ARRAY_DECLARATION
	: 'ARRAY_DECLARATION'
	;

fragment
DICTIONARY_DECLARATION
	: 'DICTIONARY_DECLARATIOn'
	;

fragment
ELSE
    : 'ELSE'
	;

LT  :   ('\n'|'\r\n')+ { emit(new CommonToken(LT, "LT")); }
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

NOT 
	: '!'
	;

// Comparator
CMP :   '<'|'>'|'=='|'>='|'<='|'<>'|'!='
    ;
    
// Boolean operation
BOP :   '||'|'&&'
    ;

ID  :   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
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
    :  '"' (options {greedy=false;} : .)* (ESC_SEQ  | ~('\\'|'"') )* '"'
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
    :   '\\' ('b'|'t'|'f'|'r'|'\"'|'\''|'\\')
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
