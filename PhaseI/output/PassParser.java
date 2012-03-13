// $ANTLR 3.4 /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g 2012-03-13 11:55:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEDENT", "ESC_SEQ", "EXPONENT", "HEX_DIGIT", "ID", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "STRING", "UNICODE_ESC", "WS", "'='"
    };

    public static final int EOF=-1;
    public static final int T__17=17;
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
    "invalidRule", "prog", "atom", "assign", "expr", "block"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
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

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:7: ( block | expr )* EOF
            {
            dbg.location(79,7);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:7: ( block | expr )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=3;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==INDENT) ) {
                    alt1=1;
                }
                else if ( (LA1_0==ID) ) {
                    alt1=2;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:8: block
            	    {
            	    dbg.location(79,8);
            	    pushFollow(FOLLOW_block_in_prog32);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:79:14: expr
            	    {
            	    dbg.location(79,14);
            	    pushFollow(FOLLOW_expr_in_prog34);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(79,21);
            match(input,EOF,FOLLOW_EOF_in_prog38); 

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
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "block"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:82:1: block : INDENT ( block | expr )+ DEDENT ;
    public final void block() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:2: ( INDENT ( block | expr )+ DEDENT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:6: INDENT ( block | expr )+ DEDENT
            {
            dbg.location(83,6);
            match(input,INDENT,FOLLOW_INDENT_in_block51); 
            dbg.location(83,13);
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:13: ( block | expr )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=3;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==INDENT) ) {
                    alt2=1;
                }
                else if ( (LA2_0==ID) ) {
                    alt2=2;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:14: block
            	    {
            	    dbg.location(83,14);
            	    pushFollow(FOLLOW_block_in_block54);
            	    block();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:83:20: expr
            	    {
            	    dbg.location(83,20);
            	    pushFollow(FOLLOW_expr_in_block56);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(83,27);
            match(input,DEDENT,FOLLOW_DEDENT_in_block60); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(84, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"



    // $ANTLR start "expr"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:1: expr : assign LT ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:5: ( assign LT )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:86:7: assign LT
            {
            dbg.location(86,7);
            pushFollow(FOLLOW_assign_in_expr69);
            assign();

            state._fsp--;

            dbg.location(86,14);
            match(input,LT,FOLLOW_LT_in_expr71); 

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
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "assign"
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:89:1: assign : ID '=' atom ;
    public final void assign() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:5: ( ID '=' atom )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:90:7: ID '=' atom
            {
            dbg.location(90,7);
            match(input,ID,FOLLOW_ID_in_assign86); 
            dbg.location(90,10);
            match(input,17,FOLLOW_17_in_assign88); 
            dbg.location(90,14);
            pushFollow(FOLLOW_atom_in_assign90);
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
        dbg.location(91, 4);

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
    // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:1: atom : ( NUMBER | STRING );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 0);

        try {
            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:93:5: ( NUMBER | STRING )
            dbg.enterAlt(1);

            // /Users/petersugihara/Documents/Academics/FU/PLT/Pass/pass/PhaseI/Pass.g:
            {
            dbg.location(93,5);
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
        dbg.location(95, 1);

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


 

    public static final BitSet FOLLOW_block_in_prog32 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_expr_in_prog34 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_EOF_in_prog38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_block51 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_block_in_block54 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_expr_in_block56 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_DEDENT_in_block60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_expr69 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_expr71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign86 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_assign88 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_atom_in_assign90 = new BitSet(new long[]{0x0000000000000002L});

}