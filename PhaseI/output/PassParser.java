// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-15 01:44:41

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


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred4_Pass", "synpred1_Pass", "call", "args", "bool", 
    "func", "control", "synpred2_Pass", "block", "iblock", "assign", "prog", 
    "atom", "synpred3_Pass", "expr"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, true, false, true, false, false
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
        dbg.location(85, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:1: func : ( args '~' )=> args '~' ( expr | ( LT iblock ) ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:5: ( ( args '~' )=> args '~' ( expr | ( LT iblock ) ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:7: ( args '~' )=> args '~' ( expr | ( LT iblock ) )
            {
            dbg.location(94,20);
            pushFollow(FOLLOW_args_in_func100);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(94,25);
            match(input,26,FOLLOW_26_in_func102); if (state.failed) return ;
            dbg.location(94,29);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:29: ( expr | ( LT iblock ) )
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==18||LA2_0==23||LA2_0==25) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:30: expr
                    {
                    dbg.location(94,30);
                    pushFollow(FOLLOW_expr_in_func105);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:35: ( LT iblock )
                    {
                    dbg.location(94,35);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:35: ( LT iblock )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:36: LT iblock
                    {
                    dbg.location(94,36);
                    match(input,LT,FOLLOW_LT_in_func108); if (state.failed) return ;
                    dbg.location(94,39);
                    pushFollow(FOLLOW_iblock_in_func110);
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
        dbg.location(95, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:1: call : ( '(' func ')' args | ID args );
    public final void call() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:5: ( '(' func ')' args | ID args )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:7: '(' func ')' args
                    {
                    dbg.location(97,7);
                    match(input,18,FOLLOW_18_in_call121); if (state.failed) return ;
                    dbg.location(97,10);
                    pushFollow(FOLLOW_func_in_call122);
                    func();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(97,14);
                    match(input,20,FOLLOW_20_in_call123); if (state.failed) return ;
                    dbg.location(97,18);
                    pushFollow(FOLLOW_args_in_call125);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:4: ID args
                    {
                    dbg.location(98,4);
                    match(input,ID,FOLLOW_ID_in_call130); if (state.failed) return ;
                    dbg.location(98,7);
                    pushFollow(FOLLOW_args_in_call132);
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
        dbg.location(99, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:1: args : ( ( '(' ( ID | atom | func ) )=> '(' ( ID | atom | func ) ( ',' ( ID | atom | func ) )* ')' | '()' );
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:5: ( ( '(' ( ID | atom | func ) )=> '(' ( ID | atom | func ) ( ',' ( ID | atom | func ) )* ')' | '()' )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) && (synpred2_Pass())) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:7: ( '(' ( ID | atom | func ) )=> '(' ( ID | atom | func ) ( ',' ( ID | atom | func ) )* ')'
                    {
                    dbg.location(101,31);
                    match(input,18,FOLLOW_18_in_args155); if (state.failed) return ;
                    dbg.location(101,35);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:35: ( ID | atom | func )
                    int alt4=3;
                    try { dbg.enterSubRule(4);
                    try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                    switch ( input.LA(1) ) {
                    case ID:
                        {
                        alt4=1;
                        }
                        break;
                    case NUMBER:
                    case STRING:
                        {
                        alt4=2;
                        }
                        break;
                    case 18:
                    case 19:
                        {
                        alt4=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(4);}

                    switch (alt4) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:36: ID
                            {
                            dbg.location(101,36);
                            match(input,ID,FOLLOW_ID_in_args158); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:39: atom
                            {
                            dbg.location(101,39);
                            pushFollow(FOLLOW_atom_in_args160);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:44: func
                            {
                            dbg.location(101,44);
                            pushFollow(FOLLOW_func_in_args162);
                            func();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(101,50);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:50: ( ',' ( ID | atom | func ) )*
                    try { dbg.enterSubRule(6);

                    loop6:
                    do {
                        int alt6=2;
                        try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        } finally {dbg.exitDecision(6);}

                        switch (alt6) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:51: ',' ( ID | atom | func )
                    	    {
                    	    dbg.location(101,51);
                    	    match(input,21,FOLLOW_21_in_args166); if (state.failed) return ;
                    	    dbg.location(101,55);
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:55: ( ID | atom | func )
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
                    	    case 18:
                    	    case 19:
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

                    	            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:56: ID
                    	            {
                    	            dbg.location(101,56);
                    	            match(input,ID,FOLLOW_ID_in_args169); if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 2 :
                    	            dbg.enterAlt(2);

                    	            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:59: atom
                    	            {
                    	            dbg.location(101,59);
                    	            pushFollow(FOLLOW_atom_in_args171);
                    	            atom();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;
                    	        case 3 :
                    	            dbg.enterAlt(3);

                    	            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:64: func
                    	            {
                    	            dbg.location(101,64);
                    	            pushFollow(FOLLOW_func_in_args173);
                    	            func();

                    	            state._fsp--;
                    	            if (state.failed) return ;

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(5);}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(101,72);
                    match(input,20,FOLLOW_20_in_args178); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:4: '()'
                    {
                    dbg.location(102,4);
                    match(input,19,FOLLOW_19_in_args183); if (state.failed) return ;

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
        dbg.location(103, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:1: expr : ( assign | call | control );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:5: ( assign | call | control )
            int alt8=3;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==22) ) {
                    alt8=1;
                }
                else if ( ((LA8_1 >= 18 && LA8_1 <= 19)) ) {
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
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 23:
            case 25:
                {
                alt8=3;
                }
                break;
            default:
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: assign
                    {
                    dbg.location(105,9);
                    pushFollow(FOLLOW_assign_in_expr195);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:9: call
                    {
                    dbg.location(106,9);
                    pushFollow(FOLLOW_call_in_expr205);
                    call();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:7: control
                    {
                    dbg.location(107,7);
                    pushFollow(FOLLOW_control_in_expr213);
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
        dbg.location(108, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:1: control : ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:2: ( 'for' ID 'in' ID LT iblock | 'while' bool LT iblock )
            int alt9=2;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:6: 'for' ID 'in' ID LT iblock
                    {
                    dbg.location(111,6);
                    match(input,23,FOLLOW_23_in_control233); if (state.failed) return ;
                    dbg.location(111,12);
                    match(input,ID,FOLLOW_ID_in_control235); if (state.failed) return ;
                    dbg.location(111,15);
                    match(input,24,FOLLOW_24_in_control237); if (state.failed) return ;
                    dbg.location(111,20);
                    match(input,ID,FOLLOW_ID_in_control239); if (state.failed) return ;
                    dbg.location(111,23);
                    match(input,LT,FOLLOW_LT_in_control241); if (state.failed) return ;
                    dbg.location(111,26);
                    pushFollow(FOLLOW_iblock_in_control243);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:6: 'while' bool LT iblock
                    {
                    dbg.location(112,6);
                    match(input,25,FOLLOW_25_in_control250); if (state.failed) return ;
                    dbg.location(112,14);
                    pushFollow(FOLLOW_bool_in_control252);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(112,19);
                    match(input,LT,FOLLOW_LT_in_control254); if (state.failed) return ;
                    dbg.location(112,22);
                    pushFollow(FOLLOW_iblock_in_control256);
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
        dbg.location(114, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:1: bool : ( ( ( atom | ID | call ) CMP )=> ( atom | ID | call ) CMP bool | ( atom | ID | call ) );
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:5: ( ( ( atom | ID | call ) CMP )=> ( atom | ID | call ) CMP bool | ( atom | ID | call ) )
            int alt12=2;
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
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
            case ID:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
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
            case 18:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred3_Pass()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:7: ( ( atom | ID | call ) CMP )=> ( atom | ID | call ) CMP bool
                    {
                    dbg.location(116,31);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:31: ( atom | ID | call )
                    int alt10=3;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt10=1;
                        }
                        break;
                    case ID:
                        {
                        int LA10_2 = input.LA(2);

                        if ( (LA10_2==CMP) ) {
                            alt10=2;
                        }
                        else if ( ((LA10_2 >= 18 && LA10_2 <= 19)) ) {
                            alt10=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case 18:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:32: atom
                            {
                            dbg.location(116,32);
                            pushFollow(FOLLOW_atom_in_bool285);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:37: ID
                            {
                            dbg.location(116,37);
                            match(input,ID,FOLLOW_ID_in_bool287); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:40: call
                            {
                            dbg.location(116,40);
                            pushFollow(FOLLOW_call_in_bool289);
                            call();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(116,46);
                    match(input,CMP,FOLLOW_CMP_in_bool292); if (state.failed) return ;
                    dbg.location(116,50);
                    pushFollow(FOLLOW_bool_in_bool294);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:9: ( atom | ID | call )
                    {
                    dbg.location(117,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:9: ( atom | ID | call )
                    int alt11=3;
                    try { dbg.enterSubRule(11);
                    try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                    switch ( input.LA(1) ) {
                    case NUMBER:
                    case STRING:
                        {
                        alt11=1;
                        }
                        break;
                    case ID:
                        {
                        int LA11_2 = input.LA(2);

                        if ( (LA11_2==LT) ) {
                            alt11=2;
                        }
                        else if ( ((LA11_2 >= 18 && LA11_2 <= 19)) ) {
                            alt11=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 2, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                        }
                        break;
                    case 18:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(11);}

                    switch (alt11) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:10: atom
                            {
                            dbg.location(117,10);
                            pushFollow(FOLLOW_atom_in_bool305);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:15: ID
                            {
                            dbg.location(117,15);
                            match(input,ID,FOLLOW_ID_in_bool307); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:18: call
                            {
                            dbg.location(117,18);
                            pushFollow(FOLLOW_call_in_bool309);
                            call();

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
        dbg.location(118, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:1: assign : ( ID '=' ( atom | func | ID ) | ( ID '=' '(' )=> ID '=' call );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:5: ( ID '=' ( atom | func | ID ) | ( ID '=' '(' )=> ID '=' call )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (true) ) {
                    alt14=1;
                }
                else if ( (synpred4_Pass()) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:9: ID '=' ( atom | func | ID )
                    {
                    dbg.location(121,9);
                    match(input,ID,FOLLOW_ID_in_assign326); if (state.failed) return ;
                    dbg.location(121,12);
                    match(input,22,FOLLOW_22_in_assign328); if (state.failed) return ;
                    dbg.location(121,16);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:16: ( atom | func | ID )
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
                    case 18:
                    case 19:
                        {
                        alt13=2;
                        }
                        break;
                    case ID:
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:17: atom
                            {
                            dbg.location(121,17);
                            pushFollow(FOLLOW_atom_in_assign331);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:22: func
                            {
                            dbg.location(121,22);
                            pushFollow(FOLLOW_func_in_assign333);
                            func();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:27: ID
                            {
                            dbg.location(121,27);
                            match(input,ID,FOLLOW_ID_in_assign335); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ( ID '=' '(' )=> ID '=' call
                    {
                    dbg.location(122,24);
                    match(input,ID,FOLLOW_ID_in_assign355); if (state.failed) return ;
                    dbg.location(122,27);
                    match(input,22,FOLLOW_22_in_assign357); if (state.failed) return ;
                    dbg.location(122,31);
                    pushFollow(FOLLOW_call_in_assign359);
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
        dbg.location(123, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(125,5);
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
        dbg.location(127, 4);

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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:7: ( '(' ( ID | atom | func ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:8: '(' ( ID | atom | func )
        {
        dbg.location(101,8);
        match(input,18,FOLLOW_18_in_synpred2_Pass142); if (state.failed) return ;
        dbg.location(101,12);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:12: ( ID | atom | func )
        int alt15=3;
        try { dbg.enterSubRule(15);
        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

        switch ( input.LA(1) ) {
        case ID:
            {
            alt15=1;
            }
            break;
        case NUMBER:
        case STRING:
            {
            alt15=2;
            }
            break;
        case 18:
        case 19:
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

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:13: ID
                {
                dbg.location(101,13);
                match(input,ID,FOLLOW_ID_in_synpred2_Pass145); if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:16: atom
                {
                dbg.location(101,16);
                pushFollow(FOLLOW_atom_in_synpred2_Pass147);
                atom();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:21: func
                {
                dbg.location(101,21);
                pushFollow(FOLLOW_func_in_synpred2_Pass149);
                func();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(15);}


        }

    }
    // $ANTLR end synpred2_Pass

    // $ANTLR start synpred3_Pass
    public final void synpred3_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:7: ( ( atom | ID | call ) CMP )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:8: ( atom | ID | call ) CMP
        {
        dbg.location(116,8);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:8: ( atom | ID | call )
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

            if ( (LA16_2==CMP) ) {
                alt16=2;
            }
            else if ( ((LA16_2 >= 18 && LA16_2 <= 19)) ) {
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
        case 18:
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

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:9: atom
                {
                dbg.location(116,9);
                pushFollow(FOLLOW_atom_in_synpred3_Pass272);
                atom();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:14: ID
                {
                dbg.location(116,14);
                match(input,ID,FOLLOW_ID_in_synpred3_Pass274); if (state.failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:17: call
                {
                dbg.location(116,17);
                pushFollow(FOLLOW_call_in_synpred3_Pass276);
                call();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(16);}

        dbg.location(116,23);
        match(input,CMP,FOLLOW_CMP_in_synpred3_Pass279); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Pass

    // $ANTLR start synpred4_Pass
    public final void synpred4_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ( ID '=' '(' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:10: ID '=' '('
        {
        dbg.location(122,10);
        match(input,ID,FOLLOW_ID_in_synpred4_Pass347); if (state.failed) return ;
        dbg.location(122,13);
        match(input,22,FOLLOW_22_in_synpred4_Pass349); if (state.failed) return ;
        dbg.location(122,17);
        match(input,18,FOLLOW_18_in_synpred4_Pass351); if (state.failed) return ;

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
    public static final BitSet FOLLOW_iblock_in_block53 = new BitSet(new long[]{0x0000000002841C02L});
    public static final BitSet FOLLOW_expr_in_block55 = new BitSet(new long[]{0x0000000002841C02L});
    public static final BitSet FOLLOW_LT_in_block57 = new BitSet(new long[]{0x0000000002841C02L});
    public static final BitSet FOLLOW_INDENT_in_iblock74 = new BitSet(new long[]{0x0000000002841C00L});
    public static final BitSet FOLLOW_block_in_iblock76 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DEDENT_in_iblock78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func100 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_func102 = new BitSet(new long[]{0x0000000002841400L});
    public static final BitSet FOLLOW_expr_in_func105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func108 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_iblock_in_func110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_call121 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_func_in_call122 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_call123 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_args_in_call125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call130 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_args_in_call132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_args155 = new BitSet(new long[]{0x00000000000CA400L});
    public static final BitSet FOLLOW_ID_in_args158 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_atom_in_args160 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_func_in_args162 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_args166 = new BitSet(new long[]{0x00000000000CA400L});
    public static final BitSet FOLLOW_ID_in_args169 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_atom_in_args171 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_func_in_args173 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_args178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_args183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_expr213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_control233 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_control235 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_control237 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_control239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_control241 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_iblock_in_control243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_control250 = new BitSet(new long[]{0x000000000004A400L});
    public static final BitSet FOLLOW_bool_in_control252 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LT_in_control254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_iblock_in_control256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_bool287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_call_in_bool289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CMP_in_bool292 = new BitSet(new long[]{0x000000000004A400L});
    public static final BitSet FOLLOW_bool_in_bool294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_bool305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_bool307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_bool309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign326 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assign328 = new BitSet(new long[]{0x00000000000CA400L});
    public static final BitSet FOLLOW_atom_in_assign331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_assign333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign355 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_assign357 = new BitSet(new long[]{0x0000000000040400L});
    public static final BitSet FOLLOW_call_in_assign359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred2_Pass142 = new BitSet(new long[]{0x00000000000CA400L});
    public static final BitSet FOLLOW_ID_in_synpred2_Pass145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred2_Pass147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_synpred2_Pass149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_synpred3_Pass272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_synpred3_Pass274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_call_in_synpred3_Pass276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CMP_in_synpred3_Pass279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred4_Pass347 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_synpred4_Pass349 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred4_Pass351 = new BitSet(new long[]{0x0000000000000002L});

}