// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-20 19:12:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOP", "CMP", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "'()'", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'else if'", "'else'", "'for'", "'if'", "'in'", "'while'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__19=19;
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
    public static final int BOP=4;
    public static final int CMP=5;
    public static final int COMMENT=6;
    public static final int DEDENT=7;
    public static final int ESC_SEQ=8;
    public static final int EXPONENT=9;
    public static final int HEX_DIGIT=10;
    public static final int ID=11;
    public static final int INDENT=12;
    public static final int LT=13;
    public static final int NUMBER=14;
    public static final int OCTAL_ESC=15;
    public static final int STRING=16;
    public static final int UNICODE_ESC=17;
    public static final int WS=18;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "iblock", "atom", "synpred5_Pass", "synpred3_Pass", "term", 
    "factor", "assign", "func", "synpred2_Pass", "args", "expr", "block", 
    "synpred1_Pass", "arithmetic", "prog", "synpred4_Pass", "call", "control", 
    "bool"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, true, false, false, 
        false, true, false, false, false, false, false, true, false, true, 
        false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public PassParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public PassParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public PassParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return PassParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g"; }



    // $ANTLR start "prog"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:75:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:75:5: ( block EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:75:9: block EOF
            {
            dbg.location(75,9);
            pushFollow(FOLLOW_block_in_prog36);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(75,15);
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
        dbg.location(76, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "block"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:1: block : ( iblock | expr | LT )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:2: ( ( iblock | expr | LT )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:4: ( iblock | expr | LT )+
            {
            dbg.location(79,4);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:4: ( iblock | expr | LT )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=4;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                switch ( input.LA(1) ) {
                case INDENT:
                    {
                    alt1=1;
                    }
                    break;
                case ID:
                case NUMBER:
                case 19:
                case 30:
                case 31:
                case 33:
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

                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:5: iblock
            	    {
            	    dbg.location(79,5);
            	    pushFollow(FOLLOW_iblock_in_block53);
            	    iblock();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:12: expr
            	    {
            	    dbg.location(79,12);
            	    pushFollow(FOLLOW_expr_in_block55);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:17: LT
            	    {
            	    dbg.location(79,17);
            	    match(input,LT,FOLLOW_LT_in_block57); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(80, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "iblock"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:7: INDENT block DEDENT
            {
            dbg.location(83,7);
            match(input,INDENT,FOLLOW_INDENT_in_iblock74); if (state.failed) return ;
            dbg.location(83,14);
            pushFollow(FOLLOW_block_in_iblock76);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(83,20);
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
        dbg.location(84, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "iblock"



    // $ANTLR start "func"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:1: func : ( args '~' )=> args '~' ( expr | ( LT iblock ) ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:5: ( ( args '~' )=> args '~' ( expr | ( LT iblock ) ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:7: ( args '~' )=> args '~' ( expr | ( LT iblock ) )
            {
            dbg.location(86,20);
            pushFollow(FOLLOW_args_in_func97);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(86,25);
            match(input,34,FOLLOW_34_in_func99); if (state.failed) return ;
            dbg.location(86,29);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:29: ( expr | ( LT iblock ) )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==NUMBER||LA2_0==19||(LA2_0 >= 30 && LA2_0 <= 31)||LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==LT) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:30: expr
                    {
                    dbg.location(86,30);
                    pushFollow(FOLLOW_expr_in_func102);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:35: ( LT iblock )
                    {
                    dbg.location(86,35);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:35: ( LT iblock )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:36: LT iblock
                    {
                    dbg.location(86,36);
                    match(input,LT,FOLLOW_LT_in_func105); if (state.failed) return ;
                    dbg.location(86,39);
                    pushFollow(FOLLOW_iblock_in_func107);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(87, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "func"



    // $ANTLR start "call"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:1: call : ( '(' func ')' args | ID args );
    public final void call() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:5: ( '(' func ')' args | ID args )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:7: '(' func ')' args
                    {
                    dbg.location(89,7);
                    match(input,19,FOLLOW_19_in_call118); if (state.failed) return ;
                    dbg.location(89,10);
                    pushFollow(FOLLOW_func_in_call119);
                    func();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(89,14);
                    match(input,21,FOLLOW_21_in_call120); if (state.failed) return ;
                    dbg.location(89,18);
                    pushFollow(FOLLOW_args_in_call122);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:4: ID args
                    {
                    dbg.location(90,4);
                    match(input,ID,FOLLOW_ID_in_call127); if (state.failed) return ;
                    dbg.location(90,7);
                    pushFollow(FOLLOW_args_in_call129);
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
        dbg.location(91, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "call"



    // $ANTLR start "args"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:1: args : ( ( '(' call )=> '(' call ( ',' call )* ')' | '(' ( ID | atom | func ) ( ',' ( ID | atom | func ) )* ')' | '()' );
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:5: ( ( '(' call )=> '(' call ( ',' call )* ')' | '(' ( ID | atom | func ) ( ',' ( ID | atom | func ) )* ')' | '()' )
            int alt8=3;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred2_Pass()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA8_0==20) ) {
                alt8=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:9: ( '(' call )=> '(' call ( ',' call )* ')'
                    {
                    dbg.location(93,22);
                    match(input,19,FOLLOW_19_in_args147); if (state.failed) return ;
                    dbg.location(93,26);
                    pushFollow(FOLLOW_call_in_args149);
                    call();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(93,31);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:31: ( ',' call )*
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==24) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:32: ',' call
                    	    {
                    	    dbg.location(93,32);
                    	    match(input,24,FOLLOW_24_in_args152); if (state.failed) return ;
                    	    dbg.location(93,36);
                    	    pushFollow(FOLLOW_call_in_args154);
                    	    call();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(93,43);
                    match(input,21,FOLLOW_21_in_args158); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:9: '(' ( ID | atom | func ) ( ',' ( ID | atom | func ) )* ')'
                    {
                    dbg.location(94,9);
                    match(input,19,FOLLOW_19_in_args168); if (state.failed) return ;
                    dbg.location(94,13);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:13: ( ID | atom | func )
                    int alt5=3;
                    try { dbg.enterSubRule(5);
                    try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        alt5=1;
                        }
                        break;
                    case NUMBER:
                    case STRING:
                        {
                        alt5=2;
                        }
                        break;
                    case 19:
                    case 20:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(5);}

                    switch (alt5) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:14: ID
                            {
                            dbg.location(94,14);
                            match(input,ID,FOLLOW_ID_in_args171); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:17: atom
                            {
                            dbg.location(94,17);
                            pushFollow(FOLLOW_atom_in_args173);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:22: func
                            {
                            dbg.location(94,22);
                            pushFollow(FOLLOW_func_in_args175);
                            func();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(5);}

                    dbg.location(94,28);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:28: ( ',' ( ID | atom | func ) )*
                    try { dbg.enterSubRule(7);

                    loop7:
                    do {
                        int alt7=2;
                        try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:29: ',' ( ID | atom | func )
                    	    {
                    	    dbg.location(94,29);
                    	    match(input,24,FOLLOW_24_in_args179); if (state.failed) return ;
                    	    dbg.location(94,33);
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:33: ( ID | atom | func )
                    	    int alt6=3;
                    	    try { dbg.enterSubRule(6);
                    	    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                    	    switch ( input.LA(1) ) {
                    	    case ID:
                    	        {
                    	        alt6=1;
                    	        }
                    	        break;
                    	    case NUMBER:
                    	    case STRING:
                    	        {
                    	        alt6=2;
                    	        }
                    	        break;
                    	    case 19:
                    	    case 20:
                    	        {
                    	        alt6=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        dbg.recognitionException(nvae);
                    	        throw nvae;

                    	    }

                    	    } finally {dbg.exitDecision(6);}

                    	    switch (alt6) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:34: ID
                    	            {
                    	            dbg.location(94,34);
                    	            match(input,ID,FOLLOW_ID_in_args182); if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:37: atom
                    	            {
                    	            dbg.location(94,37);
                    	            pushFollow(FOLLOW_atom_in_args184);
                    	            atom();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 3 :
                    	            dbg.enterAlt(3);

                    	            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:42: func
                    	            {
                    	            dbg.location(94,42);
                    	            pushFollow(FOLLOW_func_in_args186);
                    	            func();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(6);}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(94,50);
                    match(input,21,FOLLOW_21_in_args191); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:4: '()'
                    {
                    dbg.location(95,4);
                    match(input,20,FOLLOW_20_in_args196); if (state.failed) return ;

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
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "expr"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:1: expr : ( assign | call | control | arithmetic );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:5: ( assign | call | control | arithmetic )
            int alt9=4;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case ID:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 30:
            case 31:
            case 33:
                {
                alt9=3;
                }
                break;
            case NUMBER:
                {
                alt9=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:9: assign
                    {
                    dbg.location(98,9);
                    pushFollow(FOLLOW_assign_in_expr208);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: call
                    {
                    dbg.location(99,9);
                    pushFollow(FOLLOW_call_in_expr218);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:7: control
                    {
                    dbg.location(100,7);
                    pushFollow(FOLLOW_control_in_expr226);
                    control();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:9: arithmetic
                    {
                    dbg.location(101,9);
                    pushFollow(FOLLOW_arithmetic_in_expr236);
                    arithmetic();

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
        dbg.location(102, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "arithmetic"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:1: arithmetic : term ( ( '+' | '-' ) term )* ;
    public final void arithmetic() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arithmetic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:5: ( term ( ( '+' | '-' ) term )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:7: term ( ( '+' | '-' ) term )*
            {
            dbg.location(105,7);
            pushFollow(FOLLOW_term_in_arithmetic253);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(105,12);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:12: ( ( '+' | '-' ) term )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==23||LA10_0==25) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:13: ( '+' | '-' ) term
            	    {
            	    dbg.location(105,13);
            	    if ( input.LA(1)==23||input.LA(1)==25 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(105,23);
            	    pushFollow(FOLLOW_term_in_arithmetic262);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(106, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arithmetic");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arithmetic"



    // $ANTLR start "term"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:1: term : factor ( ( '*' | '/' ) factor )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:5: ( factor ( ( '*' | '/' ) factor )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:7: factor ( ( '*' | '/' ) factor )*
            {
            dbg.location(108,7);
            pushFollow(FOLLOW_factor_in_term277);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(108,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:14: ( ( '*' | '/' ) factor )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==22||LA11_0==26) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:15: ( '*' | '/' ) factor
            	    {
            	    dbg.location(108,15);
            	    if ( input.LA(1)==22||input.LA(1)==26 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(108,25);
            	    pushFollow(FOLLOW_factor_in_term286);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(109, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:1: factor : ( ( ID | NUMBER ) | ( ( ID | func ) '(' )=> call | '(' arithmetic ')' );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:5: ( ( ID | NUMBER ) | ( ( ID | func ) '(' )=> call | '(' arithmetic ')' )
            int alt12=3;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA12_1 = input.LA(2);

                if ( (true) ) {
                    alt12=1;
                }
                else if ( (synpred3_Pass()) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 19:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case NUMBER:
                {
                alt12=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:7: ( ID | NUMBER )
                    {
                    dbg.location(112,7);
                    if ( input.LA(1)==ID||input.LA(1)==NUMBER ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:7: ( ( ID | func ) '(' )=> call
                    {
                    dbg.location(113,25);
                    pushFollow(FOLLOW_call_in_factor329);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:7: '(' arithmetic ')'
                    {
                    dbg.location(114,7);
                    match(input,19,FOLLOW_19_in_factor337); if (state.failed) return ;
                    dbg.location(114,11);
                    pushFollow(FOLLOW_arithmetic_in_factor339);
                    arithmetic();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(114,22);
                    match(input,21,FOLLOW_21_in_factor341); if (state.failed) return ;

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
        dbg.location(115, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "control"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:1: control : ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock | 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )? );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:2: ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock | 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )? )
            int alt15=3;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:6: 'for' ID 'in' ID LT iblock
                    {
                    dbg.location(118,6);
                    match(input,30,FOLLOW_30_in_control357); if (state.failed) return ;
                    dbg.location(118,12);
                    match(input,ID,FOLLOW_ID_in_control359); if (state.failed) return ;
                    dbg.location(118,15);
                    match(input,32,FOLLOW_32_in_control361); if (state.failed) return ;
                    dbg.location(118,20);
                    match(input,ID,FOLLOW_ID_in_control363); if (state.failed) return ;
                    dbg.location(118,23);
                    match(input,LT,FOLLOW_LT_in_control365); if (state.failed) return ;
                    dbg.location(118,26);
                    pushFollow(FOLLOW_iblock_in_control367);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:6: 'while' bool LT iblock
                    {
                    dbg.location(119,6);
                    match(input,33,FOLLOW_33_in_control374); if (state.failed) return ;
                    dbg.location(119,14);
                    pushFollow(FOLLOW_bool_in_control376);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(119,19);
                    match(input,LT,FOLLOW_LT_in_control378); if (state.failed) return ;
                    dbg.location(119,22);
                    pushFollow(FOLLOW_iblock_in_control380);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:4: 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )?
                    {
                    dbg.location(120,4);
                    match(input,31,FOLLOW_31_in_control385); if (state.failed) return ;
                    dbg.location(120,9);
                    pushFollow(FOLLOW_bool_in_control387);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(120,14);
                    match(input,LT,FOLLOW_LT_in_control389); if (state.failed) return ;
                    dbg.location(120,17);
                    pushFollow(FOLLOW_iblock_in_control391);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(120,24);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:24: ( 'else if' bool LT iblock )*
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==28) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:25: 'else if' bool LT iblock
                    	    {
                    	    dbg.location(120,25);
                    	    match(input,28,FOLLOW_28_in_control394); if (state.failed) return ;
                    	    dbg.location(120,35);
                    	    pushFollow(FOLLOW_bool_in_control396);
                    	    bool();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    dbg.location(120,40);
                    	    match(input,LT,FOLLOW_LT_in_control398); if (state.failed) return ;
                    	    dbg.location(120,43);
                    	    pushFollow(FOLLOW_iblock_in_control400);
                    	    iblock();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(120,52);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:52: ( 'else' LT iblock )?
                    int alt14=2;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==29) ) {
                        alt14=1;
                    }
                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:53: 'else' LT iblock
                            {
                            dbg.location(120,53);
                            match(input,29,FOLLOW_29_in_control405); if (state.failed) return ;
                            dbg.location(120,60);
                            match(input,LT,FOLLOW_LT_in_control407); if (state.failed) return ;
                            dbg.location(120,63);
                            pushFollow(FOLLOW_iblock_in_control409);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(14);}


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
        dbg.location(121, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "control");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "control"



    // $ANTLR start "bool"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:1: bool : ( ( ( atom | ID | call ) ( CMP | BOP ) )=> ( atom | ID | call ) ( CMP | BOP ) bool | ( atom | ID | call ) );
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:5: ( ( ( atom | ID | call ) ( CMP | BOP ) )=> ( atom | ID | call ) ( CMP | BOP ) bool | ( atom | ID | call ) )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                int LA18_1 = input.LA(2);

                if ( (synpred4_Pass()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA18_2 = input.LA(2);

                if ( (synpred4_Pass()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 19:
                {
                int LA18_3 = input.LA(2);

                if ( (synpred4_Pass()) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:7: ( ( atom | ID | call ) ( CMP | BOP ) )=> ( atom | ID | call ) ( CMP | BOP ) bool
                    {
                    dbg.location(123,37);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:37: ( atom | ID | call )
                    int alt16=3;
                    try { dbg.enterSubRule(16);
                    try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt16=1;
                        }
                        break;
                    case ID:
                        {
                        int LA16_2 = input.LA(2);

                        if ( ((LA16_2 >= BOP && LA16_2 <= CMP)) ) {
                            alt16=2;
                        }
                        else if ( ((LA16_2 >= 19 && LA16_2 <= 20)) ) {
                            alt16=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case 19:
                        {
                        alt16=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(16);}

                    switch (alt16) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:38: atom
                            {
                            dbg.location(123,38);
                            pushFollow(FOLLOW_atom_in_bool442);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:43: ID
                            {
                            dbg.location(123,43);
                            match(input,ID,FOLLOW_ID_in_bool444); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:46: call
                            {
                            dbg.location(123,46);
                            pushFollow(FOLLOW_call_in_bool446);
                            call();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}

                    dbg.location(123,52);
                    if ( (input.LA(1) >= BOP && input.LA(1) <= CMP) ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(123,62);
                    pushFollow(FOLLOW_bool_in_bool455);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:9: ( atom | ID | call )
                    {
                    dbg.location(124,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:9: ( atom | ID | call )
                    int alt17=3;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt17=1;
                        }
                        break;
                    case ID:
                        {
                        int LA17_2 = input.LA(2);

                        if ( (LA17_2==LT) ) {
                            alt17=2;
                        }
                        else if ( ((LA17_2 >= 19 && LA17_2 <= 20)) ) {
                            alt17=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case 19:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:10: atom
                            {
                            dbg.location(124,10);
                            pushFollow(FOLLOW_atom_in_bool466);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:15: ID
                            {
                            dbg.location(124,15);
                            match(input,ID,FOLLOW_ID_in_bool468); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:18: call
                            {
                            dbg.location(124,18);
                            pushFollow(FOLLOW_call_in_bool470);
                            call();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(17);}


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
        dbg.location(125, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bool");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "bool"



    // $ANTLR start "assign"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:127:1: assign : ( ID '=' ( atom | func | ID ) | ( ID '=' '(' )=> ID '=' call );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:5: ( ID '=' ( atom | func | ID ) | ( ID '=' '(' )=> ID '=' call )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                int LA20_1 = input.LA(2);

                if ( (true) ) {
                    alt20=1;
                }
                else if ( (synpred5_Pass()) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:9: ID '=' ( atom | func | ID )
                    {
                    dbg.location(128,9);
                    match(input,ID,FOLLOW_ID_in_assign487); if (state.failed) return ;
                    dbg.location(128,12);
                    match(input,27,FOLLOW_27_in_assign489); if (state.failed) return ;
                    dbg.location(128,16);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:16: ( atom | func | ID )
                    int alt19=3;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt19=1;
                        }
                        break;
                    case 19:
                    case 20:
                        {
                        alt19=2;
                        }
                        break;
                    case ID:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:17: atom
                            {
                            dbg.location(128,17);
                            pushFollow(FOLLOW_atom_in_assign492);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:22: func
                            {
                            dbg.location(128,22);
                            pushFollow(FOLLOW_func_in_assign494);
                            func();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:27: ID
                            {
                            dbg.location(128,27);
                            match(input,ID,FOLLOW_ID_in_assign496); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:9: ( ID '=' '(' )=> ID '=' call
                    {
                    dbg.location(129,24);
                    match(input,ID,FOLLOW_ID_in_assign516); if (state.failed) return ;
                    dbg.location(129,27);
                    match(input,27,FOLLOW_27_in_assign518); if (state.failed) return ;
                    dbg.location(129,31);
                    pushFollow(FOLLOW_call_in_assign520);
                    call();

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
        dbg.location(130, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assign"



    // $ANTLR start "atom"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:132:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:132:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(132,5);
            if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(134, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred2_Pass
    public final void synpred2_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:9: ( '(' call )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:10: '(' call
        {
        dbg.location(93,10);
        match(input,19,FOLLOW_19_in_synpred2_Pass141); if (state.failed) return ;
        dbg.location(93,14);
        pushFollow(FOLLOW_call_in_synpred2_Pass143);
        call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Pass

    // $ANTLR start synpred3_Pass
    public final void synpred3_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:7: ( ( ID | func ) '(' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:8: ( ID | func ) '('
        {
        dbg.location(113,8);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:8: ( ID | func )
        int alt21=2;
        try { dbg.enterSubRule(21);
        try { dbg.enterDecision(21, decisionCanBacktrack[21]);

        int LA21_0 = input.LA(1);

        if ( (LA21_0==ID) ) {
            alt21=1;
        }
        else if ( ((LA21_0 >= 19 && LA21_0 <= 20)) ) {
            alt21=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 21, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;

        }
        } finally {dbg.exitDecision(21);}

        switch (alt21) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:9: ID
                {
                dbg.location(113,9);
                match(input,ID,FOLLOW_ID_in_synpred3_Pass320); if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:12: func
                {
                dbg.location(113,12);
                pushFollow(FOLLOW_func_in_synpred3_Pass322);
                func();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(21);}

        dbg.location(113,18);
        match(input,19,FOLLOW_19_in_synpred3_Pass325); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Pass

    // $ANTLR start synpred4_Pass
    public final void synpred4_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:7: ( ( atom | ID | call ) ( CMP | BOP ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:8: ( atom | ID | call ) ( CMP | BOP )
        {
        dbg.location(123,8);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:8: ( atom | ID | call )
        int alt22=3;
        try { dbg.enterSubRule(22);
        try { dbg.enterDecision(22, decisionCanBacktrack[22]);

        switch ( input.LA(1) ) {
        case NUMBER:
        case STRING:
            {
            alt22=1;
            }
            break;
        case ID:
            {
            int LA22_2 = input.LA(2);

            if ( ((LA22_2 >= BOP && LA22_2 <= CMP)) ) {
                alt22=2;
            }
            else if ( ((LA22_2 >= 19 && LA22_2 <= 20)) ) {
                alt22=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 2, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            }
            break;
        case 19:
            {
            alt22=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 22, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;

        }

        } finally {dbg.exitDecision(22);}

        switch (alt22) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:9: atom
                {
                dbg.location(123,9);
                pushFollow(FOLLOW_atom_in_synpred4_Pass425);
                atom();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:14: ID
                {
                dbg.location(123,14);
                match(input,ID,FOLLOW_ID_in_synpred4_Pass427); if (state.failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:17: call
                {
                dbg.location(123,17);
                pushFollow(FOLLOW_call_in_synpred4_Pass429);
                call();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(22);}

        dbg.location(123,23);
        if ( (input.LA(1) >= BOP && input.LA(1) <= CMP) ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred4_Pass

    // $ANTLR start synpred5_Pass
    public final void synpred5_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:9: ( ID '=' '(' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:10: ID '=' '('
        {
        dbg.location(129,10);
        match(input,ID,FOLLOW_ID_in_synpred5_Pass508); if (state.failed) return ;
        dbg.location(129,13);
        match(input,27,FOLLOW_27_in_synpred5_Pass510); if (state.failed) return ;
        dbg.location(129,17);
        match(input,19,FOLLOW_19_in_synpred5_Pass512); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Pass

    // Delegated rules

    public final boolean synpred5_Pass() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred5_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Pass() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred3_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Pass() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred4_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Pass() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred2_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_block_in_prog36 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iblock_in_block53 = new BitSet(new long[]{0x00000002C0087802L});
    public static final BitSet FOLLOW_expr_in_block55 = new BitSet(new long[]{0x00000002C0087802L});
    public static final BitSet FOLLOW_LT_in_block57 = new BitSet(new long[]{0x00000002C0087802L});
    public static final BitSet FOLLOW_INDENT_in_iblock74 = new BitSet(new long[]{0x00000002C0087800L});
    public static final BitSet FOLLOW_block_in_iblock76 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DEDENT_in_iblock78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func97 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_func99 = new BitSet(new long[]{0x00000002C0086800L});
    public static final BitSet FOLLOW_expr_in_func102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func105 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_func107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_call118 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_func_in_call119 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_call120 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_args_in_call122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call127 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_args_in_call129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_args147 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_args149 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_args152 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_args154 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_args158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_args168 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_ID_in_args171 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_atom_in_args173 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_func_in_args175 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_args179 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_ID_in_args182 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_atom_in_args184 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_func_in_args186 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_args191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_args196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_expr226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arithmetic_in_expr236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arithmetic253 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_set_in_arithmetic256 = new BitSet(new long[]{0x0000000000084800L});
    public static final BitSet FOLLOW_term_in_arithmetic262 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_factor_in_term277 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_set_in_term280 = new BitSet(new long[]{0x0000000000084800L});
    public static final BitSet FOLLOW_factor_in_term286 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_set_in_factor306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_factor329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_factor337 = new BitSet(new long[]{0x0000000000084800L});
    public static final BitSet FOLLOW_arithmetic_in_factor339 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_factor341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_control357 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_control359 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_control361 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_control363 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control365 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_control374 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control376 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control378 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_control385 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control387 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control391 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_control394 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control398 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control400 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_29_in_control405 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control407 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool442 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ID_in_bool444 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_call_in_bool446 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_bool449 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_bool455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_bool468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_bool470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_assign489 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_atom_in_assign492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_assign494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign516 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_assign518 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_assign520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred2_Pass141 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_synpred2_Pass143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred3_Pass320 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_func_in_synpred3_Pass322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred3_Pass325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred4_Pass425 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ID_in_synpred4_Pass427 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_call_in_synpred4_Pass429 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_synpred4_Pass432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred5_Pass508 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred5_Pass510 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred5_Pass512 = new BitSet(new long[]{0x0000000000000002L});

}