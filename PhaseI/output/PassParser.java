// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-14 17:17:35

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "'()'", "')'", "','", "'='", "'for'", "'in'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "assign", "atom", "args", "call", "expr", "prog", "iblock", 
    "assignable", "control", "block", "func"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:74:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:74:5: ( block EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:74:9: block EOF
            {
            dbg.location(74,9);
            pushFollow(FOLLOW_block_in_prog35);
            block();

            state._fsp--;

            dbg.location(74,15);
            match(input,EOF,FOLLOW_EOF_in_prog37); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(75, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:77:1: block : ( iblock | expr | LT )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:2: ( ( iblock | expr | LT )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:4: ( iblock | expr | LT )+
            {
            dbg.location(78,4);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:4: ( iblock | expr | LT )+
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
                case 17:
                case 22:
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:5: iblock
            	    {
            	    dbg.location(78,5);
            	    pushFollow(FOLLOW_iblock_in_block52);
            	    iblock();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:12: expr
            	    {
            	    dbg.location(78,12);
            	    pushFollow(FOLLOW_expr_in_block54);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:17: LT
            	    {
            	    dbg.location(78,17);
            	    match(input,LT,FOLLOW_LT_in_block56); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
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
        dbg.location(79, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:7: INDENT block DEDENT
            {
            dbg.location(82,7);
            match(input,INDENT,FOLLOW_INDENT_in_iblock73); 
            dbg.location(82,14);
            pushFollow(FOLLOW_block_in_iblock75);
            block();

            state._fsp--;

            dbg.location(82,20);
            match(input,DEDENT,FOLLOW_DEDENT_in_iblock77); 

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:1: func : ( args '~' expr | args '~' LT iblock );
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:5: ( args '~' expr | args '~' LT iblock )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            try {
                isCyclicDecision = true;
                alt2 = dfa2.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:7: args '~' expr
                    {
                    dbg.location(93,7);
                    pushFollow(FOLLOW_args_in_func92);
                    args();

                    state._fsp--;

                    dbg.location(93,12);
                    match(input,24,FOLLOW_24_in_func94); 
                    dbg.location(93,16);
                    pushFollow(FOLLOW_expr_in_func96);
                    expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:4: args '~' LT iblock
                    {
                    dbg.location(94,4);
                    pushFollow(FOLLOW_args_in_func101);
                    args();

                    state._fsp--;

                    dbg.location(94,9);
                    match(input,24,FOLLOW_24_in_func103); 
                    dbg.location(94,13);
                    match(input,LT,FOLLOW_LT_in_func105); 
                    dbg.location(94,16);
                    pushFollow(FOLLOW_iblock_in_func107);
                    iblock();

                    state._fsp--;


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

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID) ) {
                alt3=2;
            }
            else {
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
                    match(input,17,FOLLOW_17_in_call116); 
                    dbg.location(97,10);
                    pushFollow(FOLLOW_func_in_call117);
                    func();

                    state._fsp--;

                    dbg.location(97,14);
                    match(input,19,FOLLOW_19_in_call118); 
                    dbg.location(97,18);
                    pushFollow(FOLLOW_args_in_call120);
                    args();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:4: ID args
                    {
                    dbg.location(98,4);
                    match(input,ID,FOLLOW_ID_in_call125); 
                    dbg.location(98,7);
                    pushFollow(FOLLOW_args_in_call127);
                    args();

                    state._fsp--;


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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:1: args : ( '(' ID ( ',' ID )* ')' | '()' );
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:5: ( '(' ID ( ',' ID )* ')' | '()' )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:7: '(' ID ( ',' ID )* ')'
                    {
                    dbg.location(101,7);
                    match(input,17,FOLLOW_17_in_args136); 
                    dbg.location(101,11);
                    match(input,ID,FOLLOW_ID_in_args138); 
                    dbg.location(101,14);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:14: ( ',' ID )*
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:15: ',' ID
                    	    {
                    	    dbg.location(101,15);
                    	    match(input,20,FOLLOW_20_in_args141); 
                    	    dbg.location(101,19);
                    	    match(input,ID,FOLLOW_ID_in_args143); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(4);}

                    dbg.location(101,24);
                    match(input,19,FOLLOW_19_in_args147); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:4: '()'
                    {
                    dbg.location(102,4);
                    match(input,18,FOLLOW_18_in_args152); 

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
            int alt6=3;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==21) ) {
                    alt6=1;
                }
                else if ( ((LA6_1 >= 17 && LA6_1 <= 18)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: assign
                    {
                    dbg.location(105,9);
                    pushFollow(FOLLOW_assign_in_expr164);
                    assign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:9: call
                    {
                    dbg.location(106,9);
                    pushFollow(FOLLOW_call_in_expr174);
                    call();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:7: control
                    {
                    dbg.location(107,7);
                    pushFollow(FOLLOW_control_in_expr182);
                    control();

                    state._fsp--;


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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:1: control : 'for' ID 'in' ID LT iblock ;
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:2: ( 'for' ID 'in' ID LT iblock )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:6: 'for' ID 'in' ID LT iblock
            {
            dbg.location(111,6);
            match(input,22,FOLLOW_22_in_control202); 
            dbg.location(111,12);
            match(input,ID,FOLLOW_ID_in_control204); 
            dbg.location(111,15);
            match(input,23,FOLLOW_23_in_control206); 
            dbg.location(111,20);
            match(input,ID,FOLLOW_ID_in_control208); 
            dbg.location(111,23);
            match(input,LT,FOLLOW_LT_in_control210); 
            dbg.location(111,26);
            pushFollow(FOLLOW_iblock_in_control212);
            iblock();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "control");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "control"



    // $ANTLR start "assign"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:1: assign : ID '=' assignable ;
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:5: ( ID '=' assignable )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:9: ID '=' assignable
            {
            dbg.location(115,9);
            match(input,ID,FOLLOW_ID_in_assign228); 
            dbg.location(115,12);
            match(input,21,FOLLOW_21_in_assign230); 
            dbg.location(115,16);
            pushFollow(FOLLOW_assignable_in_assign232);
            assignable();

            state._fsp--;


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



    // $ANTLR start "assignable"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:1: assignable : ( atom | func | ID | call );
    public final void assignable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assignable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:5: ( atom | func | ID | call )
            int alt7=4;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==ID) ) {
                    alt7=2;
                }
                else if ( ((LA7_2 >= 17 && LA7_2 <= 18)) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 18:
                {
                alt7=2;
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
                case 19:
                case 22:
                    {
                    alt7=3;
                    }
                    break;
                case 17:
                    {
                    int LA7_7 = input.LA(3);

                    if ( (LA7_7==ID) ) {
                        alt7=4;
                    }
                    else if ( ((LA7_7 >= 17 && LA7_7 <= 18)) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 7, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    }
                    break;
                case 18:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:7: atom
                    {
                    dbg.location(119,7);
                    pushFollow(FOLLOW_atom_in_assignable249);
                    atom();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:4: func
                    {
                    dbg.location(120,4);
                    pushFollow(FOLLOW_func_in_assignable254);
                    func();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:4: ID
                    {
                    dbg.location(121,4);
                    match(input,ID,FOLLOW_ID_in_assignable259); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:6: call
                    {
                    dbg.location(122,6);
                    pushFollow(FOLLOW_call_in_assignable266);
                    call();

                    state._fsp--;


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
        dbg.location(123, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignable"



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
            }
            else {
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\21\1\11\1\30\1\23\2\11\1\30\2\uffff\1\23";
    static final String DFA2_maxS =
        "\1\22\1\11\1\30\1\24\1\26\1\11\1\30\2\uffff\1\24";
    static final String DFA2_acceptS =
        "\7\uffff\1\2\1\1\1\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\6\1\5",
            "\1\10\1\uffff\1\7\5\uffff\1\10\4\uffff\1\10",
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
            return "93:1: func : ( args '~' expr | args '~' LT iblock );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog35 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iblock_in_block52 = new BitSet(new long[]{0x0000000000420E02L});
    public static final BitSet FOLLOW_expr_in_block54 = new BitSet(new long[]{0x0000000000420E02L});
    public static final BitSet FOLLOW_LT_in_block56 = new BitSet(new long[]{0x0000000000420E02L});
    public static final BitSet FOLLOW_INDENT_in_iblock73 = new BitSet(new long[]{0x0000000000420E00L});
    public static final BitSet FOLLOW_block_in_iblock75 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DEDENT_in_iblock77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func92 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_func94 = new BitSet(new long[]{0x0000000000420200L});
    public static final BitSet FOLLOW_expr_in_func96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func101 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_func103 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_func105 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_iblock_in_func107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_call116 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_func_in_call117 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_call118 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_args_in_call120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_call125 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_args_in_call127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_args136 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_args138 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_args141 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_args143 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_args147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_args152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_expr182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_control202 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_control204 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_control206 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_control208 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_control210 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_iblock_in_control212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign228 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_assign230 = new BitSet(new long[]{0x0000000000065200L});
    public static final BitSet FOLLOW_assignable_in_assign232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_assignable249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_assignable254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignable259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_assignable266 = new BitSet(new long[]{0x0000000000000002L});

}