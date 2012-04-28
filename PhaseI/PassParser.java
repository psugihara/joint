// $ANTLR 3.4 Pass.g 2012-04-28 05:29:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class PassParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGUMENTS", "ARITH_ASSIGN", "ARRAY_ACCESS", "ARRAY_DECLARATION", "ASSIGNMENT", "BOP", "BREAK", "CMP", "COMMENT", "DEDENT", "DICTIONARY_DECLARATION", "DICTIONARY_DEFINITION", "DICT_ACCESS", "ELSE", "ELSE_IF", "ESC_SEQ", "EXPONENT", "FOR", "FUNCTION", "FUNC_CALL", "GENERIC_OP", "GEN_OP", "HEX_DIGIT", "IBLOCK", "ID", "IF", "IF_CONDITIONS", "INDENT", "LT", "NUMBER", "OCTAL_ESC", "OP", "PROG", "RETURN", "STRING", "UNICODE_ESC", "WHILE", "WS", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "'='", "'['", "']'", "'^'", "'break'", "'else if'", "'else'", "'for'", "'if'", "'in'", "'return'", "'while'", "'{'", "'}'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int ARGUMENTS=4;
    public static final int ARITH_ASSIGN=5;
    public static final int ARRAY_ACCESS=6;
    public static final int ARRAY_DECLARATION=7;
    public static final int ASSIGNMENT=8;
    public static final int BOP=9;
    public static final int BREAK=10;
    public static final int CMP=11;
    public static final int COMMENT=12;
    public static final int DEDENT=13;
    public static final int DICTIONARY_DECLARATION=14;
    public static final int DICTIONARY_DEFINITION=15;
    public static final int DICT_ACCESS=16;
    public static final int ELSE=17;
    public static final int ELSE_IF=18;
    public static final int ESC_SEQ=19;
    public static final int EXPONENT=20;
    public static final int FOR=21;
    public static final int FUNCTION=22;
    public static final int FUNC_CALL=23;
    public static final int GENERIC_OP=24;
    public static final int GEN_OP=25;
    public static final int HEX_DIGIT=26;
    public static final int IBLOCK=27;
    public static final int ID=28;
    public static final int IF=29;
    public static final int IF_CONDITIONS=30;
    public static final int INDENT=31;
    public static final int LT=32;
    public static final int NUMBER=33;
    public static final int OCTAL_ESC=34;
    public static final int OP=35;
    public static final int PROG=36;
    public static final int RETURN=37;
    public static final int STRING=38;
    public static final int UNICODE_ESC=39;
    public static final int WHILE=40;
    public static final int WS=41;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public PassParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public PassParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return PassParser.tokenNames; }
    public String getGrammarFileName() { return "Pass.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // Pass.g:103:1: prog : block EOF -> ^( PROG block ) ;
    public final PassParser.prog_return prog() throws RecognitionException {
        PassParser.prog_return retval = new PassParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        PassParser.block_return block1 =null;


        Object EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Pass.g:103:5: ( block EOF -> ^( PROG block ) )
            // Pass.g:103:9: block EOF
            {
            pushFollow(FOLLOW_block_in_prog51);
            block1=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog53); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:19: -> ^( PROG block )
            {
                // Pass.g:103:22: ^( PROG block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROG, "PROG")
                , root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // Pass.g:106:1: block : ( LT )* ( stmt )* ;
    public final PassParser.block_return block() throws RecognitionException {
        PassParser.block_return retval = new PassParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT3=null;
        PassParser.stmt_return stmt4 =null;


        Object LT3_tree=null;

        try {
            // Pass.g:107:5: ( ( LT )* ( stmt )* )
            // Pass.g:107:9: ( LT )* ( stmt )*
            {
            root_0 = (Object)adaptor.nil();


            // Pass.g:107:9: ( LT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Pass.g:107:9: LT
            	    {
            	    LT3=(Token)match(input,LT,FOLLOW_LT_in_block80); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LT3_tree = 
            	    (Object)adaptor.create(LT3)
            	    ;
            	    adaptor.addChild(root_0, LT3_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // Pass.g:107:13: ( stmt )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID||LA2_0==NUMBER||LA2_0==STRING||LA2_0==43||LA2_0==56||(LA2_0 >= 59 && LA2_0 <= 60)||(LA2_0 >= 62 && LA2_0 <= 63)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Pass.g:107:13: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_block83);
            	    stmt4=stmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, stmt4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // Pass.g:110:1: stmt : ( expr ( ( LT )+ | EOF ) | control ( LT )+ );
    public final PassParser.stmt_return stmt() throws RecognitionException {
        PassParser.stmt_return retval = new PassParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT6=null;
        Token EOF7=null;
        Token LT9=null;
        PassParser.expr_return expr5 =null;

        PassParser.control_return control8 =null;


        Object LT6_tree=null;
        Object EOF7_tree=null;
        Object LT9_tree=null;

        try {
            // Pass.g:110:5: ( expr ( ( LT )+ | EOF ) | control ( LT )+ )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==NUMBER||LA6_0==STRING||LA6_0==43||LA6_0==56||LA6_0==62) ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= 59 && LA6_0 <= 60)||LA6_0==63) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Pass.g:110:9: expr ( ( LT )+ | EOF )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt102);
                    expr5=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr5.getTree());

                    // Pass.g:110:14: ( ( LT )+ | EOF )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==LT) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==EOF) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;

                    }
                    switch (alt4) {
                        case 1 :
                            // Pass.g:110:15: ( LT )+
                            {
                            // Pass.g:110:15: ( LT )+
                            int cnt3=0;
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==LT) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // Pass.g:110:15: LT
                            	    {
                            	    LT6=(Token)match(input,LT,FOLLOW_LT_in_stmt105); if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) {
                            	    LT6_tree = 
                            	    (Object)adaptor.create(LT6)
                            	    ;
                            	    adaptor.addChild(root_0, LT6_tree);
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt3 >= 1 ) break loop3;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(3, input);
                                        throw eee;
                                }
                                cnt3++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // Pass.g:110:19: EOF
                            {
                            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_stmt108); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            EOF7_tree = 
                            (Object)adaptor.create(EOF7)
                            ;
                            adaptor.addChild(root_0, EOF7_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Pass.g:111:9: control ( LT )+
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_control_in_stmt119);
                    control8=control();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, control8.getTree());

                    // Pass.g:111:17: ( LT )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==LT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Pass.g:111:17: LT
                    	    {
                    	    LT9=(Token)match(input,LT,FOLLOW_LT_in_stmt121); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    LT9_tree = 
                    	    (Object)adaptor.create(LT9)
                    	    ;
                    	    adaptor.addChild(root_0, LT9_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class iblock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iblock"
    // Pass.g:114:1: iblock : INDENT block DEDENT -> ^( IBLOCK block ) ;
    public final PassParser.iblock_return iblock() throws RecognitionException {
        PassParser.iblock_return retval = new PassParser.iblock_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INDENT10=null;
        Token DEDENT12=null;
        PassParser.block_return block11 =null;


        Object INDENT10_tree=null;
        Object DEDENT12_tree=null;
        RewriteRuleTokenStream stream_DEDENT=new RewriteRuleTokenStream(adaptor,"token DEDENT");
        RewriteRuleTokenStream stream_INDENT=new RewriteRuleTokenStream(adaptor,"token INDENT");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // Pass.g:115:5: ( INDENT block DEDENT -> ^( IBLOCK block ) )
            // Pass.g:115:9: INDENT block DEDENT
            {
            INDENT10=(Token)match(input,INDENT,FOLLOW_INDENT_in_iblock148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INDENT.add(INDENT10);


            pushFollow(FOLLOW_block_in_iblock150);
            block11=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block11.getTree());

            DEDENT12=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_iblock152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEDENT.add(DEDENT12);


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 115:29: -> ^( IBLOCK block )
            {
                // Pass.g:115:32: ^( IBLOCK block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IBLOCK, "IBLOCK")
                , root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iblock"


    public static class args_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // Pass.g:118:1: args : '(' ( argument ( ',' argument )* )? ( ( LT )+ )? ')' -> ^( ARGUMENTS ( argument )* ) ;
    public final PassParser.args_return args() throws RecognitionException {
        PassParser.args_return retval = new PassParser.args_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        Token LT17=null;
        Token char_literal18=null;
        PassParser.argument_return argument14 =null;

        PassParser.argument_return argument16 =null;


        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        Object LT17_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // Pass.g:118:5: ( '(' ( argument ( ',' argument )* )? ( ( LT )+ )? ')' -> ^( ARGUMENTS ( argument )* ) )
            // Pass.g:118:9: '(' ( argument ( ',' argument )* )? ( ( LT )+ )? ')'
            {
            char_literal13=(Token)match(input,43,FOLLOW_43_in_args174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(char_literal13);


            // Pass.g:118:13: ( argument ( ',' argument )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==ID||LA8_1==NUMBER||LA8_1==STRING||LA8_1==43) ) {
                    alt8=1;
                }
            }
            else if ( (LA8_0==ID||LA8_0==NUMBER||LA8_0==STRING||LA8_0==43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Pass.g:118:14: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_args177);
                    argument14=argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument.add(argument14.getTree());

                    // Pass.g:118:23: ( ',' argument )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==47) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Pass.g:118:24: ',' argument
                    	    {
                    	    char_literal15=(Token)match(input,47,FOLLOW_47_in_args180); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_47.add(char_literal15);


                    	    pushFollow(FOLLOW_argument_in_args182);
                    	    argument16=argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument.add(argument16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            // Pass.g:118:41: ( ( LT )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Pass.g:118:42: ( LT )+
                    {
                    // Pass.g:118:42: ( LT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==LT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Pass.g:118:42: LT
                    	    {
                    	    LT17=(Token)match(input,LT,FOLLOW_LT_in_args189); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT17);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }


            char_literal18=(Token)match(input,44,FOLLOW_44_in_args193); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_44.add(char_literal18);


            // AST REWRITE
            // elements: argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:51: -> ^( ARGUMENTS ( argument )* )
            {
                // Pass.g:118:54: ^( ARGUMENTS ( argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARGUMENTS, "ARGUMENTS")
                , root_1);

                // Pass.g:118:66: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // Pass.g:121:1: func : args '~' ( expr -> ^( FUNCTION args expr ) | LT iblock -> ^( FUNCTION args iblock ) ) ;
    public final PassParser.func_return func() throws RecognitionException {
        PassParser.func_return retval = new PassParser.func_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal20=null;
        Token LT22=null;
        PassParser.args_return args19 =null;

        PassParser.expr_return expr21 =null;

        PassParser.iblock_return iblock23 =null;


        Object char_literal20_tree=null;
        Object LT22_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_iblock=new RewriteRuleSubtreeStream(adaptor,"rule iblock");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Pass.g:121:5: ( args '~' ( expr -> ^( FUNCTION args expr ) | LT iblock -> ^( FUNCTION args iblock ) ) )
            // Pass.g:121:9: args '~' ( expr -> ^( FUNCTION args expr ) | LT iblock -> ^( FUNCTION args iblock ) )
            {
            pushFollow(FOLLOW_args_in_func220);
            args19=args();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_args.add(args19.getTree());

            char_literal20=(Token)match(input,66,FOLLOW_66_in_func222); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_66.add(char_literal20);


            // Pass.g:121:18: ( expr -> ^( FUNCTION args expr ) | LT iblock -> ^( FUNCTION args iblock ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID||LA11_0==NUMBER||LA11_0==STRING||LA11_0==43||LA11_0==56||LA11_0==62) ) {
                alt11=1;
            }
            else if ( (LA11_0==LT) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // Pass.g:121:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_func225);
                    expr21=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr21.getTree());

                    // AST REWRITE
                    // elements: args, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 121:24: -> ^( FUNCTION args expr )
                    {
                        // Pass.g:121:27: ^( FUNCTION args expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        adaptor.addChild(root_1, stream_args.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Pass.g:122:7: LT iblock
                    {
                    LT22=(Token)match(input,LT,FOLLOW_LT_in_func243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT22);


                    pushFollow(FOLLOW_iblock_in_func245);
                    iblock23=iblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iblock.add(iblock23.getTree());

                    // AST REWRITE
                    // elements: iblock, args
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:17: -> ^( FUNCTION args iblock )
                    {
                        // Pass.g:122:20: ^( FUNCTION args iblock )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FUNCTION, "FUNCTION")
                        , root_1);

                        adaptor.addChild(root_1, stream_args.nextTree());

                        adaptor.addChild(root_1, stream_iblock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Pass.g:126:1: expr : ( ( ID ( access )* ( '=' | ARITH_ASSIGN ) )=> ID ( access )* assign -> ^( ASSIGNMENT ^( ID ( access )* ) assign ) | short_stmt | bool );
    public final PassParser.expr_return expr() throws RecognitionException {
        PassParser.expr_return retval = new PassParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID24=null;
        PassParser.access_return access25 =null;

        PassParser.assign_return assign26 =null;

        PassParser.short_stmt_return short_stmt27 =null;

        PassParser.bool_return bool28 =null;


        Object ID24_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        RewriteRuleSubtreeStream stream_access=new RewriteRuleSubtreeStream(adaptor,"rule access");
        try {
            // Pass.g:126:5: ( ( ID ( access )* ( '=' | ARITH_ASSIGN ) )=> ID ( access )* assign -> ^( ASSIGNMENT ^( ID ( access )* ) assign ) | short_stmt | bool )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // Pass.g:126:9: ( ID ( access )* ( '=' | ARITH_ASSIGN ) )=> ID ( access )* assign
                    {
                    ID24=(Token)match(input,ID,FOLLOW_ID_in_expr290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID24);


                    // Pass.g:126:46: ( access )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==49||LA12_0==53) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Pass.g:126:46: access
                    	    {
                    	    pushFollow(FOLLOW_access_in_expr292);
                    	    access25=access();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_access.add(access25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    pushFollow(FOLLOW_assign_in_expr295);
                    assign26=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assign.add(assign26.getTree());

                    // AST REWRITE
                    // elements: assign, ID, access
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:61: -> ^( ASSIGNMENT ^( ID ( access )* ) assign )
                    {
                        // Pass.g:126:64: ^( ASSIGNMENT ^( ID ( access )* ) assign )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT")
                        , root_1);

                        // Pass.g:126:77: ^( ID ( access )* )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        stream_ID.nextNode()
                        , root_2);

                        // Pass.g:126:82: ( access )*
                        while ( stream_access.hasNext() ) {
                            adaptor.addChild(root_2, stream_access.nextTree());

                        }
                        stream_access.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_assign.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Pass.g:127:9: short_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_short_stmt_in_expr320);
                    short_stmt27=short_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, short_stmt27.getTree());

                    }
                    break;
                case 3 :
                    // Pass.g:128:9: bool
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_bool_in_expr330);
                    bool28=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool28.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class short_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "short_stmt"
    // Pass.g:131:1: short_stmt : ( return_stmt | break_stmt );
    public final PassParser.short_stmt_return short_stmt() throws RecognitionException {
        PassParser.short_stmt_return retval = new PassParser.short_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PassParser.return_stmt_return return_stmt29 =null;

        PassParser.break_stmt_return break_stmt30 =null;



        try {
            // Pass.g:132:5: ( return_stmt | break_stmt )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==62) ) {
                alt14=1;
            }
            else if ( (LA14_0==56) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Pass.g:132:9: return_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_short_stmt349);
                    return_stmt29=return_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_stmt29.getTree());

                    }
                    break;
                case 2 :
                    // Pass.g:133:9: break_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_break_stmt_in_short_stmt359);
                    break_stmt30=break_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, break_stmt30.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "short_stmt"


    public static class break_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "break_stmt"
    // Pass.g:136:1: break_stmt : 'break' -> ^( BREAK ) ;
    public final PassParser.break_stmt_return break_stmt() throws RecognitionException {
        PassParser.break_stmt_return retval = new PassParser.break_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal31=null;

        Object string_literal31_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

        try {
            // Pass.g:137:5: ( 'break' -> ^( BREAK ) )
            // Pass.g:137:9: 'break'
            {
            string_literal31=(Token)match(input,56,FOLLOW_56_in_break_stmt382); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal31);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:17: -> ^( BREAK )
            {
                // Pass.g:137:20: ^( BREAK )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BREAK, "BREAK")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "break_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // Pass.g:140:1: return_stmt : 'return' argument -> ^( RETURN argument ) ;
    public final PassParser.return_stmt_return return_stmt() throws RecognitionException {
        PassParser.return_stmt_return retval = new PassParser.return_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal32=null;
        PassParser.argument_return argument33 =null;


        Object string_literal32_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // Pass.g:141:5: ( 'return' argument -> ^( RETURN argument ) )
            // Pass.g:141:9: 'return' argument
            {
            string_literal32=(Token)match(input,62,FOLLOW_62_in_return_stmt407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(string_literal32);


            pushFollow(FOLLOW_argument_in_return_stmt409);
            argument33=argument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_argument.add(argument33.getTree());

            // AST REWRITE
            // elements: argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:27: -> ^( RETURN argument )
            {
                // Pass.g:141:30: ^( RETURN argument )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(RETURN, "RETURN")
                , root_1);

                adaptor.addChild(root_1, stream_argument.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class bool_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool"
    // Pass.g:144:1: bool : ( ( args '~' )=> func | ( logic -> logic ) (operator= CMP logic -> ^( GENERIC_OP $bool $operator logic ) )* );
    public final PassParser.bool_return bool() throws RecognitionException {
        PassParser.bool_return retval = new PassParser.bool_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token operator=null;
        PassParser.func_return func34 =null;

        PassParser.logic_return logic35 =null;

        PassParser.logic_return logic36 =null;


        Object operator_tree=null;
        RewriteRuleTokenStream stream_CMP=new RewriteRuleTokenStream(adaptor,"token CMP");
        RewriteRuleSubtreeStream stream_logic=new RewriteRuleSubtreeStream(adaptor,"rule logic");
        try {
            // Pass.g:144:5: ( ( args '~' )=> func | ( logic -> logic ) (operator= CMP logic -> ^( GENERIC_OP $bool $operator logic ) )* )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred2_Pass()) ) {
                    alt16=1;
                }
                else if ( (true) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA16_0==ID||LA16_0==NUMBER||LA16_0==STRING) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Pass.g:144:9: ( args '~' )=> func
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_func_in_bool438);
                    func34=func();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, func34.getTree());

                    }
                    break;
                case 2 :
                    // Pass.g:145:9: ( logic -> logic ) (operator= CMP logic -> ^( GENERIC_OP $bool $operator logic ) )*
                    {
                    // Pass.g:145:9: ( logic -> logic )
                    // Pass.g:145:10: logic
                    {
                    pushFollow(FOLLOW_logic_in_bool449);
                    logic35=logic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logic.add(logic35.getTree());

                    // AST REWRITE
                    // elements: logic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:16: -> logic
                    {
                        adaptor.addChild(root_0, stream_logic.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }


                    // Pass.g:146:10: (operator= CMP logic -> ^( GENERIC_OP $bool $operator logic ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==CMP) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Pass.g:146:11: operator= CMP logic
                    	    {
                    	    operator=(Token)match(input,CMP,FOLLOW_CMP_in_bool469); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_CMP.add(operator);


                    	    pushFollow(FOLLOW_logic_in_bool471);
                    	    logic36=logic();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_logic.add(logic36.getTree());

                    	    // AST REWRITE
                    	    // elements: bool, logic, operator
                    	    // token labels: operator
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 146:30: -> ^( GENERIC_OP $bool $operator logic )
                    	    {
                    	        // Pass.g:146:33: ^( GENERIC_OP $bool $operator logic )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
                    	        , root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_operator.nextNode());

                    	        adaptor.addChild(root_1, stream_logic.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool"


    public static class logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logic"
    // Pass.g:149:1: logic : ( eval -> eval ) (operator= BOP eval -> ^( GENERIC_OP $logic $operator eval ) )* ;
    public final PassParser.logic_return logic() throws RecognitionException {
        PassParser.logic_return retval = new PassParser.logic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token operator=null;
        PassParser.eval_return eval37 =null;

        PassParser.eval_return eval38 =null;


        Object operator_tree=null;
        RewriteRuleTokenStream stream_BOP=new RewriteRuleTokenStream(adaptor,"token BOP");
        RewriteRuleSubtreeStream stream_eval=new RewriteRuleSubtreeStream(adaptor,"rule eval");
        try {
            // Pass.g:150:5: ( ( eval -> eval ) (operator= BOP eval -> ^( GENERIC_OP $logic $operator eval ) )* )
            // Pass.g:150:9: ( eval -> eval ) (operator= BOP eval -> ^( GENERIC_OP $logic $operator eval ) )*
            {
            // Pass.g:150:9: ( eval -> eval )
            // Pass.g:150:10: eval
            {
            pushFollow(FOLLOW_eval_in_logic507);
            eval37=eval();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_eval.add(eval37.getTree());

            // AST REWRITE
            // elements: eval
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:14: -> eval
            {
                adaptor.addChild(root_0, stream_eval.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Pass.g:151:9: (operator= BOP eval -> ^( GENERIC_OP $logic $operator eval ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==BOP) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Pass.g:151:10: operator= BOP eval
            	    {
            	    operator=(Token)match(input,BOP,FOLLOW_BOP_in_logic524); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_BOP.add(operator);


            	    pushFollow(FOLLOW_eval_in_logic526);
            	    eval38=eval();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_eval.add(eval38.getTree());

            	    // AST REWRITE
            	    // elements: eval, operator, logic
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 151:28: -> ^( GENERIC_OP $logic $operator eval )
            	    {
            	        // Pass.g:151:31: ^( GENERIC_OP $logic $operator eval )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_eval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logic"


    public static class eval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eval"
    // Pass.g:154:1: eval : ( term -> term ) (operator= '+' term -> ^( GENERIC_OP $eval $operator term ) |operator= '-' term -> ^( GENERIC_OP $eval $operator term ) )* ;
    public final PassParser.eval_return eval() throws RecognitionException {
        PassParser.eval_return retval = new PassParser.eval_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token operator=null;
        PassParser.term_return term39 =null;

        PassParser.term_return term40 =null;

        PassParser.term_return term41 =null;


        Object operator_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // Pass.g:154:5: ( ( term -> term ) (operator= '+' term -> ^( GENERIC_OP $eval $operator term ) |operator= '-' term -> ^( GENERIC_OP $eval $operator term ) )* )
            // Pass.g:154:9: ( term -> term ) (operator= '+' term -> ^( GENERIC_OP $eval $operator term ) |operator= '-' term -> ^( GENERIC_OP $eval $operator term ) )*
            {
            // Pass.g:154:9: ( term -> term )
            // Pass.g:154:10: term
            {
            pushFollow(FOLLOW_term_in_eval558);
            term39=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term39.getTree());

            // AST REWRITE
            // elements: term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 154:14: -> term
            {
                adaptor.addChild(root_0, stream_term.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Pass.g:155:6: (operator= '+' term -> ^( GENERIC_OP $eval $operator term ) |operator= '-' term -> ^( GENERIC_OP $eval $operator term ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }
                else if ( (LA18_0==48) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // Pass.g:155:7: operator= '+' term
            	    {
            	    operator=(Token)match(input,46,FOLLOW_46_in_eval572); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(operator);


            	    pushFollow(FOLLOW_term_in_eval574);
            	    term40=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_term.add(term40.getTree());

            	    // AST REWRITE
            	    // elements: eval, term, operator
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 155:25: -> ^( GENERIC_OP $eval $operator term )
            	    {
            	        // Pass.g:155:28: ^( GENERIC_OP $eval $operator term )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_term.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Pass.g:156:7: operator= '-' term
            	    {
            	    operator=(Token)match(input,48,FOLLOW_48_in_eval598); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(operator);


            	    pushFollow(FOLLOW_term_in_eval600);
            	    term41=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_term.add(term41.getTree());

            	    // AST REWRITE
            	    // elements: eval, term, operator
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 156:25: -> ^( GENERIC_OP $eval $operator term )
            	    {
            	        // Pass.g:156:28: ^( GENERIC_OP $eval $operator term )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_term.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "eval"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // Pass.g:160:1: term : ( exponent -> exponent ) (operator= '*' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '/' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '%' exponent -> ^( GENERIC_OP $term $operator exponent ) )* ;
    public final PassParser.term_return term() throws RecognitionException {
        PassParser.term_return retval = new PassParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token operator=null;
        PassParser.exponent_return exponent42 =null;

        PassParser.exponent_return exponent43 =null;

        PassParser.exponent_return exponent44 =null;

        PassParser.exponent_return exponent45 =null;


        Object operator_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_exponent=new RewriteRuleSubtreeStream(adaptor,"rule exponent");
        try {
            // Pass.g:160:5: ( ( exponent -> exponent ) (operator= '*' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '/' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '%' exponent -> ^( GENERIC_OP $term $operator exponent ) )* )
            // Pass.g:160:9: ( exponent -> exponent ) (operator= '*' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '/' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '%' exponent -> ^( GENERIC_OP $term $operator exponent ) )*
            {
            // Pass.g:160:9: ( exponent -> exponent )
            // Pass.g:160:10: exponent
            {
            pushFollow(FOLLOW_exponent_in_term640);
            exponent42=exponent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exponent.add(exponent42.getTree());

            // AST REWRITE
            // elements: exponent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:19: -> exponent
            {
                adaptor.addChild(root_0, stream_exponent.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Pass.g:161:5: (operator= '*' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '/' exponent -> ^( GENERIC_OP $term $operator exponent ) |operator= '%' exponent -> ^( GENERIC_OP $term $operator exponent ) )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    alt19=1;
                    }
                    break;
                case 50:
                    {
                    alt19=2;
                    }
                    break;
                case 42:
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // Pass.g:161:6: operator= '*' exponent
            	    {
            	    operator=(Token)match(input,45,FOLLOW_45_in_term654); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_45.add(operator);


            	    pushFollow(FOLLOW_exponent_in_term656);
            	    exponent43=exponent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exponent.add(exponent43.getTree());

            	    // AST REWRITE
            	    // elements: exponent, term, operator
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 161:28: -> ^( GENERIC_OP $term $operator exponent )
            	    {
            	        // Pass.g:161:31: ^( GENERIC_OP $term $operator exponent )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_exponent.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 2 :
            	    // Pass.g:162:6: operator= '/' exponent
            	    {
            	    operator=(Token)match(input,50,FOLLOW_50_in_term679); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(operator);


            	    pushFollow(FOLLOW_exponent_in_term681);
            	    exponent44=exponent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exponent.add(exponent44.getTree());

            	    // AST REWRITE
            	    // elements: exponent, term, operator
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 162:28: -> ^( GENERIC_OP $term $operator exponent )
            	    {
            	        // Pass.g:162:31: ^( GENERIC_OP $term $operator exponent )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_exponent.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;
            	case 3 :
            	    // Pass.g:163:6: operator= '%' exponent
            	    {
            	    operator=(Token)match(input,42,FOLLOW_42_in_term704); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_42.add(operator);


            	    pushFollow(FOLLOW_exponent_in_term706);
            	    exponent45=exponent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_exponent.add(exponent45.getTree());

            	    // AST REWRITE
            	    // elements: exponent, operator, term
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 163:28: -> ^( GENERIC_OP $term $operator exponent )
            	    {
            	        // Pass.g:163:31: ^( GENERIC_OP $term $operator exponent )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_exponent.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class exponent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exponent"
    // Pass.g:166:1: exponent : ( factor -> factor ) (operator= '^' factor -> ^( GENERIC_OP $exponent $operator factor ) )* ;
    public final PassParser.exponent_return exponent() throws RecognitionException {
        PassParser.exponent_return retval = new PassParser.exponent_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token operator=null;
        PassParser.factor_return factor46 =null;

        PassParser.factor_return factor47 =null;


        Object operator_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_factor=new RewriteRuleSubtreeStream(adaptor,"rule factor");
        try {
            // Pass.g:167:2: ( ( factor -> factor ) (operator= '^' factor -> ^( GENERIC_OP $exponent $operator factor ) )* )
            // Pass.g:167:4: ( factor -> factor ) (operator= '^' factor -> ^( GENERIC_OP $exponent $operator factor ) )*
            {
            // Pass.g:167:4: ( factor -> factor )
            // Pass.g:167:5: factor
            {
            pushFollow(FOLLOW_factor_in_exponent737);
            factor46=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_factor.add(factor46.getTree());

            // AST REWRITE
            // elements: factor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 167:12: -> factor
            {
                adaptor.addChild(root_0, stream_factor.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // Pass.g:167:23: (operator= '^' factor -> ^( GENERIC_OP $exponent $operator factor ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==55) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Pass.g:167:24: operator= '^' factor
            	    {
            	    operator=(Token)match(input,55,FOLLOW_55_in_exponent747); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(operator);


            	    pushFollow(FOLLOW_factor_in_exponent749);
            	    factor47=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_factor.add(factor47.getTree());

            	    // AST REWRITE
            	    // elements: exponent, factor, operator
            	    // token labels: operator
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {

            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_operator=new RewriteRuleTokenStream(adaptor,"token operator",operator);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 167:44: -> ^( GENERIC_OP $exponent $operator factor )
            	    {
            	        // Pass.g:167:47: ^( GENERIC_OP $exponent $operator factor )
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(GENERIC_OP, "GENERIC_OP")
            	        , root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_1, stream_operator.nextNode());

            	        adaptor.addChild(root_1, stream_factor.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }


            	    retval.tree = root_0;
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exponent"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // Pass.g:170:1: factor : ( ( modable -> modable ) ( args -> ^( FUNC_CALL $factor args ) | array_access -> ^( ARRAY_ACCESS $factor array_access ) | dictionary_access -> ^( DICT_ACCESS $factor dictionary_access ) )* | atom );
    public final PassParser.factor_return factor() throws RecognitionException {
        PassParser.factor_return retval = new PassParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PassParser.modable_return modable48 =null;

        PassParser.args_return args49 =null;

        PassParser.array_access_return array_access50 =null;

        PassParser.dictionary_access_return dictionary_access51 =null;

        PassParser.atom_return atom52 =null;


        RewriteRuleSubtreeStream stream_dictionary_access=new RewriteRuleSubtreeStream(adaptor,"rule dictionary_access");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_array_access=new RewriteRuleSubtreeStream(adaptor,"rule array_access");
        RewriteRuleSubtreeStream stream_modable=new RewriteRuleSubtreeStream(adaptor,"rule modable");
        try {
            // Pass.g:171:5: ( ( modable -> modable ) ( args -> ^( FUNC_CALL $factor args ) | array_access -> ^( ARRAY_ACCESS $factor array_access ) | dictionary_access -> ^( DICT_ACCESS $factor dictionary_access ) )* | atom )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID||LA22_0==43) ) {
                alt22=1;
            }
            else if ( (LA22_0==NUMBER||LA22_0==STRING) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Pass.g:171:9: ( modable -> modable ) ( args -> ^( FUNC_CALL $factor args ) | array_access -> ^( ARRAY_ACCESS $factor array_access ) | dictionary_access -> ^( DICT_ACCESS $factor dictionary_access ) )*
                    {
                    // Pass.g:171:9: ( modable -> modable )
                    // Pass.g:171:10: modable
                    {
                    pushFollow(FOLLOW_modable_in_factor782);
                    modable48=modable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_modable.add(modable48.getTree());

                    // AST REWRITE
                    // elements: modable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:18: -> modable
                    {
                        adaptor.addChild(root_0, stream_modable.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }


                    // Pass.g:172:9: ( args -> ^( FUNC_CALL $factor args ) | array_access -> ^( ARRAY_ACCESS $factor array_access ) | dictionary_access -> ^( DICT_ACCESS $factor dictionary_access ) )*
                    loop21:
                    do {
                        int alt21=4;
                        switch ( input.LA(1) ) {
                        case 43:
                            {
                            alt21=1;
                            }
                            break;
                        case 53:
                            {
                            alt21=2;
                            }
                            break;
                        case 49:
                            {
                            alt21=3;
                            }
                            break;

                        }

                        switch (alt21) {
                    	case 1 :
                    	    // Pass.g:172:10: args
                    	    {
                    	    pushFollow(FOLLOW_args_in_factor799);
                    	    args49=args();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_args.add(args49.getTree());

                    	    // AST REWRITE
                    	    // elements: args, factor
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 172:15: -> ^( FUNC_CALL $factor args )
                    	    {
                    	        // Pass.g:172:18: ^( FUNC_CALL $factor args )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(FUNC_CALL, "FUNC_CALL")
                    	        , root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_args.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // Pass.g:173:13: array_access
                    	    {
                    	    pushFollow(FOLLOW_array_access_in_factor824);
                    	    array_access50=array_access();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_array_access.add(array_access50.getTree());

                    	    // AST REWRITE
                    	    // elements: factor, array_access
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 173:26: -> ^( ARRAY_ACCESS $factor array_access )
                    	    {
                    	        // Pass.g:173:29: ^( ARRAY_ACCESS $factor array_access )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(ARRAY_ACCESS, "ARRAY_ACCESS")
                    	        , root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_array_access.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // Pass.g:174:13: dictionary_access
                    	    {
                    	    pushFollow(FOLLOW_dictionary_access_in_factor849);
                    	    dictionary_access51=dictionary_access();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_dictionary_access.add(dictionary_access51.getTree());

                    	    // AST REWRITE
                    	    // elements: dictionary_access, factor
                    	    // token labels: 
                    	    // rule labels: retval
                    	    // token list labels: 
                    	    // rule list labels: 
                    	    // wildcard labels: 
                    	    if ( state.backtracking==0 ) {

                    	    retval.tree = root_0;
                    	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    	    root_0 = (Object)adaptor.nil();
                    	    // 174:31: -> ^( DICT_ACCESS $factor dictionary_access )
                    	    {
                    	        // Pass.g:174:34: ^( DICT_ACCESS $factor dictionary_access )
                    	        {
                    	        Object root_1 = (Object)adaptor.nil();
                    	        root_1 = (Object)adaptor.becomeRoot(
                    	        (Object)adaptor.create(DICT_ACCESS, "DICT_ACCESS")
                    	        , root_1);

                    	        adaptor.addChild(root_1, stream_retval.nextTree());

                    	        adaptor.addChild(root_1, stream_dictionary_access.nextTree());

                    	        adaptor.addChild(root_0, root_1);
                    	        }

                    	    }


                    	    retval.tree = root_0;
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Pass.g:176:9: atom
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_atom_in_factor884);
                    atom52=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, atom52.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class array_access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_access"
    // Pass.g:179:1: array_access : '[' NUMBER ']' -> NUMBER ;
    public final PassParser.array_access_return array_access() throws RecognitionException {
        PassParser.array_access_return retval = new PassParser.array_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal53=null;
        Token NUMBER54=null;
        Token char_literal55=null;

        Object char_literal53_tree=null;
        Object NUMBER54_tree=null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");

        try {
            // Pass.g:180:2: ( '[' NUMBER ']' -> NUMBER )
            // Pass.g:180:6: '[' NUMBER ']'
            {
            char_literal53=(Token)match(input,53,FOLLOW_53_in_array_access900); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal53);


            NUMBER54=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_array_access902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NUMBER.add(NUMBER54);


            char_literal55=(Token)match(input,54,FOLLOW_54_in_array_access904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal55);


            // AST REWRITE
            // elements: NUMBER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:21: -> NUMBER
            {
                adaptor.addChild(root_0, 
                stream_NUMBER.nextNode()
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_access"


    public static class dictionary_access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dictionary_access"
    // Pass.g:183:1: dictionary_access : '.' def= ID -> $def;
    public final PassParser.dictionary_access_return dictionary_access() throws RecognitionException {
        PassParser.dictionary_access_return retval = new PassParser.dictionary_access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token def=null;
        Token char_literal56=null;

        Object def_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // Pass.g:184:2: ( '.' def= ID -> $def)
            // Pass.g:184:6: '.' def= ID
            {
            char_literal56=(Token)match(input,49,FOLLOW_49_in_dictionary_access921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal56);


            def=(Token)match(input,ID,FOLLOW_ID_in_dictionary_access925); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(def);


            // AST REWRITE
            // elements: def
            // token labels: def
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_def=new RewriteRuleTokenStream(adaptor,"token def",def);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:17: -> $def
            {
                adaptor.addChild(root_0, stream_def.nextNode());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dictionary_access"


    public static class access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "access"
    // Pass.g:187:1: access : ( array_access | dictionary_access );
    public final PassParser.access_return access() throws RecognitionException {
        PassParser.access_return retval = new PassParser.access_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PassParser.array_access_return array_access57 =null;

        PassParser.dictionary_access_return dictionary_access58 =null;



        try {
            // Pass.g:188:5: ( array_access | dictionary_access )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==53) ) {
                alt23=1;
            }
            else if ( (LA23_0==49) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Pass.g:188:9: array_access
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_array_access_in_access946);
                    array_access57=array_access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_access57.getTree());

                    }
                    break;
                case 2 :
                    // Pass.g:189:9: dictionary_access
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dictionary_access_in_access956);
                    dictionary_access58=dictionary_access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dictionary_access58.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "access"


    public static class mod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mod"
    // Pass.g:192:1: mod : ( args | access );
    public final PassParser.mod_return mod() throws RecognitionException {
        PassParser.mod_return retval = new PassParser.mod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        PassParser.args_return args59 =null;

        PassParser.access_return access60 =null;



        try {
            // Pass.g:192:5: ( args | access )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            else if ( (LA24_0==49||LA24_0==53) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Pass.g:192:9: args
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_args_in_mod971);
                    args59=args();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, args59.getTree());

                    }
                    break;
                case 2 :
                    // Pass.g:193:9: access
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_access_in_mod981);
                    access60=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access60.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mod"


    public static class modable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "modable"
    // Pass.g:196:1: modable : ( ID | '(' bool ')' -> bool );
    public final PassParser.modable_return modable() throws RecognitionException {
        PassParser.modable_return retval = new PassParser.modable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        PassParser.bool_return bool63 =null;


        Object ID61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleSubtreeStream stream_bool=new RewriteRuleSubtreeStream(adaptor,"rule bool");
        try {
            // Pass.g:197:5: ( ID | '(' bool ')' -> bool )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==43) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // Pass.g:197:9: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID61=(Token)match(input,ID,FOLLOW_ID_in_modable1004); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID61_tree = 
                    (Object)adaptor.create(ID61)
                    ;
                    adaptor.addChild(root_0, ID61_tree);
                    }

                    }
                    break;
                case 2 :
                    // Pass.g:198:9: '(' bool ')'
                    {
                    char_literal62=(Token)match(input,43,FOLLOW_43_in_modable1014); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_43.add(char_literal62);


                    pushFollow(FOLLOW_bool_in_modable1016);
                    bool63=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bool.add(bool63.getTree());

                    char_literal64=(Token)match(input,44,FOLLOW_44_in_modable1018); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_44.add(char_literal64);


                    // AST REWRITE
                    // elements: bool
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:22: -> bool
                    {
                        adaptor.addChild(root_0, stream_bool.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "modable"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Pass.g:201:1: atom : ( NUMBER | STRING );
    public final PassParser.atom_return atom() throws RecognitionException {
        PassParser.atom_return retval = new PassParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set65=null;

        Object set65_tree=null;

        try {
            // Pass.g:201:5: ( NUMBER | STRING )
            // Pass.g:
            {
            root_0 = (Object)adaptor.nil();


            set65=(Token)input.LT(1);

            if ( input.LA(1)==NUMBER||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set65)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class control_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "control"
    // Pass.g:205:1: control : ( 'for' iterator= ID 'in' (container= ID ( args )+ ( LT )+ iblock -> ^( FOR $iterator ^( FUNC_CALL $container ( args )* ) ( LT )+ iblock ) |container= ID ( access )+ ( LT )+ iblock -> ^( FOR $iterator ^( $container ( access )* ) ( LT )+ iblock ) | array_definition ( LT )+ iblock -> ^( FOR $iterator array_definition ( LT )+ iblock ) |container= ID ( LT )+ iblock -> ^( FOR $iterator $container ( LT )+ iblock ) ) | 'while' bool ( LT )+ iblock -> ^( WHILE bool ( LT )+ iblock ) | 'if' bool ( LT )+ iblock ( ( LT )+ else_test )? -> ^( IF_CONDITIONS ^( IF bool ( LT )+ iblock ) ( else_test )* ) );
    public final PassParser.control_return control() throws RecognitionException {
        PassParser.control_return retval = new PassParser.control_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token iterator=null;
        Token container=null;
        Token string_literal66=null;
        Token string_literal67=null;
        Token LT69=null;
        Token LT72=null;
        Token LT75=null;
        Token LT77=null;
        Token string_literal79=null;
        Token LT81=null;
        Token string_literal83=null;
        Token LT85=null;
        Token LT87=null;
        PassParser.args_return args68 =null;

        PassParser.iblock_return iblock70 =null;

        PassParser.access_return access71 =null;

        PassParser.iblock_return iblock73 =null;

        PassParser.array_definition_return array_definition74 =null;

        PassParser.iblock_return iblock76 =null;

        PassParser.iblock_return iblock78 =null;

        PassParser.bool_return bool80 =null;

        PassParser.iblock_return iblock82 =null;

        PassParser.bool_return bool84 =null;

        PassParser.iblock_return iblock86 =null;

        PassParser.else_test_return else_test88 =null;


        Object iterator_tree=null;
        Object container_tree=null;
        Object string_literal66_tree=null;
        Object string_literal67_tree=null;
        Object LT69_tree=null;
        Object LT72_tree=null;
        Object LT75_tree=null;
        Object LT77_tree=null;
        Object string_literal79_tree=null;
        Object LT81_tree=null;
        Object string_literal83_tree=null;
        Object LT85_tree=null;
        Object LT87_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_else_test=new RewriteRuleSubtreeStream(adaptor,"rule else_test");
        RewriteRuleSubtreeStream stream_iblock=new RewriteRuleSubtreeStream(adaptor,"rule iblock");
        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        RewriteRuleSubtreeStream stream_bool=new RewriteRuleSubtreeStream(adaptor,"rule bool");
        RewriteRuleSubtreeStream stream_access=new RewriteRuleSubtreeStream(adaptor,"rule access");
        RewriteRuleSubtreeStream stream_array_definition=new RewriteRuleSubtreeStream(adaptor,"rule array_definition");
        try {
            // Pass.g:206:5: ( 'for' iterator= ID 'in' (container= ID ( args )+ ( LT )+ iblock -> ^( FOR $iterator ^( FUNC_CALL $container ( args )* ) ( LT )+ iblock ) |container= ID ( access )+ ( LT )+ iblock -> ^( FOR $iterator ^( $container ( access )* ) ( LT )+ iblock ) | array_definition ( LT )+ iblock -> ^( FOR $iterator array_definition ( LT )+ iblock ) |container= ID ( LT )+ iblock -> ^( FOR $iterator $container ( LT )+ iblock ) ) | 'while' bool ( LT )+ iblock -> ^( WHILE bool ( LT )+ iblock ) | 'if' bool ( LT )+ iblock ( ( LT )+ else_test )? -> ^( IF_CONDITIONS ^( IF bool ( LT )+ iblock ) ( else_test )* ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt37=1;
                }
                break;
            case 63:
                {
                alt37=2;
                }
                break;
            case 60:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // Pass.g:206:9: 'for' iterator= ID 'in' (container= ID ( args )+ ( LT )+ iblock -> ^( FOR $iterator ^( FUNC_CALL $container ( args )* ) ( LT )+ iblock ) |container= ID ( access )+ ( LT )+ iblock -> ^( FOR $iterator ^( $container ( access )* ) ( LT )+ iblock ) | array_definition ( LT )+ iblock -> ^( FOR $iterator array_definition ( LT )+ iblock ) |container= ID ( LT )+ iblock -> ^( FOR $iterator $container ( LT )+ iblock ) )
                    {
                    string_literal66=(Token)match(input,59,FOLLOW_59_in_control1065); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal66);


                    iterator=(Token)match(input,ID,FOLLOW_ID_in_control1069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(iterator);


                    string_literal67=(Token)match(input,61,FOLLOW_61_in_control1071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(string_literal67);


                    // Pass.g:207:10: (container= ID ( args )+ ( LT )+ iblock -> ^( FOR $iterator ^( FUNC_CALL $container ( args )* ) ( LT )+ iblock ) |container= ID ( access )+ ( LT )+ iblock -> ^( FOR $iterator ^( $container ( access )* ) ( LT )+ iblock ) | array_definition ( LT )+ iblock -> ^( FOR $iterator array_definition ( LT )+ iblock ) |container= ID ( LT )+ iblock -> ^( FOR $iterator $container ( LT )+ iblock ) )
                    int alt32=4;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ID) ) {
                        switch ( input.LA(2) ) {
                        case 43:
                            {
                            alt32=1;
                            }
                            break;
                        case 49:
                        case 53:
                            {
                            alt32=2;
                            }
                            break;
                        case LT:
                            {
                            alt32=4;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 1, input);

                            throw nvae;

                        }

                    }
                    else if ( (LA32_0==53) ) {
                        alt32=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // Pass.g:207:11: container= ID ( args )+ ( LT )+ iblock
                            {
                            container=(Token)match(input,ID,FOLLOW_ID_in_control1086); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ID.add(container);


                            // Pass.g:207:24: ( args )+
                            int cnt26=0;
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==43) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // Pass.g:207:24: args
                            	    {
                            	    pushFollow(FOLLOW_args_in_control1088);
                            	    args68=args();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_args.add(args68.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt26 >= 1 ) break loop26;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(26, input);
                                        throw eee;
                                }
                                cnt26++;
                            } while (true);


                            // Pass.g:207:30: ( LT )+
                            int cnt27=0;
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==LT) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // Pass.g:207:30: LT
                            	    {
                            	    LT69=(Token)match(input,LT,FOLLOW_LT_in_control1091); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_LT.add(LT69);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt27 >= 1 ) break loop27;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(27, input);
                                        throw eee;
                                }
                                cnt27++;
                            } while (true);


                            pushFollow(FOLLOW_iblock_in_control1094);
                            iblock70=iblock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_iblock.add(iblock70.getTree());

                            // AST REWRITE
                            // elements: args, iterator, LT, container, iblock
                            // token labels: iterator, container
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_iterator=new RewriteRuleTokenStream(adaptor,"token iterator",iterator);
                            RewriteRuleTokenStream stream_container=new RewriteRuleTokenStream(adaptor,"token container",container);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 207:41: -> ^( FOR $iterator ^( FUNC_CALL $container ( args )* ) ( LT )+ iblock )
                            {
                                // Pass.g:207:44: ^( FOR $iterator ^( FUNC_CALL $container ( args )* ) ( LT )+ iblock )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(FOR, "FOR")
                                , root_1);

                                adaptor.addChild(root_1, stream_iterator.nextNode());

                                // Pass.g:207:60: ^( FUNC_CALL $container ( args )* )
                                {
                                Object root_2 = (Object)adaptor.nil();
                                root_2 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(FUNC_CALL, "FUNC_CALL")
                                , root_2);

                                adaptor.addChild(root_2, stream_container.nextNode());

                                // Pass.g:207:83: ( args )*
                                while ( stream_args.hasNext() ) {
                                    adaptor.addChild(root_2, stream_args.nextTree());

                                }
                                stream_args.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                                if ( !(stream_LT.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_LT.hasNext() ) {
                                    adaptor.addChild(root_1, 
                                    stream_LT.nextNode()
                                    );

                                }
                                stream_LT.reset();

                                adaptor.addChild(root_1, stream_iblock.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 2 :
                            // Pass.g:208:11: container= ID ( access )+ ( LT )+ iblock
                            {
                            container=(Token)match(input,ID,FOLLOW_ID_in_control1132); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ID.add(container);


                            // Pass.g:208:24: ( access )+
                            int cnt28=0;
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==49||LA28_0==53) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // Pass.g:208:24: access
                            	    {
                            	    pushFollow(FOLLOW_access_in_control1134);
                            	    access71=access();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_access.add(access71.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt28 >= 1 ) break loop28;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(28, input);
                                        throw eee;
                                }
                                cnt28++;
                            } while (true);


                            // Pass.g:208:32: ( LT )+
                            int cnt29=0;
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==LT) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // Pass.g:208:32: LT
                            	    {
                            	    LT72=(Token)match(input,LT,FOLLOW_LT_in_control1137); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_LT.add(LT72);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt29 >= 1 ) break loop29;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(29, input);
                                        throw eee;
                                }
                                cnt29++;
                            } while (true);


                            pushFollow(FOLLOW_iblock_in_control1140);
                            iblock73=iblock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_iblock.add(iblock73.getTree());

                            // AST REWRITE
                            // elements: iblock, container, iterator, LT, access
                            // token labels: iterator, container
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_iterator=new RewriteRuleTokenStream(adaptor,"token iterator",iterator);
                            RewriteRuleTokenStream stream_container=new RewriteRuleTokenStream(adaptor,"token container",container);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 208:43: -> ^( FOR $iterator ^( $container ( access )* ) ( LT )+ iblock )
                            {
                                // Pass.g:208:46: ^( FOR $iterator ^( $container ( access )* ) ( LT )+ iblock )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(FOR, "FOR")
                                , root_1);

                                adaptor.addChild(root_1, stream_iterator.nextNode());

                                // Pass.g:208:62: ^( $container ( access )* )
                                {
                                Object root_2 = (Object)adaptor.nil();
                                root_2 = (Object)adaptor.becomeRoot(stream_container.nextNode(), root_2);

                                // Pass.g:208:75: ( access )*
                                while ( stream_access.hasNext() ) {
                                    adaptor.addChild(root_2, stream_access.nextTree());

                                }
                                stream_access.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                                if ( !(stream_LT.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_LT.hasNext() ) {
                                    adaptor.addChild(root_1, 
                                    stream_LT.nextNode()
                                    );

                                }
                                stream_LT.reset();

                                adaptor.addChild(root_1, stream_iblock.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 3 :
                            // Pass.g:209:14: array_definition ( LT )+ iblock
                            {
                            pushFollow(FOLLOW_array_definition_in_control1177);
                            array_definition74=array_definition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_array_definition.add(array_definition74.getTree());

                            // Pass.g:209:31: ( LT )+
                            int cnt30=0;
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==LT) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // Pass.g:209:31: LT
                            	    {
                            	    LT75=(Token)match(input,LT,FOLLOW_LT_in_control1179); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_LT.add(LT75);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt30 >= 1 ) break loop30;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(30, input);
                                        throw eee;
                                }
                                cnt30++;
                            } while (true);


                            pushFollow(FOLLOW_iblock_in_control1182);
                            iblock76=iblock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_iblock.add(iblock76.getTree());

                            // AST REWRITE
                            // elements: array_definition, iterator, iblock, LT
                            // token labels: iterator
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_iterator=new RewriteRuleTokenStream(adaptor,"token iterator",iterator);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 209:42: -> ^( FOR $iterator array_definition ( LT )+ iblock )
                            {
                                // Pass.g:209:45: ^( FOR $iterator array_definition ( LT )+ iblock )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(FOR, "FOR")
                                , root_1);

                                adaptor.addChild(root_1, stream_iterator.nextNode());

                                adaptor.addChild(root_1, stream_array_definition.nextTree());

                                if ( !(stream_LT.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_LT.hasNext() ) {
                                    adaptor.addChild(root_1, 
                                    stream_LT.nextNode()
                                    );

                                }
                                stream_LT.reset();

                                adaptor.addChild(root_1, stream_iblock.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;
                        case 4 :
                            // Pass.g:210:14: container= ID ( LT )+ iblock
                            {
                            container=(Token)match(input,ID,FOLLOW_ID_in_control1215); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ID.add(container);


                            // Pass.g:210:27: ( LT )+
                            int cnt31=0;
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==LT) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // Pass.g:210:27: LT
                            	    {
                            	    LT77=(Token)match(input,LT,FOLLOW_LT_in_control1217); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_LT.add(LT77);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt31 >= 1 ) break loop31;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(31, input);
                                        throw eee;
                                }
                                cnt31++;
                            } while (true);


                            pushFollow(FOLLOW_iblock_in_control1220);
                            iblock78=iblock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_iblock.add(iblock78.getTree());

                            // AST REWRITE
                            // elements: LT, iblock, iterator, container
                            // token labels: iterator, container
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleTokenStream stream_iterator=new RewriteRuleTokenStream(adaptor,"token iterator",iterator);
                            RewriteRuleTokenStream stream_container=new RewriteRuleTokenStream(adaptor,"token container",container);
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (Object)adaptor.nil();
                            // 210:38: -> ^( FOR $iterator $container ( LT )+ iblock )
                            {
                                // Pass.g:210:41: ^( FOR $iterator $container ( LT )+ iblock )
                                {
                                Object root_1 = (Object)adaptor.nil();
                                root_1 = (Object)adaptor.becomeRoot(
                                (Object)adaptor.create(FOR, "FOR")
                                , root_1);

                                adaptor.addChild(root_1, stream_iterator.nextNode());

                                adaptor.addChild(root_1, stream_container.nextNode());

                                if ( !(stream_LT.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_LT.hasNext() ) {
                                    adaptor.addChild(root_1, 
                                    stream_LT.nextNode()
                                    );

                                }
                                stream_LT.reset();

                                adaptor.addChild(root_1, stream_iblock.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Pass.g:212:9: 'while' bool ( LT )+ iblock
                    {
                    string_literal79=(Token)match(input,63,FOLLOW_63_in_control1261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(string_literal79);


                    pushFollow(FOLLOW_bool_in_control1263);
                    bool80=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bool.add(bool80.getTree());

                    // Pass.g:212:22: ( LT )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==LT) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // Pass.g:212:22: LT
                    	    {
                    	    LT81=(Token)match(input,LT,FOLLOW_LT_in_control1265); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT81);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    pushFollow(FOLLOW_iblock_in_control1268);
                    iblock82=iblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iblock.add(iblock82.getTree());

                    // AST REWRITE
                    // elements: bool, iblock, LT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:33: -> ^( WHILE bool ( LT )+ iblock )
                    {
                        // Pass.g:212:36: ^( WHILE bool ( LT )+ iblock )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(WHILE, "WHILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_bool.nextTree());

                        if ( !(stream_LT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_LT.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_LT.nextNode()
                            );

                        }
                        stream_LT.reset();

                        adaptor.addChild(root_1, stream_iblock.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Pass.g:213:9: 'if' bool ( LT )+ iblock ( ( LT )+ else_test )?
                    {
                    string_literal83=(Token)match(input,60,FOLLOW_60_in_control1291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal83);


                    pushFollow(FOLLOW_bool_in_control1293);
                    bool84=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bool.add(bool84.getTree());

                    // Pass.g:213:19: ( LT )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==LT) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Pass.g:213:19: LT
                    	    {
                    	    LT85=(Token)match(input,LT,FOLLOW_LT_in_control1295); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT85);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    pushFollow(FOLLOW_iblock_in_control1298);
                    iblock86=iblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iblock.add(iblock86.getTree());

                    // Pass.g:213:30: ( ( LT )+ else_test )?
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // Pass.g:213:31: ( LT )+ else_test
                            {
                            // Pass.g:213:31: ( LT )+
                            int cnt35=0;
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==LT) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // Pass.g:213:31: LT
                            	    {
                            	    LT87=(Token)match(input,LT,FOLLOW_LT_in_control1301); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_LT.add(LT87);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt35 >= 1 ) break loop35;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(35, input);
                                        throw eee;
                                }
                                cnt35++;
                            } while (true);


                            pushFollow(FOLLOW_else_test_in_control1304);
                            else_test88=else_test();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_test.add(else_test88.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: bool, LT, else_test, iblock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 213:47: -> ^( IF_CONDITIONS ^( IF bool ( LT )+ iblock ) ( else_test )* )
                    {
                        // Pass.g:213:50: ^( IF_CONDITIONS ^( IF bool ( LT )+ iblock ) ( else_test )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IF_CONDITIONS, "IF_CONDITIONS")
                        , root_1);

                        // Pass.g:213:66: ^( IF bool ( LT )+ iblock )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(IF, "IF")
                        , root_2);

                        adaptor.addChild(root_2, stream_bool.nextTree());

                        if ( !(stream_LT.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_LT.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_LT.nextNode()
                            );

                        }
                        stream_LT.reset();

                        adaptor.addChild(root_2, stream_iblock.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // Pass.g:213:88: ( else_test )*
                        while ( stream_else_test.hasNext() ) {
                            adaptor.addChild(root_1, stream_else_test.nextTree());

                        }
                        stream_else_test.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "control"


    public static class else_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_body"
    // Pass.g:216:1: else_body : ( return_stmt LT | LT iblock );
    public final PassParser.else_body_return else_body() throws RecognitionException {
        PassParser.else_body_return retval = new PassParser.else_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT90=null;
        Token LT91=null;
        PassParser.return_stmt_return return_stmt89 =null;

        PassParser.iblock_return iblock92 =null;


        Object LT90_tree=null;
        Object LT91_tree=null;

        try {
            // Pass.g:217:2: ( return_stmt LT | LT iblock )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            else if ( (LA38_0==LT) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // Pass.g:217:4: return_stmt LT
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_else_body1344);
                    return_stmt89=return_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_stmt89.getTree());

                    LT90=(Token)match(input,LT,FOLLOW_LT_in_else_body1346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT90_tree = 
                    (Object)adaptor.create(LT90)
                    ;
                    adaptor.addChild(root_0, LT90_tree);
                    }

                    }
                    break;
                case 2 :
                    // Pass.g:218:4: LT iblock
                    {
                    root_0 = (Object)adaptor.nil();


                    LT91=(Token)match(input,LT,FOLLOW_LT_in_else_body1351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT91_tree = 
                    (Object)adaptor.create(LT91)
                    ;
                    adaptor.addChild(root_0, LT91_tree);
                    }

                    pushFollow(FOLLOW_iblock_in_else_body1353);
                    iblock92=iblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iblock92.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_body"


    public static class else_if_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_if_body"
    // Pass.g:221:1: else_if_body : ( return_stmt | LT iblock );
    public final PassParser.else_if_body_return else_if_body() throws RecognitionException {
        PassParser.else_if_body_return retval = new PassParser.else_if_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT94=null;
        PassParser.return_stmt_return return_stmt93 =null;

        PassParser.iblock_return iblock95 =null;


        Object LT94_tree=null;

        try {
            // Pass.g:222:2: ( return_stmt | LT iblock )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==62) ) {
                alt39=1;
            }
            else if ( (LA39_0==LT) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Pass.g:222:5: return_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_else_if_body1365);
                    return_stmt93=return_stmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_stmt93.getTree());

                    }
                    break;
                case 2 :
                    // Pass.g:223:4: LT iblock
                    {
                    root_0 = (Object)adaptor.nil();


                    LT94=(Token)match(input,LT,FOLLOW_LT_in_else_if_body1370); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT94_tree = 
                    (Object)adaptor.create(LT94)
                    ;
                    adaptor.addChild(root_0, LT94_tree);
                    }

                    pushFollow(FOLLOW_iblock_in_else_if_body1372);
                    iblock95=iblock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iblock95.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_if_body"


    public static class else_test_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_test"
    // Pass.g:227:1: else_test : ( ( 'else if' )=> 'else if' bool else_if_body ( ( LT )+ else_test )? -> ^( ELSE_IF bool else_if_body ) ( ( LT )+ else_test )* | 'else' else_body -> ^( ELSE else_body ) );
    public final PassParser.else_test_return else_test() throws RecognitionException {
        PassParser.else_test_return retval = new PassParser.else_test_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal96=null;
        Token LT99=null;
        Token string_literal101=null;
        PassParser.bool_return bool97 =null;

        PassParser.else_if_body_return else_if_body98 =null;

        PassParser.else_test_return else_test100 =null;

        PassParser.else_body_return else_body102 =null;


        Object string_literal96_tree=null;
        Object LT99_tree=null;
        Object string_literal101_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_else_test=new RewriteRuleSubtreeStream(adaptor,"rule else_test");
        RewriteRuleSubtreeStream stream_else_if_body=new RewriteRuleSubtreeStream(adaptor,"rule else_if_body");
        RewriteRuleSubtreeStream stream_bool=new RewriteRuleSubtreeStream(adaptor,"rule bool");
        RewriteRuleSubtreeStream stream_else_body=new RewriteRuleSubtreeStream(adaptor,"rule else_body");
        try {
            // Pass.g:228:5: ( ( 'else if' )=> 'else if' bool else_if_body ( ( LT )+ else_test )? -> ^( ELSE_IF bool else_if_body ) ( ( LT )+ else_test )* | 'else' else_body -> ^( ELSE else_body ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) && (synpred3_Pass())) {
                alt42=1;
            }
            else if ( (LA42_0==58) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // Pass.g:228:7: ( 'else if' )=> 'else if' bool else_if_body ( ( LT )+ else_test )?
                    {
                    string_literal96=(Token)match(input,57,FOLLOW_57_in_else_test1393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal96);


                    pushFollow(FOLLOW_bool_in_else_test1395);
                    bool97=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_bool.add(bool97.getTree());

                    pushFollow(FOLLOW_else_if_body_in_else_test1397);
                    else_if_body98=else_if_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_else_if_body.add(else_if_body98.getTree());

                    // Pass.g:228:49: ( ( LT )+ else_test )?
                    int alt41=2;
                    alt41 = dfa41.predict(input);
                    switch (alt41) {
                        case 1 :
                            // Pass.g:228:50: ( LT )+ else_test
                            {
                            // Pass.g:228:50: ( LT )+
                            int cnt40=0;
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( (LA40_0==LT) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // Pass.g:228:50: LT
                            	    {
                            	    LT99=(Token)match(input,LT,FOLLOW_LT_in_else_test1400); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_LT.add(LT99);


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt40 >= 1 ) break loop40;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(40, input);
                                        throw eee;
                                }
                                cnt40++;
                            } while (true);


                            pushFollow(FOLLOW_else_test_in_else_test1403);
                            else_test100=else_test();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_else_test.add(else_test100.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: else_if_body, LT, else_test, bool
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 228:66: -> ^( ELSE_IF bool else_if_body ) ( ( LT )+ else_test )*
                    {
                        // Pass.g:228:69: ^( ELSE_IF bool else_if_body )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ELSE_IF, "ELSE_IF")
                        , root_1);

                        adaptor.addChild(root_1, stream_bool.nextTree());

                        adaptor.addChild(root_1, stream_else_if_body.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        // Pass.g:228:97: ( ( LT )+ else_test )*
                        while ( stream_else_test.hasNext() ) {
                            if ( !(stream_LT.hasNext()) ) {
                                throw new RewriteEarlyExitException();
                            }
                            while ( stream_LT.hasNext() ) {
                                adaptor.addChild(root_0, 
                                stream_LT.nextNode()
                                );

                            }
                            stream_LT.reset();

                            adaptor.addChild(root_0, stream_else_test.nextTree());

                        }
                        stream_else_test.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Pass.g:229:7: 'else' else_body
                    {
                    string_literal101=(Token)match(input,58,FOLLOW_58_in_else_test1430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(string_literal101);


                    pushFollow(FOLLOW_else_body_in_else_test1432);
                    else_body102=else_body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_else_body.add(else_body102.getTree());

                    // AST REWRITE
                    // elements: else_body
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:24: -> ^( ELSE else_body )
                    {
                        // Pass.g:229:27: ^( ELSE else_body )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ELSE, "ELSE")
                        , root_1);

                        adaptor.addChild(root_1, stream_else_body.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_test"


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // Pass.g:233:1: assign : ( '=' ( expr | dictionary_definition | array_definition ) | ARITH_ASSIGN bool );
    public final PassParser.assign_return assign() throws RecognitionException {
        PassParser.assign_return retval = new PassParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal103=null;
        Token ARITH_ASSIGN107=null;
        PassParser.expr_return expr104 =null;

        PassParser.dictionary_definition_return dictionary_definition105 =null;

        PassParser.array_definition_return array_definition106 =null;

        PassParser.bool_return bool108 =null;


        Object char_literal103_tree=null;
        Object ARITH_ASSIGN107_tree=null;

        try {
            // Pass.g:234:5: ( '=' ( expr | dictionary_definition | array_definition ) | ARITH_ASSIGN bool )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            else if ( (LA44_0==ARITH_ASSIGN) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // Pass.g:234:9: '=' ( expr | dictionary_definition | array_definition )
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal103=(Token)match(input,52,FOLLOW_52_in_assign1464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal103_tree = 
                    (Object)adaptor.create(char_literal103)
                    ;
                    adaptor.addChild(root_0, char_literal103_tree);
                    }

                    // Pass.g:234:13: ( expr | dictionary_definition | array_definition )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case ID:
                    case NUMBER:
                    case STRING:
                    case 43:
                    case 56:
                    case 62:
                        {
                        alt43=1;
                        }
                        break;
                    case 64:
                        {
                        alt43=2;
                        }
                        break;
                    case 53:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;

                    }

                    switch (alt43) {
                        case 1 :
                            // Pass.g:234:14: expr
                            {
                            pushFollow(FOLLOW_expr_in_assign1467);
                            expr104=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr104.getTree());

                            }
                            break;
                        case 2 :
                            // Pass.g:234:19: dictionary_definition
                            {
                            pushFollow(FOLLOW_dictionary_definition_in_assign1469);
                            dictionary_definition105=dictionary_definition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dictionary_definition105.getTree());

                            }
                            break;
                        case 3 :
                            // Pass.g:234:41: array_definition
                            {
                            pushFollow(FOLLOW_array_definition_in_assign1471);
                            array_definition106=array_definition();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, array_definition106.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Pass.g:235:9: ARITH_ASSIGN bool
                    {
                    root_0 = (Object)adaptor.nil();


                    ARITH_ASSIGN107=(Token)match(input,ARITH_ASSIGN,FOLLOW_ARITH_ASSIGN_in_assign1482); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ARITH_ASSIGN107_tree = 
                    (Object)adaptor.create(ARITH_ASSIGN107)
                    ;
                    adaptor.addChild(root_0, ARITH_ASSIGN107_tree);
                    }

                    pushFollow(FOLLOW_bool_in_assign1484);
                    bool108=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool108.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class dictionary_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dictionary_definition"
    // Pass.g:238:1: dictionary_definition : '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' -> ^( DICTIONARY_DECLARATION ( dictionary_entry )* ) ;
    public final PassParser.dictionary_definition_return dictionary_definition() throws RecognitionException {
        PassParser.dictionary_definition_return retval = new PassParser.dictionary_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal113=null;
        PassParser.dictionary_entry_return dictionary_entry110 =null;

        PassParser.dictionary_entry_return dictionary_entry112 =null;


        Object char_literal109_tree=null;
        Object char_literal111_tree=null;
        Object char_literal113_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_dictionary_entry=new RewriteRuleSubtreeStream(adaptor,"rule dictionary_entry");
        try {
            // Pass.g:239:5: ( '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}' -> ^( DICTIONARY_DECLARATION ( dictionary_entry )* ) )
            // Pass.g:239:9: '{' ( dictionary_entry ( ',' dictionary_entry )* )? '}'
            {
            char_literal109=(Token)match(input,64,FOLLOW_64_in_dictionary_definition1503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_64.add(char_literal109);


            // Pass.g:239:13: ( dictionary_entry ( ',' dictionary_entry )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Pass.g:239:14: dictionary_entry ( ',' dictionary_entry )*
                    {
                    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition1506);
                    dictionary_entry110=dictionary_entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dictionary_entry.add(dictionary_entry110.getTree());

                    // Pass.g:239:31: ( ',' dictionary_entry )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==47) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // Pass.g:239:32: ',' dictionary_entry
                    	    {
                    	    char_literal111=(Token)match(input,47,FOLLOW_47_in_dictionary_definition1509); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_47.add(char_literal111);


                    	    pushFollow(FOLLOW_dictionary_entry_in_dictionary_definition1511);
                    	    dictionary_entry112=dictionary_entry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_dictionary_entry.add(dictionary_entry112.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal113=(Token)match(input,65,FOLLOW_65_in_dictionary_definition1517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_65.add(char_literal113);


            // AST REWRITE
            // elements: dictionary_entry
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 239:61: -> ^( DICTIONARY_DECLARATION ( dictionary_entry )* )
            {
                // Pass.g:239:64: ^( DICTIONARY_DECLARATION ( dictionary_entry )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DICTIONARY_DECLARATION, "DICTIONARY_DECLARATION")
                , root_1);

                // Pass.g:239:89: ( dictionary_entry )*
                while ( stream_dictionary_entry.hasNext() ) {
                    adaptor.addChild(root_1, stream_dictionary_entry.nextTree());

                }
                stream_dictionary_entry.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dictionary_definition"


    public static class dictionary_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dictionary_entry"
    // Pass.g:242:1: dictionary_entry : ID ':' atom -> ^( DICTIONARY_DEFINITION ID atom ) ;
    public final PassParser.dictionary_entry_return dictionary_entry() throws RecognitionException {
        PassParser.dictionary_entry_return retval = new PassParser.dictionary_entry_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID114=null;
        Token char_literal115=null;
        PassParser.atom_return atom116 =null;


        Object ID114_tree=null;
        Object char_literal115_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // Pass.g:243:5: ( ID ':' atom -> ^( DICTIONARY_DEFINITION ID atom ) )
            // Pass.g:243:9: ID ':' atom
            {
            ID114=(Token)match(input,ID,FOLLOW_ID_in_dictionary_entry1545); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID114);


            char_literal115=(Token)match(input,51,FOLLOW_51_in_dictionary_entry1547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal115);


            pushFollow(FOLLOW_atom_in_dictionary_entry1549);
            atom116=atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_atom.add(atom116.getTree());

            // AST REWRITE
            // elements: atom, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:21: -> ^( DICTIONARY_DEFINITION ID atom )
            {
                // Pass.g:243:24: ^( DICTIONARY_DEFINITION ID atom )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DICTIONARY_DEFINITION, "DICTIONARY_DEFINITION")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_atom.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dictionary_entry"


    public static class array_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_definition"
    // Pass.g:246:1: array_definition : '[' ( argument ( ',' argument )* )? ']' -> ^( ARRAY_DECLARATION ( argument )* ) ;
    public final PassParser.array_definition_return array_definition() throws RecognitionException {
        PassParser.array_definition_return retval = new PassParser.array_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal117=null;
        Token char_literal119=null;
        Token char_literal121=null;
        PassParser.argument_return argument118 =null;

        PassParser.argument_return argument120 =null;


        Object char_literal117_tree=null;
        Object char_literal119_tree=null;
        Object char_literal121_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");
        try {
            // Pass.g:247:5: ( '[' ( argument ( ',' argument )* )? ']' -> ^( ARRAY_DECLARATION ( argument )* ) )
            // Pass.g:247:9: '[' ( argument ( ',' argument )* )? ']'
            {
            char_literal117=(Token)match(input,53,FOLLOW_53_in_array_definition1582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal117);


            // Pass.g:247:13: ( argument ( ',' argument )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID||(LA48_0 >= LT && LA48_0 <= NUMBER)||LA48_0==STRING||LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // Pass.g:247:14: argument ( ',' argument )*
                    {
                    pushFollow(FOLLOW_argument_in_array_definition1585);
                    argument118=argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_argument.add(argument118.getTree());

                    // Pass.g:247:23: ( ',' argument )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==47) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // Pass.g:247:24: ',' argument
                    	    {
                    	    char_literal119=(Token)match(input,47,FOLLOW_47_in_array_definition1588); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_47.add(char_literal119);


                    	    pushFollow(FOLLOW_argument_in_array_definition1590);
                    	    argument120=argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_argument.add(argument120.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal121=(Token)match(input,54,FOLLOW_54_in_array_definition1596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal121);


            // AST REWRITE
            // elements: argument
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 247:45: -> ^( ARRAY_DECLARATION ( argument )* )
            {
                // Pass.g:247:48: ^( ARRAY_DECLARATION ( argument )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARRAY_DECLARATION, "ARRAY_DECLARATION")
                , root_1);

                // Pass.g:247:68: ( argument )*
                while ( stream_argument.hasNext() ) {
                    adaptor.addChild(root_1, stream_argument.nextTree());

                }
                stream_argument.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_definition"


    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // Pass.g:250:1: argument : ( LT )? bool ;
    public final PassParser.argument_return argument() throws RecognitionException {
        PassParser.argument_return retval = new PassParser.argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LT122=null;
        PassParser.bool_return bool123 =null;


        Object LT122_tree=null;

        try {
            // Pass.g:251:5: ( ( LT )? bool )
            // Pass.g:251:9: ( LT )? bool
            {
            root_0 = (Object)adaptor.nil();


            // Pass.g:251:9: ( LT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==LT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Pass.g:251:9: LT
                    {
                    LT122=(Token)match(input,LT,FOLLOW_LT_in_argument1628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LT122_tree = 
                    (Object)adaptor.create(LT122)
                    ;
                    adaptor.addChild(root_0, LT122_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_bool_in_argument1631);
            bool123=bool();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bool123.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"

    // $ANTLR start synpred1_Pass
    public final void synpred1_Pass_fragment() throws RecognitionException {
        // Pass.g:126:9: ( ID ( access )* ( '=' | ARITH_ASSIGN ) )
        // Pass.g:126:10: ID ( access )* ( '=' | ARITH_ASSIGN )
        {
        match(input,ID,FOLLOW_ID_in_synpred1_Pass277); if (state.failed) return ;

        // Pass.g:126:13: ( access )*
        loop50:
        do {
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49||LA50_0==53) ) {
                alt50=1;
            }


            switch (alt50) {
        	case 1 :
        	    // Pass.g:126:13: access
        	    {
        	    pushFollow(FOLLOW_access_in_synpred1_Pass279);
        	    access();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop50;
            }
        } while (true);


        if ( input.LA(1)==ARITH_ASSIGN||input.LA(1)==52 ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred1_Pass

    // $ANTLR start synpred2_Pass
    public final void synpred2_Pass_fragment() throws RecognitionException {
        // Pass.g:144:9: ( args '~' )
        // Pass.g:144:10: args '~'
        {
        pushFollow(FOLLOW_args_in_synpred2_Pass432);
        args();

        state._fsp--;
        if (state.failed) return ;

        match(input,66,FOLLOW_66_in_synpred2_Pass434); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Pass

    // $ANTLR start synpred3_Pass
    public final void synpred3_Pass_fragment() throws RecognitionException {
        // Pass.g:228:7: ( 'else if' )
        // Pass.g:228:8: 'else if'
        {
        match(input,57,FOLLOW_57_in_synpred3_Pass1389); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Pass

    // Delegated rules

    public final boolean synpred3_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Pass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Pass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA13_eotS =
        "\13\uffff";
    static final String DFA13_eofS =
        "\1\uffff\1\3\7\uffff\2\3";
    static final String DFA13_minS =
        "\1\34\1\5\2\uffff\1\41\1\34\2\uffff\1\66\2\5";
    static final String DFA13_maxS =
        "\2\76\2\uffff\1\41\1\34\2\uffff\1\66\2\76";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\2\1\3\uffff";
    static final String DFA13_specialS =
        "\1\uffff\1\2\7\uffff\1\1\1\0}>";
    static final String[] DFA13_transitionS = {
            "\1\1\4\uffff\1\3\4\uffff\1\3\4\uffff\1\3\14\uffff\1\2\5\uffff"+
            "\1\2",
            "\1\7\3\uffff\1\3\1\uffff\1\3\24\uffff\1\3\11\uffff\7\3\1\5"+
            "\1\3\1\uffff\1\6\1\4\2\3\6\uffff\1\3",
            "",
            "",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\7\3\uffff\1\3\1\uffff\1\3\24\uffff\1\3\11\uffff\7\3\1\5"+
            "\1\3\1\uffff\1\6\1\4\2\3\6\uffff\1\3",
            "\1\7\3\uffff\1\3\1\uffff\1\3\24\uffff\1\3\11\uffff\7\3\1\5"+
            "\1\3\1\uffff\1\6\1\4\2\3\6\uffff\1\3"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "126:1: expr : ( ( ID ( access )* ( '=' | ARITH_ASSIGN ) )=> ID ( access )* assign -> ^( ASSIGNMENT ^( ID ( access )* ) assign ) | short_stmt | bool );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA13_10==52) && (synpred1_Pass())) {s = 6;}

                        else if ( (LA13_10==ARITH_ASSIGN) && (synpred1_Pass())) {s = 7;}

                        else if ( (LA13_10==53) ) {s = 4;}

                        else if ( (LA13_10==49) ) {s = 5;}

                        else if ( (LA13_10==EOF||LA13_10==BOP||LA13_10==CMP||LA13_10==LT||(LA13_10 >= 42 && LA13_10 <= 48)||LA13_10==50||(LA13_10 >= 54 && LA13_10 <= 55)||LA13_10==62) ) {s = 3;}

                         
                        input.seek(index13_10);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA13_9==52) && (synpred1_Pass())) {s = 6;}

                        else if ( (LA13_9==ARITH_ASSIGN) && (synpred1_Pass())) {s = 7;}

                        else if ( (LA13_9==53) ) {s = 4;}

                        else if ( (LA13_9==49) ) {s = 5;}

                        else if ( (LA13_9==EOF||LA13_9==BOP||LA13_9==CMP||LA13_9==LT||(LA13_9 >= 42 && LA13_9 <= 48)||LA13_9==50||(LA13_9 >= 54 && LA13_9 <= 55)||LA13_9==62) ) {s = 3;}

                         
                        input.seek(index13_9);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA13_1==53) ) {s = 4;}

                        else if ( (LA13_1==49) ) {s = 5;}

                        else if ( (LA13_1==52) && (synpred1_Pass())) {s = 6;}

                        else if ( (LA13_1==ARITH_ASSIGN) && (synpred1_Pass())) {s = 7;}

                        else if ( (LA13_1==EOF||LA13_1==BOP||LA13_1==CMP||LA13_1==LT||(LA13_1 >= 42 && LA13_1 <= 48)||LA13_1==50||(LA13_1 >= 54 && LA13_1 <= 55)||LA13_1==62) ) {s = 3;}

                         
                        input.seek(index13_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA36_eotS =
        "\4\uffff";
    static final String DFA36_eofS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA36_minS =
        "\1\40\1\15\2\uffff";
    static final String DFA36_maxS =
        "\1\40\1\77\2\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA36_specialS =
        "\4\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1",
            "\1\3\16\uffff\1\3\3\uffff\1\1\1\3\4\uffff\1\3\4\uffff\1\3\14"+
            "\uffff\1\3\2\2\2\3\1\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "213:30: ( ( LT )+ else_test )?";
        }
    }
    static final String DFA41_eotS =
        "\4\uffff";
    static final String DFA41_eofS =
        "\1\uffff\1\3\2\uffff";
    static final String DFA41_minS =
        "\1\40\1\15\2\uffff";
    static final String DFA41_maxS =
        "\1\40\1\77\2\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA41_specialS =
        "\4\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1",
            "\1\3\16\uffff\1\3\3\uffff\1\1\1\3\4\uffff\1\3\4\uffff\1\3\14"+
            "\uffff\1\3\2\2\2\3\1\uffff\2\3",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "228:49: ( ( LT )+ else_test )?";
        }
    }
 

    public static final BitSet FOLLOW_block_in_prog51 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_block80 = new BitSet(new long[]{0xD900084310000002L});
    public static final BitSet FOLLOW_stmt_in_block83 = new BitSet(new long[]{0xD900084210000002L});
    public static final BitSet FOLLOW_expr_in_stmt102 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_stmt105 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_EOF_in_stmt108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_control_in_stmt119 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_stmt121 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_INDENT_in_iblock148 = new BitSet(new long[]{0xD900084310002000L});
    public static final BitSet FOLLOW_block_in_iblock150 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DEDENT_in_iblock152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_args174 = new BitSet(new long[]{0x0000184310000000L});
    public static final BitSet FOLLOW_argument_in_args177 = new BitSet(new long[]{0x0000900100000000L});
    public static final BitSet FOLLOW_47_in_args180 = new BitSet(new long[]{0x0000084310000000L});
    public static final BitSet FOLLOW_argument_in_args182 = new BitSet(new long[]{0x0000900100000000L});
    public static final BitSet FOLLOW_LT_in_args189 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_44_in_args193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_func220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_func222 = new BitSet(new long[]{0x4100084310000000L});
    public static final BitSet FOLLOW_expr_in_func225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_func243 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_iblock_in_func245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr290 = new BitSet(new long[]{0x0032000000000020L});
    public static final BitSet FOLLOW_access_in_expr292 = new BitSet(new long[]{0x0032000000000020L});
    public static final BitSet FOLLOW_assign_in_expr295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_short_stmt_in_expr320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_expr330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_short_stmt349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_stmt_in_short_stmt359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_break_stmt382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_return_stmt407 = new BitSet(new long[]{0x0000084310000000L});
    public static final BitSet FOLLOW_argument_in_return_stmt409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_in_bool438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logic_in_bool449 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_CMP_in_bool469 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_logic_in_bool471 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_eval_in_logic507 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_BOP_in_logic524 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_eval_in_logic526 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_term_in_eval558 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_46_in_eval572 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_term_in_eval574 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_48_in_eval598 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_term_in_eval600 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_exponent_in_term640 = new BitSet(new long[]{0x0004240000000002L});
    public static final BitSet FOLLOW_45_in_term654 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_exponent_in_term656 = new BitSet(new long[]{0x0004240000000002L});
    public static final BitSet FOLLOW_50_in_term679 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_exponent_in_term681 = new BitSet(new long[]{0x0004240000000002L});
    public static final BitSet FOLLOW_42_in_term704 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_exponent_in_term706 = new BitSet(new long[]{0x0004240000000002L});
    public static final BitSet FOLLOW_factor_in_exponent737 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_exponent747 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_factor_in_exponent749 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_modable_in_factor782 = new BitSet(new long[]{0x0022080000000002L});
    public static final BitSet FOLLOW_args_in_factor799 = new BitSet(new long[]{0x0022080000000002L});
    public static final BitSet FOLLOW_array_access_in_factor824 = new BitSet(new long[]{0x0022080000000002L});
    public static final BitSet FOLLOW_dictionary_access_in_factor849 = new BitSet(new long[]{0x0022080000000002L});
    public static final BitSet FOLLOW_atom_in_factor884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_array_access900 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NUMBER_in_array_access902 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_array_access904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_dictionary_access921 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_dictionary_access925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_access_in_access946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_access_in_access956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_mod971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_mod981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_modable1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_modable1014 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_bool_in_modable1016 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_modable1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_control1065 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_control1069 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_control1071 = new BitSet(new long[]{0x0020000010000000L});
    public static final BitSet FOLLOW_ID_in_control1086 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_args_in_control1088 = new BitSet(new long[]{0x0000080100000000L});
    public static final BitSet FOLLOW_LT_in_control1091 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_iblock_in_control1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_control1132 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_access_in_control1134 = new BitSet(new long[]{0x0022000100000000L});
    public static final BitSet FOLLOW_LT_in_control1137 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_iblock_in_control1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_control1177 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_control1179 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_iblock_in_control1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_control1215 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_control1217 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_iblock_in_control1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_control1261 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_bool_in_control1263 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_control1265 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_iblock_in_control1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_control1291 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_bool_in_control1293 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_control1295 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_iblock_in_control1298 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LT_in_control1301 = new BitSet(new long[]{0x0600000100000000L});
    public static final BitSet FOLLOW_else_test_in_control1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_body1344 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_LT_in_else_body1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_body1351 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_iblock_in_else_body1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_else_if_body1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_else_if_body1370 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_iblock_in_else_if_body1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_else_test1393 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_bool_in_else_test1395 = new BitSet(new long[]{0x4000000100000000L});
    public static final BitSet FOLLOW_else_if_body_in_else_test1397 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_LT_in_else_test1400 = new BitSet(new long[]{0x0600000100000000L});
    public static final BitSet FOLLOW_else_test_in_else_test1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_else_test1430 = new BitSet(new long[]{0x4000000100000000L});
    public static final BitSet FOLLOW_else_body_in_else_test1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_assign1464 = new BitSet(new long[]{0x4120084210000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_assign1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_definition_in_assign1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_definition_in_assign1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_ASSIGN_in_assign1482 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_bool_in_assign1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_dictionary_definition1503 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition1506 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_dictionary_definition1509 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_dictionary_entry_in_dictionary_definition1511 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_dictionary_definition1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_dictionary_entry1545 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_dictionary_entry1547 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_atom_in_dictionary_entry1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_array_definition1582 = new BitSet(new long[]{0x0040084310000000L});
    public static final BitSet FOLLOW_argument_in_array_definition1585 = new BitSet(new long[]{0x0040800000000000L});
    public static final BitSet FOLLOW_47_in_array_definition1588 = new BitSet(new long[]{0x0000084310000000L});
    public static final BitSet FOLLOW_argument_in_array_definition1590 = new BitSet(new long[]{0x0040800000000000L});
    public static final BitSet FOLLOW_54_in_array_definition1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_argument1628 = new BitSet(new long[]{0x0000084210000000L});
    public static final BitSet FOLLOW_bool_in_argument1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_synpred1_Pass277 = new BitSet(new long[]{0x0032000000000020L});
    public static final BitSet FOLLOW_access_in_synpred1_Pass279 = new BitSet(new long[]{0x0032000000000020L});
    public static final BitSet FOLLOW_set_in_synpred1_Pass282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_synpred2_Pass432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_synpred2_Pass434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred3_Pass1389 = new BitSet(new long[]{0x0000000000000002L});

}