// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-04-02 11:56:02

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
    "invalidRule", "synpred4_Pass", "return_stmt", "factor_p", "dictionary_entry", 
    "logic", "dictionary_definition", "short_stmt", "argument", "synpred5_Pass", 
    "args", "else_p", "eval", "factor", "term", "prog", "break_stmt", "synpred2_Pass", 
    "stmt", "assign", "iblock", "control", "synpred1_Pass", "expr", "value", 
    "synpred3_Pass", "func", "bool", "access", "else_test", "block", "atom", 
    "mod", "array_definition"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, true, false, false, false, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, true, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:76:1: prog : block EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:76:5: ( block EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:76:9: block EOF
            {
            dbg.location(76,9);
            pushFollow(FOLLOW_block_in_prog35);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(76,15);
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
        dbg.location(77, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:1: block : ( stmt | LT )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:5: ( ( stmt | LT )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:9: ( stmt | LT )+
            {
            dbg.location(80,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:9: ( stmt | LT )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NUMBER||LA1_0==STRING||LA1_0==21||LA1_0==33||(LA1_0 >= 35 && LA1_0 <= 36)||(LA1_0 >= 38 && LA1_0 <= 39)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==LT) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:10: stmt
            	    {
            	    dbg.location(80,10);
            	    pushFollow(FOLLOW_stmt_in_block57);
            	    stmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:15: LT
            	    {
            	    dbg.location(80,15);
            	    match(input,LT,FOLLOW_LT_in_block59); if (state.failed) return ;

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
        dbg.location(81, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:1: stmt : ( expr LT | control );
    public final void stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:5: ( expr LT | control )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:9: expr LT
                    {
                    dbg.location(83,9);
                    pushFollow(FOLLOW_expr_in_stmt79);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(83,14);
                    match(input,LT,FOLLOW_LT_in_stmt81); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:84:9: control
                    {
                    dbg.location(84,9);
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
        dbg.location(85, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:87:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:9: INDENT block DEDENT
            {
            dbg.location(88,9);
            match(input,INDENT,FOLLOW_INDENT_in_iblock117); if (state.failed) return ;
            dbg.location(88,16);
            pushFollow(FOLLOW_block_in_iblock119);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(88,22);
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
        dbg.location(89, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:1: args : '(' ( argument ( ',' argument )* )? ')' ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:5: ( '(' ( argument ( ',' argument )* )? ')' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:9: '(' ( argument ( ',' argument )* )? ')'
            {
            dbg.location(91,9);
            match(input,21,FOLLOW_21_in_args135); if (state.failed) return ;
            dbg.location(91,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:13: ( argument ( ',' argument )* )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID||LA4_0==NUMBER||LA4_0==STRING||LA4_0==21) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:14: argument ( ',' argument )*
                    {
                    dbg.location(91,14);
                    pushFollow(FOLLOW_argument_in_args138);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(91,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:23: ( ',' argument )*
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

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:91:24: ',' argument
                    	    {
                    	    dbg.location(91,24);
                    	    match(input,25,FOLLOW_25_in_args141); if (state.failed) return ;
                    	    dbg.location(91,28);
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
                    } finally {dbg.exitSubRule(3);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(91,41);
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
        dbg.location(92, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:1: func : args '~' ( expr | ( LT iblock ) ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:5: ( args '~' ( expr | ( LT iblock ) ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:9: args '~' ( expr | ( LT iblock ) )
            {
            dbg.location(94,9);
            pushFollow(FOLLOW_args_in_func167);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(94,14);
            match(input,42,FOLLOW_42_in_func169); if (state.failed) return ;
            dbg.location(94,18);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:18: ( expr | ( LT iblock ) )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:19: expr
                    {
                    dbg.location(94,19);
                    pushFollow(FOLLOW_expr_in_func172);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:24: ( LT iblock )
                    {
                    dbg.location(94,24);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:24: ( LT iblock )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:25: LT iblock
                    {
                    dbg.location(94,25);
                    match(input,LT,FOLLOW_LT_in_func175); if (state.failed) return ;
                    dbg.location(94,28);
                    pushFollow(FOLLOW_iblock_in_func177);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(95, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:1: expr : ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | ( args '~' )=> func | short_stmt | bool );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:5: ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | ( args '~' )=> func | short_stmt | bool )
            int alt7=4;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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

                    dbg.recognitionException(nvae);
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

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign
                    {
                    dbg.location(97,44);
                    match(input,ID,FOLLOW_ID_in_expr217); if (state.failed) return ;
                    dbg.location(97,47);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:47: ( access )?
                    int alt6=2;
                    try { dbg.enterSubRule(6);
                    try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==27||LA6_0==31) ) {
                        alt6=1;
                    }
                    } finally {dbg.exitDecision(6);}

                    switch (alt6) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:47: access
                            {
                            dbg.location(97,47);
                            pushFollow(FOLLOW_access_in_expr219);
                            access();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(97,55);
                    pushFollow(FOLLOW_assign_in_expr222);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:9: ( args '~' )=> func
                    {
                    dbg.location(98,23);
                    pushFollow(FOLLOW_func_in_expr240);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: short_stmt
                    {
                    dbg.location(99,9);
                    pushFollow(FOLLOW_short_stmt_in_expr250);
                    short_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:9: bool
                    {
                    dbg.location(100,9);
                    pushFollow(FOLLOW_bool_in_expr260);
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



    // $ANTLR start "short_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:103:1: short_stmt : ( return_stmt | break_stmt );
    public final void short_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "short_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(103, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:5: ( return_stmt | break_stmt )
            int alt8=2;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:9: return_stmt
                    {
                    dbg.location(104,9);
                    pushFollow(FOLLOW_return_stmt_in_short_stmt279);
                    return_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: break_stmt
                    {
                    dbg.location(105,9);
                    pushFollow(FOLLOW_break_stmt_in_short_stmt289);
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
        dbg.location(106, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:1: break_stmt : 'break' ;
    public final void break_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "break_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:5: ( 'break' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:9: 'break'
            {
            dbg.location(109,9);
            match(input,33,FOLLOW_33_in_break_stmt312); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "break_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "break_stmt"



    // $ANTLR start "return_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:1: return_stmt : 'return' argument ;
    public final void return_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:5: ( 'return' argument )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:9: 'return' argument
            {
            dbg.location(113,9);
            match(input,38,FOLLOW_38_in_return_stmt331); if (state.failed) return ;
            dbg.location(113,18);
            pushFollow(FOLLOW_argument_in_return_stmt333);
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
        dbg.location(114, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:1: bool : logic ( CMP logic )* ;
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:5: ( logic ( CMP logic )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:9: logic ( CMP logic )*
            {
            dbg.location(116,9);
            pushFollow(FOLLOW_logic_in_bool347);
            logic();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(116,15);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:15: ( CMP logic )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==CMP) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:16: CMP logic
            	    {
            	    dbg.location(116,16);
            	    match(input,CMP,FOLLOW_CMP_in_bool350); if (state.failed) return ;
            	    dbg.location(116,20);
            	    pushFollow(FOLLOW_logic_in_bool352);
            	    logic();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


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
            dbg.exitRule(getGrammarFileName(), "bool");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "bool"



    // $ANTLR start "logic"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:1: logic : eval ( BOP eval )* ;
    public final void logic() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "logic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:5: ( eval ( BOP eval )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:9: eval ( BOP eval )*
            {
            dbg.location(120,9);
            pushFollow(FOLLOW_eval_in_logic373);
            eval();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(120,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:14: ( BOP eval )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==BOP) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:15: BOP eval
            	    {
            	    dbg.location(120,15);
            	    match(input,BOP,FOLLOW_BOP_in_logic376); if (state.failed) return ;
            	    dbg.location(120,19);
            	    pushFollow(FOLLOW_eval_in_logic378);
            	    eval();

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
        dbg.location(121, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:1: eval : term ( ( '+' | '-' ) term )* ;
    public final void eval() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:5: ( term ( ( '+' | '-' ) term )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:9: term ( ( '+' | '-' ) term )*
            {
            dbg.location(123,9);
            pushFollow(FOLLOW_term_in_eval394);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(123,14);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:14: ( ( '+' | '-' ) term )*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11, decisionCanBacktrack[11]);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||LA11_0==26) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:123:15: ( '+' | '-' ) term
            	    {
            	    dbg.location(123,15);
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

            	    dbg.location(123,25);
            	    pushFollow(FOLLOW_term_in_eval403);
            	    term();

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
        dbg.location(124, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:5: ( factor ( ( '*' | '/' | '%' ) factor )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:9: factor ( ( '*' | '/' | '%' ) factor )*
            {
            dbg.location(126,9);
            pushFollow(FOLLOW_factor_in_term419);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(126,16);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:16: ( ( '*' | '/' | '%' ) factor )*
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==20||LA12_0==23||LA12_0==28) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:126:17: ( '*' | '/' | '%' ) factor
            	    {
            	    dbg.location(126,17);
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

            	    dbg.location(126,31);
            	    pushFollow(FOLLOW_factor_in_term430);
            	    factor();

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
        dbg.location(127, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:1: factor : ( '(' factor_p | value );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:130:5: ( '(' factor_p | value )
            int alt13=2;
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:130:9: '(' factor_p
                    {
                    dbg.location(130,9);
                    match(input,21,FOLLOW_21_in_factor451); if (state.failed) return ;
                    dbg.location(130,13);
                    pushFollow(FOLLOW_factor_p_in_factor453);
                    factor_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:131:10: value
                    {
                    dbg.location(131,10);
                    pushFollow(FOLLOW_value_in_factor464);
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
        dbg.location(132, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "factor_p"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:135:1: factor_p : ( ( args '~' )=> func ')' args | bool ')' );
    public final void factor_p() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor_p");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(135, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:5: ( ( args '~' )=> func ')' args | bool ')' )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

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

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:9: ( args '~' )=> func ')' args
                    {
                    dbg.location(136,23);
                    pushFollow(FOLLOW_func_in_factor_p493);
                    func();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(136,28);
                    match(input,22,FOLLOW_22_in_factor_p495); if (state.failed) return ;
                    dbg.location(136,31);
                    pushFollow(FOLLOW_args_in_factor_p496);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:137:9: bool ')'
                    {
                    dbg.location(137,9);
                    pushFollow(FOLLOW_bool_in_factor_p506);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(137,14);
                    match(input,22,FOLLOW_22_in_factor_p508); if (state.failed) return ;

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
        dbg.location(138, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor_p");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor_p"



    // $ANTLR start "access"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:1: access : ( '[' NUMBER ']' | '.' ID );
    public final void access() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "access");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:141:5: ( '[' NUMBER ']' | '.' ID )
            int alt15=2;
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:141:9: '[' NUMBER ']'
                    {
                    dbg.location(141,9);
                    match(input,31,FOLLOW_31_in_access534); if (state.failed) return ;
                    dbg.location(141,13);
                    match(input,NUMBER,FOLLOW_NUMBER_in_access536); if (state.failed) return ;
                    dbg.location(141,20);
                    match(input,32,FOLLOW_32_in_access538); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:142:9: '.' ID
                    {
                    dbg.location(142,9);
                    match(input,27,FOLLOW_27_in_access548); if (state.failed) return ;
                    dbg.location(142,13);
                    match(input,ID,FOLLOW_ID_in_access550); if (state.failed) return ;

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
        dbg.location(143, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "access");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "access"



    // $ANTLR start "value"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:1: value : ( atom | ID ( mod )* );
    public final void value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:146:5: ( atom | ID ( mod )* )
            int alt17=2;
            try { dbg.enterDecision(17, decisionCanBacktrack[17]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(17);}

            switch (alt17) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:146:9: atom
                    {
                    dbg.location(146,9);
                    pushFollow(FOLLOW_atom_in_value569);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:147:9: ID ( mod )*
                    {
                    dbg.location(147,9);
                    match(input,ID,FOLLOW_ID_in_value579); if (state.failed) return ;
                    dbg.location(147,12);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:147:12: ( mod )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16, decisionCanBacktrack[16]);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21||LA16_0==27||LA16_0==31) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:147:12: mod
                    	    {
                    	    dbg.location(147,12);
                    	    pushFollow(FOLLOW_mod_in_value581);
                    	    mod();

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
        dbg.location(148, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "mod"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:1: mod : ( args | access );
    public final void mod() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:5: ( args | access )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:9: args
                    {
                    dbg.location(150,9);
                    pushFollow(FOLLOW_args_in_mod597);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:151:9: access
                    {
                    dbg.location(151,9);
                    pushFollow(FOLLOW_access_in_mod607);
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
        dbg.location(152, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mod");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mod"



    // $ANTLR start "atom"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:154:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(154, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:154:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(154,5);
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
        dbg.location(156, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:158:1: control : ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:159:5: ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test )
            int alt21=3;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:159:9: 'for' ID 'in' ID ( mod )? LT iblock
                    {
                    dbg.location(159,9);
                    match(input,35,FOLLOW_35_in_control650); if (state.failed) return ;
                    dbg.location(159,15);
                    match(input,ID,FOLLOW_ID_in_control652); if (state.failed) return ;
                    dbg.location(159,18);
                    match(input,37,FOLLOW_37_in_control654); if (state.failed) return ;
                    dbg.location(159,23);
                    match(input,ID,FOLLOW_ID_in_control656); if (state.failed) return ;
                    dbg.location(159,26);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:159:26: ( mod )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19, decisionCanBacktrack[19]);

                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==21||LA19_0==27||LA19_0==31) ) {
                        alt19=1;
                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:159:26: mod
                            {
                            dbg.location(159,26);
                            pushFollow(FOLLOW_mod_in_control658);
                            mod();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(159,31);
                    match(input,LT,FOLLOW_LT_in_control661); if (state.failed) return ;
                    dbg.location(159,34);
                    pushFollow(FOLLOW_iblock_in_control663);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:160:9: 'while' bool LT iblock
                    {
                    dbg.location(160,9);
                    match(input,39,FOLLOW_39_in_control673); if (state.failed) return ;
                    dbg.location(160,17);
                    pushFollow(FOLLOW_bool_in_control675);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(160,22);
                    match(input,LT,FOLLOW_LT_in_control677); if (state.failed) return ;
                    dbg.location(160,25);
                    pushFollow(FOLLOW_iblock_in_control679);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:161:9: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(161,9);
                    match(input,36,FOLLOW_36_in_control689); if (state.failed) return ;
                    dbg.location(161,14);
                    pushFollow(FOLLOW_bool_in_control691);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(161,19);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:161:19: ( return_stmt LT | LT iblock )
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20, decisionCanBacktrack[20]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:161:20: return_stmt LT
                            {
                            dbg.location(161,20);
                            pushFollow(FOLLOW_return_stmt_in_control694);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(161,32);
                            match(input,LT,FOLLOW_LT_in_control696); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:161:35: LT iblock
                            {
                            dbg.location(161,35);
                            match(input,LT,FOLLOW_LT_in_control698); if (state.failed) return ;
                            dbg.location(161,38);
                            pushFollow(FOLLOW_iblock_in_control700);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(161,46);
                    pushFollow(FOLLOW_else_test_in_control703);
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
        dbg.location(162, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:165:1: else_test : ( 'else' else_p |);
    public final void else_test() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_test");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(165, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:166:5: ( 'else' else_p |)
            int alt22=2;
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:166:10: 'else' else_p
                    {
                    dbg.location(166,10);
                    match(input,34,FOLLOW_34_in_else_test725); if (state.failed) return ;
                    dbg.location(166,17);
                    pushFollow(FOLLOW_else_p_in_else_test727);
                    else_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:168:5: 
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
        dbg.location(168, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:170:1: else_p : ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) );
    public final void else_p() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_p");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(170, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:5: ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) )
            int alt25=2;
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:10: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(171,10);
                    match(input,36,FOLLOW_36_in_else_p753); if (state.failed) return ;
                    dbg.location(171,15);
                    pushFollow(FOLLOW_bool_in_else_p755);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(171,20);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:20: ( return_stmt LT | LT iblock )
                    int alt23=2;
                    try { dbg.enterSubRule(23);
                    try { dbg.enterDecision(23, decisionCanBacktrack[23]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(23);}

                    switch (alt23) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:21: return_stmt LT
                            {
                            dbg.location(171,21);
                            pushFollow(FOLLOW_return_stmt_in_else_p758);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(171,33);
                            match(input,LT,FOLLOW_LT_in_else_p760); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:36: LT iblock
                            {
                            dbg.location(171,36);
                            match(input,LT,FOLLOW_LT_in_else_p762); if (state.failed) return ;
                            dbg.location(171,39);
                            pushFollow(FOLLOW_iblock_in_else_p764);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(23);}

                    dbg.location(171,47);
                    pushFollow(FOLLOW_else_test_in_else_p767);
                    else_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:10: ( return_stmt LT | LT iblock )
                    {
                    dbg.location(172,10);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:10: ( return_stmt LT | LT iblock )
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:11: return_stmt LT
                            {
                            dbg.location(172,11);
                            pushFollow(FOLLOW_return_stmt_in_else_p779);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(172,23);
                            match(input,LT,FOLLOW_LT_in_else_p781); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:172:26: LT iblock
                            {
                            dbg.location(172,26);
                            match(input,LT,FOLLOW_LT_in_else_p783); if (state.failed) return ;
                            dbg.location(172,29);
                            pushFollow(FOLLOW_iblock_in_else_p785);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}


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
        dbg.location(173, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:175:1: assign : ( '=' ( argument | dictionary_definition | array_definition ) | ARITH_ASSIGN bool );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:176:5: ( '=' ( argument | dictionary_definition | array_definition ) | ARITH_ASSIGN bool )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:176:9: '=' ( argument | dictionary_definition | array_definition )
                    {
                    dbg.location(176,9);
                    match(input,30,FOLLOW_30_in_assign809); if (state.failed) return ;
                    dbg.location(176,13);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:176:13: ( argument | dictionary_definition | array_definition )
                    int alt26=3;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26, decisionCanBacktrack[26]);

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

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }

                    } finally {dbg.exitDecision(26);}

                    switch (alt26) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:176:14: argument
                            {
                            dbg.location(176,14);
                            pushFollow(FOLLOW_argument_in_assign812);
                            argument();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:176:23: dictionary_definition
                            {
                            dbg.location(176,23);
                            pushFollow(FOLLOW_dictionary_definition_in_assign814);
                            dictionary_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:176:45: array_definition
                            {
                            dbg.location(176,45);
                            pushFollow(FOLLOW_array_definition_in_assign816);
                            array_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:177:9: ARITH_ASSIGN bool
                    {
                    dbg.location(177,9);
                    match(input,ARITH_ASSIGN,FOLLOW_ARITH_ASSIGN_in_assign827); if (state.failed) return ;
                    dbg.location(177,22);
                    pushFollow(FOLLOW_bool_in_assign829);
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
        dbg.location(178, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:180:1: dictionary_definition : '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' ;
    public final void dictionary_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(180, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:181:5: ( '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:181:9: '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}'
            {
            dbg.location(181,9);
            match(input,40,FOLLOW_40_in_dictionary_definition848); if (state.failed) return ;
            dbg.location(181,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:181:13: ( dictionary_entry ( ',' dictionary_entry )* )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==ID) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:181:14: dictionary_entry ( ',' dictionary_entry )*
                    {
                    dbg.location(181,14);
                    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition851);
                    dictionary_entry();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(181,31);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:181:31: ( ',' dictionary_entry )*
                    try { dbg.enterSubRule(28);

                    loop28:
                    do {
                        int alt28=2;
                        try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==25) ) {
                            alt28=1;
                        }


                        } finally {dbg.exitDecision(28);}

                        switch (alt28) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:181:32: ',' dictionary_entry
                    	    {
                    	    dbg.location(181,32);
                    	    match(input,25,FOLLOW_25_in_dictionary_definition854); if (state.failed) return ;
                    	    dbg.location(181,36);
                    	    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition856);
                    	    dictionary_entry();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(28);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}

            dbg.location(181,57);
            match(input,41,FOLLOW_41_in_dictionary_definition862); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(182, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:1: dictionary_entry : ID ':' atom ;
    public final void dictionary_entry() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_entry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(184, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:185:5: ( ID ':' atom )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:185:9: ID ':' atom
            {
            dbg.location(185,9);
            match(input,ID,FOLLOW_ID_in_dictionary_entry881); if (state.failed) return ;
            dbg.location(185,12);
            match(input,29,FOLLOW_29_in_dictionary_entry883); if (state.failed) return ;
            dbg.location(185,16);
            pushFollow(FOLLOW_atom_in_dictionary_entry885);
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
        dbg.location(186, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:1: array_definition : '[' ( argument ( ',' argument )* )? ']' ;
    public final void array_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "array_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:5: ( '[' ( argument ( ',' argument )* )? ']' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:9: '[' ( argument ( ',' argument )* )? ']'
            {
            dbg.location(189,9);
            match(input,31,FOLLOW_31_in_array_definition909); if (state.failed) return ;
            dbg.location(189,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:13: ( argument ( ',' argument )* )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==ID||LA31_0==NUMBER||LA31_0==STRING||LA31_0==21) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:14: argument ( ',' argument )*
                    {
                    dbg.location(189,14);
                    pushFollow(FOLLOW_argument_in_array_definition912);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(189,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:23: ( ',' argument )*
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

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:189:24: ',' argument
                    	    {
                    	    dbg.location(189,24);
                    	    match(input,25,FOLLOW_25_in_array_definition915); if (state.failed) return ;
                    	    dbg.location(189,28);
                    	    pushFollow(FOLLOW_argument_in_array_definition917);
                    	    argument();

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

            dbg.location(189,41);
            match(input,32,FOLLOW_32_in_array_definition923); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "array_definition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "array_definition"



    // $ANTLR start "argument"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:1: argument : ( ( args '~' )=> func | ( '(' args '~' )=> '(' func ')' args | bool );
    public final void argument() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(192, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:5: ( ( args '~' )=> func | ( '(' args '~' )=> '(' func ')' args | bool )
            int alt32=3;
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

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

                    dbg.recognitionException(nvae);
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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:9: ( args '~' )=> func
                    {
                    dbg.location(193,22);
                    pushFollow(FOLLOW_func_in_argument953);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:194:9: ( '(' args '~' )=> '(' func ')' args
                    {
                    dbg.location(194,26);
                    match(input,21,FOLLOW_21_in_argument972); if (state.failed) return ;
                    dbg.location(194,30);
                    pushFollow(FOLLOW_func_in_argument974);
                    func();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(194,35);
                    match(input,22,FOLLOW_22_in_argument976); if (state.failed) return ;
                    dbg.location(194,39);
                    pushFollow(FOLLOW_args_in_argument978);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:9: bool
                    {
                    dbg.location(195,9);
                    pushFollow(FOLLOW_bool_in_argument988);
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
        dbg.location(196, 4);

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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:10: ID ( access )? ( '=' | ARITH_ASSIGN )
        {
        dbg.location(97,10);
        match(input,ID,FOLLOW_ID_in_synpred1_Pass203); if (state.failed) return ;
        dbg.location(97,13);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:13: ( access )?
        int alt33=2;
        try { dbg.enterSubRule(33);
        try { dbg.enterDecision(33, decisionCanBacktrack[33]);

        int LA33_0 = input.LA(1);

        if ( (LA33_0==27||LA33_0==31) ) {
            alt33=1;
        }
        } finally {dbg.exitDecision(33);}

        switch (alt33) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:13: access
                {
                dbg.location(97,13);
                pushFollow(FOLLOW_access_in_synpred1_Pass205);
                access();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(33);}

        dbg.location(97,21);
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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:10: args '~'
        {
        dbg.location(98,10);
        pushFollow(FOLLOW_args_in_synpred2_Pass233);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(98,15);
        match(input,42,FOLLOW_42_in_synpred2_Pass235); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Pass

    // $ANTLR start synpred3_Pass
    public final void synpred3_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:136:10: args '~'
        {
        dbg.location(136,10);
        pushFollow(FOLLOW_args_in_synpred3_Pass486);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(136,15);
        match(input,42,FOLLOW_42_in_synpred3_Pass488); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Pass

    // $ANTLR start synpred4_Pass
    public final void synpred4_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:193:10: args '~'
        {
        dbg.location(193,10);
        pushFollow(FOLLOW_args_in_synpred4_Pass947);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(193,15);
        match(input,42,FOLLOW_42_in_synpred4_Pass949); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Pass

    // $ANTLR start synpred5_Pass
    public final void synpred5_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:194:9: ( '(' args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:194:10: '(' args '~'
        {
        dbg.location(194,10);
        match(input,21,FOLLOW_21_in_synpred5_Pass964); if (state.failed) return ;
        dbg.location(194,14);
        pushFollow(FOLLOW_args_in_synpred5_Pass966);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(194,19);
        match(input,42,FOLLOW_42_in_synpred5_Pass968); if (state.failed) return ;

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
    public static final BitSet FOLLOW_ID_in_expr217 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_expr219 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_assign_in_expr222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_expr240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_stmt_in_expr250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_expr260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_short_stmt279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_short_stmt289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_break_stmt312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_return_stmt331 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_return_stmt333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_bool347 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CMP_in_bool350 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_logic_in_bool352 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_eval_in_logic373 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BOP_in_logic376 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_eval_in_logic378 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_term_in_eval394 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_set_in_eval397 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_term_in_eval403 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_factor_in_term419 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_set_in_term422 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_in_term430 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_21_in_factor451 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_p_in_factor453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_factor464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_factor_p493 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor_p495 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_factor_p496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_factor_p506 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor_p508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_access534 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUMBER_in_access536 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_access538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_access548 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_access550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_value569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value579 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_mod_in_value581 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_args_in_mod597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_mod607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control652 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control654 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control656 = new BitSet(new long[]{0x0000000088204000L});
    public static final BitSet FOLLOW_mod_in_control658 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control661 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_control673 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control675 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_control689 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control691 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_control694 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control696 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_control698 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control700 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_control703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_else_test725 = new BitSet(new long[]{0x0000005000004000L});
    public static final BitSet FOLLOW_else_p_in_else_test727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_else_p753 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_else_p755 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_else_p758 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p760 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_else_p762 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p764 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_else_p767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_p779 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_p783 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_assign809 = new BitSet(new long[]{0x0000010080229000L});
    public static final BitSet FOLLOW_argument_in_assign812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_definition_in_assign814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_assign816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_ASSIGN_in_assign827 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_assign829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_dictionary_definition848 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition851 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_25_in_dictionary_definition854 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition856 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_41_in_dictionary_definition862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dictionary_entry881 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dictionary_entry883 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_atom_in_dictionary_entry885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array_definition909 = new BitSet(new long[]{0x0000000100229000L});
    public static final BitSet FOLLOW_argument_in_array_definition912 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_25_in_array_definition915 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_array_definition917 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_32_in_array_definition923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_argument953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_argument972 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_func_in_argument974 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_argument976 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_argument978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_argument988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass203 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_synpred1_Pass205 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_set_in_synpred1_Pass208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred2_Pass233 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred2_Pass235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred3_Pass486 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred3_Pass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred4_Pass947 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred4_Pass949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_Pass964 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_synpred5_Pass966 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred5_Pass968 = new BitSet(new long[]{0x0000000000000002L});

}