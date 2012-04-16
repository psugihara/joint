// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-04-12 22:58:02

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


public static final String[] ruleNames = new String[] {
    "invalidRule", "access", "synpred1_Pass", "logic", "iblock", "dictionary_entry", 
    "prog", "factor", "expr", "mod", "bool", "return_stmt", "argument", 
    "eval", "modable", "stmt", "break_stmt", "else_p", "func", "assign", 
    "dictionary_definition", "else_test", "control", "short_stmt", "args", 
    "synpred2_Pass", "block", "term", "atom", "array_definition"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        true, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:5: ( block EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:9: block EOF
            {
            dbg.location(101,9);
            pushFollow(FOLLOW_block_in_prog35);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(101,15);
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
        dbg.location(102, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:1: block : ( stmt )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:5: ( ( stmt )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: ( stmt )+
            {
            dbg.location(105,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: ( stmt )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NUMBER||LA1_0==STRING||LA1_0==21||LA1_0==33||(LA1_0 >= 35 && LA1_0 <= 36)||(LA1_0 >= 38 && LA1_0 <= 39)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: stmt
            	    {
            	    dbg.location(105,9);
            	    pushFollow(FOLLOW_stmt_in_block56);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        dbg.location(106, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:1: stmt : ( expr LT | control );
    public final void stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:5: ( expr LT | control )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:9: expr LT
                    {
                    dbg.location(108,9);
                    pushFollow(FOLLOW_expr_in_stmt75);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(108,14);
                    match(input,LT,FOLLOW_LT_in_stmt77); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:9: control
                    {
                    dbg.location(109,9);
                    pushFollow(FOLLOW_control_in_stmt87);
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
        dbg.location(110, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "iblock"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:9: INDENT block DEDENT
            {
            dbg.location(113,9);
            match(input,INDENT,FOLLOW_INDENT_in_iblock113); if (state.failed) return ;
            dbg.location(113,16);
            pushFollow(FOLLOW_block_in_iblock115);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(113,22);
            match(input,DEDENT,FOLLOW_DEDENT_in_iblock117); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "iblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "iblock"



    // $ANTLR start "args"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:1: args : '(' ( argument ( ',' argument )* )? ( LT )? ')' ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:5: ( '(' ( argument ( ',' argument )* )? ( LT )? ')' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:9: '(' ( argument ( ',' argument )* )? ( LT )? ')'
            {
            dbg.location(116,9);
            match(input,21,FOLLOW_21_in_args131); if (state.failed) return ;
            dbg.location(116,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:13: ( argument ( ',' argument )* )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==LT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==ID||LA4_1==NUMBER||LA4_1==STRING||LA4_1==21) ) {
                    alt4=1;
                }
            }
            else if ( (LA4_0==ID||LA4_0==NUMBER||LA4_0==STRING||LA4_0==21) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:14: argument ( ',' argument )*
                    {
                    dbg.location(116,14);
                    pushFollow(FOLLOW_argument_in_args134);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(116,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:23: ( ',' argument )*
                    try { dbg.enterSubRule(3);

                    loop3:
                    do {
                        int alt3=2;
                        try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==25) ) {
                            alt3=1;
                        }


                        } finally {dbg.exitDecision(3);}

                        switch (alt3) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:24: ',' argument
                    	    {
                    	    dbg.location(116,24);
                    	    match(input,25,FOLLOW_25_in_args137); if (state.failed) return ;
                    	    dbg.location(116,28);
                    	    pushFollow(FOLLOW_argument_in_args139);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(3);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(116,41);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:41: ( LT )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==LT) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:41: LT
                    {
                    dbg.location(116,41);
                    match(input,LT,FOLLOW_LT_in_args145); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(116,44);
            match(input,22,FOLLOW_22_in_args147); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "args");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "args"



    // $ANTLR start "func"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:1: func : args '~' ( expr | LT iblock ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:5: ( args '~' ( expr | LT iblock ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:9: args '~' ( expr | LT iblock )
            {
            dbg.location(119,9);
            pushFollow(FOLLOW_args_in_func165);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(119,14);
            match(input,42,FOLLOW_42_in_func167); if (state.failed) return ;
            dbg.location(119,18);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:18: ( expr | LT iblock )
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==NUMBER||LA6_0==STRING||LA6_0==21||LA6_0==33||LA6_0==38) ) {
                alt6=1;
            }
            else if ( (LA6_0==LT) ) {
                alt6=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:19: expr
                    {
                    dbg.location(119,19);
                    pushFollow(FOLLOW_expr_in_func170);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:24: LT iblock
                    {
                    dbg.location(119,24);
                    match(input,LT,FOLLOW_LT_in_func172); if (state.failed) return ;
                    dbg.location(119,27);
                    pushFollow(FOLLOW_iblock_in_func174);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
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
        dbg.location(120, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:1: expr : ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | short_stmt | bool );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(122, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:5: ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | short_stmt | bool )
            int alt8=3;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==31) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==NUMBER) ) {
                        int LA8_8 = input.LA(4);

                        if ( (LA8_8==32) ) {
                            int LA8_10 = input.LA(5);

                            if ( (LA8_10==30) && (synpred1_Pass())) {
                                alt8=1;
                            }
                            else if ( (LA8_10==ARITH_ASSIGN) && (synpred1_Pass())) {
                                alt8=1;
                            }
                            else if ( ((LA8_10 >= BOP && LA8_10 <= CMP)||LA8_10==LT||(LA8_10 >= 20 && LA8_10 <= 28)||(LA8_10 >= 31 && LA8_10 <= 32)||LA8_10==38) ) {
                                alt8=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 10, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 8, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA8_1==27) ) {
                    int LA8_5 = input.LA(3);

                    if ( (LA8_5==ID) ) {
                        int LA8_9 = input.LA(4);

                        if ( (LA8_9==30) && (synpred1_Pass())) {
                            alt8=1;
                        }
                        else if ( (LA8_9==ARITH_ASSIGN) && (synpred1_Pass())) {
                            alt8=1;
                        }
                        else if ( ((LA8_9 >= BOP && LA8_9 <= CMP)||LA8_9==LT||(LA8_9 >= 20 && LA8_9 <= 28)||(LA8_9 >= 31 && LA8_9 <= 32)||LA8_9==38) ) {
                            alt8=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 9, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA8_1==30) && (synpred1_Pass())) {
                    alt8=1;
                }
                else if ( (LA8_1==ARITH_ASSIGN) && (synpred1_Pass())) {
                    alt8=1;
                }
                else if ( ((LA8_1 >= BOP && LA8_1 <= CMP)||LA8_1==LT||(LA8_1 >= 20 && LA8_1 <= 26)||LA8_1==28||LA8_1==32||LA8_1==38) ) {
                    alt8=3;
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
            case 33:
            case 38:
                {
                alt8=2;
                }
                break;
            case NUMBER:
            case STRING:
            case 21:
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign
                    {
                    dbg.location(122,43);
                    match(input,ID,FOLLOW_ID_in_expr203); if (state.failed) return ;
                    dbg.location(122,46);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:46: ( access )?
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==27||LA7_0==31) ) {
                        alt7=1;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:46: access
                            {
                            dbg.location(122,46);
                            pushFollow(FOLLOW_access_in_expr205);
                            access();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(122,54);
                    pushFollow(FOLLOW_assign_in_expr208);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:9: short_stmt
                    {
                    dbg.location(123,9);
                    pushFollow(FOLLOW_short_stmt_in_expr218);
                    short_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:9: bool
                    {
                    dbg.location(124,9);
                    pushFollow(FOLLOW_bool_in_expr228);
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
        dbg.location(125, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "short_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:127:1: short_stmt : ( return_stmt | break_stmt );
    public final void short_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "short_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:5: ( return_stmt | break_stmt )
            int alt9=2;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:9: return_stmt
                    {
                    dbg.location(128,9);
                    pushFollow(FOLLOW_return_stmt_in_short_stmt247);
                    return_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:9: break_stmt
                    {
                    dbg.location(129,9);
                    pushFollow(FOLLOW_break_stmt_in_short_stmt257);
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
        dbg.location(130, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "short_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "short_stmt"



    // $ANTLR start "break_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:132:1: break_stmt : 'break' ;
    public final void break_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "break_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:5: ( 'break' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:9: 'break'
            {
            dbg.location(133,9);
            match(input,33,FOLLOW_33_in_break_stmt280); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "break_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "break_stmt"



    // $ANTLR start "return_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:1: return_stmt : 'return' argument ;
    public final void return_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:137:5: ( 'return' argument )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:137:9: 'return' argument
            {
            dbg.location(137,9);
            match(input,38,FOLLOW_38_in_return_stmt299); if (state.failed) return ;
            dbg.location(137,18);
            pushFollow(FOLLOW_argument_in_return_stmt301);
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
        dbg.location(138, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "return_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "return_stmt"



    // $ANTLR start "bool"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:1: bool : ( ( args '~' )=> func | logic ( CMP logic )* );
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:5: ( ( args '~' )=> func | logic ( CMP logic )* )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                int LA11_1 = input.LA(2);

                if ( (synpred2_Pass()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA11_0==ID||LA11_0==NUMBER||LA11_0==STRING) ) {
                alt11=2;
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:9: ( args '~' )=> func
                    {
                    dbg.location(140,22);
                    pushFollow(FOLLOW_func_in_bool322);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:141:9: logic ( CMP logic )*
                    {
                    dbg.location(141,9);
                    pushFollow(FOLLOW_logic_in_bool332);
                    logic();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(141,15);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:141:15: ( CMP logic )*
                    try { dbg.enterSubRule(10);

                    loop10:
                    do {
                        int alt10=2;
                        try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==CMP) ) {
                            alt10=1;
                        }


                        } finally {dbg.exitDecision(10);}

                        switch (alt10) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:141:16: CMP logic
                    	    {
                    	    dbg.location(141,16);
                    	    match(input,CMP,FOLLOW_CMP_in_bool335); if (state.failed) return ;
                    	    dbg.location(141,20);
                    	    pushFollow(FOLLOW_logic_in_bool337);
                    	    logic();

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
        dbg.location(142, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bool");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "bool"



    // $ANTLR start "logic"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:144:1: logic : eval ( BOP eval )* ;
    public final void logic() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "logic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(144, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:5: ( eval ( BOP eval )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:9: eval ( BOP eval )*
            {
            dbg.location(145,9);
            pushFollow(FOLLOW_eval_in_logic358);
            eval();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(145,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:14: ( BOP eval )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==BOP) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:15: BOP eval
            	    {
            	    dbg.location(145,15);
            	    match(input,BOP,FOLLOW_BOP_in_logic361); if (state.failed) return ;
            	    dbg.location(145,19);
            	    pushFollow(FOLLOW_eval_in_logic363);
            	    eval();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);
            } finally {dbg.exitSubRule(12);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(146, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logic");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "logic"



    // $ANTLR start "eval"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:1: eval : term ( ( '+' | '-' ) term )* ;
    public final void eval() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:5: ( term ( ( '+' | '-' ) term )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:9: term ( ( '+' | '-' ) term )*
            {
            dbg.location(148,9);
            pushFollow(FOLLOW_term_in_eval379);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(148,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:14: ( ( '+' | '-' ) term )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==24||LA13_0==26) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:15: ( '+' | '-' ) term
            	    {
            	    dbg.location(148,15);
            	    if ( input.LA(1)==24||input.LA(1)==26 ) {
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

            	    dbg.location(148,25);
            	    pushFollow(FOLLOW_term_in_eval388);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(149, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:5: ( factor ( ( '*' | '/' | '%' ) factor )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:9: factor ( ( '*' | '/' | '%' ) factor )*
            {
            dbg.location(151,9);
            pushFollow(FOLLOW_factor_in_term404);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(151,16);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:16: ( ( '*' | '/' | '%' ) factor )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==20||LA14_0==23||LA14_0==28) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:17: ( '*' | '/' | '%' ) factor
            	    {
            	    dbg.location(151,17);
            	    if ( input.LA(1)==20||input.LA(1)==23||input.LA(1)==28 ) {
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

            	    dbg.location(151,31);
            	    pushFollow(FOLLOW_factor_in_term415);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(152, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:154:1: factor : ( modable ( mod )* | atom );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:5: ( modable ( mod )* | atom )
            int alt16=2;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==NUMBER||LA16_0==STRING) ) {
                alt16=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:9: modable ( mod )*
                    {
                    dbg.location(155,9);
                    pushFollow(FOLLOW_modable_in_factor436);
                    modable();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(155,17);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:17: ( mod )*
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21||LA15_0==27||LA15_0==31) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:17: mod
                    	    {
                    	    dbg.location(155,17);
                    	    pushFollow(FOLLOW_mod_in_factor438);
                    	    mod();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:156:9: atom
                    {
                    dbg.location(156,9);
                    pushFollow(FOLLOW_atom_in_factor449);
                    atom();

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
        dbg.location(157, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "access"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:159:1: access : ( '[' NUMBER ']' | '.' ID );
    public final void access() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "access");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(159, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:160:5: ( '[' NUMBER ']' | '.' ID )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:160:9: '[' NUMBER ']'
                    {
                    dbg.location(160,9);
                    match(input,31,FOLLOW_31_in_access468); if (state.failed) return ;
                    dbg.location(160,13);
                    match(input,NUMBER,FOLLOW_NUMBER_in_access470); if (state.failed) return ;
                    dbg.location(160,20);
                    match(input,32,FOLLOW_32_in_access472); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:161:9: '.' ID
                    {
                    dbg.location(161,9);
                    match(input,27,FOLLOW_27_in_access482); if (state.failed) return ;
                    dbg.location(161,13);
                    match(input,ID,FOLLOW_ID_in_access484); if (state.failed) return ;

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
        dbg.location(162, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "access");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "access"



    // $ANTLR start "mod"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:1: mod : ( args | access );
    public final void mod() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(164, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:5: ( args | access )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:9: args
                    {
                    dbg.location(164,9);
                    pushFollow(FOLLOW_args_in_mod499);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:165:9: access
                    {
                    dbg.location(165,9);
                    pushFollow(FOLLOW_access_in_mod509);
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
        dbg.location(166, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mod"



    // $ANTLR start "modable"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:168:1: modable : ( ID | '(' bool ')' );
    public final void modable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "modable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:169:5: ( ID | '(' bool ')' )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==21) ) {
                alt19=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:169:9: ID
                    {
                    dbg.location(169,9);
                    match(input,ID,FOLLOW_ID_in_modable532); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:170:9: '(' bool ')'
                    {
                    dbg.location(170,9);
                    match(input,21,FOLLOW_21_in_modable542); if (state.failed) return ;
                    dbg.location(170,13);
                    pushFollow(FOLLOW_bool_in_modable544);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(170,18);
                    match(input,22,FOLLOW_22_in_modable546); if (state.failed) return ;

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
        dbg.location(171, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "modable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "modable"



    // $ANTLR start "atom"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:173:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:173:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(173,5);
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
        dbg.location(175, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"



    // $ANTLR start "control"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:177:1: control : ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:178:5: ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test )
            int alt22=3;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            switch ( input.LA(1) ) {
            case 35:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case 36:
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:178:9: 'for' ID 'in' ID ( mod )? LT iblock
                    {
                    dbg.location(178,9);
                    match(input,35,FOLLOW_35_in_control589); if (state.failed) return ;
                    dbg.location(178,15);
                    match(input,ID,FOLLOW_ID_in_control591); if (state.failed) return ;
                    dbg.location(178,18);
                    match(input,37,FOLLOW_37_in_control593); if (state.failed) return ;
                    dbg.location(178,23);
                    match(input,ID,FOLLOW_ID_in_control595); if (state.failed) return ;
                    dbg.location(178,26);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:178:26: ( mod )?
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==21||LA20_0==27||LA20_0==31) ) {
                        alt20=1;
                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:178:26: mod
                            {
                            dbg.location(178,26);
                            pushFollow(FOLLOW_mod_in_control597);
                            mod();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(178,31);
                    match(input,LT,FOLLOW_LT_in_control600); if (state.failed) return ;
                    dbg.location(178,34);
                    pushFollow(FOLLOW_iblock_in_control602);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:9: 'while' bool LT iblock
                    {
                    dbg.location(179,9);
                    match(input,39,FOLLOW_39_in_control612); if (state.failed) return ;
                    dbg.location(179,17);
                    pushFollow(FOLLOW_bool_in_control614);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(179,22);
                    match(input,LT,FOLLOW_LT_in_control616); if (state.failed) return ;
                    dbg.location(179,25);
                    pushFollow(FOLLOW_iblock_in_control618);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:180:9: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(180,9);
                    match(input,36,FOLLOW_36_in_control628); if (state.failed) return ;
                    dbg.location(180,14);
                    pushFollow(FOLLOW_bool_in_control630);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(180,19);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:180:19: ( return_stmt LT | LT iblock )
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21, decisionCanBacktrack[21]);

                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==38) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==LT) ) {
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:180:20: return_stmt LT
                            {
                            dbg.location(180,20);
                            pushFollow(FOLLOW_return_stmt_in_control633);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(180,32);
                            match(input,LT,FOLLOW_LT_in_control635); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:180:35: LT iblock
                            {
                            dbg.location(180,35);
                            match(input,LT,FOLLOW_LT_in_control637); if (state.failed) return ;
                            dbg.location(180,38);
                            pushFollow(FOLLOW_iblock_in_control639);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(180,46);
                    pushFollow(FOLLOW_else_test_in_control642);
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
        dbg.location(181, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "control");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "control"



    // $ANTLR start "else_test"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:1: else_test : ( 'else' else_p |);
    public final void else_test() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_test");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:185:5: ( 'else' else_p |)
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==DEDENT||LA23_0==ID||LA23_0==NUMBER||LA23_0==STRING||LA23_0==21||LA23_0==33||(LA23_0 >= 35 && LA23_0 <= 36)||(LA23_0 >= 38 && LA23_0 <= 39)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:185:9: 'else' else_p
                    {
                    dbg.location(185,9);
                    match(input,34,FOLLOW_34_in_else_test663); if (state.failed) return ;
                    dbg.location(185,16);
                    pushFollow(FOLLOW_else_p_in_else_test665);
                    else_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:187:5: 
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
        dbg.location(187, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "else_test");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "else_test"



    // $ANTLR start "else_p"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:1: else_p : ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) );
    public final void else_p() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_p");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:190:5: ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            else if ( (LA26_0==LT||LA26_0==38) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:190:9: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(190,9);
                    match(input,36,FOLLOW_36_in_else_p690); if (state.failed) return ;
                    dbg.location(190,14);
                    pushFollow(FOLLOW_bool_in_else_p692);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(190,19);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:190:19: ( return_stmt LT | LT iblock )
                    int alt24=2;
                    try { dbg.enterSubRule(24);
                    try { dbg.enterDecision(24, decisionCanBacktrack[24]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(24);}

                    switch (alt24) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:190:20: return_stmt LT
                            {
                            dbg.location(190,20);
                            pushFollow(FOLLOW_return_stmt_in_else_p695);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(190,32);
                            match(input,LT,FOLLOW_LT_in_else_p697); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:190:35: LT iblock
                            {
                            dbg.location(190,35);
                            match(input,LT,FOLLOW_LT_in_else_p699); if (state.failed) return ;
                            dbg.location(190,38);
                            pushFollow(FOLLOW_iblock_in_else_p701);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(190,46);
                    pushFollow(FOLLOW_else_test_in_else_p704);
                    else_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:191:10: ( return_stmt LT | LT iblock )
                    {
                    dbg.location(191,10);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:191:10: ( return_stmt LT | LT iblock )
                    int alt25=2;
                    try { dbg.enterSubRule(25);
                    try { dbg.enterDecision(25, decisionCanBacktrack[25]);

                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==38) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==LT) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(25);}

                    switch (alt25) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:191:11: return_stmt LT
                            {
                            dbg.location(191,11);
                            pushFollow(FOLLOW_return_stmt_in_else_p716);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(191,23);
                            match(input,LT,FOLLOW_LT_in_else_p718); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:191:26: LT iblock
                            {
                            dbg.location(191,26);
                            match(input,LT,FOLLOW_LT_in_else_p720); if (state.failed) return ;
                            dbg.location(191,29);
                            pushFollow(FOLLOW_iblock_in_else_p722);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}


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
        dbg.location(192, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "else_p");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "else_p"



    // $ANTLR start "assign"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:194:1: assign : ( '=' ( expr | dictionary_definition | array_definition ) | ARITH_ASSIGN bool );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:5: ( '=' ( expr | dictionary_definition | array_definition ) | ARITH_ASSIGN bool )
            int alt28=2;
            try { dbg.enterDecision(28, decisionCanBacktrack[28]);

            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            else if ( (LA28_0==ARITH_ASSIGN) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(28);}

            switch (alt28) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:9: '=' ( expr | dictionary_definition | array_definition )
                    {
                    dbg.location(195,9);
                    match(input,30,FOLLOW_30_in_assign746); if (state.failed) return ;
                    dbg.location(195,13);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:13: ( expr | dictionary_definition | array_definition )
                    int alt27=3;
                    try { dbg.enterSubRule(27);
                    try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                    switch ( input.LA(1) ) {
                    case ID:
                    case NUMBER:
                    case STRING:
                    case 21:
                    case 33:
                    case 38:
                        {
                        alt27=1;
                        }
                        break;
                    case 40:
                        {
                        alt27=2;
                        }
                        break;
                    case 31:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(27);}

                    switch (alt27) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:14: expr
                            {
                            dbg.location(195,14);
                            pushFollow(FOLLOW_expr_in_assign749);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:19: dictionary_definition
                            {
                            dbg.location(195,19);
                            pushFollow(FOLLOW_dictionary_definition_in_assign751);
                            dictionary_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:41: array_definition
                            {
                            dbg.location(195,41);
                            pushFollow(FOLLOW_array_definition_in_assign753);
                            array_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(27);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:196:9: ARITH_ASSIGN bool
                    {
                    dbg.location(196,9);
                    match(input,ARITH_ASSIGN,FOLLOW_ARITH_ASSIGN_in_assign764); if (state.failed) return ;
                    dbg.location(196,22);
                    pushFollow(FOLLOW_bool_in_assign766);
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
        dbg.location(197, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assign"



    // $ANTLR start "dictionary_definition"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:199:1: dictionary_definition : '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' ;
    public final void dictionary_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(199, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:5: ( '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:9: '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}'
            {
            dbg.location(200,9);
            match(input,40,FOLLOW_40_in_dictionary_definition785); if (state.failed) return ;
            dbg.location(200,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:13: ( dictionary_entry ( ',' dictionary_entry )* )?
            int alt30=2;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==ID) ) {
                alt30=1;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:14: dictionary_entry ( ',' dictionary_entry )*
                    {
                    dbg.location(200,14);
                    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition788);
                    dictionary_entry();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(200,31);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:31: ( ',' dictionary_entry )*
                    try { dbg.enterSubRule(29);

                    loop29:
                    do {
                        int alt29=2;
                        try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==25) ) {
                            alt29=1;
                        }


                        } finally {dbg.exitDecision(29);}

                        switch (alt29) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:32: ',' dictionary_entry
                    	    {
                    	    dbg.location(200,32);
                    	    match(input,25,FOLLOW_25_in_dictionary_definition791); if (state.failed) return ;
                    	    dbg.location(200,36);
                    	    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition793);
                    	    dictionary_entry();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(29);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}

            dbg.location(200,57);
            match(input,41,FOLLOW_41_in_dictionary_definition799); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(201, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dictionary_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dictionary_definition"



    // $ANTLR start "dictionary_entry"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:203:1: dictionary_entry : ID ':' atom ;
    public final void dictionary_entry() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_entry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:204:5: ( ID ':' atom )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:204:9: ID ':' atom
            {
            dbg.location(204,9);
            match(input,ID,FOLLOW_ID_in_dictionary_entry818); if (state.failed) return ;
            dbg.location(204,12);
            match(input,29,FOLLOW_29_in_dictionary_entry820); if (state.failed) return ;
            dbg.location(204,16);
            pushFollow(FOLLOW_atom_in_dictionary_entry822);
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
        dbg.location(205, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dictionary_entry");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dictionary_entry"



    // $ANTLR start "array_definition"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:207:1: array_definition : '[' ( argument ( ',' argument )* )? ']' ;
    public final void array_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "array_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:208:5: ( '[' ( argument ( ',' argument )* )? ']' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:208:9: '[' ( argument ( ',' argument )* )? ']'
            {
            dbg.location(208,9);
            match(input,31,FOLLOW_31_in_array_definition846); if (state.failed) return ;
            dbg.location(208,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:208:13: ( argument ( ',' argument )* )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID||(LA32_0 >= LT && LA32_0 <= NUMBER)||LA32_0==STRING||LA32_0==21) ) {
                alt32=1;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:208:14: argument ( ',' argument )*
                    {
                    dbg.location(208,14);
                    pushFollow(FOLLOW_argument_in_array_definition849);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(208,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:208:23: ( ',' argument )*
                    try { dbg.enterSubRule(31);

                    loop31:
                    do {
                        int alt31=2;
                        try { dbg.enterDecision(31, decisionCanBacktrack[31]);

                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==25) ) {
                            alt31=1;
                        }


                        } finally {dbg.exitDecision(31);}

                        switch (alt31) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:208:24: ',' argument
                    	    {
                    	    dbg.location(208,24);
                    	    match(input,25,FOLLOW_25_in_array_definition852); if (state.failed) return ;
                    	    dbg.location(208,28);
                    	    pushFollow(FOLLOW_argument_in_array_definition854);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(31);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(32);}

            dbg.location(208,41);
            match(input,32,FOLLOW_32_in_array_definition860); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(209, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "array_definition"



    // $ANTLR start "argument"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:211:1: argument : ( LT )? bool ;
    public final void argument() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:212:5: ( ( LT )? bool )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:212:9: ( LT )? bool
            {
            dbg.location(212,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:212:9: ( LT )?
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==LT) ) {
                alt33=1;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:212:9: LT
                    {
                    dbg.location(212,9);
                    match(input,LT,FOLLOW_LT_in_argument883); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}

            dbg.location(212,13);
            pushFollow(FOLLOW_bool_in_argument886);
            bool();

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
        dbg.location(213, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "argument");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "argument"

    // $ANTLR start synpred1_Pass
    public final void synpred1_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:10: ID ( access )? ( '=' | ARITH_ASSIGN )
        {
        dbg.location(122,10);
        match(input,ID,FOLLOW_ID_in_synpred1_Pass190); if (state.failed) return ;
        dbg.location(122,13);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:13: ( access )?
        int alt34=2;
        try { dbg.enterSubRule(34);
        try { dbg.enterDecision(34, decisionCanBacktrack[34]);

        int LA34_0 = input.LA(1);

        if ( (LA34_0==27||LA34_0==31) ) {
            alt34=1;
        }
        } finally {dbg.exitDecision(34);}

        switch (alt34) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:13: access
                {
                dbg.location(122,13);
                pushFollow(FOLLOW_access_in_synpred1_Pass192);
                access();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(34);}

        dbg.location(122,21);
        if ( input.LA(1)==ARITH_ASSIGN||input.LA(1)==30 ) {
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
    // $ANTLR end synpred1_Pass

    // $ANTLR start synpred2_Pass
    public final void synpred2_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:10: args '~'
        {
        dbg.location(140,10);
        pushFollow(FOLLOW_args_in_synpred2_Pass316);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(140,15);
        match(input,42,FOLLOW_42_in_synpred2_Pass318); if (state.failed) return ;

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


 

    public static final BitSet FOLLOW_block_in_prog35 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_block56 = new BitSet(new long[]{0x000000DA00229002L});
    public static final BitSet FOLLOW_expr_in_stmt75 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_stmt77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_stmt87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_iblock113 = new BitSet(new long[]{0x000000DA00229000L});
    public static final BitSet FOLLOW_block_in_iblock115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DEDENT_in_iblock117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_args131 = new BitSet(new long[]{0x000000000062D000L});
    public static final BitSet FOLLOW_argument_in_args134 = new BitSet(new long[]{0x0000000002404000L});
    public static final BitSet FOLLOW_25_in_args137 = new BitSet(new long[]{0x000000000022D000L});
    public static final BitSet FOLLOW_argument_in_args139 = new BitSet(new long[]{0x0000000002404000L});
    public static final BitSet FOLLOW_LT_in_args145 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_args147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func165 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_func167 = new BitSet(new long[]{0x000000420022D000L});
    public static final BitSet FOLLOW_expr_in_func170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_func174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr203 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_expr205 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_assign_in_expr208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_stmt_in_expr218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_expr228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_short_stmt247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_short_stmt257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_break_stmt280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_return_stmt299 = new BitSet(new long[]{0x000000000022D000L});
    public static final BitSet FOLLOW_argument_in_return_stmt301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_bool322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_bool332 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CMP_in_bool335 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_logic_in_bool337 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_eval_in_logic358 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BOP_in_logic361 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_eval_in_logic363 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_term_in_eval379 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_set_in_eval382 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_term_in_eval388 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_factor_in_term404 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_set_in_term407 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_in_term415 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_modable_in_factor436 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_mod_in_factor438 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_atom_in_factor449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_access468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUMBER_in_access470 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_access472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_access482 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_access484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_mod499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_mod509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modable532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_modable542 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_modable544 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_modable546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control591 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control593 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control595 = new BitSet(new long[]{0x0000000088204000L});
    public static final BitSet FOLLOW_mod_in_control597 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control600 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_control612 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control614 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control616 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_control628 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control630 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_control633 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control635 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_control637 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control639 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_control642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_else_test663 = new BitSet(new long[]{0x0000005000004000L});
    public static final BitSet FOLLOW_else_p_in_else_test665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_else_p690 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_else_p692 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_else_p695 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p697 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_else_p699 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p701 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_else_p704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_p716 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_p720 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_assign746 = new BitSet(new long[]{0x0000014280229000L});
    public static final BitSet FOLLOW_expr_in_assign749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_definition_in_assign751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_assign753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_ASSIGN_in_assign764 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_assign766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_dictionary_definition785 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition788 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_25_in_dictionary_definition791 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition793 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_41_in_dictionary_definition799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dictionary_entry818 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dictionary_entry820 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_atom_in_dictionary_entry822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array_definition846 = new BitSet(new long[]{0x000000010022D000L});
    public static final BitSet FOLLOW_argument_in_array_definition849 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_25_in_array_definition852 = new BitSet(new long[]{0x000000000022D000L});
    public static final BitSet FOLLOW_argument_in_array_definition854 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_32_in_array_definition860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_argument883 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_argument886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass190 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_synpred1_Pass192 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_set_in_synpred1_Pass195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred2_Pass316 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred2_Pass318 = new BitSet(new long[]{0x0000000000000002L});

}