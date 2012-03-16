// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-16 14:38:00

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOP", "CMP", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "'()'", "')'", "','", "'='", "'else if'", "'else'", "'for'", "'if'", "'in'", "'while'", "'~'"
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
    "invalidRule", "assign", "synpred3_Pass", "func", "control", "synpred1_Pass", 
    "synpred2_Pass", "synpred4_Pass", "block", "bool", "expr", "atom", "prog", 
    "iblock", "call", "args"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, true, false, false, 
        false, false, false, false, true, false, true, false
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
                case 19:
                case 26:
                case 27:
                case 29:
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
            match(input,30,FOLLOW_30_in_func99); if (state.failed) return ;
            dbg.location(86,29);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:29: ( expr | ( LT iblock ) )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==19||(LA2_0 >= 26 && LA2_0 <= 27)||LA2_0==29) ) {
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

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:32: ',' call
                    	    {
                    	    dbg.location(93,32);
                    	    match(input,22,FOLLOW_22_in_args152); if (state.failed) return ;
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

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:29: ',' ( ID | atom | func )
                    	    {
                    	    dbg.location(94,29);
                    	    match(input,22,FOLLOW_22_in_args179); if (state.failed) return ;
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:1: expr : ( assign | call | control );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:5: ( assign | call | control )
            int alt9=3;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==23) ) {
                    alt9=1;
                }
                else if ( ((LA9_1 >= 19 && LA9_1 <= 20)) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 26:
            case 27:
            case 29:
                {
                alt9=3;
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

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(101, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "control"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:1: control : ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock | 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )? );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:2: ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock | 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )? )
            int alt12=3;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:6: 'for' ID 'in' ID LT iblock
                    {
                    dbg.location(104,6);
                    match(input,26,FOLLOW_26_in_control246); if (state.failed) return ;
                    dbg.location(104,12);
                    match(input,ID,FOLLOW_ID_in_control248); if (state.failed) return ;
                    dbg.location(104,15);
                    match(input,28,FOLLOW_28_in_control250); if (state.failed) return ;
                    dbg.location(104,20);
                    match(input,ID,FOLLOW_ID_in_control252); if (state.failed) return ;
                    dbg.location(104,23);
                    match(input,LT,FOLLOW_LT_in_control254); if (state.failed) return ;
                    dbg.location(104,26);
                    pushFollow(FOLLOW_iblock_in_control256);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:6: 'while' bool LT iblock
                    {
                    dbg.location(105,6);
                    match(input,29,FOLLOW_29_in_control263); if (state.failed) return ;
                    dbg.location(105,14);
                    pushFollow(FOLLOW_bool_in_control265);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(105,19);
                    match(input,LT,FOLLOW_LT_in_control267); if (state.failed) return ;
                    dbg.location(105,22);
                    pushFollow(FOLLOW_iblock_in_control269);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:4: 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )?
                    {
                    dbg.location(106,4);
                    match(input,27,FOLLOW_27_in_control274); if (state.failed) return ;
                    dbg.location(106,9);
                    pushFollow(FOLLOW_bool_in_control276);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(106,14);
                    match(input,LT,FOLLOW_LT_in_control278); if (state.failed) return ;
                    dbg.location(106,17);
                    pushFollow(FOLLOW_iblock_in_control280);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(106,24);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:24: ( 'else if' bool LT iblock )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:25: 'else if' bool LT iblock
                    	    {
                    	    dbg.location(106,25);
                    	    match(input,24,FOLLOW_24_in_control283); if (state.failed) return ;
                    	    dbg.location(106,35);
                    	    pushFollow(FOLLOW_bool_in_control285);
                    	    bool();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    dbg.location(106,40);
                    	    match(input,LT,FOLLOW_LT_in_control287); if (state.failed) return ;
                    	    dbg.location(106,43);
                    	    pushFollow(FOLLOW_iblock_in_control289);
                    	    iblock();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(106,52);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:52: ( 'else' LT iblock )?
                    int alt11=2;
                    try { dbg.enterSubRule(11);
                    try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    } finally {dbg.exitDecision(11);}

                    switch (alt11) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:53: 'else' LT iblock
                            {
                            dbg.location(106,53);
                            match(input,25,FOLLOW_25_in_control294); if (state.failed) return ;
                            dbg.location(106,60);
                            match(input,LT,FOLLOW_LT_in_control296); if (state.failed) return ;
                            dbg.location(106,63);
                            pushFollow(FOLLOW_iblock_in_control298);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(11);}


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
        dbg.location(107, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:1: bool : ( ( ( atom | ID | call ) ( CMP | BOP ) )=> ( atom | ID | call ) ( CMP | BOP ) bool | ( atom | ID | call ) );
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:5: ( ( ( atom | ID | call ) ( CMP | BOP ) )=> ( atom | ID | call ) ( CMP | BOP ) bool | ( atom | ID | call ) )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA15_2 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 19:
                {
                int LA15_3 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt15=1;
                }
                else if ( (true) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:7: ( ( atom | ID | call ) ( CMP | BOP ) )=> ( atom | ID | call ) ( CMP | BOP ) bool
                    {
                    dbg.location(109,37);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:37: ( atom | ID | call )
                    int alt13=3;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt13=1;
                        }
                        break;
                    case ID:
                        {
                        int LA13_2 = input.LA(2);

                        if ( ((LA13_2 >= BOP && LA13_2 <= CMP)) ) {
                            alt13=2;
                        }
                        else if ( ((LA13_2 >= 19 && LA13_2 <= 20)) ) {
                            alt13=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case 19:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:38: atom
                            {
                            dbg.location(109,38);
                            pushFollow(FOLLOW_atom_in_bool331);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:43: ID
                            {
                            dbg.location(109,43);
                            match(input,ID,FOLLOW_ID_in_bool333); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:46: call
                            {
                            dbg.location(109,46);
                            pushFollow(FOLLOW_call_in_bool335);
                            call();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}

                    dbg.location(109,52);
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

                    dbg.location(109,62);
                    pushFollow(FOLLOW_bool_in_bool344);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:9: ( atom | ID | call )
                    {
                    dbg.location(110,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:9: ( atom | ID | call )
                    int alt14=3;
                    try { dbg.enterSubRule(14);
                    try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt14=1;
                        }
                        break;
                    case ID:
                        {
                        int LA14_2 = input.LA(2);

                        if ( (LA14_2==LT) ) {
                            alt14=2;
                        }
                        else if ( ((LA14_2 >= 19 && LA14_2 <= 20)) ) {
                            alt14=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case 19:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(14);}

                    switch (alt14) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:10: atom
                            {
                            dbg.location(110,10);
                            pushFollow(FOLLOW_atom_in_bool355);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:15: ID
                            {
                            dbg.location(110,15);
                            match(input,ID,FOLLOW_ID_in_bool357); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:18: call
                            {
                            dbg.location(110,18);
                            pushFollow(FOLLOW_call_in_bool359);
                            call();

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
        dbg.location(111, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:1: assign : ( ID '=' ( atom | func | ID ) | ( ID '=' '(' )=> ID '=' call );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:5: ( ID '=' ( atom | func | ID ) | ( ID '=' '(' )=> ID '=' call )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                int LA17_1 = input.LA(2);

                if ( (true) ) {
                    alt17=1;
                }
                else if ( (synpred4_Pass()) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:9: ID '=' ( atom | func | ID )
                    {
                    dbg.location(114,9);
                    match(input,ID,FOLLOW_ID_in_assign376); if (state.failed) return ;
                    dbg.location(114,12);
                    match(input,23,FOLLOW_23_in_assign378); if (state.failed) return ;
                    dbg.location(114,16);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:16: ( atom | func | ID )
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
                    case 19:
                    case 20:
                        {
                        alt16=2;
                        }
                        break;
                    case ID:
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:17: atom
                            {
                            dbg.location(114,17);
                            pushFollow(FOLLOW_atom_in_assign381);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:22: func
                            {
                            dbg.location(114,22);
                            pushFollow(FOLLOW_func_in_assign383);
                            func();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:27: ID
                            {
                            dbg.location(114,27);
                            match(input,ID,FOLLOW_ID_in_assign385); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(16);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:9: ( ID '=' '(' )=> ID '=' call
                    {
                    dbg.location(115,24);
                    match(input,ID,FOLLOW_ID_in_assign405); if (state.failed) return ;
                    dbg.location(115,27);
                    match(input,23,FOLLOW_23_in_assign407); if (state.failed) return ;
                    dbg.location(115,31);
                    pushFollow(FOLLOW_call_in_assign409);
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
        dbg.location(116, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(118,5);
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
        dbg.location(120, 4);

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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:7: ( ( atom | ID | call ) ( CMP | BOP ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:8: ( atom | ID | call ) ( CMP | BOP )
        {
        dbg.location(109,8);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:8: ( atom | ID | call )
        int alt18=3;
        try { dbg.enterSubRule(18);
        try { dbg.enterDecision(18, decisionCanBacktrack[18]);

        switch ( input.LA(1) ) {
        case NUMBER:
        case STRING:
            {
            alt18=1;
            }
            break;
        case ID:
            {
            int LA18_2 = input.LA(2);

            if ( ((LA18_2 >= BOP && LA18_2 <= CMP)) ) {
                alt18=2;
            }
            else if ( ((LA18_2 >= 19 && LA18_2 <= 20)) ) {
                alt18=3;
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
            alt18=3;
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

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:9: atom
                {
                dbg.location(109,9);
                pushFollow(FOLLOW_atom_in_synpred3_Pass314);
                atom();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:14: ID
                {
                dbg.location(109,14);
                match(input,ID,FOLLOW_ID_in_synpred3_Pass316); if (state.failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:17: call
                {
                dbg.location(109,17);
                pushFollow(FOLLOW_call_in_synpred3_Pass318);
                call();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(18);}

        dbg.location(109,23);
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
    // $ANTLR end synpred3_Pass

    // $ANTLR start synpred4_Pass
    public final void synpred4_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:9: ( ID '=' '(' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:10: ID '=' '('
        {
        dbg.location(115,10);
        match(input,ID,FOLLOW_ID_in_synpred4_Pass397); if (state.failed) return ;
        dbg.location(115,13);
        match(input,23,FOLLOW_23_in_synpred4_Pass399); if (state.failed) return ;
        dbg.location(115,17);
        match(input,19,FOLLOW_19_in_synpred4_Pass401); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Pass

    // Delegated rules

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
    public static final BitSet FOLLOW_iblock_in_block53 = new BitSet(new long[]{0x000000002C083802L});
    public static final BitSet FOLLOW_expr_in_block55 = new BitSet(new long[]{0x000000002C083802L});
    public static final BitSet FOLLOW_LT_in_block57 = new BitSet(new long[]{0x000000002C083802L});
    public static final BitSet FOLLOW_INDENT_in_iblock74 = new BitSet(new long[]{0x000000002C083800L});
    public static final BitSet FOLLOW_block_in_iblock76 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DEDENT_in_iblock78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func97 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_func99 = new BitSet(new long[]{0x000000002C082800L});
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
    public static final BitSet FOLLOW_call_in_args149 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_args152 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_args154 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_args158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_args168 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_ID_in_args171 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_atom_in_args173 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_func_in_args175 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_args179 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_ID_in_args182 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_atom_in_args184 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_func_in_args186 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_args191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_args196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_expr226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_control246 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_control248 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_control250 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_control252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_control263 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control265 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_control274 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control276 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control280 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_control283 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control285 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control287 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control289 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_25_in_control294 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool331 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ID_in_bool333 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_call_in_bool335 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_bool338 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_bool344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_bool357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_bool359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign376 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_assign378 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_atom_in_assign381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_assign383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_assign407 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_assign409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred2_Pass141 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_call_in_synpred2_Pass143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred3_Pass314 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ID_in_synpred3_Pass316 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_call_in_synpred3_Pass318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_synpred3_Pass321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred4_Pass397 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_synpred4_Pass399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred4_Pass401 = new BitSet(new long[]{0x0000000000000002L});

}