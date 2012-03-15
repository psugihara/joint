// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-14 21:36:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CMP", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "'()'", "')'", "','", "'='", "'for'", "'in'", "'while'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int CMP=4;
    public static final int COMMENT=5;
    public static final int DEDENT=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int HEX_DIGIT=9;
    public static final int ID=10;
    public static final int INDENT=11;
    public static final int LT=12;
    public static final int NUMBER=13;
    public static final int OCTAL_ESC=14;
    public static final int STRING=15;
    public static final int UNICODE_ESC=16;
    public static final int WS=17;

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
    public String getGrammarFileName() { return "/Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g"; }



    // $ANTLR start "prog"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:75:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:75:5: ( block EOF )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:75:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog36);
            block();

            state._fsp--;
            if (state.failed) return ;

            match(input,EOF,FOLLOW_EOF_in_prog38); if (state.failed) return ;

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:1: block : ( iblock | expr | LT )+ ;
    public final void block() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:2: ( ( iblock | expr | LT )+ )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:4: ( iblock | expr | LT )+
            {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:4: ( iblock | expr | LT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case INDENT:
                    {
                    alt1=1;
                    }
                    break;
                case ID:
                case 18:
                case 23:
                case 25:
                    {
                    alt1=2;
                    }
                    break;
                case LT:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:5: iblock
            	    {
            	    pushFollow(FOLLOW_iblock_in_block53);
            	    iblock();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:12: expr
            	    {
            	    pushFollow(FOLLOW_expr_in_block55);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:17: LT
            	    {
            	    match(input,LT,FOLLOW_LT_in_block57); if (state.failed) return ;

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



    // $ANTLR start "iblock"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:5: ( INDENT block DEDENT )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:7: INDENT block DEDENT
            {
            match(input,INDENT,FOLLOW_INDENT_in_iblock74); if (state.failed) return ;

            pushFollow(FOLLOW_block_in_iblock76);
            block();

            state._fsp--;
            if (state.failed) return ;

            match(input,DEDENT,FOLLOW_DEDENT_in_iblock78); if (state.failed) return ;

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



    // $ANTLR start "func"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:1: func : ( args '~' expr | args '~' LT iblock );
    public final void func() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:5: ( args '~' expr | args '~' LT iblock )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:7: args '~' expr
                    {
                    pushFollow(FOLLOW_args_in_func93);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,26,FOLLOW_26_in_func95); if (state.failed) return ;

                    pushFollow(FOLLOW_expr_in_func97);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:4: args '~' LT iblock
                    {
                    pushFollow(FOLLOW_args_in_func102);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,26,FOLLOW_26_in_func104); if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_func106); if (state.failed) return ;

                    pushFollow(FOLLOW_iblock_in_func108);
                    iblock();

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
    // $ANTLR end "func"



    // $ANTLR start "call"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:1: call : ( '(' func ')' args | ID args );
    public final void call() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:5: ( '(' func ')' args | ID args )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:7: '(' func ')' args
                    {
                    match(input,18,FOLLOW_18_in_call117); if (state.failed) return ;

                    pushFollow(FOLLOW_func_in_call118);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,20,FOLLOW_20_in_call119); if (state.failed) return ;

                    pushFollow(FOLLOW_args_in_call121);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:4: ID args
                    {
                    match(input,ID,FOLLOW_ID_in_call126); if (state.failed) return ;

                    pushFollow(FOLLOW_args_in_call128);
                    args();

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
    // $ANTLR end "call"



    // $ANTLR start "args"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:1: args : ( '(' ID ( ',' ID )* ')' | '()' );
    public final void args() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:5: ( '(' ID ( ',' ID )* ')' | '()' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
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
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:7: '(' ID ( ',' ID )* ')'
                    {
                    match(input,18,FOLLOW_18_in_args137); if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_args139); if (state.failed) return ;

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:14: ( ',' ID )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:15: ',' ID
                    	    {
                    	    match(input,21,FOLLOW_21_in_args142); if (state.failed) return ;

                    	    match(input,ID,FOLLOW_ID_in_args144); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match(input,20,FOLLOW_20_in_args148); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:4: '()'
                    {
                    match(input,19,FOLLOW_19_in_args153); if (state.failed) return ;

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
    // $ANTLR end "args"



    // $ANTLR start "expr"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:1: expr : ( assign | call | control );
    public final void expr() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:5: ( assign | call | control )
            int alt6=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==22) ) {
                    alt6=1;
                }
                else if ( ((LA6_1 >= 18 && LA6_1 <= 19)) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 23:
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:9: assign
                    {
                    pushFollow(FOLLOW_assign_in_expr165);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:9: call
                    {
                    pushFollow(FOLLOW_call_in_expr175);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:7: control
                    {
                    pushFollow(FOLLOW_control_in_expr183);
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
    // $ANTLR end "expr"



    // $ANTLR start "control"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:1: control : ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock );
    public final void control() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:2: ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:6: 'for' ID 'in' ID LT iblock
                    {
                    match(input,23,FOLLOW_23_in_control203); if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_control205); if (state.failed) return ;

                    match(input,24,FOLLOW_24_in_control207); if (state.failed) return ;

                    match(input,ID,FOLLOW_ID_in_control209); if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_control211); if (state.failed) return ;

                    pushFollow(FOLLOW_iblock_in_control213);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:6: 'while' bool LT iblock
                    {
                    match(input,25,FOLLOW_25_in_control220); if (state.failed) return ;

                    pushFollow(FOLLOW_bool_in_control222);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,LT,FOLLOW_LT_in_control224); if (state.failed) return ;

                    pushFollow(FOLLOW_iblock_in_control226);
                    iblock();

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



    // $ANTLR start "bool"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:1: bool : ( ( ( atom | ID | call ) CMP )=> ( atom | ID | call ) CMP bool | ( atom | ID | call ) );
    public final void bool() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:5: ( ( ( atom | ID | call ) CMP )=> ( atom | ID | call ) CMP bool | ( atom | ID | call ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred1_Pass()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred1_Pass()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
                }
                break;
            case 18:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred1_Pass()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:7: ( ( atom | ID | call ) CMP )=> ( atom | ID | call ) CMP bool
                    {
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:31: ( atom | ID | call )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt8=1;
                        }
                        break;
                    case ID:
                        {
                        int LA8_2 = input.LA(2);

                        if ( (LA8_2==CMP) ) {
                            alt8=2;
                        }
                        else if ( ((LA8_2 >= 18 && LA8_2 <= 19)) ) {
                            alt8=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 18:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }

                    switch (alt8) {
                        case 1 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:32: atom
                            {
                            pushFollow(FOLLOW_atom_in_bool255);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:37: ID
                            {
                            match(input,ID,FOLLOW_ID_in_bool257); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:40: call
                            {
                            pushFollow(FOLLOW_call_in_bool259);
                            call();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,CMP,FOLLOW_CMP_in_bool262); if (state.failed) return ;

                    pushFollow(FOLLOW_bool_in_bool264);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:9: ( atom | ID | call )
                    {
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:9: ( atom | ID | call )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt9=1;
                        }
                        break;
                    case ID:
                        {
                        int LA9_2 = input.LA(2);

                        if ( (LA9_2==LT) ) {
                            alt9=2;
                        }
                        else if ( ((LA9_2 >= 18 && LA9_2 <= 19)) ) {
                            alt9=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 2, input);

                            throw nvae;

                        }
                        }
                        break;
                    case 18:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }

                    switch (alt9) {
                        case 1 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:10: atom
                            {
                            pushFollow(FOLLOW_atom_in_bool275);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:15: ID
                            {
                            match(input,ID,FOLLOW_ID_in_bool277); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:18: call
                            {
                            pushFollow(FOLLOW_call_in_bool279);
                            call();

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
    // $ANTLR end "bool"



    // $ANTLR start "assign"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:1: assign : ID '=' ( atom | func | ID | call ) ;
    public final void assign() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:5: ( ID '=' ( atom | func | ID | call ) )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ID '=' ( atom | func | ID | call )
            {
            match(input,ID,FOLLOW_ID_in_assign296); if (state.failed) return ;

            match(input,22,FOLLOW_22_in_assign298); if (state.failed) return ;

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:16: ( atom | func | ID | call )
            int alt11=4;
            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==ID) ) {
                    alt11=2;
                }
                else if ( ((LA11_2 >= 18 && LA11_2 <= 19)) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case EOF:
                case DEDENT:
                case ID:
                case INDENT:
                case LT:
                case 20:
                case 23:
                case 25:
                    {
                    alt11=3;
                    }
                    break;
                case 18:
                    {
                    int LA11_7 = input.LA(3);

                    if ( (LA11_7==ID) ) {
                        alt11=4;
                    }
                    else if ( ((LA11_7 >= 18 && LA11_7 <= 19)) ) {
                        alt11=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                case 19:
                    {
                    alt11=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:17: atom
                    {
                    pushFollow(FOLLOW_atom_in_assign301);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:22: func
                    {
                    pushFollow(FOLLOW_func_in_assign303);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:27: ID
                    {
                    match(input,ID,FOLLOW_ID_in_assign305); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:30: call
                    {
                    pushFollow(FOLLOW_call_in_assign307);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "assign"



    // $ANTLR start "atom"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:5: ( NUMBER | STRING )
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
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

    // $ANTLR start synpred1_Pass
    public final void synpred1_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:7: ( ( atom | ID | call ) CMP )
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:8: ( atom | ID | call ) CMP
        {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:8: ( atom | ID | call )
        int alt12=3;
        switch ( input.LA(1) ) {
        case NUMBER:
        case STRING:
            {
            alt12=1;
            }
            break;
        case ID:
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2==CMP) ) {
                alt12=2;
            }
            else if ( ((LA12_2 >= 18 && LA12_2 <= 19)) ) {
                alt12=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 2, input);

                throw nvae;

            }
            }
            break;
        case 18:
            {
            alt12=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 12, 0, input);

            throw nvae;

        }

        switch (alt12) {
            case 1 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:9: atom
                {
                pushFollow(FOLLOW_atom_in_synpred1_Pass242);
                atom();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:14: ID
                {
                match(input,ID,FOLLOW_ID_in_synpred1_Pass244); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:17: call
                {
                pushFollow(FOLLOW_call_in_synpred1_Pass246);
                call();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,CMP,FOLLOW_CMP_in_synpred1_Pass249); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Pass

    // Delegated rules

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


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\22\1\12\1\32\1\24\2\12\1\32\2\uffff\1\24";
    static final String DFA2_maxS =
        "\1\23\1\12\1\32\1\25\1\31\1\12\1\32\2\uffff\1\25";
    static final String DFA2_acceptS =
        "\7\uffff\1\2\1\1\1\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\6\1\5",
            "\1\10\1\uffff\1\7\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10",
            "\1\11",
            "\1\4",
            "",
            "",
            "\1\6\1\5"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "94:1: func : ( args '~' expr | args '~' LT iblock );";
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog36 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iblock_in_block53 = new BitSet(new long[]{0x0000000002841C02L});
    public static final BitSet FOLLOW_expr_in_block55 = new BitSet(new long[]{0x0000000002841C02L});
    public static final BitSet FOLLOW_LT_in_block57 = new BitSet(new long[]{0x0000000002841C02L});
    public static final BitSet FOLLOW_INDENT_in_iblock74 = new BitSet(new long[]{0x0000000002841C00L});
    public static final BitSet FOLLOW_block_in_iblock76 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEDENT_in_iblock78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func93 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_func95 = new BitSet(new long[]{0x0000000002840400L});
    public static final BitSet FOLLOW_expr_in_func97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func102 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_func104 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_func106 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_iblock_in_func108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_call117 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_func_in_call118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_call119 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_args_in_call121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call126 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_args_in_call128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_args137 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_args139 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_args142 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_args144 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_args148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_args153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_expr183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_control203 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_control205 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_control207 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_control209 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_control211 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_iblock_in_control213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_control220 = new BitSet(new long[]{0x000000000004A400L});
    public static final BitSet FOLLOW_bool_in_control222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_control224 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_iblock_in_control226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_bool257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_call_in_bool259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CMP_in_bool262 = new BitSet(new long[]{0x000000000004A400L});
    public static final BitSet FOLLOW_bool_in_bool264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_bool277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_bool279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign296 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assign298 = new BitSet(new long[]{0x00000000000CA400L});
    public static final BitSet FOLLOW_atom_in_assign301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_assign303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_assign307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred1_Pass242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_call_in_synpred1_Pass246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CMP_in_synpred1_Pass249 = new BitSet(new long[]{0x0000000000000002L});

}