// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-04-02 10:53:03

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
    "invalidRule", "dictionary_entry", "access", "break_stmt", "synpred1_Pass", 
    "func", "value", "term", "factor", "eval", "block", "args", "short_stmt", 
    "return_stmt", "statement", "else_test", "synpred3_Pass", "synpred2_Pass", 
    "mod", "control", "synpred5_Pass", "iblock", "atom", "expr", "argument", 
    "else_p", "bool", "dictionary_definition", "prog", "array_definition", 
    "factor_p", "synpred4_Pass", "assign", "logic"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, true, false, false, false, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, true, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:1: block : ( statement | LT )+ ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:2: ( ( statement | LT )+ )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:6: ( statement | LT )+
            {
            dbg.location(80,6);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:6: ( statement | LT )+
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:7: statement
            	    {
            	    dbg.location(80,7);
            	    pushFollow(FOLLOW_statement_in_block54);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:80:17: LT
            	    {
            	    dbg.location(80,17);
            	    match(input,LT,FOLLOW_LT_in_block56); if (state.failed) return ;

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
        dbg.location(81, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "statement"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:1: statement : ( expr ( LT | EOF ) | control );
    public final void statement() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(83, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:84:2: ( expr ( LT | EOF ) | control )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:84:6: expr ( LT | EOF )
                    {
                    dbg.location(84,6);
                    pushFollow(FOLLOW_expr_in_statement72);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(84,11);
                    if ( input.LA(1)==EOF||input.LA(1)==LT ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:85:6: control
                    {
                    dbg.location(85,6);
                    pushFollow(FOLLOW_control_in_statement85);
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
        dbg.location(86, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"



    // $ANTLR start "iblock"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:88:1: iblock : INDENT block DEDENT ;
    public final void iblock() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "iblock");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:5: ( INDENT block DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:9: INDENT block DEDENT
            {
            dbg.location(89,9);
            match(input,INDENT,FOLLOW_INDENT_in_iblock103); if (state.failed) return ;
            dbg.location(89,16);
            pushFollow(FOLLOW_block_in_iblock105);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(89,22);
            match(input,DEDENT,FOLLOW_DEDENT_in_iblock107); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(90, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:1: args : '(' ( argument ( ',' argument )* )? ')' ;
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:5: ( '(' ( argument ( ',' argument )* )? ')' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:9: '(' ( argument ( ',' argument )* )? ')'
            {
            dbg.location(92,9);
            match(input,21,FOLLOW_21_in_args121); if (state.failed) return ;
            dbg.location(92,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:13: ( argument ( ',' argument )* )?
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:14: argument ( ',' argument )*
                    {
                    dbg.location(92,14);
                    pushFollow(FOLLOW_argument_in_args124);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(92,23);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:23: ( ',' argument )*
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

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:24: ',' argument
                    	    {
                    	    dbg.location(92,24);
                    	    match(input,25,FOLLOW_25_in_args127); if (state.failed) return ;
                    	    dbg.location(92,28);
                    	    pushFollow(FOLLOW_argument_in_args129);
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

            dbg.location(92,41);
            match(input,22,FOLLOW_22_in_args135); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(93, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:1: func : args '~' ( expr | ( LT iblock ) ) ;
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:5: ( args '~' ( expr | ( LT iblock ) ) )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:9: args '~' ( expr | ( LT iblock ) )
            {
            dbg.location(95,9);
            pushFollow(FOLLOW_args_in_func147);
            args();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(95,14);
            match(input,42,FOLLOW_42_in_func149); if (state.failed) return ;
            dbg.location(95,18);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:18: ( expr | ( LT iblock ) )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:19: expr
                    {
                    dbg.location(95,19);
                    pushFollow(FOLLOW_expr_in_func152);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:24: ( LT iblock )
                    {
                    dbg.location(95,24);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:24: ( LT iblock )
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:95:25: LT iblock
                    {
                    dbg.location(95,25);
                    match(input,LT,FOLLOW_LT_in_func155); if (state.failed) return ;
                    dbg.location(95,28);
                    pushFollow(FOLLOW_iblock_in_func157);
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
        dbg.location(96, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:1: expr : ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | ( args '~' )=> func | short_stmt | bool );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:5: ( ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign | ( args '~' )=> func | short_stmt | bool )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )=> ID ( access )? assign
                    {
                    dbg.location(98,44);
                    match(input,ID,FOLLOW_ID_in_expr194); if (state.failed) return ;
                    dbg.location(98,47);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:47: ( access )?
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:47: access
                            {
                            dbg.location(98,47);
                            pushFollow(FOLLOW_access_in_expr196);
                            access();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(98,55);
                    pushFollow(FOLLOW_assign_in_expr199);
                    assign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: ( args '~' )=> func
                    {
                    dbg.location(99,23);
                    pushFollow(FOLLOW_func_in_expr217);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:9: short_stmt
                    {
                    dbg.location(100,9);
                    pushFollow(FOLLOW_short_stmt_in_expr227);
                    short_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:9: bool
                    {
                    dbg.location(101,9);
                    pushFollow(FOLLOW_bool_in_expr237);
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



    // $ANTLR start "short_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:1: short_stmt : ( return_stmt | break_stmt );
    public final void short_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "short_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:2: ( return_stmt | break_stmt )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:6: return_stmt
                    {
                    dbg.location(105,6);
                    pushFollow(FOLLOW_return_stmt_in_short_stmt253);
                    return_stmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:106:6: break_stmt
                    {
                    dbg.location(106,6);
                    pushFollow(FOLLOW_break_stmt_in_short_stmt260);
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
        dbg.location(107, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:1: break_stmt : 'break' ;
    public final void break_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "break_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(109, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:2: ( 'break' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:110:6: 'break'
            {
            dbg.location(110,6);
            match(input,33,FOLLOW_33_in_break_stmt274); if (state.failed) return ;

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
            dbg.exitRule(getGrammarFileName(), "break_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "break_stmt"



    // $ANTLR start "return_stmt"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:1: return_stmt : 'return' argument ;
    public final void return_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:2: ( 'return' argument )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:4: 'return' argument
            {
            dbg.location(114,4);
            match(input,38,FOLLOW_38_in_return_stmt285); if (state.failed) return ;
            dbg.location(114,13);
            pushFollow(FOLLOW_argument_in_return_stmt287);
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
        dbg.location(115, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:1: bool : logic ( CMP logic )* ;
    public final void bool() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "bool");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:5: ( logic ( CMP logic )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:9: logic ( CMP logic )*
            {
            dbg.location(117,9);
            pushFollow(FOLLOW_logic_in_bool298);
            logic();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(117,15);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:15: ( CMP logic )*
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:117:16: CMP logic
            	    {
            	    dbg.location(117,16);
            	    match(input,CMP,FOLLOW_CMP_in_bool301); if (state.failed) return ;
            	    dbg.location(117,20);
            	    pushFollow(FOLLOW_logic_in_bool303);
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
        dbg.location(118, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:120:1: logic : eval ( BOP eval )* ;
    public final void logic() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "logic");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:2: ( eval ( BOP eval )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:6: eval ( BOP eval )*
            {
            dbg.location(121,6);
            pushFollow(FOLLOW_eval_in_logic321);
            eval();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(121,11);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:11: ( BOP eval )*
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:121:12: BOP eval
            	    {
            	    dbg.location(121,12);
            	    match(input,BOP,FOLLOW_BOP_in_logic324); if (state.failed) return ;
            	    dbg.location(121,16);
            	    pushFollow(FOLLOW_eval_in_logic326);
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
        dbg.location(122, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:124:1: eval : term ( ( '+' | '-' ) term )* ;
    public final void eval() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "eval");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:2: ( term ( ( '+' | '-' ) term )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:6: term ( ( '+' | '-' ) term )*
            {
            dbg.location(125,6);
            pushFollow(FOLLOW_term_in_eval341);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(125,11);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:11: ( ( '+' | '-' ) term )*
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:125:12: ( '+' | '-' ) term
            	    {
            	    dbg.location(125,12);
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

            	    dbg.location(125,22);
            	    pushFollow(FOLLOW_term_in_eval350);
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
        dbg.location(126, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:128:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final void term() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(128, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:2: ( factor ( ( '*' | '/' | '%' ) factor )* )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:6: factor ( ( '*' | '/' | '%' ) factor )*
            {
            dbg.location(129,6);
            pushFollow(FOLLOW_factor_in_term369);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(129,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:13: ( ( '*' | '/' | '%' ) factor )*
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

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:129:14: ( '*' | '/' | '%' ) factor
            	    {
            	    dbg.location(129,14);
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

            	    dbg.location(129,28);
            	    pushFollow(FOLLOW_factor_in_term380);
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
        dbg.location(130, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:132:1: factor : ( '(' factor_p | value );
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(132, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:5: ( '(' factor_p | value )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:133:9: '(' factor_p
                    {
                    dbg.location(133,9);
                    match(input,21,FOLLOW_21_in_factor402); if (state.failed) return ;
                    dbg.location(133,13);
                    pushFollow(FOLLOW_factor_p_in_factor404);
                    factor_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:134:10: value
                    {
                    dbg.location(134,10);
                    pushFollow(FOLLOW_value_in_factor415);
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
        dbg.location(135, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:138:1: factor_p : ( ( args '~' )=> func ')' args | bool ')' );
    public final void factor_p() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor_p");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:2: ( ( args '~' )=> func ')' args | bool ')' )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:6: ( args '~' )=> func ')' args
                    {
                    dbg.location(139,20);
                    pushFollow(FOLLOW_func_in_factor_p441);
                    func();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(139,25);
                    match(input,22,FOLLOW_22_in_factor_p443); if (state.failed) return ;
                    dbg.location(139,28);
                    pushFollow(FOLLOW_args_in_factor_p444);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:140:6: bool ')'
                    {
                    dbg.location(140,6);
                    pushFollow(FOLLOW_bool_in_factor_p451);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(140,11);
                    match(input,22,FOLLOW_22_in_factor_p453); if (state.failed) return ;

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
        dbg.location(141, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:143:1: access : ( ( '[' NUMBER ']' )+ | '.' ID );
    public final void access() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "access");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:144:5: ( ( '[' NUMBER ']' )+ | '.' ID )
            int alt16=2;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:144:9: ( '[' NUMBER ']' )+
                    {
                    dbg.location(144,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:144:9: ( '[' NUMBER ']' )+
                    int cnt15=0;
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==31) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:144:10: '[' NUMBER ']'
                    	    {
                    	    dbg.location(144,10);
                    	    match(input,31,FOLLOW_31_in_access477); if (state.failed) return ;
                    	    dbg.location(144,14);
                    	    match(input,NUMBER,FOLLOW_NUMBER_in_access479); if (state.failed) return ;
                    	    dbg.location(144,21);
                    	    match(input,32,FOLLOW_32_in_access481); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt15++;
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:145:9: '.' ID
                    {
                    dbg.location(145,9);
                    match(input,27,FOLLOW_27_in_access493); if (state.failed) return ;
                    dbg.location(145,13);
                    match(input,ID,FOLLOW_ID_in_access495); if (state.failed) return ;

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
        dbg.location(146, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:148:1: value : ( atom | ID ( mod )? );
    public final void value() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:149:5: ( atom | ID ( mod )? )
            int alt18=2;
            try { dbg.enterDecision(18, decisionCanBacktrack[18]);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==NUMBER||LA18_0==STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:149:9: atom
                    {
                    dbg.location(149,9);
                    pushFollow(FOLLOW_atom_in_value511);
                    atom();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:6: ID ( mod )?
                    {
                    dbg.location(150,6);
                    match(input,ID,FOLLOW_ID_in_value518); if (state.failed) return ;
                    dbg.location(150,9);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:9: ( mod )?
                    int alt17=2;
                    try { dbg.enterSubRule(17);
                    try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==21||LA17_0==27||LA17_0==31) ) {
                        alt17=1;
                    }
                    } finally {dbg.exitDecision(17);}

                    switch (alt17) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:150:9: mod
                            {
                            dbg.location(150,9);
                            pushFollow(FOLLOW_mod_in_value520);
                            mod();

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
        dbg.location(151, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:153:1: mod : ( args | access );
    public final void mod() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mod");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:153:5: ( args | access )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            else if ( (LA19_0==27||LA19_0==31) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:153:9: args
                    {
                    dbg.location(153,9);
                    pushFollow(FOLLOW_args_in_mod536);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:154:6: access
                    {
                    dbg.location(154,6);
                    pushFollow(FOLLOW_access_in_mod543);
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
        dbg.location(155, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:157:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:157:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(157,5);
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
        dbg.location(159, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:161:1: control : ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test );
    public final void control() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "control");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(161, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:5: ( 'for' ID 'in' ID ( mod )? LT iblock | 'while' bool LT iblock | 'if' bool ( return_stmt LT | LT iblock ) else_test )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:9: 'for' ID 'in' ID ( mod )? LT iblock
                    {
                    dbg.location(162,9);
                    match(input,35,FOLLOW_35_in_control583); if (state.failed) return ;
                    dbg.location(162,15);
                    match(input,ID,FOLLOW_ID_in_control585); if (state.failed) return ;
                    dbg.location(162,18);
                    match(input,37,FOLLOW_37_in_control587); if (state.failed) return ;
                    dbg.location(162,23);
                    match(input,ID,FOLLOW_ID_in_control589); if (state.failed) return ;
                    dbg.location(162,26);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:26: ( mod )?
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:162:26: mod
                            {
                            dbg.location(162,26);
                            pushFollow(FOLLOW_mod_in_control591);
                            mod();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(162,31);
                    match(input,LT,FOLLOW_LT_in_control594); if (state.failed) return ;
                    dbg.location(162,34);
                    pushFollow(FOLLOW_iblock_in_control596);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:163:9: 'while' bool LT iblock
                    {
                    dbg.location(163,9);
                    match(input,39,FOLLOW_39_in_control606); if (state.failed) return ;
                    dbg.location(163,17);
                    pushFollow(FOLLOW_bool_in_control608);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(163,22);
                    match(input,LT,FOLLOW_LT_in_control610); if (state.failed) return ;
                    dbg.location(163,25);
                    pushFollow(FOLLOW_iblock_in_control612);
                    iblock();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:9: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(164,9);
                    match(input,36,FOLLOW_36_in_control622); if (state.failed) return ;
                    dbg.location(164,14);
                    pushFollow(FOLLOW_bool_in_control624);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(164,19);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:19: ( return_stmt LT | LT iblock )
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:20: return_stmt LT
                            {
                            dbg.location(164,20);
                            pushFollow(FOLLOW_return_stmt_in_control627);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(164,32);
                            match(input,LT,FOLLOW_LT_in_control629); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:164:35: LT iblock
                            {
                            dbg.location(164,35);
                            match(input,LT,FOLLOW_LT_in_control631); if (state.failed) return ;
                            dbg.location(164,38);
                            pushFollow(FOLLOW_iblock_in_control633);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(164,46);
                    pushFollow(FOLLOW_else_test_in_control636);
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
        dbg.location(165, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:168:1: else_test : ( 'else' else_p |);
    public final void else_test() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_test");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:169:2: ( 'else' else_p |)
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            else if ( (LA23_0==EOF||LA23_0==DEDENT||LA23_0==ID||(LA23_0 >= LT && LA23_0 <= NUMBER)||LA23_0==STRING||LA23_0==21||LA23_0==33||(LA23_0 >= 35 && LA23_0 <= 36)||(LA23_0 >= 38 && LA23_0 <= 39)) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:169:7: 'else' else_p
                    {
                    dbg.location(169,7);
                    match(input,34,FOLLOW_34_in_else_test655); if (state.failed) return ;
                    dbg.location(169,14);
                    pushFollow(FOLLOW_else_p_in_else_test657);
                    else_p();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:171:2: 
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
        dbg.location(171, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:173:1: else_p : ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) );
    public final void else_p() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_p");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:2: ( 'if' bool ( return_stmt LT | LT iblock ) else_test | ( return_stmt LT | LT iblock ) )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:7: 'if' bool ( return_stmt LT | LT iblock ) else_test
                    {
                    dbg.location(174,7);
                    match(input,36,FOLLOW_36_in_else_p674); if (state.failed) return ;
                    dbg.location(174,12);
                    pushFollow(FOLLOW_bool_in_else_p676);
                    bool();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(174,17);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:17: ( return_stmt LT | LT iblock )
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:18: return_stmt LT
                            {
                            dbg.location(174,18);
                            pushFollow(FOLLOW_return_stmt_in_else_p679);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(174,30);
                            match(input,LT,FOLLOW_LT_in_else_p681); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:174:33: LT iblock
                            {
                            dbg.location(174,33);
                            match(input,LT,FOLLOW_LT_in_else_p683); if (state.failed) return ;
                            dbg.location(174,36);
                            pushFollow(FOLLOW_iblock_in_else_p685);
                            iblock();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(24);}

                    dbg.location(174,44);
                    pushFollow(FOLLOW_else_test_in_else_p688);
                    else_test();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:175:7: ( return_stmt LT | LT iblock )
                    {
                    dbg.location(175,7);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:175:7: ( return_stmt LT | LT iblock )
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:175:8: return_stmt LT
                            {
                            dbg.location(175,8);
                            pushFollow(FOLLOW_return_stmt_in_else_p697);
                            return_stmt();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(175,20);
                            match(input,LT,FOLLOW_LT_in_else_p699); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:175:23: LT iblock
                            {
                            dbg.location(175,23);
                            match(input,LT,FOLLOW_LT_in_else_p701); if (state.failed) return ;
                            dbg.location(175,26);
                            pushFollow(FOLLOW_iblock_in_else_p703);
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
        dbg.location(176, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:178:1: assign : ( '=' ( argument | dictionary_definition | array_definition ) | ARITH_ASSIGN bool );
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:5: ( '=' ( argument | dictionary_definition | array_definition ) | ARITH_ASSIGN bool )
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:9: '=' ( argument | dictionary_definition | array_definition )
                    {
                    dbg.location(179,9);
                    match(input,30,FOLLOW_30_in_assign721); if (state.failed) return ;
                    dbg.location(179,13);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:13: ( argument | dictionary_definition | array_definition )
                    int alt27=3;
                    try { dbg.enterSubRule(27);
                    try { dbg.enterDecision(27, decisionCanBacktrack[27]);

                    switch ( input.LA(1) ) {
                    case ID:
                    case NUMBER:
                    case STRING:
                    case 21:
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

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:14: argument
                            {
                            dbg.location(179,14);
                            pushFollow(FOLLOW_argument_in_assign724);
                            argument();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:23: dictionary_definition
                            {
                            dbg.location(179,23);
                            pushFollow(FOLLOW_dictionary_definition_in_assign726);
                            dictionary_definition();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:179:45: array_definition
                            {
                            dbg.location(179,45);
                            pushFollow(FOLLOW_array_definition_in_assign728);
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:180:9: ARITH_ASSIGN bool
                    {
                    dbg.location(180,9);
                    match(input,ARITH_ASSIGN,FOLLOW_ARITH_ASSIGN_in_assign739); if (state.failed) return ;
                    dbg.location(180,22);
                    pushFollow(FOLLOW_bool_in_assign741);
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
        dbg.location(181, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:183:1: dictionary_definition : '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' ;
    public final void dictionary_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:2: ( '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:6: '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}'
            {
            dbg.location(184,6);
            match(input,40,FOLLOW_40_in_dictionary_definition757); if (state.failed) return ;
            dbg.location(184,10);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:10: ( dictionary_entry ( ',' dictionary_entry )* )?
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:11: dictionary_entry ( ',' dictionary_entry )*
                    {
                    dbg.location(184,11);
                    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition760);
                    dictionary_entry();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(184,28);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:28: ( ',' dictionary_entry )*
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

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:184:29: ',' dictionary_entry
                    	    {
                    	    dbg.location(184,29);
                    	    match(input,25,FOLLOW_25_in_dictionary_definition763); if (state.failed) return ;
                    	    dbg.location(184,33);
                    	    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition765);
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

            dbg.location(184,54);
            match(input,41,FOLLOW_41_in_dictionary_definition771); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(185, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:187:1: dictionary_entry : ID ':' atom ;
    public final void dictionary_entry() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "dictionary_entry");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:2: ( ID ':' atom )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:188:6: ID ':' atom
            {
            dbg.location(188,6);
            match(input,ID,FOLLOW_ID_in_dictionary_entry784); if (state.failed) return ;
            dbg.location(188,8);
            match(input,29,FOLLOW_29_in_dictionary_entry785); if (state.failed) return ;
            dbg.location(188,11);
            pushFollow(FOLLOW_atom_in_dictionary_entry786);
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
        dbg.location(189, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:191:1: array_definition : '[' ( argument ( ',' argument )* )? ']' ;
    public final void array_definition() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "array_definition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:2: ( '[' ( argument ( ',' argument )* )? ']' )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:6: '[' ( argument ( ',' argument )* )? ']'
            {
            dbg.location(192,6);
            match(input,31,FOLLOW_31_in_array_definition801); if (state.failed) return ;
            dbg.location(192,10);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:10: ( argument ( ',' argument )* )?
            int alt32=2;
            try { dbg.enterSubRule(32);
            try { dbg.enterDecision(32, decisionCanBacktrack[32]);

            int LA32_0 = input.LA(1);

            if ( (LA32_0==ID||LA32_0==NUMBER||LA32_0==STRING||LA32_0==21) ) {
                alt32=1;
            }
            } finally {dbg.exitDecision(32);}

            switch (alt32) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:11: argument ( ',' argument )*
                    {
                    dbg.location(192,11);
                    pushFollow(FOLLOW_argument_in_array_definition804);
                    argument();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(192,20);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:20: ( ',' argument )*
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

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:192:21: ',' argument
                    	    {
                    	    dbg.location(192,21);
                    	    match(input,25,FOLLOW_25_in_array_definition807); if (state.failed) return ;
                    	    dbg.location(192,25);
                    	    pushFollow(FOLLOW_argument_in_array_definition809);
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

            dbg.location(192,38);
            match(input,32,FOLLOW_32_in_array_definition815); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(193, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:195:1: argument : ( ( args '~' )=> func | ( '(' args '~' )=> '(' func ')' args | bool );
    public final void argument() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "argument");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:196:2: ( ( args '~' )=> func | ( '(' args '~' )=> '(' func ')' args | bool )
            int alt33=3;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred4_Pass()) ) {
                    alt33=1;
                }
                else if ( (synpred5_Pass()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA33_0==ID||LA33_0==NUMBER||LA33_0==STRING) ) {
                alt33=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:196:6: ( args '~' )=> func
                    {
                    dbg.location(196,19);
                    pushFollow(FOLLOW_func_in_argument836);
                    func();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:197:6: ( '(' args '~' )=> '(' func ')' args
                    {
                    dbg.location(197,23);
                    match(input,21,FOLLOW_21_in_argument852); if (state.failed) return ;
                    dbg.location(197,27);
                    pushFollow(FOLLOW_func_in_argument854);
                    func();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(197,32);
                    match(input,22,FOLLOW_22_in_argument856); if (state.failed) return ;
                    dbg.location(197,35);
                    pushFollow(FOLLOW_args_in_argument857);
                    args();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:198:6: bool
                    {
                    dbg.location(198,6);
                    pushFollow(FOLLOW_bool_in_argument864);
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
        dbg.location(199, 1);

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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:9: ( ID ( access )? ( '=' | ARITH_ASSIGN ) )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:10: ID ( access )? ( '=' | ARITH_ASSIGN )
        {
        dbg.location(98,10);
        match(input,ID,FOLLOW_ID_in_synpred1_Pass180); if (state.failed) return ;
        dbg.location(98,13);
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:13: ( access )?
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

                // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:98:13: access
                {
                dbg.location(98,13);
                pushFollow(FOLLOW_access_in_synpred1_Pass182);
                access();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(34);}

        dbg.location(98,21);
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
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:9: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:99:10: args '~'
        {
        dbg.location(99,10);
        pushFollow(FOLLOW_args_in_synpred2_Pass210);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(99,15);
        match(input,42,FOLLOW_42_in_synpred2_Pass212); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Pass

    // $ANTLR start synpred3_Pass
    public final void synpred3_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:6: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:139:7: args '~'
        {
        dbg.location(139,7);
        pushFollow(FOLLOW_args_in_synpred3_Pass434);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(139,12);
        match(input,42,FOLLOW_42_in_synpred3_Pass436); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Pass

    // $ANTLR start synpred4_Pass
    public final void synpred4_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:196:6: ( args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:196:7: args '~'
        {
        dbg.location(196,7);
        pushFollow(FOLLOW_args_in_synpred4_Pass830);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(196,12);
        match(input,42,FOLLOW_42_in_synpred4_Pass832); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Pass

    // $ANTLR start synpred5_Pass
    public final void synpred5_Pass_fragment() throws RecognitionException {
        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:197:6: ( '(' args '~' )
        dbg.enterAlt(1);

        // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:197:7: '(' args '~'
        {
        dbg.location(197,7);
        match(input,21,FOLLOW_21_in_synpred5_Pass844); if (state.failed) return ;
        dbg.location(197,11);
        pushFollow(FOLLOW_args_in_synpred5_Pass846);
        args();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(197,16);
        match(input,42,FOLLOW_42_in_synpred5_Pass848); if (state.failed) return ;

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
    public static final BitSet FOLLOW_statement_in_block54 = new BitSet(new long[]{0x000000DA0022D002L});
    public static final BitSet FOLLOW_LT_in_block56 = new BitSet(new long[]{0x000000DA0022D002L});
    public static final BitSet FOLLOW_expr_in_statement72 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_statement74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_statement85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_iblock103 = new BitSet(new long[]{0x000000DA0022D000L});
    public static final BitSet FOLLOW_block_in_iblock105 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_DEDENT_in_iblock107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_args121 = new BitSet(new long[]{0x0000000000629000L});
    public static final BitSet FOLLOW_argument_in_args124 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_25_in_args127 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_args129 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_args135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func147 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_func149 = new BitSet(new long[]{0x000000420022D000L});
    public static final BitSet FOLLOW_expr_in_func152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_func157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr194 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_expr196 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_assign_in_expr199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_expr217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_stmt_in_expr227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_expr237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_short_stmt253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_short_stmt260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_break_stmt274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_return_stmt285 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_return_stmt287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_bool298 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CMP_in_bool301 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_logic_in_bool303 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_eval_in_logic321 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_BOP_in_logic324 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_eval_in_logic326 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_term_in_eval341 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_set_in_eval344 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_term_in_eval350 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_factor_in_term369 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_set_in_term372 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_in_term380 = new BitSet(new long[]{0x0000000010900002L});
    public static final BitSet FOLLOW_21_in_factor402 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_factor_p_in_factor404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_factor415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_factor_p441 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor_p443 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_factor_p444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_factor_p451 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor_p453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_access477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_NUMBER_in_access479 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_access481 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_27_in_access493 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_access495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_value511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value518 = new BitSet(new long[]{0x0000000088200002L});
    public static final BitSet FOLLOW_mod_in_value520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_mod536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_mod543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_control583 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control585 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_control587 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_control589 = new BitSet(new long[]{0x0000000088204000L});
    public static final BitSet FOLLOW_mod_in_control591 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control594 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_control606 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control608 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control610 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_control622 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_control624 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_control627 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_control629 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_control631 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_control633 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_control636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_else_test655 = new BitSet(new long[]{0x0000005000004000L});
    public static final BitSet FOLLOW_else_p_in_else_test657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_else_p674 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_else_p676 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_return_stmt_in_else_p679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p681 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_LT_in_else_p683 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p685 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_else_test_in_else_p688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_p697 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_else_p699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_p701 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_iblock_in_else_p703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_assign721 = new BitSet(new long[]{0x0000010080229000L});
    public static final BitSet FOLLOW_argument_in_assign724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_definition_in_assign726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_assign728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_ASSIGN_in_assign739 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_bool_in_assign741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_dictionary_definition757 = new BitSet(new long[]{0x0000020000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition760 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_25_in_dictionary_definition763 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition765 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_41_in_dictionary_definition771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dictionary_entry784 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_dictionary_entry785 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_atom_in_dictionary_entry786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array_definition801 = new BitSet(new long[]{0x0000000100229000L});
    public static final BitSet FOLLOW_argument_in_array_definition804 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_25_in_array_definition807 = new BitSet(new long[]{0x0000000000229000L});
    public static final BitSet FOLLOW_argument_in_array_definition809 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_32_in_array_definition815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_argument836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_argument852 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_func_in_argument854 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_argument856 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_argument857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_argument864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass180 = new BitSet(new long[]{0x00000000C8000010L});
    public static final BitSet FOLLOW_access_in_synpred1_Pass182 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_set_in_synpred1_Pass185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred2_Pass210 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred2_Pass212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred3_Pass434 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred3_Pass436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred4_Pass830 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred4_Pass832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_Pass844 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_args_in_synpred5_Pass846 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred5_Pass848 = new BitSet(new long[]{0x0000000000000002L});

}