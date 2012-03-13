// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-13 12:55:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "FOR", "FUNC", "HEX_DIGIT", "ID", "IN", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "PCLOSE", "POPEN", "STRING", "UNICODE_ESC", "WHILE", "WS", "'='"
    };

    public static final int EOF=-1;
    public static final int T__23=23;
    public static final int COMMENT=4;
    public static final int DEDENT=5;
    public static final int ESC_SEQ=6;
    public static final int EXPONENT=7;
    public static final int FOR=8;
    public static final int FUNC=9;
    public static final int HEX_DIGIT=10;
    public static final int ID=11;
    public static final int IN=12;
    public static final int INDENT=13;
    public static final int LT=14;
    public static final int NUMBER=15;
    public static final int OCTAL_ESC=16;
    public static final int PCLOSE=17;
    public static final int POPEN=18;
    public static final int STRING=19;
    public static final int UNICODE_ESC=20;
    public static final int WHILE=21;
    public static final int WS=22;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "prog", "head", "assign", "body", "expr", "block", "atom"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false
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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:1: prog : ( block | expr )* EOF ;
    public final void prog() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:5: ( ( block | expr )* EOF )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:9: ( block | expr )* EOF
            {
            dbg.location(79,9);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:9: ( block | expr )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==FOR||LA1_0==WHILE) ) {
                    alt1=1;
                }
                else if ( (LA1_0==ID) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:10: block
            	    {
            	    dbg.location(79,10);
            	    pushFollow(FOLLOW_block_in_prog36);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:16: expr
            	    {
            	    dbg.location(79,16);
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

            dbg.location(79,23);
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
        dbg.location(80, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:1: block : head LT body ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:5: ( head LT body )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:9: head LT body
            {
            dbg.location(83,9);
            pushFollow(FOLLOW_head_in_block61);
            head();

            state._fsp--;

            dbg.location(83,14);
            match(input,LT,FOLLOW_LT_in_block63); 
            dbg.location(83,17);
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
        dbg.location(84, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:1: head : ( FOR ID IN ID | WHILE );
    public final void head() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "head");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:5: ( FOR ID IN ID | WHILE )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==FOR) ) {
                alt2=1;
            }
            else if ( (LA2_0==WHILE) ) {
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

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:7: FOR ID IN ID
                    {
                    dbg.location(86,7);
                    match(input,FOR,FOLLOW_FOR_in_head77); 
                    dbg.location(86,11);
                    match(input,ID,FOLLOW_ID_in_head79); 
                    dbg.location(86,14);
                    match(input,IN,FOLLOW_IN_in_head81); 
                    dbg.location(86,17);
                    match(input,ID,FOLLOW_ID_in_head83); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:87:9: WHILE
                    {
                    dbg.location(87,9);
                    match(input,WHILE,FOLLOW_WHILE_in_head93); 

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
        dbg.location(88, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:1: body : INDENT ( block | expr )+ DEDENT ;
    public final void body() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(90, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:5: ( INDENT ( block | expr )+ DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:9: INDENT ( block | expr )+ DEDENT
            {
            dbg.location(90,9);
            match(input,INDENT,FOLLOW_INDENT_in_body108); 
            dbg.location(90,16);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:16: ( block | expr )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==FOR||LA3_0==WHILE) ) {
                    alt3=1;
                }
                else if ( (LA3_0==ID) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:17: block
            	    {
            	    dbg.location(90,17);
            	    pushFollow(FOLLOW_block_in_body111);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:23: expr
            	    {
            	    dbg.location(90,23);
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

            dbg.location(90,30);
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
        dbg.location(91, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "body"



    // $ANTLR start "expr"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:1: expr : assign LT ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:5: ( assign LT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:9: assign LT
            {
            dbg.location(93,9);
            pushFollow(FOLLOW_assign_in_expr132);
            assign();

            state._fsp--;

            dbg.location(93,16);
            match(input,LT,FOLLOW_LT_in_expr134); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(94, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:96:1: assign : ID '=' atom ;
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:5: ( ID '=' atom )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:97:9: ID '=' atom
            {
            dbg.location(97,9);
            match(input,ID,FOLLOW_ID_in_assign157); 
            dbg.location(97,12);
            match(input,23,FOLLOW_23_in_assign159); 
            dbg.location(97,16);
            pushFollow(FOLLOW_atom_in_assign161);
            atom();

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
        dbg.location(98, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(100, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:100:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(100,5);
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
        dbg.location(102, 4);

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


 

    public static final BitSet FOLLOW_block_in_prog36 = new BitSet(new long[]{0x0000000000200900L});
    public static final BitSet FOLLOW_expr_in_prog38 = new BitSet(new long[]{0x0000000000200900L});
    public static final BitSet FOLLOW_EOF_in_prog42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_head_in_block61 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_block63 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_body_in_block65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_head77 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_head79 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_head81 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_head83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_head93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_body108 = new BitSet(new long[]{0x0000000000200900L});
    public static final BitSet FOLLOW_block_in_body111 = new BitSet(new long[]{0x0000000000200920L});
    public static final BitSet FOLLOW_expr_in_body113 = new BitSet(new long[]{0x0000000000200920L});
    public static final BitSet FOLLOW_DEDENT_in_body117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr132 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_expr134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign157 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_assign159 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_atom_in_assign161 = new BitSet(new long[]{0x0000000000000002L});

}