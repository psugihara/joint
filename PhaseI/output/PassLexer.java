// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-13 11:55:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int COMMENT=4;
    public static final int DEDENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int HEX_DIGIT=8;
    public static final int ID=9;
    public static final int INDENT=10;
    public static final int LT=11;
    public static final int NUMBER=12;
    public static final int OCTAL_ESC=13;
    public static final int STRING=14;
    public static final int UNICODE_ESC=15;
    public static final int WS=16;

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
    public String getGrammarFileName() { return "/Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:73:7: ( '=' )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:73:9: '='
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
    // $ANTLR end "T__17"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:5: ({...}? => ( ' ' )+ )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:6: {...}? => ( ' ' )+
            {
            if ( !((getCharPositionInLine()==0)) ) {
                throw new FailedPredicateException(input, "INDENT", "getCharPositionInLine()==0");
            }

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:9: ( ' ' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:10: ' '
            	    {
            	    match(' '); 

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



                      reindent(getText().length());
                    

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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:2: ( '\\n' (~ ' ' ) )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:6: '\\n' (~ ' ' )
            {
            match('\n'); 

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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
            	    break loop2;
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:5: ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt10=4;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:9: ( '0' .. '9' )+
                    {
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:9: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    match('.'); 

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
                    	    break loop5;
                        }
                    } while (true);


                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:37: ( EXPONENT )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='E'||LA6_0=='e') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:37: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:25: ( EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:9: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='/') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='/') ) {
                    alt14=1;
                }
                else if ( (LA14_1=='*') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:14: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\f')||(LA11_0 >= '\u000E' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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


                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:28: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:14: ( options {greedy=false; } : . )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='*') ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='/') ) {
                                alt13=2;
                            }
                            else if ( ((LA13_1 >= '\u0000' && LA13_1 <= '.')||(LA13_1 >= '0' && LA13_1 <= '\uFFFF')) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ')')||(LA13_0 >= '+' && LA13_0 <= '\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

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
    // $ANTLR end "COMMENT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:5: ( ( '\\n' | ';' ) )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)==';' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:5: ( ( ' ' | '\\t' | '\\r' ) )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:9: ( ' ' | '\\t' | '\\r' )
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:143:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:143:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:143:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '!')||(LA15_0 >= '#' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:143:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:143:24: ~ ( '\\\\' | '\"' )
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
            	    break loop15;
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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


            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:33: ( '0' .. '9' )+
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
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\\') ) {
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
                    alt18=1;
                    }
                    break;
                case 'u':
                    {
                    alt18=2;
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
                    alt18=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:156:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:157:9: OCTAL_ESC
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
                    int LA19_2 = input.LA(3);

                    if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
                        int LA19_4 = input.LA(4);

                        if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
                            alt19=1;
                        }
                        else {
                            alt19=2;
                        }
                    }
                    else {
                        alt19=3;
                    }
                }
                else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
                    int LA19_3 = input.LA(3);

                    if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:163:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:9: '\\\\' ( '0' .. '7' )
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
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:169:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:169:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:8: ( T__17 | INDENT | DEDENT | ID | NUMBER | COMMENT | LT | WS | STRING )
        int alt20=9;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt20=1;
            }
            break;
        case ' ':
            {
            int LA20_2 = input.LA(2);

            if ( (LA20_2==' ') && ((getCharPositionInLine()==0))) {
                alt20=2;
            }
            else if ( ((getCharPositionInLine()==0)) ) {
                alt20=2;
            }
            else if ( (true) ) {
                alt20=8;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 2, input);

                throw nvae;

            }
            }
            break;
        case '\n':
            {
            int LA20_3 = input.LA(2);

            if ( ((LA20_3 >= '\u0000' && LA20_3 <= '\u001F')||(LA20_3 >= '!' && LA20_3 <= '\uFFFF')) ) {
                alt20=3;
            }
            else {
                alt20=7;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt20=4;
            }
            break;
        case '.':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt20=5;
            }
            break;
        case '/':
            {
            alt20=6;
            }
            break;
        case ';':
            {
            alt20=7;
            }
            break;
        case '\t':
        case '\r':
            {
            alt20=8;
            }
            break;
        case '\"':
            {
            alt20=9;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 20, 0, input);

            throw nvae;

        }

        switch (alt20) {
            case 1 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:10: T__17
                {
                mT__17(); 


                }
                break;
            case 2 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:16: INDENT
                {
                mINDENT(); 


                }
                break;
            case 3 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:23: DEDENT
                {
                mDEDENT(); 


                }
                break;
            case 4 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:30: ID
                {
                mID(); 


                }
                break;
            case 5 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:33: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 6 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:40: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 7 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:48: LT
                {
                mLT(); 


                }
                break;
            case 8 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:51: WS
                {
                mWS(); 


                }
                break;
            case 9 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:1:54: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\3\4\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\2\56\4\uffff";
    static final String DFA10_maxS =
        "\1\71\1\145\4\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\3\1\1\1\2\1\4";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "120:1: NUMBER : ( ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
 

}