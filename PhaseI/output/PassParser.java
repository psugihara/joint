// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-04-02 01:16:27

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOP", "CMP", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "'='", "'['", "']'", "'else if'", "'else'", "'for'", "'if'", "'in'", "'while'", "'~'"
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
    public static final int T__35=35;
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
    "invalidRule", "assign", "synpred1_Pass", "mod", "bool", "control", 
    "block", "synpred2_Pass", "func", "val", "term", "prog", "eval", "atom", 
    "expr", "factor", "args", "iblock"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        true, false, false, false, true
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:77:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:77:5: ( block EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:77:9: block EOF
            {
            dbg.location(77,9);
            pushFollow(FOLLOW_block_in_prog36);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(77,15);
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
        dbg.location(78, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:1: block : ( expr | LT )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:2: ( ( expr | LT )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:6: ( expr | LT )+
            {
            dbg.location(81,6);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:6: ( expr | LT )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||(LA1_0 >= 31 && LA1_0 <= 32)||LA1_0==34) ) {
                    alt1=1;
                }
                else if ( (LA1_0==LT) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:7: expr
            	    {
            	    dbg.location(81,7);
            	    pushFollow(FOLLOW_expr_in_block55);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:12: LT
            	    {
            	    dbg.location(81,12);
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
        dbg.location(82, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:84:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:85:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:85:9: INDENT block DEDENT
            {
            dbg.location(85,9);
            match(input,INDENT,FOLLOW_INDENT_in_iblock76); if (state.failed) return ;
            dbg.location(85,16);
            pushFollow(FOLLOW_block_in_iblock78);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(85,22);
            match(input,DEDENT,FOLLOW_DEDENT_in_iblock80); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(86, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "iblock"



    // $ANTLR start "args"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:1: args : '(' ( ( eval ) ( ',' ( eval ) )* )? ')' ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:5: ( '(' ( ( eval ) ( ',' ( eval ) )* )? ')' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:9: '(' ( ( eval ) ( ',' ( eval ) )* )? ')'
            {
            dbg.location(88,9);
            match(input,19,FOLLOW_19_in_args94); if (state.failed) return ;
            dbg.location(88,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:13: ( ( eval ) ( ',' ( eval ) )* )?
            int alt3=2;
            try { dbg.enterSubRule(3);
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==NUMBER||LA3_0==STRING||LA3_0==19) ) {
                alt3=1;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:14: ( eval ) ( ',' ( eval ) )*
                    {
                    dbg.location(88,14);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:14: ( eval )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:15: eval
                    {
                    dbg.location(88,15);
                    pushFollow(FOLLOW_eval_in_args98);
                    eval();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    dbg.location(88,21);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:21: ( ',' ( eval ) )*
                    try { dbg.enterSubRule(2);

                    loop2:
                    do {
                        int alt2=2;
                        try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==23) ) {
                            alt2=1;
                        }


                        } finally {dbg.exitDecision(2);}

                        switch (alt2) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:22: ',' ( eval )
                    	    {
                    	    dbg.location(88,22);
                    	    match(input,23,FOLLOW_23_in_args102); if (state.failed) return ;
                    	    dbg.location(88,26);
                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:26: ( eval )
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:27: eval
                    	    {
                    	    dbg.location(88,27);
                    	    pushFollow(FOLLOW_eval_in_args105);
                    	    eval();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(3);}

            dbg.location(88,37);
            match(input,20,FOLLOW_20_in_args112); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(89, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "func"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:1: func : args '~' ( expr | ( LT iblock ) ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:5: ( args '~' ( expr | ( LT iblock ) ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:9: args '~' ( expr | ( LT iblock ) )
            {
            dbg.location(91,9);
            pushFollow(FOLLOW_args_in_func124);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(91,14);
            match(input,35,FOLLOW_35_in_func126); if (state.failed) return ;
            dbg.location(91,18);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:18: ( expr | ( LT iblock ) )
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||(LA4_0 >= 31 && LA4_0 <= 32)||LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==LT) ) {
                alt4=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:19: expr
                    {
                    dbg.location(91,19);
                    pushFollow(FOLLOW_expr_in_func129);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:24: ( LT iblock )
                    {
                    dbg.location(91,24);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:24: ( LT iblock )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:25: LT iblock
                    {
                    dbg.location(91,25);
                    match(input,LT,FOLLOW_LT_in_func132); if (state.failed) return ;
                    dbg.location(91,28);
                    pushFollow(FOLLOW_iblock_in_func134);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(92, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "func"



    // $ANTLR start "expr"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:1: expr : ( assign | control );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:5: ( assign | control )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= 31 && LA5_0 <= 32)||LA5_0==34) ) {
                alt5=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:9: assign
                    {
                    dbg.location(94,9);
                    pushFollow(FOLLOW_assign_in_expr151);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:9: control
                    {
                    dbg.location(95,9);
                    pushFollow(FOLLOW_control_in_expr161);
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
        dbg.location(96, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "eval"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:1: eval : term ( ( '+' | '-' ) term )* ;
    public final void eval() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:2: ( term ( ( '+' | '-' ) term )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:6: term ( ( '+' | '-' ) term )*
            {
            dbg.location(99,6);
            pushFollow(FOLLOW_term_in_eval177);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(99,11);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:11: ( ( '+' | '-' ) term )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==24) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:12: ( '+' | '-' ) term
            	    {
            	    dbg.location(99,12);
            	    if ( input.LA(1)==22||input.LA(1)==24 ) {
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

            	    dbg.location(99,22);
            	    pushFollow(FOLLOW_term_in_eval186);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(100, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "eval");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "eval"



    // $ANTLR start "term"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:1: term : factor ( ( '*' | '/' ) factor )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:2: ( factor ( ( '*' | '/' ) factor )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:6: factor ( ( '*' | '/' ) factor )*
            {
            dbg.location(103,6);
            pushFollow(FOLLOW_factor_in_term205);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(103,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:13: ( ( '*' | '/' ) factor )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==21||LA7_0==25) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:14: ( '*' | '/' ) factor
            	    {
            	    dbg.location(103,14);
            	    if ( input.LA(1)==21||input.LA(1)==25 ) {
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

            	    dbg.location(103,24);
            	    pushFollow(FOLLOW_factor_in_term214);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(104, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:1: factor : val ( mod )* ;
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:5: ( val ( mod )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:9: val ( mod )*
            {
            dbg.location(107,9);
            pushFollow(FOLLOW_val_in_factor236);
            val();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(107,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:13: ( mod )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }
                else if ( (LA8_0==19) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:13: mod
            	    {
            	    dbg.location(107,13);
            	    pushFollow(FOLLOW_mod_in_factor238);
            	    mod();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


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
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "mod"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:1: mod : ( '[' val ']' | args );
    public final void mod() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:5: ( '[' val ']' | args )
            int alt9=2;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:9: '[' val ']'
                    {
                    dbg.location(110,9);
                    match(input,27,FOLLOW_27_in_mod258); if (state.failed) return ;
                    dbg.location(110,13);
                    pushFollow(FOLLOW_val_in_mod260);
                    val();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(110,17);
                    match(input,28,FOLLOW_28_in_mod262); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:111:9: args
                    {
                    dbg.location(111,9);
                    pushFollow(FOLLOW_args_in_mod272);
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
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mod"



    // $ANTLR start "val"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:1: val : ( ( atom | ID ) | ( args '~' )=> func | '(' eval ')' );
    public final void val() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "val");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:5: ( ( atom | ID ) | ( args '~' )=> func | '(' eval ')' )
            int alt11=3;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID||LA11_0==NUMBER||LA11_0==STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                int LA11_3 = input.LA(2);

                if ( (synpred1_Pass()) ) {
                    alt11=2;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:9: ( atom | ID )
                    {
                    dbg.location(114,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:9: ( atom | ID )
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NUMBER||LA10_0==STRING) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==ID) ) {
                        alt10=2;
                    }
                    else {
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:10: atom
                            {
                            dbg.location(114,10);
                            pushFollow(FOLLOW_atom_in_val285);
                            atom();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:15: ID
                            {
                            dbg.location(114,15);
                            match(input,ID,FOLLOW_ID_in_val287); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(10);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:9: ( args '~' )=> func
                    {
                    dbg.location(115,23);
                    pushFollow(FOLLOW_func_in_val306);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:9: '(' eval ')'
                    {
                    dbg.location(116,9);
                    match(input,19,FOLLOW_19_in_val316); if (state.failed) return ;
                    dbg.location(116,13);
                    pushFollow(FOLLOW_eval_in_val318);
                    eval();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(116,18);
                    match(input,20,FOLLOW_20_in_val320); if (state.failed) return ;

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
        dbg.location(117, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "val");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "val"



    // $ANTLR start "control"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:1: control : ( 'for' ID 'in' ID LT iblock | 'while' expr LT iblock | 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )? );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:5: ( 'for' ID 'in' ID LT iblock | 'while' expr LT iblock | 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )? )
            int alt14=3;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 32:
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:9: 'for' ID 'in' ID LT iblock
                    {
                    dbg.location(120,9);
                    match(input,31,FOLLOW_31_in_control339); if (state.failed) return ;
                    dbg.location(120,15);
                    match(input,ID,FOLLOW_ID_in_control341); if (state.failed) return ;
                    dbg.location(120,18);
                    match(input,33,FOLLOW_33_in_control343); if (state.failed) return ;
                    dbg.location(120,23);
                    match(input,ID,FOLLOW_ID_in_control345); if (state.failed) return ;
                    dbg.location(120,26);
                    match(input,LT,FOLLOW_LT_in_control347); if (state.failed) return ;
                    dbg.location(120,29);
                    pushFollow(FOLLOW_iblock_in_control349);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:9: 'while' expr LT iblock
                    {
                    dbg.location(121,9);
                    match(input,34,FOLLOW_34_in_control359); if (state.failed) return ;
                    dbg.location(121,17);
                    pushFollow(FOLLOW_expr_in_control361);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(121,22);
                    match(input,LT,FOLLOW_LT_in_control363); if (state.failed) return ;
                    dbg.location(121,25);
                    pushFollow(FOLLOW_iblock_in_control365);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: 'if' bool LT iblock ( 'else if' bool LT iblock )* ( 'else' LT iblock )?
                    {
                    dbg.location(122,9);
                    match(input,32,FOLLOW_32_in_control375); if (state.failed) return ;
                    dbg.location(122,14);
                    pushFollow(FOLLOW_bool_in_control377);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(122,19);
                    match(input,LT,FOLLOW_LT_in_control379); if (state.failed) return ;
                    dbg.location(122,22);
                    pushFollow(FOLLOW_iblock_in_control381);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(122,29);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:29: ( 'else if' bool LT iblock )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==29) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:30: 'else if' bool LT iblock
                    	    {
                    	    dbg.location(122,30);
                    	    match(input,29,FOLLOW_29_in_control384); if (state.failed) return ;
                    	    dbg.location(122,40);
                    	    pushFollow(FOLLOW_bool_in_control386);
                    	    bool();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    dbg.location(122,45);
                    	    match(input,LT,FOLLOW_LT_in_control388); if (state.failed) return ;
                    	    dbg.location(122,48);
                    	    pushFollow(FOLLOW_iblock_in_control390);
                    	    iblock();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}

                    dbg.location(122,57);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:57: ( 'else' LT iblock )?
                    int alt13=2;
                    try { dbg.enterSubRule(13);
                    try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    } finally {dbg.exitDecision(13);}

                    switch (alt13) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:58: 'else' LT iblock
                            {
                            dbg.location(122,58);
                            match(input,30,FOLLOW_30_in_control395); if (state.failed) return ;
                            dbg.location(122,65);
                            match(input,LT,FOLLOW_LT_in_control397); if (state.failed) return ;
                            dbg.location(122,68);
                            pushFollow(FOLLOW_iblock_in_control399);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(13);}


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
            dbg.exitRule(getGrammarFileName(), "control");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "control"



    // $ANTLR start "bool"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:1: bool : ( ( ( eval ) ( CMP | BOP ) )=> ( eval ) ( CMP | BOP ) bool | ( eval ) );
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:5: ( ( ( eval ) ( CMP | BOP ) )=> ( eval ) ( CMP | BOP ) bool | ( eval ) )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                int LA15_1 = input.LA(2);

                if ( (synpred2_Pass()) ) {
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

                if ( (synpred2_Pass()) ) {
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

                if ( (synpred2_Pass()) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:9: ( ( eval ) ( CMP | BOP ) )=> ( eval ) ( CMP | BOP ) bool
                    {
                    dbg.location(125,31);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:31: ( eval )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:32: eval
                    {
                    dbg.location(125,32);
                    pushFollow(FOLLOW_eval_in_bool430);
                    eval();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    dbg.location(125,38);
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

                    dbg.location(125,48);
                    pushFollow(FOLLOW_bool_in_bool439);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:9: ( eval )
                    {
                    dbg.location(126,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:9: ( eval )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:10: eval
                    {
                    dbg.location(126,10);
                    pushFollow(FOLLOW_eval_in_bool450);
                    eval();

                    state._fsp--;
                    if (state.failed) return ;

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
        dbg.location(127, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:1: assign : ID '=' eval ;
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:130:5: ( ID '=' eval )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:130:9: ID '=' eval
            {
            dbg.location(130,9);
            match(input,ID,FOLLOW_ID_in_assign470); if (state.failed) return ;
            dbg.location(130,12);
            match(input,26,FOLLOW_26_in_assign472); if (state.failed) return ;
            dbg.location(130,16);
            pushFollow(FOLLOW_eval_in_assign474);
            eval();

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
        dbg.location(131, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(133, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(133,5);
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
        dbg.location(135, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"

    // $ANTLR start synpred1_Pass
    public final void synpred1_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:10: args '~'
        {
        dbg.location(115,10);
        pushFollow(FOLLOW_args_in_synpred1_Pass299);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(115,15);
        match(input,35,FOLLOW_35_in_synpred1_Pass301); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Pass

    // $ANTLR start synpred2_Pass
    public final void synpred2_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:9: ( ( eval ) ( CMP | BOP ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:10: ( eval ) ( CMP | BOP )
        {
        dbg.location(125,10);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:10: ( eval )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:11: eval
        {
        dbg.location(125,11);
        pushFollow(FOLLOW_eval_in_synpred2_Pass417);
        eval();

        state._fsp--;
        if (state.failed) return ;

        }

        dbg.location(125,17);
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
    // $ANTLR end synpred2_Pass

    // Delegated rules

    public final boolean synpred1_Pass() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred1_Pass_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_expr_in_block55 = new BitSet(new long[]{0x0000000580002802L});
    public static final BitSet FOLLOW_LT_in_block57 = new BitSet(new long[]{0x0000000580002802L});
    public static final BitSet FOLLOW_INDENT_in_iblock76 = new BitSet(new long[]{0x0000000580002800L});
    public static final BitSet FOLLOW_block_in_iblock78 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DEDENT_in_iblock80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_args94 = new BitSet(new long[]{0x0000000000194800L});
    public static final BitSet FOLLOW_eval_in_args98 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_args102 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_eval_in_args105 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_args112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func124 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_func126 = new BitSet(new long[]{0x0000000580002800L});
    public static final BitSet FOLLOW_expr_in_func129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func132 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_func134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_expr161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_eval177 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_set_in_eval180 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_term_in_eval186 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_factor_in_term205 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_set_in_term208 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_factor_in_term214 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_val_in_factor236 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_mod_in_factor238 = new BitSet(new long[]{0x0000000008080002L});
    public static final BitSet FOLLOW_27_in_mod258 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_val_in_mod260 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_mod262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_mod272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_val285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_val287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_val306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_val316 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_eval_in_val318 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_val320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_control339 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_control341 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_control343 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_control345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control347 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_control359 = new BitSet(new long[]{0x0000000580000800L});
    public static final BitSet FOLLOW_expr_in_control361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control363 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_control375 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control379 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control381 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_control384 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_control386 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control388 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control390 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30_in_control395 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_control397 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_iblock_in_control399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eval_in_bool430 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_bool433 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_bool_in_bool439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eval_in_bool450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign470 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assign472 = new BitSet(new long[]{0x0000000000094800L});
    public static final BitSet FOLLOW_eval_in_assign474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred1_Pass299 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_synpred1_Pass301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eval_in_synpred2_Pass417 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_synpred2_Pass420 = new BitSet(new long[]{0x0000000000000002L});

}