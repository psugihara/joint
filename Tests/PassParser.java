// $ANTLR 3.4 Pass.g 2012-04-05 22:26:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITH_ASSIGN", "BOP", "CMP", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "'='", "'['", "']'", "'break'", "'else'", "'for'", "'if'", "'in'", "'return'", "'while'", "'{'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int ARITH_ASSIGN=4;
    public static final int BOP=5;
    public static final int CMP=6;
    public static final int COMMENT=7;
    public static final int DEDENT=8;
    public static final int ESC_SEQ=9;
    public static final int EXPONENT=10;
    public static final int HEX_DIGIT=11;
    public static final int ID=12;
    public static final int INDENT=13;
    public static final int LT=14;
    public static final int NUMBER=15;
    public static final int OCTAL_ESC=16;
    public static final int STRING=17;
    public static final int UNICODE_ESC=18;
    public static final int WS=19;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PassParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PassParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return PassParser.tokenNames; }
    public String getGrammarFileName() { return "Pass.g"; }



    // $ANTLR start "prog"
    // Pass.g:76:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try {
            // Pass.g:76:5: ( block EOF )
            // Pass.g:76:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog35);
            block();

            state._fsp--;
            if (state.failed) return ;

            match(input,EOF,FOLLOW_EOF_in_prog37); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "block"
    // Pass.g:79:1: block : ( stmt | LT )+ ;
    public final void block() throws RecognitionException {
        try {
            // Pass.g:80:5: ( ( stmt | LT )+ )
            // Pass.g:80:9: ( stmt | LT )+
            {
            // Pass.g:80:9: ( stmt | LT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NUMBER||LA1_0==STRING||LA1_0==21||LA1_0==33||(LA1_0 >= 35 && LA1_0 <= 36)||(LA1_0 >= 38 && LA1_0 <= 39)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==LT) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // Pass.g:80:10: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block57);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Pass.g:80:15: LT
            	    {
            	    match(input,LT,FOLLOW_LT_in_block59); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "stmt"
    // Pass.g:83:1: stmt : ( expr LT | control );
    public final void stmt() throws RecognitionException {
        try {
            // Pass.g:83:5: ( expr LT | control )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==NUMBER||LA2_0==STRING||LA2_0==21||LA2_0==33||LA2_0==38) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= 35 && LA2_0 <= 36)||LA2_0==39) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Pass.g:83:9: expr LT
                    {
                    pushFollow(FOLLOW_expr_in_stmt79);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_stmt81); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:84:9: control
                    {
                    pushFollow(FOLLOW_control_in_stmt91);
                    control();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "iblock"
    // Pass.g:87:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try {
            // Pass.g:88:5: ( INDENT block DEDENT )
            // Pass.g:88:9: INDENT block DEDENT
            {
            match(input,INDENT,FOLLOW_INDENT_in_iblock117); if (state.failed) return ;

            pushFollow(FOLLOW_block_in_iblock119);
            block();

            state._fsp--;
            if (state.failed) return ;

            match(input,DEDENT,FOLLOW_DEDENT_in_iblock121); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iblock"



    // $ANTLR start "args"
    // Pass.g:91:1: args : '(' ( argument ( ',' argument )* )? ')' ;
    public final void args() throws RecognitionException {
        try {
            // Pass.g:91:5: ( '(' ( argument ( ',' argument )* )? ')' )
            // Pass.g:91:9: '(' ( argument ( ',' argument )* )? ')'
            {
            match(input,21,FOLLOW_21_in_args135); if (state.failed) return ;

            // Pass.g:91:13: ( argument ( ',' argument )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||LA4_0==NUMBER||LA4_0==STRING||LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Pass.g:91:14: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_args138);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;

                    // Pass.g:91:23: ( ',' argument )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==25) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Pass.g:91:24: ',' argument
                    	    {
                    	    match(input,25,FOLLOW_25_in_args141); if (state.failed) return ;

                    	    pushFollow(FOLLOW_argument_in_args143);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,22,FOLLOW_22_in_args149); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "func"
    // Pass.g:94:1: func : args '~' ( expr | ( LT iblock ) ) ;
    public final void func() throws RecognitionException {
        try {
            // Pass.g:94:5: ( args '~' ( expr | ( LT iblock ) ) )
            // Pass.g:94:9: args '~' ( expr | ( LT iblock ) )
            {
            pushFollow(FOLLOW_args_in_func167);
            args();

            state._fsp--;
            if (state.failed) return ;

            match(input,42,FOLLOW_42_in_func169); if (state.failed) return ;

            // Pass.g:94:18: ( expr | ( LT iblock ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID||LA5_0==NUMBER||LA5_0==STRING||LA5_0==21||LA5_0==33||LA5_0==38) ) {
                alt5=1;
            }
            else if ( (LA5_0==LT) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Pass.g:94:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_func172);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:94:24: ( LT iblock )
                    {
                    // Pass.g:94:24: ( LT iblock )
                    // Pass.g:94:25: LT iblock
                    {
                    match(input,LT,FOLLOW_LT_in_func175); if (state.failed) return ;

                    pushFollow(FOLLOW_iblock_in_func177);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func"



    // $ANTLR start "expr"
    // Pass.g:97:1: expr : ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | ( args '~' )=> func | short_stmt | bool );
    public final void expr() throws RecognitionException {
        try {
            // Pass.g:97:5: ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | ( args '~' )=> func | short_stmt | bool )
            int alt7=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred1_Pass()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case 21:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred2_Pass()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case 33:
            case 38:
                {
                alt7=3;
                }
                break;
            case NUMBER:
            case STRING:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // Pass.g:97:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign
                    {
                    match(input,ID,FOLLOW_ID_in_expr216); if (state.failed) return ;

                    // Pass.g:97:46: ( access )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==27||LA6_0==31) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Pass.g:97:46: access
                            {
                            pushFollow(FOLLOW_access_in_expr218);
                            access();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_assign_in_expr221);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:98:9: ( args '~' )=> func
                    {
                    pushFollow(FOLLOW_func_in_expr239);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Pass.g:99:9: short_stmt
                    {
                    pushFollow(FOLLOW_short_stmt_in_expr249);
                    short_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Pass.g:100:9: bool
                    {
                    pushFollow(FOLLOW_bool_in_expr259);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "short_stmt"
    // Pass.g:103:1: short_stmt : ( return_stmt | break_stmt );
    public final void short_stmt() throws RecognitionException {
        try {
            // Pass.g:104:5: ( return_stmt | break_stmt )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==33) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Pass.g:104:9: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_short_stmt278);
                    return_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:105:9: break_stmt
                    {
                    pushFollow(FOLLOW_break_stmt_in_short_stmt288);
                    break_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "short_stmt"



    // $ANTLR start "break_stmt"
    // Pass.g:108:1: break_stmt : 'break' ;
    public final void break_stmt() throws RecognitionException {
        try {
            // Pass.g:109:5: ( 'break' )
            // Pass.g:109:9: 'break'
            {
            match(input,33,FOLLOW_33_in_break_stmt311); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "break_stmt"



    // $ANTLR start "return_stmt"
    // Pass.g:112:1: return_stmt : 'return' argument ;
    public final void return_stmt() throws RecognitionException {
        try {
            // Pass.g:113:5: ( 'return' argument )
            // Pass.g:113:9: 'return' argument
            {
            match(input,38,FOLLOW_38_in_return_stmt330); if (state.failed) return ;

            pushFollow(FOLLOW_argument_in_return_stmt332);
            argument();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "return_stmt"



    // $ANTLR start "bool"
    // Pass.g:116:1: bool : logic ( CMP logic )* ;
    public final void bool() throws RecognitionException {
        try {
            // Pass.g:116:5: ( logic ( CMP logic )* )
            // Pass.g:116:9: logic ( CMP logic )*
            {
            pushFollow(FOLLOW_logic_in_bool346);
            logic();

            state._fsp--;
            if (state.failed) return ;

            // Pass.g:116:15: ( CMP logic )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CMP) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Pass.g:116:16: CMP logic
            	    {
            	    match(input,CMP,FOLLOW_CMP_in_bool349); if (state.failed) return ;

            	    pushFollow(FOLLOW_logic_in_bool351);
            	    logic();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "bool"



    // $ANTLR start "logic"
    // Pass.g:119:1: logic : eval ( BOP eval )* ;
    public final void logic() throws RecognitionException {
        try {
            // Pass.g:120:5: ( eval ( BOP eval )* )
            // Pass.g:120:9: eval ( BOP eval )*
            {
            pushFollow(FOLLOW_eval_in_logic372);
            eval();

            state._fsp--;
            if (state.failed) return ;

            // Pass.g:120:14: ( BOP eval )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BOP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Pass.g:120:15: BOP eval
            	    {
            	    match(input,BOP,FOLLOW_BOP_in_logic375); if (state.failed) return ;

            	    pushFollow(FOLLOW_eval_in_logic377);
            	    eval();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "logic"



    // $ANTLR start "eval"
    // Pass.g:123:1: eval : term ( ( '+' | '-' ) term )* ;
    public final void eval() throws RecognitionException {
        try {
            // Pass.g:123:5: ( term ( ( '+' | '-' ) term )* )
            // Pass.g:123:9: term ( ( '+' | '-' ) term )*
            {
            pushFollow(FOLLOW_term_in_eval393);
            term();

            state._fsp--;
            if (state.failed) return ;

            // Pass.g:123:14: ( ( '+' | '-' ) term )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Pass.g:123:15: ( '+' | '-' ) term
            	    {
            	    if ( input.LA(1)==24||input.LA(1)==26 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_eval402);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "eval"



    // $ANTLR start "term"
    // Pass.g:126:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // Pass.g:126:5: ( factor ( ( '*' | '/' | '%' ) factor )* )
            // Pass.g:126:9: factor ( ( '*' | '/' | '%' ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term418);
            factor();

            state._fsp--;
            if (state.failed) return ;

            // Pass.g:126:16: ( ( '*' | '/' | '%' ) factor )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20||LA12_0==23||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Pass.g:126:17: ( '*' | '/' | '%' ) factor
            	    {
            	    if ( input.LA(1)==20||input.LA(1)==23||input.LA(1)==28 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term429);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // Pass.g:129:1: factor : ( '(' factor_p | value );
    public final void factor() throws RecognitionException {
        try {
            // Pass.g:130:5: ( '(' factor_p | value )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            else if ( (LA13_0==ID||LA13_0==NUMBER||LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // Pass.g:130:9: '(' factor_p
                    {
                    match(input,21,FOLLOW_21_in_factor450); if (state.failed) return ;

                    pushFollow(FOLLOW_factor_p_in_factor452);
                    factor_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:131:10: value
                    {
                    pushFollow(FOLLOW_value_in_factor463);
                    value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "factor_p"
    // Pass.g:135:1: factor_p : ( ( args '~' )=> func ')' args | bool ')' );
    public final void factor_p() throws RecognitionException {
        try {
            // Pass.g:136:5: ( ( args '~' )=> func ')' args | bool ')' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA14_0==ID||LA14_0==NUMBER||LA14_0==STRING) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Pass.g:136:9: ( args '~' )=> func ')' args
                    {
                    pushFollow(FOLLOW_func_in_factor_p492);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,22,FOLLOW_22_in_factor_p494); if (state.failed) return ;

                    pushFollow(FOLLOW_args_in_factor_p495);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:137:9: bool ')'
                    {
                    pushFollow(FOLLOW_bool_in_factor_p505);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,22,FOLLOW_22_in_factor_p507); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor_p"



    // $ANTLR start "access"
    // Pass.g:140:1: access : ( '[' NUMBER ']' | '.' ID );
    public final void access() throws RecognitionException {
        try {
            // Pass.g:141:5: ( '[' NUMBER ']' | '.' ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==27) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // Pass.g:141:9: '[' NUMBER ']'
                    {
                    match(input,31,FOLLOW_31_in_access533); if (state.failed) return ;

                    match(input,NUMBER,FOLLOW_NUMBER_in_access535); if (state.failed) return ;

                    match(input,32,FOLLOW_32_in_access537); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:142:9: '.' ID
                    {
                    match(input,27,FOLLOW_27_in_access547); if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_access549); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "access"



    // $ANTLR start "value"
    // Pass.g:145:1: value : ( atom | ID ( mod )* );
    public final void value() throws RecognitionException {
        try {
            // Pass.g:146:5: ( atom | ID ( mod )* )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NUMBER||LA17_0==STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // Pass.g:146:9: atom
                    {
                    pushFollow(FOLLOW_atom_in_value568);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:147:9: ID ( mod )*
                    {
                    match(input,ID,FOLLOW_ID_in_value578); if (state.failed) return ;

                    // Pass.g:147:12: ( mod )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21||LA16_0==27||LA16_0==31) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Pass.g:147:12: mod
                    	    {
                    	    pushFollow(FOLLOW_mod_in_value580);
                    	    mod();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "mod"
    // Pass.g:150:1: mod : ( args | access );
    public final void mod() throws RecognitionException {
        try {
            // Pass.g:150:5: ( args | access )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==27||LA18_0==31) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Pass.g:150:9: args
                    {
                    pushFollow(FOLLOW_args_in_mod596);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:151:9: access
                    {
                    pushFollow(FOLLOW_access_in_mod606);
                    access();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "mod"



    // $ANTLR start "atom"
    // Pass.g:154:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try {
            // Pass.g:154:5: ( NUMBER | STRING )
            // Pass.g:
            {
            if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "atom"



    // $ANTLR start "control"
    // Pass.g:158:1: control : ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test );
    public final void control() throws RecognitionException {
        try {
            // Pass.g:159:5: ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 39:
                {
                alt21=2;
                }
                break;
            case 36:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // Pass.g:159:9: 'for' ID 'in' ID ( mod )? LT iblock
                    {
                    match(input,35,FOLLOW_35_in_control649); if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_control651); if (state.failed) return ;

                    match(input,37,FOLLOW_37_in_control653); if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_control655); if (state.failed) return ;

                    // Pass.g:159:26: ( mod )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==21||LA19_0==27||LA19_0==31) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Pass.g:159:26: mod
                            {
                            pushFollow(FOLLOW_mod_in_control657);
                            mod();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,LT,FOLLOW_LT_in_control660); if (state.failed) return ;

                    pushFollow(FOLLOW_iblock_in_control662);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:160:9: 'while' bool LT iblock
                    {
                    match(input,39,FOLLOW_39_in_control672); if (state.failed) return ;

                    pushFollow(FOLLOW_bool_in_control674);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_control676); if (state.failed) return ;

                    pushFollow(FOLLOW_iblock_in_control678);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Pass.g:161:9: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    match(input,36,FOLLOW_36_in_control688); if (state.failed) return ;

                    pushFollow(FOLLOW_bool_in_control690);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    // Pass.g:161:19: ( return_stmt LT | LT iblock )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==38) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==LT) ) {
                        alt20=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // Pass.g:161:20: return_stmt LT
                            {
                            pushFollow(FOLLOW_return_stmt_in_control693);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,LT,FOLLOW_LT_in_control695); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Pass.g:161:35: LT iblock
                            {
                            match(input,LT,FOLLOW_LT_in_control697); if (state.failed) return ;

                            pushFollow(FOLLOW_iblock_in_control699);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_else_test_in_control702);
                    else_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "control"



    // $ANTLR start "else_test"
    // Pass.g:165:1: else_test : ( 'else' else_p |);
    public final void else_test() throws RecognitionException {
        try {
            // Pass.g:166:5: ( 'else' else_p |)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            else if ( (LA22_0==EOF||LA22_0==DEDENT||LA22_0==ID||(LA22_0 >= LT && LA22_0 <= NUMBER)||LA22_0==STRING||LA22_0==21||LA22_0==33||(LA22_0 >= 35 && LA22_0 <= 36)||(LA22_0 >= 38 && LA22_0 <= 39)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Pass.g:166:10: 'else' else_p
                    {
                    match(input,34,FOLLOW_34_in_else_test724); if (state.failed) return ;

                    pushFollow(FOLLOW_else_p_in_else_test726);
                    else_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:168:5: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "else_test"



    // $ANTLR start "else_p"
    // Pass.g:170:1: else_p : ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) );
    public final void else_p() throws RecognitionException {
        try {
            // Pass.g:171:5: ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            else if ( (LA25_0==LT||LA25_0==38) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // Pass.g:171:10: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    match(input,36,FOLLOW_36_in_else_p752); if (state.failed) return ;

                    pushFollow(FOLLOW_bool_in_else_p754);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    // Pass.g:171:20: ( return_stmt LT | LT iblock )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==LT) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }
                    switch (alt23) {
                        case 1 :
                            // Pass.g:171:21: return_stmt LT
                            {
                            pushFollow(FOLLOW_return_stmt_in_else_p757);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,LT,FOLLOW_LT_in_else_p759); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Pass.g:171:36: LT iblock
                            {
                            match(input,LT,FOLLOW_LT_in_else_p761); if (state.failed) return ;

                            pushFollow(FOLLOW_iblock_in_else_p763);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_else_test_in_else_p766);
                    else_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:172:10: ( return_stmt LT | LT iblock )
                    {
                    // Pass.g:172:10: ( return_stmt LT | LT iblock )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==38) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==LT) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;

                    }
                    switch (alt24) {
                        case 1 :
                            // Pass.g:172:11: return_stmt LT
                            {
                            pushFollow(FOLLOW_return_stmt_in_else_p778);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,LT,FOLLOW_LT_in_else_p780); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Pass.g:172:26: LT iblock
                            {
                            match(input,LT,FOLLOW_LT_in_else_p782); if (state.failed) return ;

                            pushFollow(FOLLOW_iblock_in_else_p784);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "else_p"



    // $ANTLR start "assign"
    // Pass.g:175:1: assign : ( '=' ( argument | dictionary_definition | array_definition ) | ARITH_ASSIGN bool );
    public final void assign() throws RecognitionException {
        try {
            // Pass.g:176:5: ( '=' ( argument | dictionary_definition | array_definition ) | ARITH_ASSIGN bool )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            else if ( (LA27_0==ARITH_ASSIGN) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // Pass.g:176:9: '=' ( argument | dictionary_definition | array_definition )
                    {
                    match(input,30,FOLLOW_30_in_assign808); if (state.failed) return ;

                    // Pass.g:176:13: ( argument | dictionary_definition | array_definition )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case ID:
                    case NUMBER:
                    case STRING:
                    case 21:
                        {
                        alt26=1;
                        }
                        break;
                    case 40:
                        {
                        alt26=2;
                        }
                        break;
                    case 31:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }

                    switch (alt26) {
                        case 1 :
                            // Pass.g:176:14: argument
                            {
                            pushFollow(FOLLOW_argument_in_assign811);
                            argument();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // Pass.g:176:23: dictionary_definition
                            {
                            pushFollow(FOLLOW_dictionary_definition_in_assign813);
                            dictionary_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // Pass.g:176:45: array_definition
                            {
                            pushFollow(FOLLOW_array_definition_in_assign815);
                            array_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Pass.g:177:9: ARITH_ASSIGN bool
                    {
                    match(input,ARITH_ASSIGN,FOLLOW_ARITH_ASSIGN_in_assign826); if (state.failed) return ;

                    pushFollow(FOLLOW_bool_in_assign828);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign"



    // $ANTLR start "dictionary_definition"
    // Pass.g:180:1: dictionary_definition : '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' ;
    public final void dictionary_definition() throws RecognitionException {
        try {
            // Pass.g:181:5: ( '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' )
            // Pass.g:181:9: '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}'
            {
            match(input,40,FOLLOW_40_in_dictionary_definition847); if (state.failed) return ;

            // Pass.g:181:13: ( dictionary_entry ( ',' dictionary_entry )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Pass.g:181:14: dictionary_entry ( ',' dictionary_entry )*
                    {
                    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition850);
                    dictionary_entry();

                    state._fsp--;
                    if (state.failed) return ;

                    // Pass.g:181:31: ( ',' dictionary_entry )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==25) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Pass.g:181:32: ',' dictionary_entry
                    	    {
                    	    match(input,25,FOLLOW_25_in_dictionary_definition853); if (state.failed) return ;

                    	    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition855);
                    	    dictionary_entry();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,41,FOLLOW_41_in_dictionary_definition861); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dictionary_definition"



    // $ANTLR start "dictionary_entry"
    // Pass.g:184:1: dictionary_entry : ID ':' atom ;
    public final void dictionary_entry() throws RecognitionException {
        try {
            // Pass.g:185:5: ( ID ':' atom )
            // Pass.g:185:9: ID ':' atom
            {
            match(input,ID,FOLLOW_ID_in_dictionary_entry880); if (state.failed) return ;

            match(input,29,FOLLOW_29_in_dictionary_entry882); if (state.failed) return ;

            pushFollow(FOLLOW_atom_in_dictionary_entry884);
            atom();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dictionary_entry"



    // $ANTLR start "array_definition"
    // Pass.g:188:1: array_definition : '[' ( argument ( ',' argument )* )? ']' ;
    public final void array_definition() throws RecognitionException {
        try {
            // Pass.g:189:5: ( '[' ( argument ( ',' argument )* )? ']' )
            // Pass.g:189:9: '[' ( argument ( ',' argument )* )? ']'
            {
            match(input,31,FOLLOW_31_in_array_definition908); if (state.failed) return ;

            // Pass.g:189:13: ( argument ( ',' argument )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID||LA31_0==NUMBER||LA31_0==STRING||LA31_0==21) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Pass.g:189:14: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_array_definition911);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;

                    // Pass.g:189:23: ( ',' argument )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==25) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Pass.g:189:24: ',' argument
                    	    {
                    	    match(input,25,FOLLOW_25_in_array_definition914); if (state.failed) return ;

                    	    pushFollow(FOLLOW_argument_in_array_definition916);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,32,FOLLOW_32_in_array_definition922); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "array_definition"



    // $ANTLR start "argument"
    // Pass.g:192:1: argument : ( ( args '~' )=> func | ( '(' args '~' )=> '(' func ')' args | bool );
    public final void argument() throws RecognitionException {
        try {
            // Pass.g:193:5: ( ( args '~' )=> func | ( '(' args '~' )=> '(' func ')' args | bool )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred4_Pass()) ) {
                    alt32=1;
                }
                else if ( (synpred5_Pass()) ) {
                    alt32=2;
                }
                else if ( (true) ) {
                    alt32=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA32_0==ID||LA32_0==NUMBER||LA32_0==STRING) ) {
                alt32=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Pass.g:193:9: ( args '~' )=> func
                    {
                    pushFollow(FOLLOW_func_in_argument952);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Pass.g:194:9: ( '(' args '~' )=> '(' func ')' args
                    {
                    match(input,21,FOLLOW_21_in_argument971); if (state.failed) return ;

                    pushFollow(FOLLOW_func_in_argument973);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,22,FOLLOW_22_in_argument975); if (state.failed) return ;

                    pushFollow(FOLLOW_args_in_argument977);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Pass.g:195:9: bool
                    {
                    pushFollow(FOLLOW_bool_in_argument987);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "argument"

    // $ANTLR start synpred1_Pass
    public final void synpred1_Pass_fragment() throws RecognitionException {
        // Pass.g:97:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )
        // Pass.g:97:10: ID ( access )? ( '=' | ARITH_ASSIGN )
        {
        match(input,ID,FOLLOW_ID_in_synpred1_Pass203); if (state.failed) return ;

        // Pass.g:97:13: ( access )?
        int alt33=2;
        int LA33_0 = input.LA(1);

        if ( (LA33_0==27||LA33_0==31) ) {
            alt33=1;
        }
        switch (alt33) {
            case 1 :
                // Pass.g:97:13: access
                {
                pushFollow(FOLLOW_access_in_synpred1_Pass205);
                access();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        if ( input.LA(1)==ARITH_ASSIGN||input.LA(1)==30 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred1_Pass

    // $ANTLR start synpred2_Pass
    public final void synpred2_Pass_fragment() throws RecognitionException {
        // Pass.g:98:9: ( args '~' )
        // Pass.g:98:10: args '~'
        {
        pushFollow(FOLLOW_args_in_synpred2_Pass232);
        args();

        state._fsp--;
        if (state.failed) return ;

        match(input,42,FOLLOW_42_in_synpred2_Pass234); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Pass

    // $ANTLR start synpred3_Pass
    public final void synpred3_Pass_fragment() throws RecognitionException {
        // Pass.g:136:9: ( args '~' )
        // Pass.g:136:10: args '~'
        {
        pushFollow(FOLLOW_args_in_synpred3_Pass485);
        args();

        state._fsp--;
        if (state.failed) return ;

        match(input,42,FOLLOW_42_in_synpred3_Pass487); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Pass

    // $ANTLR start synpred4_Pass
    public final void synpred4_Pass_fragment() throws RecognitionException {
        // Pass.g:193:9: ( args '~' )
        // Pass.g:193:10: args '~'
        {
        pushFollow(FOLLOW_args_in_synpred4_Pass946);
        args();

        state._fsp--;
        if (state.failed) return ;

        match(input,42,FOLLOW_42_in_synpred4_Pass948); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Pass

    // $ANTLR start synpred5_Pass
    public final void synpred5_Pass_fragment() throws RecognitionException {
        // Pass.g:194:9: ( '(' args '~' )
        // Pass.g:194:10: '(' args '~'
        {
        match(input,21,FOLLOW_21_in_synpred5_Pass963); if (state.failed) return ;

        pushFollow(FOLLOW_args_in_synpred5_Pass965);
        args();

        state._fsp--;
        if (state.failed) return ;

        match(input,42,FOLLOW_42_in_synpred5_Pass967); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Pass

    // Delegated rules

    public final boolean synpred5_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_block_in_prog35 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block57 = new BitSet(new long[]{0x000000DA0022D002L});
    public static final BitSet FOLLOW_LT_in_block59 = new BitSet(new long[]{0x000000DA0022D002L});
    public static final BitSet FOLLOW_expr_in_stmt79 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_stmt81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_stmt91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_iblock117 = new BitSet(new long[]{0x000000DA0022D000L});
    public static final BitSet FOLLOW_block_in_iblock119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DEDENT_in_iblock121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_args135 = new BitSet(new long[]{0x0000000000629000L});
    public static final BitSet FOLLOW_argument_in_args138 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_args141 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_args143 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_args149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func167 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_func169 = new BitSet(new long[]{0x000000420022D000L});
    public static final BitSet FOLLOW_expr_in_func172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func175 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_func177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr216 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_expr218 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_assign_in_expr221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_expr239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_stmt_in_expr249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_expr259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_short_stmt278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_short_stmt288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_break_stmt311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_return_stmt330 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_return_stmt332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_bool346 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CMP_in_bool349 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_logic_in_bool351 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_eval_in_logic372 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BOP_in_logic375 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_eval_in_logic377 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_term_in_eval393 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_set_in_eval396 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_term_in_eval402 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_factor_in_term418 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_set_in_term421 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_in_term429 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_21_in_factor450 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_p_in_factor452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_factor463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_factor_p492 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor_p494 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_factor_p495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_factor_p505 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor_p507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_access533 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUMBER_in_access535 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_access537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_access547 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_access549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_value568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value578 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_mod_in_value580 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_args_in_mod596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_mod606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control649 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control651 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control653 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control655 = new BitSet(new long[]{0x0000000088204000L});
    public static final BitSet FOLLOW_mod_in_control657 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control660 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_control672 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control674 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control676 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_control688 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control690 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_control693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control695 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_control697 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control699 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_control702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_else_test724 = new BitSet(new long[]{0x0000005000004000L});
    public static final BitSet FOLLOW_else_p_in_else_test726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_else_p752 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_else_p754 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_else_p757 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p759 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_else_p761 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p763 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_else_p766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_p778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_p782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_assign808 = new BitSet(new long[]{0x0000010080229000L});
    public static final BitSet FOLLOW_argument_in_assign811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_definition_in_assign813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_assign815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_ASSIGN_in_assign826 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_assign828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_dictionary_definition847 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition850 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_25_in_dictionary_definition853 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition855 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_41_in_dictionary_definition861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dictionary_entry880 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dictionary_entry882 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_atom_in_dictionary_entry884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array_definition908 = new BitSet(new long[]{0x0000000100229000L});
    public static final BitSet FOLLOW_argument_in_array_definition911 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_25_in_array_definition914 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_array_definition916 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_32_in_array_definition922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_argument952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_argument971 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_func_in_argument973 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_argument975 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_argument977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_argument987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass203 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_synpred1_Pass205 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_set_in_synpred1_Pass208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred2_Pass232 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred2_Pass234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred3_Pass485 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred3_Pass487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred4_Pass946 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred4_Pass948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_Pass963 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_synpred5_Pass965 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred5_Pass967 = new BitSet(new long[]{0x0000000000000002L});

}