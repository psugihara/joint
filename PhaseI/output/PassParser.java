// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-13 19:15:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'('", "'()'", "')'", "','", "'='", "'for'", "'in'", "'while'", "'~'"
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
    public static final int T__25=25;
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
    "invalidRule", "args", "head", "expr", "body", "atom", "prog", "call", 
    "assignable", "func", "assign", "block"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:1: prog : ( block | expr )* EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:5: ( ( block | expr )* EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:9: ( block | expr )* EOF
            {
            dbg.location(78,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:9: ( block | expr )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||LA1_0==24) ) {
                    alt1=1;
                }
                else if ( (LA1_0==ID||LA1_0==17) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:10: block
            	    {
            	    dbg.location(78,10);
            	    pushFollow(FOLLOW_block_in_prog36);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:78:16: expr
            	    {
            	    dbg.location(78,16);
            	    pushFollow(FOLLOW_expr_in_prog38);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(78,23);
            match(input,EOF,FOLLOW_EOF_in_prog42); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(79, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:81:1: block : head LT body ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:5: ( head LT body )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:9: head LT body
            {
            dbg.location(82,9);
            pushFollow(FOLLOW_head_in_block61);
            head();

            state._fsp--;

            dbg.location(82,14);
            match(input,LT,FOLLOW_LT_in_block63); 
            dbg.location(82,17);
            pushFollow(FOLLOW_body_in_block65);
            body();

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
        dbg.location(83, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "head"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:85:1: head : ( 'for' ID 'in' ID | 'while' );
    public final void head() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "head");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:85:5: ( 'for' ID 'in' ID | 'while' )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:85:7: 'for' ID 'in' ID
                    {
                    dbg.location(85,7);
                    match(input,22,FOLLOW_22_in_head77); 
                    dbg.location(85,13);
                    match(input,ID,FOLLOW_ID_in_head79); 
                    dbg.location(85,16);
                    match(input,23,FOLLOW_23_in_head81); 
                    dbg.location(85,21);
                    match(input,ID,FOLLOW_ID_in_head83); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:9: 'while'
                    {
                    dbg.location(86,9);
                    match(input,24,FOLLOW_24_in_head93); 

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
        dbg.location(87, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "head");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "head"



    // $ANTLR start "body"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:1: body : INDENT ( block | expr )+ DEDENT ;
    public final void body() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:5: ( INDENT ( block | expr )+ DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:9: INDENT ( block | expr )+ DEDENT
            {
            dbg.location(89,9);
            match(input,INDENT,FOLLOW_INDENT_in_body108); 
            dbg.location(89,16);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:16: ( block | expr )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==22||LA3_0==24) ) {
                    alt3=1;
                }
                else if ( (LA3_0==ID||LA3_0==17) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:17: block
            	    {
            	    dbg.location(89,17);
            	    pushFollow(FOLLOW_block_in_body111);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:23: expr
            	    {
            	    dbg.location(89,23);
            	    pushFollow(FOLLOW_expr_in_body113);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(89,30);
            match(input,DEDENT,FOLLOW_DEDENT_in_body117); 

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
            dbg.exitRule(getGrammarFileName(), "body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "body"



    // $ANTLR start "func"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:1: func : ( args '~' body | args '~' LT body | args '~' expr );
    public final void func() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:5: ( args '~' body | args '~' LT body | args '~' expr )
            int alt4=3;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            try {
                isCyclicDecision = true;
                alt4 = dfa4.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:92:7: args '~' body
                    {
                    dbg.location(92,7);
                    pushFollow(FOLLOW_args_in_func129);
                    args();

                    state._fsp--;

                    dbg.location(92,12);
                    match(input,25,FOLLOW_25_in_func131); 
                    dbg.location(92,16);
                    pushFollow(FOLLOW_body_in_func133);
                    body();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:4: args '~' LT body
                    {
                    dbg.location(93,4);
                    pushFollow(FOLLOW_args_in_func138);
                    args();

                    state._fsp--;

                    dbg.location(93,9);
                    match(input,25,FOLLOW_25_in_func140); 
                    dbg.location(93,13);
                    match(input,LT,FOLLOW_LT_in_func142); 
                    dbg.location(93,16);
                    pushFollow(FOLLOW_body_in_func144);
                    body();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:94:4: args '~' expr
                    {
                    dbg.location(94,4);
                    pushFollow(FOLLOW_args_in_func149);
                    args();

                    state._fsp--;

                    dbg.location(94,9);
                    match(input,25,FOLLOW_25_in_func151); 
                    dbg.location(94,13);
                    pushFollow(FOLLOW_expr_in_func153);
                    expr();

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:1: call : ( '(' func ')' | ID ) args LT ;
    public final void call() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "call");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:5: ( ( '(' func ')' | ID ) args LT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:7: ( '(' func ')' | ID ) args LT
            {
            dbg.location(97,7);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:7: ( '(' func ')' | ID )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==ID) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:8: '(' func ')'
                    {
                    dbg.location(97,8);
                    match(input,17,FOLLOW_17_in_call163); 
                    dbg.location(97,11);
                    pushFollow(FOLLOW_func_in_call164);
                    func();

                    state._fsp--;

                    dbg.location(97,15);
                    match(input,19,FOLLOW_19_in_call165); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:19: ID
                    {
                    dbg.location(97,19);
                    match(input,ID,FOLLOW_ID_in_call167); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}

            dbg.location(97,23);
            pushFollow(FOLLOW_args_in_call170);
            args();

            state._fsp--;

            dbg.location(97,28);
            match(input,LT,FOLLOW_LT_in_call172); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(98, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:1: args : ( '(' ID ( ',' ID )* ')' | '()' );
    public final void args() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "args");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:5: ( '(' ID ( ',' ID )* ')' | '()' )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:7: '(' ID ( ',' ID )* ')'
                    {
                    dbg.location(100,7);
                    match(input,17,FOLLOW_17_in_args181); 
                    dbg.location(100,11);
                    match(input,ID,FOLLOW_ID_in_args183); 
                    dbg.location(100,14);
                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:14: ( ',' ID )*
                    try { dbg.enterSubRule(6);

                    loop6:
                    do {
                        int alt6=2;
                        try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        } finally {dbg.exitDecision(6);}

                        switch (alt6) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:15: ',' ID
                    	    {
                    	    dbg.location(100,15);
                    	    match(input,20,FOLLOW_20_in_args186); 
                    	    dbg.location(100,19);
                    	    match(input,ID,FOLLOW_ID_in_args188); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(6);}

                    dbg.location(100,24);
                    match(input,19,FOLLOW_19_in_args192); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:101:4: '()'
                    {
                    dbg.location(101,4);
                    match(input,18,FOLLOW_18_in_args197); 

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
        dbg.location(102, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:1: expr : ( assign | call );
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:5: ( assign | call )
            int alt8=2;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==21) ) {
                    alt8=1;
                }
                else if ( ((LA8_1 >= 17 && LA8_1 <= 18)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:104:9: assign
                    {
                    dbg.location(104,9);
                    pushFollow(FOLLOW_assign_in_expr209);
                    assign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:105:9: call
                    {
                    dbg.location(105,9);
                    pushFollow(FOLLOW_call_in_expr219);
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
        dbg.location(106, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "assign"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:108:1: assign : ID '=' assignable ;
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:5: ( ID '=' assignable )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:109:9: ID '=' assignable
            {
            dbg.location(109,9);
            match(input,ID,FOLLOW_ID_in_assign238); 
            dbg.location(109,12);
            match(input,21,FOLLOW_21_in_assign240); 
            dbg.location(109,16);
            pushFollow(FOLLOW_assignable_in_assign242);
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
        dbg.location(110, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:112:1: assignable : ( atom LT | func | ID LT | call );
    public final void assignable() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assignable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:5: ( atom LT | func | ID LT | call )
            int alt9=4;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case NUMBER:
            case STRING:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==ID) ) {
                    alt9=2;
                }
                else if ( ((LA9_2 >= 17 && LA9_2 <= 18)) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case ID:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==LT) ) {
                    alt9=3;
                }
                else if ( ((LA9_4 >= 17 && LA9_4 <= 18)) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:113:7: atom LT
                    {
                    dbg.location(113,7);
                    pushFollow(FOLLOW_atom_in_assignable259);
                    atom();

                    state._fsp--;

                    dbg.location(113,12);
                    match(input,LT,FOLLOW_LT_in_assignable261); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:114:4: func
                    {
                    dbg.location(114,4);
                    pushFollow(FOLLOW_func_in_assignable266);
                    func();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:115:4: ID LT
                    {
                    dbg.location(115,4);
                    match(input,ID,FOLLOW_ID_in_assignable271); 
                    dbg.location(115,7);
                    match(input,LT,FOLLOW_LT_in_assignable273); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:116:6: call
                    {
                    dbg.location(116,6);
                    pushFollow(FOLLOW_call_in_assignable280);
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
        dbg.location(117, 1);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:119:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(119,5);
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
        dbg.location(121, 4);

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\21\1\11\1\31\1\23\2\11\1\31\3\uffff\1\23";
    static final String DFA4_maxS =
        "\1\22\1\11\1\31\1\24\1\21\1\11\1\31\3\uffff\1\24";
    static final String DFA4_acceptS =
        "\7\uffff\1\2\1\1\1\3\1\uffff";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\1\6\1\5",
            "\1\11\1\10\1\7\5\uffff\1\11",
            "\1\12",
            "\1\4",
            "",
            "",
            "",
            "\1\6\1\5"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "92:1: func : ( args '~' body | args '~' LT body | args '~' expr );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog36 = new BitSet(new long[]{0x0000000001420200L});
    public static final BitSet FOLLOW_expr_in_prog38 = new BitSet(new long[]{0x0000000001420200L});
    public static final BitSet FOLLOW_EOF_in_prog42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_head_in_block61 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_block63 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_block65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_head77 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_head79 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_head81 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_head83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_head93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_body108 = new BitSet(new long[]{0x0000000001420200L});
    public static final BitSet FOLLOW_block_in_body111 = new BitSet(new long[]{0x0000000001420220L});
    public static final BitSet FOLLOW_expr_in_body113 = new BitSet(new long[]{0x0000000001420220L});
    public static final BitSet FOLLOW_DEDENT_in_body117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func129 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_func131 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_func133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func138 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_func140 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_func142 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_body_in_func144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_func151 = new BitSet(new long[]{0x0000000000020200L});
    public static final BitSet FOLLOW_expr_in_func153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_call163 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_func_in_call164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_call165 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ID_in_call167 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_args_in_call170 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_call172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_args181 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_args183 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_20_in_args186 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_args188 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_args192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_args197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign238 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_assign240 = new BitSet(new long[]{0x0000000000065200L});
    public static final BitSet FOLLOW_assignable_in_assign242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_assignable259 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_assignable261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_assignable266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignable271 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_assignable273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_assignable280 = new BitSet(new long[]{0x0000000000000002L});

}