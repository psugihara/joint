// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-04-15 22:59:34

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
    "invalidRule", "dictionary_definition", "argument", "control", "prog", 
    "else_test", "logic", "iblock", "break_stmt", "stmt", "bool", "else_p", 
    "assign", "factor", "synpred2_Pass", "access", "mod", "term", "atom", 
    "func", "expr", "block", "modable", "short_stmt", "eval", "args", "return_stmt", 
    "array_definition", "synpred1_Pass", "dictionary_entry"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, true, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:5: ( block EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:9: block EOF
            {
            dbg.location(95,9);
            pushFollow(FOLLOW_block_in_prog35);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(95,15);
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
        dbg.location(96, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:1: block : ( stmt )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:5: ( ( stmt )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: ( stmt )+
            {
            dbg.location(99,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: ( stmt )+
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: stmt
            	    {
            	    dbg.location(99,9);
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
        dbg.location(100, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:1: stmt : ( expr ( LT )+ | control );
    public final void stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:5: ( expr ( LT )+ | control )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==NUMBER||LA3_0==STRING||LA3_0==21||LA3_0==33||LA3_0==38) ) {
                alt3=1;
            }
            else if ( ((LA3_0 >= 35 && LA3_0 <= 36)||LA3_0==39) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:9: expr ( LT )+
                    {
                    dbg.location(102,9);
                    pushFollow(FOLLOW_expr_in_stmt75);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(102,14);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:14: ( LT )+
                    int cnt2=0;
                    try { dbg.enterSubRule(2);

                    loop2:
                    do {
                        int alt2=2;
                        try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==LT) ) {
                            alt2=1;
                        }


                        } finally {dbg.exitDecision(2);}

                        switch (alt2) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:102:14: LT
                    	    {
                    	    dbg.location(102,14);
                    	    match(input,LT,FOLLOW_LT_in_stmt77); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt2++;
                    } while (true);
                    } finally {dbg.exitSubRule(2);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:9: control
                    {
                    dbg.location(103,9);
                    pushFollow(FOLLOW_control_in_stmt88);
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
        dbg.location(104, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(106, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:107:9: INDENT block DEDENT
            {
            dbg.location(107,9);
            match(input,INDENT,FOLLOW_INDENT_in_iblock114); if (state.failed) return ;
            dbg.location(107,16);
            pushFollow(FOLLOW_block_in_iblock116);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(107,22);
            match(input,DEDENT,FOLLOW_DEDENT_in_iblock118); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "iblock");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "iblock"



    // $ANTLR start "args"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:1: args : '(' ( argument ( ',' argument )* )? ( ( LT )+ )? ')' ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:5: ( '(' ( argument ( ',' argument )* )? ( ( LT )+ )? ')' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:9: '(' ( argument ( ',' argument )* )? ( ( LT )+ )? ')'
            {
            dbg.location(110,9);
            match(input,21,FOLLOW_21_in_args132); if (state.failed) return ;
            dbg.location(110,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:13: ( argument ( ',' argument )* )?
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==LT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID||LA5_1==NUMBER||LA5_1==STRING||LA5_1==21) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==ID||LA5_0==NUMBER||LA5_0==STRING||LA5_0==21) ) {
                alt5=1;
            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:14: argument ( ',' argument )*
                    {
                    dbg.location(110,14);
                    pushFollow(FOLLOW_argument_in_args135);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(110,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:23: ( ',' argument )*
                    try { dbg.enterSubRule(4);

                    loop4:
                    do {
                        int alt4=2;
                        try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==25) ) {
                            alt4=1;
                        }


                        } finally {dbg.exitDecision(4);}

                        switch (alt4) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:24: ',' argument
                    	    {
                    	    dbg.location(110,24);
                    	    match(input,25,FOLLOW_25_in_args138); if (state.failed) return ;
                    	    dbg.location(110,28);
                    	    pushFollow(FOLLOW_argument_in_args140);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(4);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(110,41);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:41: ( ( LT )+ )?
            int alt7=2;
            try { dbg.enterSubRule(7);
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==LT) ) {
                alt7=1;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:42: ( LT )+
                    {
                    dbg.location(110,42);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:42: ( LT )+
                    int cnt6=0;
                    try { dbg.enterSubRule(6);

                    loop6:
                    do {
                        int alt6=2;
                        try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==LT) ) {
                            alt6=1;
                        }


                        } finally {dbg.exitDecision(6);}

                        switch (alt6) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:42: LT
                    	    {
                    	    dbg.location(110,42);
                    	    match(input,LT,FOLLOW_LT_in_args147); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt6++;
                    } while (true);
                    } finally {dbg.exitSubRule(6);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(7);}

            dbg.location(110,47);
            match(input,22,FOLLOW_22_in_args151); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(111, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:1: func : args '~' ( expr | LT iblock ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:5: ( args '~' ( expr | LT iblock ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:9: args '~' ( expr | LT iblock )
            {
            dbg.location(113,9);
            pushFollow(FOLLOW_args_in_func169);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(113,14);
            match(input,42,FOLLOW_42_in_func171); if (state.failed) return ;
            dbg.location(113,18);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:18: ( expr | LT iblock )
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||LA8_0==NUMBER||LA8_0==STRING||LA8_0==21||LA8_0==33||LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==LT) ) {
                alt8=2;
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:19: expr
                    {
                    dbg.location(113,19);
                    pushFollow(FOLLOW_expr_in_func174);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:24: LT iblock
                    {
                    dbg.location(113,24);
                    match(input,LT,FOLLOW_LT_in_func176); if (state.failed) return ;
                    dbg.location(113,27);
                    pushFollow(FOLLOW_iblock_in_func178);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
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
        dbg.location(114, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:1: expr : ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | short_stmt | bool );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:5: ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | short_stmt | bool )
            int alt10=3;
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case ID:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==31) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==NUMBER) ) {
                        int LA10_8 = input.LA(4);

                        if ( (LA10_8==32) ) {
                            int LA10_10 = input.LA(5);

                            if ( (LA10_10==30) && (synpred1_Pass())) {
                                alt10=1;
                            }
                            else if ( (LA10_10==ARITH_ASSIGN) && (synpred1_Pass())) {
                                alt10=1;
                            }
                            else if ( ((LA10_10 >= BOP && LA10_10 <= CMP)||LA10_10==LT||(LA10_10 >= 20 && LA10_10 <= 28)||(LA10_10 >= 31 && LA10_10 <= 32)||LA10_10==38) ) {
                                alt10=3;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 10, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 8, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA10_1==27) ) {
                    int LA10_5 = input.LA(3);

                    if ( (LA10_5==ID) ) {
                        int LA10_9 = input.LA(4);

                        if ( (LA10_9==30) && (synpred1_Pass())) {
                            alt10=1;
                        }
                        else if ( (LA10_9==ARITH_ASSIGN) && (synpred1_Pass())) {
                            alt10=1;
                        }
                        else if ( ((LA10_9 >= BOP && LA10_9 <= CMP)||LA10_9==LT||(LA10_9 >= 20 && LA10_9 <= 28)||(LA10_9 >= 31 && LA10_9 <= 32)||LA10_9==38) ) {
                            alt10=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 9, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 5, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else if ( (LA10_1==30) && (synpred1_Pass())) {
                    alt10=1;
                }
                else if ( (LA10_1==ARITH_ASSIGN) && (synpred1_Pass())) {
                    alt10=1;
                }
                else if ( ((LA10_1 >= BOP && LA10_1 <= CMP)||LA10_1==LT||(LA10_1 >= 20 && LA10_1 <= 26)||LA10_1==28||LA10_1==32||LA10_1==38) ) {
                    alt10=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 33:
            case 38:
                {
                alt10=2;
                }
                break;
            case NUMBER:
            case STRING:
            case 21:
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign
                    {
                    dbg.location(116,43);
                    match(input,ID,FOLLOW_ID_in_expr207); if (state.failed) return ;
                    dbg.location(116,46);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:46: ( access )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27||LA9_0==31) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:46: access
                            {
                            dbg.location(116,46);
                            pushFollow(FOLLOW_access_in_expr209);
                            access();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(116,54);
                    pushFollow(FOLLOW_assign_in_expr212);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:9: short_stmt
                    {
                    dbg.location(117,9);
                    pushFollow(FOLLOW_short_stmt_in_expr222);
                    short_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:118:9: bool
                    {
                    dbg.location(118,9);
                    pushFollow(FOLLOW_bool_in_expr232);
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
        dbg.location(119, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:1: short_stmt : ( return_stmt | break_stmt );
    public final void short_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "short_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(121, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:5: ( return_stmt | break_stmt )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==33) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:122:9: return_stmt
                    {
                    dbg.location(122,9);
                    pushFollow(FOLLOW_return_stmt_in_short_stmt251);
                    return_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:9: break_stmt
                    {
                    dbg.location(123,9);
                    pushFollow(FOLLOW_break_stmt_in_short_stmt261);
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
        dbg.location(124, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:1: break_stmt : 'break' ;
    public final void break_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "break_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:127:5: ( 'break' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:127:9: 'break'
            {
            dbg.location(127,9);
            match(input,33,FOLLOW_33_in_break_stmt284); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(128, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:130:1: return_stmt : 'return' argument ;
    public final void return_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(130, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:131:5: ( 'return' argument )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:131:9: 'return' argument
            {
            dbg.location(131,9);
            match(input,38,FOLLOW_38_in_return_stmt303); if (state.failed) return ;
            dbg.location(131,18);
            pushFollow(FOLLOW_argument_in_return_stmt305);
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
        dbg.location(132, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:134:1: bool : ( ( args '~' )=> func | logic ( CMP logic )* );
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:134:5: ( ( args '~' )=> func | logic ( CMP logic )* )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred2_Pass()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA13_0==ID||LA13_0==NUMBER||LA13_0==STRING) ) {
                alt13=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:134:9: ( args '~' )=> func
                    {
                    dbg.location(134,22);
                    pushFollow(FOLLOW_func_in_bool326);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:135:9: logic ( CMP logic )*
                    {
                    dbg.location(135,9);
                    pushFollow(FOLLOW_logic_in_bool336);
                    logic();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(135,15);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:135:15: ( CMP logic )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==CMP) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:135:16: CMP logic
                    	    {
                    	    dbg.location(135,16);
                    	    match(input,CMP,FOLLOW_CMP_in_bool339); if (state.failed) return ;
                    	    dbg.location(135,20);
                    	    pushFollow(FOLLOW_logic_in_bool341);
                    	    logic();

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
        dbg.location(136, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:138:1: logic : eval ( BOP eval )* ;
    public final void logic() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "logic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:5: ( eval ( BOP eval )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:9: eval ( BOP eval )*
            {
            dbg.location(139,9);
            pushFollow(FOLLOW_eval_in_logic362);
            eval();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(139,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:14: ( BOP eval )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==BOP) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:15: BOP eval
            	    {
            	    dbg.location(139,15);
            	    match(input,BOP,FOLLOW_BOP_in_logic365); if (state.failed) return ;
            	    dbg.location(139,19);
            	    pushFollow(FOLLOW_eval_in_logic367);
            	    eval();

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
        dbg.location(140, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:142:1: eval : term ( ( '+' | '-' ) term )* ;
    public final void eval() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(142, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:142:5: ( term ( ( '+' | '-' ) term )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:142:9: term ( ( '+' | '-' ) term )*
            {
            dbg.location(142,9);
            pushFollow(FOLLOW_term_in_eval383);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(142,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:142:14: ( ( '+' | '-' ) term )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==24||LA15_0==26) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:142:15: ( '+' | '-' ) term
            	    {
            	    dbg.location(142,15);
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

            	    dbg.location(142,25);
            	    pushFollow(FOLLOW_term_in_eval392);
            	    term();

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(143, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:5: ( factor ( ( '*' | '/' | '%' ) factor )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:9: factor ( ( '*' | '/' | '%' ) factor )*
            {
            dbg.location(145,9);
            pushFollow(FOLLOW_factor_in_term408);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(145,16);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:16: ( ( '*' | '/' | '%' ) factor )*
            try { dbg.enterSubRule(16);

            loop16:
            do {
                int alt16=2;
                try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                int LA16_0 = input.LA(1);

                if ( (LA16_0==20||LA16_0==23||LA16_0==28) ) {
                    alt16=1;
                }


                } finally {dbg.exitDecision(16);}

                switch (alt16) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:17: ( '*' | '/' | '%' ) factor
            	    {
            	    dbg.location(145,17);
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

            	    dbg.location(145,31);
            	    pushFollow(FOLLOW_factor_in_term419);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);
            } finally {dbg.exitSubRule(16);}


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
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:1: factor : ( modable ( mod )* | atom );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:149:5: ( modable ( mod )* | atom )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||LA18_0==21) ) {
                alt18=1;
            }
            else if ( (LA18_0==NUMBER||LA18_0==STRING) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:149:9: modable ( mod )*
                    {
                    dbg.location(149,9);
                    pushFollow(FOLLOW_modable_in_factor440);
                    modable();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(149,17);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:149:17: ( mod )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==21||LA17_0==27||LA17_0==31) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:149:17: mod
                    	    {
                    	    dbg.location(149,17);
                    	    pushFollow(FOLLOW_mod_in_factor442);
                    	    mod();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:9: atom
                    {
                    dbg.location(150,9);
                    pushFollow(FOLLOW_atom_in_factor453);
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
        dbg.location(151, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:153:1: access : ( '[' NUMBER ']' | '.' ID );
    public final void access() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "access");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:154:5: ( '[' NUMBER ']' | '.' ID )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:154:9: '[' NUMBER ']'
                    {
                    dbg.location(154,9);
                    match(input,31,FOLLOW_31_in_access472); if (state.failed) return ;
                    dbg.location(154,13);
                    match(input,NUMBER,FOLLOW_NUMBER_in_access474); if (state.failed) return ;
                    dbg.location(154,20);
                    match(input,32,FOLLOW_32_in_access476); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:155:9: '.' ID
                    {
                    dbg.location(155,9);
                    match(input,27,FOLLOW_27_in_access486); if (state.failed) return ;
                    dbg.location(155,13);
                    match(input,ID,FOLLOW_ID_in_access488); if (state.failed) return ;

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
        dbg.location(156, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:158:1: mod : ( args | access );
    public final void mod() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:158:5: ( args | access )
            int alt20=2;
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            else if ( (LA20_0==27||LA20_0==31) ) {
                alt20=2;
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:158:9: args
                    {
                    dbg.location(158,9);
                    pushFollow(FOLLOW_args_in_mod503);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:159:9: access
                    {
                    dbg.location(159,9);
                    pushFollow(FOLLOW_access_in_mod513);
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
        dbg.location(160, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:1: modable : ( ID | '(' bool ')' );
    public final void modable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "modable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(162, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:163:5: ( ID | '(' bool ')' )
            int alt21=2;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==21) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:163:9: ID
                    {
                    dbg.location(163,9);
                    match(input,ID,FOLLOW_ID_in_modable536); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:9: '(' bool ')'
                    {
                    dbg.location(164,9);
                    match(input,21,FOLLOW_21_in_modable546); if (state.failed) return ;
                    dbg.location(164,13);
                    pushFollow(FOLLOW_bool_in_modable548);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(164,18);
                    match(input,22,FOLLOW_22_in_modable550); if (state.failed) return ;

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
        dbg.location(165, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:167:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:167:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(167,5);
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
        dbg.location(169, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:1: control : ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool LT iblock ( else_test )? );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:5: ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool LT iblock ( else_test )? )
            int alt24=3;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            switch ( input.LA(1) ) {
            case 35:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            default:
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:9: 'for' ID 'in' ID ( mod )? LT iblock
                    {
                    dbg.location(172,9);
                    match(input,35,FOLLOW_35_in_control593); if (state.failed) return ;
                    dbg.location(172,15);
                    match(input,ID,FOLLOW_ID_in_control595); if (state.failed) return ;
                    dbg.location(172,18);
                    match(input,37,FOLLOW_37_in_control597); if (state.failed) return ;
                    dbg.location(172,23);
                    match(input,ID,FOLLOW_ID_in_control599); if (state.failed) return ;
                    dbg.location(172,26);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:26: ( mod )?
                    int alt22=2;
                    try { dbg.enterSubRule(22);
                    try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==21||LA22_0==27||LA22_0==31) ) {
                        alt22=1;
                    }
                    } finally {dbg.exitDecision(22);}

                    switch (alt22) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:26: mod
                            {
                            dbg.location(172,26);
                            pushFollow(FOLLOW_mod_in_control601);
                            mod();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(22);}

                    dbg.location(172,31);
                    match(input,LT,FOLLOW_LT_in_control604); if (state.failed) return ;
                    dbg.location(172,34);
                    pushFollow(FOLLOW_iblock_in_control606);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:173:9: 'while' bool LT iblock
                    {
                    dbg.location(173,9);
                    match(input,39,FOLLOW_39_in_control616); if (state.failed) return ;
                    dbg.location(173,17);
                    pushFollow(FOLLOW_bool_in_control618);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(173,22);
                    match(input,LT,FOLLOW_LT_in_control620); if (state.failed) return ;
                    dbg.location(173,25);
                    pushFollow(FOLLOW_iblock_in_control622);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:9: 'if' bool LT iblock ( else_test )?
                    {
                    dbg.location(174,9);
                    match(input,36,FOLLOW_36_in_control632); if (state.failed) return ;
                    dbg.location(174,14);
                    pushFollow(FOLLOW_bool_in_control634);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(174,19);
                    match(input,LT,FOLLOW_LT_in_control636); if (state.failed) return ;
                    dbg.location(174,22);
                    pushFollow(FOLLOW_iblock_in_control638);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(174,29);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:29: ( else_test )?
                    int alt23=2;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==34) ) {
                        alt23=1;
                    }
                    } finally {dbg.exitDecision(23);}

                    switch (alt23) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:29: else_test
                            {
                            dbg.location(174,29);
                            pushFollow(FOLLOW_else_test_in_control640);
                            else_test();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}


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
        dbg.location(175, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:178:1: else_test : 'else' else_p ;
    public final void else_test() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_test");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:5: ( 'else' else_p )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:9: 'else' else_p
            {
            dbg.location(179,9);
            match(input,34,FOLLOW_34_in_else_test662); if (state.failed) return ;
            dbg.location(179,16);
            pushFollow(FOLLOW_else_p_in_else_test664);
            else_p();

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
        dbg.location(180, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:182:1: else_p : ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) );
    public final void else_p() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_p");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:183:5: ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            else if ( (LA27_0==LT||LA27_0==38) ) {
                alt27=2;
            }
            else {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:183:9: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(183,9);
                    match(input,36,FOLLOW_36_in_else_p683); if (state.failed) return ;
                    dbg.location(183,14);
                    pushFollow(FOLLOW_bool_in_else_p685);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(183,19);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:183:19: ( return_stmt LT | LT iblock )
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:183:20: return_stmt LT
                            {
                            dbg.location(183,20);
                            pushFollow(FOLLOW_return_stmt_in_else_p688);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(183,32);
                            match(input,LT,FOLLOW_LT_in_else_p690); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:183:35: LT iblock
                            {
                            dbg.location(183,35);
                            match(input,LT,FOLLOW_LT_in_else_p692); if (state.failed) return ;
                            dbg.location(183,38);
                            pushFollow(FOLLOW_iblock_in_else_p694);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(25);}

                    dbg.location(183,46);
                    pushFollow(FOLLOW_else_test_in_else_p697);
                    else_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:10: ( return_stmt LT | LT iblock )
                    {
                    dbg.location(184,10);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:10: ( return_stmt LT | LT iblock )
                    int alt26=2;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26, decisionCanBacktrack[26]);

                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==38) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==LT) ) {
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:11: return_stmt LT
                            {
                            dbg.location(184,11);
                            pushFollow(FOLLOW_return_stmt_in_else_p709);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(184,23);
                            match(input,LT,FOLLOW_LT_in_else_p711); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:26: LT iblock
                            {
                            dbg.location(184,26);
                            match(input,LT,FOLLOW_LT_in_else_p713); if (state.failed) return ;
                            dbg.location(184,29);
                            pushFollow(FOLLOW_iblock_in_else_p715);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}


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
        dbg.location(185, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:187:1: assign : ( '=' ( expr | dictionary_definition | array_definition ) | ARITH_ASSIGN bool );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:5: ( '=' ( expr | dictionary_definition | array_definition ) | ARITH_ASSIGN bool )
            int alt29=2;
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            else if ( (LA29_0==ARITH_ASSIGN) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:9: '=' ( expr | dictionary_definition | array_definition )
                    {
                    dbg.location(188,9);
                    match(input,30,FOLLOW_30_in_assign739); if (state.failed) return ;
                    dbg.location(188,13);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:13: ( expr | dictionary_definition | array_definition )
                    int alt28=3;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                    switch ( input.LA(1) ) {
                    case ID:
                    case NUMBER:
                    case STRING:
                    case 21:
                    case 33:
                    case 38:
                        {
                        alt28=1;
                        }
                        break;
                    case 40:
                        {
                        alt28=2;
                        }
                        break;
                    case 31:
                        {
                        alt28=3;
                        }
                        break;
                    default:
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:14: expr
                            {
                            dbg.location(188,14);
                            pushFollow(FOLLOW_expr_in_assign742);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:19: dictionary_definition
                            {
                            dbg.location(188,19);
                            pushFollow(FOLLOW_dictionary_definition_in_assign744);
                            dictionary_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:41: array_definition
                            {
                            dbg.location(188,41);
                            pushFollow(FOLLOW_array_definition_in_assign746);
                            array_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:9: ARITH_ASSIGN bool
                    {
                    dbg.location(189,9);
                    match(input,ARITH_ASSIGN,FOLLOW_ARITH_ASSIGN_in_assign757); if (state.failed) return ;
                    dbg.location(189,22);
                    pushFollow(FOLLOW_bool_in_assign759);
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
        dbg.location(190, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:1: dictionary_definition : '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' ;
    public final void dictionary_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:5: ( '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:9: '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}'
            {
            dbg.location(193,9);
            match(input,40,FOLLOW_40_in_dictionary_definition778); if (state.failed) return ;
            dbg.location(193,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:13: ( dictionary_entry ( ',' dictionary_entry )* )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:14: dictionary_entry ( ',' dictionary_entry )*
                    {
                    dbg.location(193,14);
                    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition781);
                    dictionary_entry();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(193,31);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:31: ( ',' dictionary_entry )*
                    try { dbg.enterSubRule(30);

                    loop30:
                    do {
                        int alt30=2;
                        try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==25) ) {
                            alt30=1;
                        }


                        } finally {dbg.exitDecision(30);}

                        switch (alt30) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:32: ',' dictionary_entry
                    	    {
                    	    dbg.location(193,32);
                    	    match(input,25,FOLLOW_25_in_dictionary_definition784); if (state.failed) return ;
                    	    dbg.location(193,36);
                    	    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition786);
                    	    dictionary_entry();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(30);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}

            dbg.location(193,57);
            match(input,41,FOLLOW_41_in_dictionary_definition792); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(194, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:196:1: dictionary_entry : ID ':' atom ;
    public final void dictionary_entry() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_entry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:197:5: ( ID ':' atom )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:197:9: ID ':' atom
            {
            dbg.location(197,9);
            match(input,ID,FOLLOW_ID_in_dictionary_entry811); if (state.failed) return ;
            dbg.location(197,12);
            match(input,29,FOLLOW_29_in_dictionary_entry813); if (state.failed) return ;
            dbg.location(197,16);
            pushFollow(FOLLOW_atom_in_dictionary_entry815);
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
        dbg.location(198, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:200:1: array_definition : '[' ( argument ( ',' argument )* )? ']' ;
    public final void array_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "array_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(200, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:201:5: ( '[' ( argument ( ',' argument )* )? ']' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:201:9: '[' ( argument ( ',' argument )* )? ']'
            {
            dbg.location(201,9);
            match(input,31,FOLLOW_31_in_array_definition839); if (state.failed) return ;
            dbg.location(201,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:201:13: ( argument ( ',' argument )* )?
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID||(LA33_0 >= LT && LA33_0 <= NUMBER)||LA33_0==STRING||LA33_0==21) ) {
                alt33=1;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:201:14: argument ( ',' argument )*
                    {
                    dbg.location(201,14);
                    pushFollow(FOLLOW_argument_in_array_definition842);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(201,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:201:23: ( ',' argument )*
                    try { dbg.enterSubRule(32);

                    loop32:
                    do {
                        int alt32=2;
                        try { dbg.enterDecision(32, decisionCanBacktrack[32]);

                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==25) ) {
                            alt32=1;
                        }


                        } finally {dbg.exitDecision(32);}

                        switch (alt32) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:201:24: ',' argument
                    	    {
                    	    dbg.location(201,24);
                    	    match(input,25,FOLLOW_25_in_array_definition845); if (state.failed) return ;
                    	    dbg.location(201,28);
                    	    pushFollow(FOLLOW_argument_in_array_definition847);
                    	    argument();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(32);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}

            dbg.location(201,41);
            match(input,32,FOLLOW_32_in_array_definition853); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(202, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:204:1: argument : ( LT )? bool ;
    public final void argument() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(204, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:205:5: ( ( LT )? bool )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:205:9: ( LT )? bool
            {
            dbg.location(205,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:205:9: ( LT )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==LT) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:205:9: LT
                    {
                    dbg.location(205,9);
                    match(input,LT,FOLLOW_LT_in_argument876); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}

            dbg.location(205,13);
            pushFollow(FOLLOW_bool_in_argument879);
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
        dbg.location(206, 4);

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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:10: ID ( access )? ( '=' | ARITH_ASSIGN )
        {
        dbg.location(116,10);
        match(input,ID,FOLLOW_ID_in_synpred1_Pass194); if (state.failed) return ;
        dbg.location(116,13);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:13: ( access )?
        int alt35=2;
        try { dbg.enterSubRule(35);
        try { dbg.enterDecision(35, decisionCanBacktrack[35]);

        int LA35_0 = input.LA(1);

        if ( (LA35_0==27||LA35_0==31) ) {
            alt35=1;
        }
        } finally {dbg.exitDecision(35);}

        switch (alt35) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:13: access
                {
                dbg.location(116,13);
                pushFollow(FOLLOW_access_in_synpred1_Pass196);
                access();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(35);}

        dbg.location(116,21);
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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:134:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:134:10: args '~'
        {
        dbg.location(134,10);
        pushFollow(FOLLOW_args_in_synpred2_Pass320);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(134,15);
        match(input,42,FOLLOW_42_in_synpred2_Pass322); if (state.failed) return ;

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
    public static final BitSet FOLLOW_LT_in_stmt77 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_control_in_stmt88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_iblock114 = new BitSet(new long[]{0x000000DA00229000L});
    public static final BitSet FOLLOW_block_in_iblock116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DEDENT_in_iblock118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_args132 = new BitSet(new long[]{0x000000000062D000L});
    public static final BitSet FOLLOW_argument_in_args135 = new BitSet(new long[]{0x0000000002404000L});
    public static final BitSet FOLLOW_25_in_args138 = new BitSet(new long[]{0x000000000022D000L});
    public static final BitSet FOLLOW_argument_in_args140 = new BitSet(new long[]{0x0000000002404000L});
    public static final BitSet FOLLOW_LT_in_args147 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_22_in_args151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func169 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_func171 = new BitSet(new long[]{0x000000420022D000L});
    public static final BitSet FOLLOW_expr_in_func174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_func178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr207 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_expr209 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_assign_in_expr212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_stmt_in_expr222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_expr232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_short_stmt251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_short_stmt261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_break_stmt284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_return_stmt303 = new BitSet(new long[]{0x000000000022D000L});
    public static final BitSet FOLLOW_argument_in_return_stmt305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_bool326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_bool336 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CMP_in_bool339 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_logic_in_bool341 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_eval_in_logic362 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BOP_in_logic365 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_eval_in_logic367 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_term_in_eval383 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_set_in_eval386 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_term_in_eval392 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_factor_in_term408 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_set_in_term411 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_in_term419 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_modable_in_factor440 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_mod_in_factor442 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_atom_in_factor453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_access472 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUMBER_in_access474 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_access476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_access486 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_access488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_mod503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_mod513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modable536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_modable546 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_modable548 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_modable550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control593 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control595 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control597 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control599 = new BitSet(new long[]{0x0000000088204000L});
    public static final BitSet FOLLOW_mod_in_control601 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control604 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_control616 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control618 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_control632 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control636 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control638 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_else_test_in_control640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_else_test662 = new BitSet(new long[]{0x0000005000004000L});
    public static final BitSet FOLLOW_else_p_in_else_test664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_else_p683 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_else_p685 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_else_p688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p690 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_else_p692 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p694 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_else_p697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_p709 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_p713 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_assign739 = new BitSet(new long[]{0x0000014280229000L});
    public static final BitSet FOLLOW_expr_in_assign742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_definition_in_assign744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_assign746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_ASSIGN_in_assign757 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_assign759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_dictionary_definition778 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition781 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_25_in_dictionary_definition784 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition786 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_41_in_dictionary_definition792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dictionary_entry811 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dictionary_entry813 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_atom_in_dictionary_entry815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array_definition839 = new BitSet(new long[]{0x000000010022D000L});
    public static final BitSet FOLLOW_argument_in_array_definition842 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_25_in_array_definition845 = new BitSet(new long[]{0x000000000022D000L});
    public static final BitSet FOLLOW_argument_in_array_definition847 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_32_in_array_definition853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_argument876 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_argument879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass194 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_synpred1_Pass196 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_set_in_synpred1_Pass199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred2_Pass320 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred2_Pass322 = new BitSet(new long[]{0x0000000000000002L});

}