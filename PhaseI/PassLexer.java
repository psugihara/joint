// $ANTLR 3.4 Pass.g 2012-04-27 16:18:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int ARGUMENTS=4;
    public static final int ARITH_ASSIGN=5;
    public static final int ARRAY_ACCESS=6;
    public static final int ARRAY_DECLARATION=7;
    public static final int ASSIGNMENT=8;
    public static final int BOP=9;
    public static final int CMP=10;
    public static final int COMMENT=11;
    public static final int DEDENT=12;
    public static final int DICTIONARY_DECLARATION=13;
    public static final int DICTIONARY_DEFINITION=14;
    public static final int DICT_ACCESS=15;
    public static final int ELSE=16;
    public static final int ELSE_IF=17;
    public static final int ESC_SEQ=18;
    public static final int EXPONENT=19;
    public static final int FOR=20;
    public static final int FUNCTION=21;
    public static final int FUNC_CALL=22;
    public static final int HEX_DIGIT=23;
    public static final int IBLOCK=24;
    public static final int ID=25;
    public static final int IF=26;
    public static final int IF_CONDITIONS=27;
    public static final int INDENT=28;
    public static final int LT=29;
    public static final int NUMBER=30;
    public static final int OCTAL_ESC=31;
    public static final int OP=32;
    public static final int PROG=33;
    public static final int STRING=34;
    public static final int UNICODE_ESC=35;
    public static final int WHILE=36;
    public static final int WS=37;

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


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public PassLexer() {} 
    public PassLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PassLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Pass.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:93:7: ( '%' )
            // Pass.g:93:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:94:7: ( '(' )
            // Pass.g:94:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:95:7: ( ')' )
            // Pass.g:95:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:96:7: ( '*' )
            // Pass.g:96:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:97:7: ( '+' )
            // Pass.g:97:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:98:7: ( ',' )
            // Pass.g:98:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:99:7: ( '-' )
            // Pass.g:99:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:100:7: ( '.' )
            // Pass.g:100:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:101:7: ( '/' )
            // Pass.g:101:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:102:7: ( ':' )
            // Pass.g:102:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:103:7: ( '=' )
            // Pass.g:103:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:104:7: ( '[' )
            // Pass.g:104:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:105:7: ( ']' )
            // Pass.g:105:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:106:7: ( 'break' )
            // Pass.g:106:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:107:7: ( 'else if' )
            // Pass.g:107:9: 'else if'
            {
            match("else if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:108:7: ( 'else' )
            // Pass.g:108:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:109:7: ( 'for' )
            // Pass.g:109:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:110:7: ( 'if' )
            // Pass.g:110:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:111:7: ( 'in' )
            // Pass.g:111:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:112:7: ( 'return' )
            // Pass.g:112:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:113:7: ( 'while' )
            // Pass.g:113:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:114:7: ( '{' )
            // Pass.g:114:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:115:7: ( '}' )
            // Pass.g:115:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:116:7: ( '~' )
            // Pass.g:116:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:234:2: ( 'OP' )
            // Pass.g:234:4: 'OP'
            {
            match("OP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "PROG"
    public final void mPROG() throws RecognitionException {
        try {
            int _type = PROG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:238:2: ( 'PROG' )
            // Pass.g:238:4: 'PROG'
            {
            match("PROG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROG"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:242:2: ( 'FUNCTION' )
            // Pass.g:242:4: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:246:2: ( 'ASSIGNMENT' )
            // Pass.g:246:4: 'ASSIGNMENT'
            {
            match("ASSIGNMENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "ARRAY_ACCESS"
    public final void mARRAY_ACCESS() throws RecognitionException {
        try {
            int _type = ARRAY_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:250:2: ( 'ARRAY ENTRY' )
            // Pass.g:250:4: 'ARRAY ENTRY'
            {
            match("ARRAY ENTRY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY_ACCESS"

    // $ANTLR start "DICTIONARY_DEFINITION"
    public final void mDICTIONARY_DEFINITION() throws RecognitionException {
        try {
            int _type = DICTIONARY_DEFINITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:254:2: ( 'DICTIONARY DEFINITION' )
            // Pass.g:254:4: 'DICTIONARY DEFINITION'
            {
            match("DICTIONARY DEFINITION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DICTIONARY_DEFINITION"

    // $ANTLR start "DICT_ACCESS"
    public final void mDICT_ACCESS() throws RecognitionException {
        try {
            int _type = DICT_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:258:2: ( 'DICTIONARY ENTRY' )
            // Pass.g:258:4: 'DICTIONARY ENTRY'
            {
            match("DICTIONARY ENTRY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DICT_ACCESS"

    // $ANTLR start "IF_CONDITIONS"
    public final void mIF_CONDITIONS() throws RecognitionException {
        try {
            int _type = IF_CONDITIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:262:2: ( 'IF_CONDITIONS' )
            // Pass.g:262:4: 'IF_CONDITIONS'
            {
            match("IF_CONDITIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_CONDITIONS"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:266:2: ( 'IF' )
            // Pass.g:266:4: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE_IF"
    public final void mELSE_IF() throws RecognitionException {
        try {
            int _type = ELSE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:270:2: ( 'ELSE_IF' )
            // Pass.g:270:4: 'ELSE_IF'
            {
            match("ELSE_IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE_IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:274:2: ( 'ELSE' )
            // Pass.g:274:4: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:278:2: ( 'WHILE' )
            // Pass.g:278:4: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:282:2: ( 'FOR' )
            // Pass.g:282:4: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FUNC_CALL"
    public final void mFUNC_CALL() throws RecognitionException {
        try {
            int _type = FUNC_CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:286:2: ( 'FUNC_CALL' )
            // Pass.g:286:4: 'FUNC_CALL'
            {
            match("FUNC_CALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC_CALL"

    // $ANTLR start "ARGUMENTS"
    public final void mARGUMENTS() throws RecognitionException {
        try {
            int _type = ARGUMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:290:2: ( 'ARGUMENTS' )
            // Pass.g:290:4: 'ARGUMENTS'
            {
            match("ARGUMENTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARGUMENTS"

    // $ANTLR start "IBLOCK"
    public final void mIBLOCK() throws RecognitionException {
        try {
            int _type = IBLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:294:2: ( 'IBLOCK' )
            // Pass.g:294:4: 'IBLOCK'
            {
            match("IBLOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IBLOCK"

    // $ANTLR start "ARRAY_DECLARATION"
    public final void mARRAY_DECLARATION() throws RecognitionException {
        try {
            int _type = ARRAY_DECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:298:2: ( 'ARRAY_DECLARATION' )
            // Pass.g:298:4: 'ARRAY_DECLARATION'
            {
            match("ARRAY_DECLARATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARRAY_DECLARATION"

    // $ANTLR start "DICTIONARY_DECLARATION"
    public final void mDICTIONARY_DECLARATION() throws RecognitionException {
        try {
            int _type = DICTIONARY_DECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:302:2: ( 'DICTIONARY_DECLARATIOn' )
            // Pass.g:302:4: 'DICTIONARY_DECLARATIOn'
            {
            match("DICTIONARY_DECLARATIOn"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DICTIONARY_DECLARATION"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:305:5: ( ( '\\n' | 'r\\n' )+ )
            // Pass.g:305:9: ( '\\n' | 'r\\n' )+
            {
            // Pass.g:305:9: ( '\\n' | 'r\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\n') ) {
                    alt1=1;
                }
                else if ( (LA1_0=='r') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // Pass.g:305:10: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 2 :
            	    // Pass.g:305:15: 'r\\n'
            	    {
            	    match("r\n"); 



            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:309:5: ({...}? => ( ' ' )+ )
            // Pass.g:310:8: {...}? => ( ' ' )+
            {
            if ( !((getCharPositionInLine()==0)) ) {
                throw new FailedPredicateException(input, "INDENT", "getCharPositionInLine()==0");
            }

            // Pass.g:311:9: ( ' ' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Pass.g:311:10: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);



                      reindent(getText().length());
                      skip();
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:319:5: ( LT (~ ' ' ) )
            // Pass.g:319:9: LT (~ ' ' )
            {
            mLT(); 


            getCharStream().mark();

            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\u001F')||(input.LA(1) >= '!' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }



                      emit(new CommonToken(LT, "LT"));
                      reindent(0);
                      getCharStream().rewind();
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEDENT"

    // $ANTLR start "ARITH_ASSIGN"
    public final void mARITH_ASSIGN() throws RecognitionException {
        try {
            int _type = ARITH_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:330:5: ( '+=' | '-=' | '*=' | '/=' | '%=' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt3=1;
                }
                break;
            case '-':
                {
                alt3=2;
                }
                break;
            case '*':
                {
                alt3=3;
                }
                break;
            case '/':
                {
                alt3=4;
                }
                break;
            case '%':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // Pass.g:330:9: '+='
                    {
                    match("+="); 



                    }
                    break;
                case 2 :
                    // Pass.g:330:14: '-='
                    {
                    match("-="); 



                    }
                    break;
                case 3 :
                    // Pass.g:330:19: '*='
                    {
                    match("*="); 



                    }
                    break;
                case 4 :
                    // Pass.g:330:24: '/='
                    {
                    match("/="); 



                    }
                    break;
                case 5 :
                    // Pass.g:330:29: '%='
                    {
                    match("%="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARITH_ASSIGN"

    // $ANTLR start "CMP"
    public final void mCMP() throws RecognitionException {
        try {
            int _type = CMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:334:5: ( '<' | '>' | '==' | '>=' | '<=' | '<>' | '!=' )
            int alt4=7;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt4=5;
                    }
                    break;
                case '>':
                    {
                    alt4=6;
                    }
                    break;
                default:
                    alt4=1;
                }

                }
                break;
            case '>':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=2;
                }
                }
                break;
            case '=':
                {
                alt4=3;
                }
                break;
            case '!':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // Pass.g:334:9: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // Pass.g:334:13: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // Pass.g:334:17: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 4 :
                    // Pass.g:334:22: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 5 :
                    // Pass.g:334:27: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 6 :
                    // Pass.g:334:32: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 7 :
                    // Pass.g:334:37: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CMP"

    // $ANTLR start "BOP"
    public final void mBOP() throws RecognitionException {
        try {
            int _type = BOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:338:5: ( '||' | '&&' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='|') ) {
                alt5=1;
            }
            else if ( (LA5_0=='&') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Pass.g:338:9: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // Pass.g:338:14: '&&'
                    {
                    match("&&"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:341:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Pass.g:341:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Pass.g:341:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Pass.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:345:5: ( ( '-' )? ( '0' .. '9' )+ | ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // Pass.g:345:9: ( '-' )? ( '0' .. '9' )+
                    {
                    // Pass.g:345:9: ( '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Pass.g:345:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    // Pass.g:345:13: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Pass.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Pass.g:346:9: ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // Pass.g:346:9: ( '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Pass.g:346:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    // Pass.g:346:13: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Pass.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    match('.'); 

                    // Pass.g:346:29: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Pass.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    // Pass.g:346:41: ( EXPONENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Pass.g:346:41: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Pass.g:347:9: ( '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    // Pass.g:347:9: ( '-' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='-') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Pass.g:347:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    match('.'); 

                    // Pass.g:347:17: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Pass.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    // Pass.g:347:29: ( EXPONENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='E'||LA15_0=='e') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Pass.g:347:29: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Pass.g:348:9: ( '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // Pass.g:348:9: ( '-' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='-') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Pass.g:348:9: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }


                    // Pass.g:348:13: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Pass.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:352:5: ( '#' ( options {greedy=false; } : . )* '#' )
            // Pass.g:352:9: '#' ( options {greedy=false; } : . )* '#'
            {
            match('#'); 

            // Pass.g:352:13: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='#') ) {
                    alt19=2;
                }
                else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '\"')||(LA19_0 >= '$' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Pass.g:352:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('#'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:355:5: ( ( ' ' | '\\t' | '\\r' ) )
            // Pass.g:355:9: ( ' ' | '\\t' | '\\r' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Pass.g:362:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // Pass.g:362:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Pass.g:362:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    alt20=1;
                }
                else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '!')||(LA20_0 >= '#' && LA20_0 <= '[')||(LA20_0 >= ']' && LA20_0 <= '\uFFFF')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // Pass.g:362:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // Pass.g:362:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // Pass.g:368:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Pass.g:368:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Pass.g:368:19: ( '+' | '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='+'||LA21_0=='-') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Pass.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Pass.g:368:30: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // Pass.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Pass.g:373:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Pass.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // Pass.g:378:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt23=1;
                    }
                    break;
                case 'u':
                    {
                    alt23=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt23=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Pass.g:378:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Pass.g:379:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // Pass.g:380:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // Pass.g:385:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\\') ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1 >= '0' && LA24_1 <= '3')) ) {
                    int LA24_2 = input.LA(3);

                    if ( ((LA24_2 >= '0' && LA24_2 <= '7')) ) {
                        int LA24_4 = input.LA(4);

                        if ( ((LA24_4 >= '0' && LA24_4 <= '7')) ) {
                            alt24=1;
                        }
                        else {
                            alt24=2;
                        }
                    }
                    else {
                        alt24=3;
                    }
                }
                else if ( ((LA24_1 >= '4' && LA24_1 <= '7')) ) {
                    int LA24_3 = input.LA(3);

                    if ( ((LA24_3 >= '0' && LA24_3 <= '7')) ) {
                        alt24=2;
                    }
                    else {
                        alt24=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Pass.g:385:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Pass.g:386:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // Pass.g:387:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // Pass.g:392:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Pass.g:392:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // Pass.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | OP | PROG | FUNCTION | ASSIGNMENT | ARRAY_ACCESS | DICTIONARY_DEFINITION | DICT_ACCESS | IF_CONDITIONS | IF | ELSE_IF | ELSE | WHILE | FOR | FUNC_CALL | ARGUMENTS | IBLOCK | ARRAY_DECLARATION | DICTIONARY_DECLARATION | LT | INDENT | DEDENT | ARITH_ASSIGN | CMP | BOP | ID | NUMBER | COMMENT | WS | STRING )
        int alt25=53;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // Pass.g:1:10: T__38
                {
                mT__38(); 


                }
                break;
            case 2 :
                // Pass.g:1:16: T__39
                {
                mT__39(); 


                }
                break;
            case 3 :
                // Pass.g:1:22: T__40
                {
                mT__40(); 


                }
                break;
            case 4 :
                // Pass.g:1:28: T__41
                {
                mT__41(); 


                }
                break;
            case 5 :
                // Pass.g:1:34: T__42
                {
                mT__42(); 


                }
                break;
            case 6 :
                // Pass.g:1:40: T__43
                {
                mT__43(); 


                }
                break;
            case 7 :
                // Pass.g:1:46: T__44
                {
                mT__44(); 


                }
                break;
            case 8 :
                // Pass.g:1:52: T__45
                {
                mT__45(); 


                }
                break;
            case 9 :
                // Pass.g:1:58: T__46
                {
                mT__46(); 


                }
                break;
            case 10 :
                // Pass.g:1:64: T__47
                {
                mT__47(); 


                }
                break;
            case 11 :
                // Pass.g:1:70: T__48
                {
                mT__48(); 


                }
                break;
            case 12 :
                // Pass.g:1:76: T__49
                {
                mT__49(); 


                }
                break;
            case 13 :
                // Pass.g:1:82: T__50
                {
                mT__50(); 


                }
                break;
            case 14 :
                // Pass.g:1:88: T__51
                {
                mT__51(); 


                }
                break;
            case 15 :
                // Pass.g:1:94: T__52
                {
                mT__52(); 


                }
                break;
            case 16 :
                // Pass.g:1:100: T__53
                {
                mT__53(); 


                }
                break;
            case 17 :
                // Pass.g:1:106: T__54
                {
                mT__54(); 


                }
                break;
            case 18 :
                // Pass.g:1:112: T__55
                {
                mT__55(); 


                }
                break;
            case 19 :
                // Pass.g:1:118: T__56
                {
                mT__56(); 


                }
                break;
            case 20 :
                // Pass.g:1:124: T__57
                {
                mT__57(); 


                }
                break;
            case 21 :
                // Pass.g:1:130: T__58
                {
                mT__58(); 


                }
                break;
            case 22 :
                // Pass.g:1:136: T__59
                {
                mT__59(); 


                }
                break;
            case 23 :
                // Pass.g:1:142: T__60
                {
                mT__60(); 


                }
                break;
            case 24 :
                // Pass.g:1:148: T__61
                {
                mT__61(); 


                }
                break;
            case 25 :
                // Pass.g:1:154: OP
                {
                mOP(); 


                }
                break;
            case 26 :
                // Pass.g:1:157: PROG
                {
                mPROG(); 


                }
                break;
            case 27 :
                // Pass.g:1:162: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 28 :
                // Pass.g:1:171: ASSIGNMENT
                {
                mASSIGNMENT(); 


                }
                break;
            case 29 :
                // Pass.g:1:182: ARRAY_ACCESS
                {
                mARRAY_ACCESS(); 


                }
                break;
            case 30 :
                // Pass.g:1:195: DICTIONARY_DEFINITION
                {
                mDICTIONARY_DEFINITION(); 


                }
                break;
            case 31 :
                // Pass.g:1:217: DICT_ACCESS
                {
                mDICT_ACCESS(); 


                }
                break;
            case 32 :
                // Pass.g:1:229: IF_CONDITIONS
                {
                mIF_CONDITIONS(); 


                }
                break;
            case 33 :
                // Pass.g:1:243: IF
                {
                mIF(); 


                }
                break;
            case 34 :
                // Pass.g:1:246: ELSE_IF
                {
                mELSE_IF(); 


                }
                break;
            case 35 :
                // Pass.g:1:254: ELSE
                {
                mELSE(); 


                }
                break;
            case 36 :
                // Pass.g:1:259: WHILE
                {
                mWHILE(); 


                }
                break;
            case 37 :
                // Pass.g:1:265: FOR
                {
                mFOR(); 


                }
                break;
            case 38 :
                // Pass.g:1:269: FUNC_CALL
                {
                mFUNC_CALL(); 


                }
                break;
            case 39 :
                // Pass.g:1:279: ARGUMENTS
                {
                mARGUMENTS(); 


                }
                break;
            case 40 :
                // Pass.g:1:289: IBLOCK
                {
                mIBLOCK(); 


                }
                break;
            case 41 :
                // Pass.g:1:296: ARRAY_DECLARATION
                {
                mARRAY_DECLARATION(); 


                }
                break;
            case 42 :
                // Pass.g:1:314: DICTIONARY_DECLARATION
                {
                mDICTIONARY_DECLARATION(); 


                }
                break;
            case 43 :
                // Pass.g:1:337: LT
                {
                mLT(); 


                }
                break;
            case 44 :
                // Pass.g:1:340: INDENT
                {
                mINDENT(); 


                }
                break;
            case 45 :
                // Pass.g:1:347: DEDENT
                {
                mDEDENT(); 


                }
                break;
            case 46 :
                // Pass.g:1:354: ARITH_ASSIGN
                {
                mARITH_ASSIGN(); 


                }
                break;
            case 47 :
                // Pass.g:1:367: CMP
                {
                mCMP(); 


                }
                break;
            case 48 :
                // Pass.g:1:371: BOP
                {
                mBOP(); 


                }
                break;
            case 49 :
                // Pass.g:1:375: ID
                {
                mID(); 


                }
                break;
            case 50 :
                // Pass.g:1:378: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 51 :
                // Pass.g:1:385: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 52 :
                // Pass.g:1:393: WS
                {
                mWS(); 


                }
                break;
            case 53 :
                // Pass.g:1:396: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA18_eotS =
        "\2\uffff\1\4\4\uffff";
    static final String DFA18_eofS =
        "\7\uffff";
    static final String DFA18_minS =
        "\1\55\2\56\4\uffff";
    static final String DFA18_maxS =
        "\2\71\1\145\4\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\1\1\1\2\1\4";
    static final String DFA18_specialS =
        "\7\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\5\1\uffff\12\2\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "344:1: NUMBER : ( ( '-' )? ( '0' .. '9' )+ | ( '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | ( '-' )? '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA25_eotS =
        "\1\uffff\1\51\2\uffff\1\52\1\53\1\uffff\1\54\1\55\1\56\1\uffff\1"+
        "\57\2\uffff\6\43\3\uffff\10\43\1\103\1\107\17\uffff\3\43\1\114\1"+
        "\115\1\43\1\103\1\43\1\120\6\43\1\131\3\43\1\uffff\1\103\1\106\3"+
        "\uffff\2\43\1\137\2\uffff\2\43\1\uffff\2\43\1\144\5\43\1\uffff\4"+
        "\43\1\157\1\uffff\2\43\1\162\1\43\1\uffff\6\43\1\174\1\43\1\176"+
        "\2\uffff\1\43\1\u0080\1\uffff\11\43\1\uffff\1\u008b\1\uffff\1\u008c"+
        "\1\uffff\3\43\1\uffff\4\43\1\u0094\1\43\2\uffff\7\43\1\uffff\1\u009d"+
        "\1\u009e\6\43\2\uffff\1\u00a5\2\43\1\u00a8\2\43\1\uffff\1\u00ab"+
        "\1\43\1\uffff\2\43\1\uffff\1\43\1\uffff\3\43\2\uffff\4\43\1\u00ba"+
        "\2\43\1\uffff\4\43\1\u00c1\1\43\1\uffff\4\43\1\u00c7\1\uffff";
    static final String DFA25_eofS =
        "\u00c8\uffff";
    static final String DFA25_minS =
        "\1\11\1\75\2\uffff\2\75\1\uffff\1\56\1\60\1\75\1\uffff\1\75\2\uffff"+
        "\1\162\1\154\1\157\1\146\1\12\1\150\3\uffff\1\120\1\122\1\117\1"+
        "\122\1\111\1\102\1\114\1\110\1\0\1\40\17\uffff\1\145\1\163\1\162"+
        "\2\60\1\164\1\0\1\151\1\60\1\117\1\116\1\122\1\123\1\107\1\103\1"+
        "\60\1\114\1\123\1\111\1\uffff\1\0\1\12\1\uffff\1\0\1\uffff\1\141"+
        "\1\145\1\60\2\uffff\1\165\1\154\1\uffff\1\107\1\103\1\60\1\111\1"+
        "\101\1\125\1\124\1\103\1\uffff\1\117\1\105\1\114\1\153\1\40\1\uffff"+
        "\1\162\1\145\1\60\1\124\1\uffff\1\107\1\131\1\115\1\111\1\117\1"+
        "\103\1\60\1\105\1\60\2\uffff\1\156\1\60\1\uffff\1\111\1\103\1\116"+
        "\1\40\1\105\1\117\1\116\1\113\1\111\1\uffff\1\60\1\uffff\1\60\1"+
        "\uffff\1\117\1\101\1\115\1\uffff\1\104\2\116\1\104\1\60\1\106\2"+
        "\uffff\1\116\1\114\2\105\1\124\1\101\1\111\1\uffff\2\60\1\114\1"+
        "\116\1\103\1\123\1\122\1\124\2\uffff\1\60\1\124\1\114\1\60\1\131"+
        "\1\111\1\uffff\1\60\1\101\1\uffff\1\40\1\117\1\uffff\1\122\2\104"+
        "\1\116\1\101\2\uffff\1\105\1\123\1\124\1\103\1\60\1\111\1\114\1"+
        "\uffff\1\117\1\101\1\116\1\122\1\60\1\101\1\uffff\1\124\1\111\1"+
        "\117\1\156\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\176\1\75\2\uffff\2\75\1\uffff\1\75\1\71\1\75\1\uffff\1\75\2\uffff"+
        "\1\162\1\154\1\157\1\156\1\145\1\150\3\uffff\1\120\1\122\1\125\1"+
        "\123\1\111\1\106\1\114\1\110\1\uffff\1\40\17\uffff\1\145\1\163\1"+
        "\162\2\172\1\164\1\uffff\1\151\1\172\1\117\1\116\1\122\1\123\1\122"+
        "\1\103\1\172\1\114\1\123\1\111\1\uffff\1\uffff\1\12\1\uffff\1\0"+
        "\1\uffff\1\141\1\145\1\172\2\uffff\1\165\1\154\1\uffff\1\107\1\103"+
        "\1\172\1\111\1\101\1\125\1\124\1\103\1\uffff\1\117\1\105\1\114\1"+
        "\153\1\172\1\uffff\1\162\1\145\1\172\1\137\1\uffff\1\107\1\131\1"+
        "\115\1\111\1\117\1\103\1\172\1\105\1\172\2\uffff\1\156\1\172\1\uffff"+
        "\1\111\1\103\1\116\1\137\1\105\1\117\1\116\1\113\1\111\1\uffff\1"+
        "\172\1\uffff\1\172\1\uffff\1\117\1\101\1\115\1\uffff\1\104\2\116"+
        "\1\104\1\172\1\106\2\uffff\1\116\1\114\2\105\1\124\1\101\1\111\1"+
        "\uffff\2\172\1\114\1\116\1\103\1\123\1\122\1\124\2\uffff\1\172\1"+
        "\124\1\114\1\172\1\131\1\111\1\uffff\1\172\1\101\1\uffff\1\137\1"+
        "\117\1\uffff\1\122\1\105\1\104\1\116\1\101\2\uffff\1\105\1\123\1"+
        "\124\1\103\1\172\1\111\1\114\1\uffff\1\117\1\101\1\116\1\122\1\172"+
        "\1\101\1\uffff\1\124\1\111\1\117\1\156\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\3\uffff\1\12\1\uffff\1\14\1\15\6\uffff"+
        "\1\26\1\27\1\30\12\uffff\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\56"+
        "\1\1\1\4\1\5\1\7\1\10\1\11\1\13\23\uffff\1\53\2\uffff\1\55\1\uffff"+
        "\1\54\3\uffff\1\22\1\23\2\uffff\1\31\10\uffff\1\41\5\uffff\1\21"+
        "\4\uffff\1\45\11\uffff\1\17\1\20\2\uffff\1\32\11\uffff\1\43\1\uffff"+
        "\1\16\1\uffff\1\25\3\uffff\1\35\6\uffff\1\44\1\24\7\uffff\1\50\10"+
        "\uffff\1\42\1\33\6\uffff\1\46\2\uffff\1\47\2\uffff\1\34\5\uffff"+
        "\1\36\1\37\7\uffff\1\40\6\uffff\1\51\5\uffff\1\52";
    static final String DFA25_specialS =
        "\37\uffff\1\4\1\0\25\uffff\1\3\15\uffff\1\1\2\uffff\1\2\u0080\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\46\1\37\2\uffff\1\46\22\uffff\1\40\1\41\1\47\1\45\1\uffff"+
            "\1\1\1\42\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\44\1"+
            "\12\1\uffff\1\41\1\13\1\41\2\uffff\1\32\2\43\1\33\1\35\1\31"+
            "\2\43\1\34\5\43\1\27\1\30\6\43\1\36\3\43\1\14\1\uffff\1\15\1"+
            "\uffff\1\43\1\uffff\1\43\1\16\2\43\1\17\1\20\2\43\1\21\10\43"+
            "\1\22\4\43\1\23\3\43\1\24\1\42\1\25\1\26",
            "\1\50",
            "",
            "",
            "\1\50",
            "\1\50",
            "",
            "\1\44\1\uffff\12\44\3\uffff\1\50",
            "\12\44",
            "\1\50",
            "",
            "\1\41",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63\7\uffff\1\64",
            "\1\66\132\uffff\1\65",
            "\1\67",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\73\5\uffff\1\72",
            "\1\75\1\74",
            "\1\76",
            "\1\100\3\uffff\1\77",
            "\1\101",
            "\1\102",
            "\12\106\1\104\25\106\1\uffff\121\106\1\105\uff8d\106",
            "\1\110",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\116",
            "\12\106\1\104\25\106\1\uffff\121\106\1\105\uff8d\106",
            "\1\117",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\126\12\uffff\1\125",
            "\1\127",
            "\12\43\7\uffff\32\43\4\uffff\1\130\1\uffff\32\43",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\12\106\1\104\25\106\1\uffff\121\106\1\105\uff8d\106",
            "\1\66",
            "",
            "\1\uffff",
            "",
            "\1\135",
            "\1\136",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\17\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "\1\160",
            "\1\161",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\163\12\uffff\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\43\7\uffff\32\43\4\uffff\1\173\1\uffff\32\43",
            "\1\175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\177",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\76\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a6",
            "\1\u00a7",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ac",
            "",
            "\1\u00ad\76\uffff\1\u00ae",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b1\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | OP | PROG | FUNCTION | ASSIGNMENT | ARRAY_ACCESS | DICTIONARY_DEFINITION | DICT_ACCESS | IF_CONDITIONS | IF | ELSE_IF | ELSE | WHILE | FOR | FUNC_CALL | ARGUMENTS | IBLOCK | ARRAY_DECLARATION | DICTIONARY_DECLARATION | LT | INDENT | DEDENT | ARITH_ASSIGN | CMP | BOP | ID | NUMBER | COMMENT | WS | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_32 = input.LA(1);

                         
                        int index25_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA25_32==' ') && ((getCharPositionInLine()==0))) {s = 72;}

                        else s = 71;

                         
                        input.seek(index25_32);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA25_68 = input.LA(1);

                        s = -1;
                        if ( (LA25_68=='\n') ) {s = 68;}

                        else if ( (LA25_68=='r') ) {s = 69;}

                        else if ( ((LA25_68 >= '\u0000' && LA25_68 <= '\t')||(LA25_68 >= '\u000B' && LA25_68 <= '\u001F')||(LA25_68 >= '!' && LA25_68 <= 'q')||(LA25_68 >= 's' && LA25_68 <= '\uFFFF')) ) {s = 70;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA25_71 = input.LA(1);

                         
                        int index25_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((getCharPositionInLine()==0)) ) {s = 72;}

                        else if ( (true) ) {s = 38;}

                         
                        input.seek(index25_71);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA25_54 = input.LA(1);

                        s = -1;
                        if ( (LA25_54=='\n') ) {s = 68;}

                        else if ( (LA25_54=='r') ) {s = 69;}

                        else if ( ((LA25_54 >= '\u0000' && LA25_54 <= '\t')||(LA25_54 >= '\u000B' && LA25_54 <= '\u001F')||(LA25_54 >= '!' && LA25_54 <= 'q')||(LA25_54 >= 's' && LA25_54 <= '\uFFFF')) ) {s = 70;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA25_31 = input.LA(1);

                        s = -1;
                        if ( (LA25_31=='\n') ) {s = 68;}

                        else if ( (LA25_31=='r') ) {s = 69;}

                        else if ( ((LA25_31 >= '\u0000' && LA25_31 <= '\t')||(LA25_31 >= '\u000B' && LA25_31 <= '\u001F')||(LA25_31 >= '!' && LA25_31 <= 'q')||(LA25_31 >= 's' && LA25_31 <= '\uFFFF')) ) {s = 70;}

                        else s = 67;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}