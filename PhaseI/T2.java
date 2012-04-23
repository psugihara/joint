import org.antlr.runtime.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.TokenRewriteStream;

import java.util.*;
import org.antlr.runtime.tree.*;
import java.io.*;

public class T2 {
    public static PassParser grammar;
    public static void run(String inputFile) throws Exception {
ANTLRFileStream fs = new ANTLRFileStream(inputFile);
PassLexer lex = new PassLexer(fs);
TokenRewriteStream tokens = new TokenRewriteStream(lex);
PassParser grammar = new PassParser(tokens);
PassAdaptor pass_adaptor = new  PassAdaptor();
grammar.setTreeAdaptor(pass_adaptor);
PassParser.prog_return ret = grammar.prog();
CommonTree tree = (CommonTree)ret.getTree();  
walkTree(tree,2);
//printTree(tree, 2);
    }
public static void printTree(CommonTree t, int indent) {
	if ( t != null ) {
		StringBuffer sb = new StringBuffer(indent);
		for ( int i = 0; i < indent; i++ )
			sb = sb.append("   ");
		for ( int i = 0; i < t.getChildCount(); i++ ) {
			System.out.println(sb.toString() + t.getChild(i).toString());
			printTree((CommonTree)t.getChild(i), indent+1);
		}
	}
}    
public static void walkTree(CommonTree t, int indent) {
    /**
    //An Example of what a case would be like, I used this for testing
    if(t.getType() == grammar.ASSIGNMENT)
	{
	    System.out.println("var " + t.getChild(0).getText().toString() + t.getChild(1).getText().toString() + t.getChild(2).getText().toString() + ";");

	}
    **/
    if ( t != null ) {
	System.out.println("\""+t.toString()+"\"");
		for ( int i = 0; i < t.getChildCount(); i++ ) {
			walkTree((CommonTree)t.getChild(i), indent+1);
		}
	}
}

    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) {
            System.out.println("usage: pass <INPUT_FILE.pass>\n");
            return;
        }
        if (!args[0].endsWith(".pass")) {
            System.out.println(args[0]+": Input file must be a \".pass\" file.");
            return;
        }

        try {
            run(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot access \"" + args[0] + "\"");
            return;
        }


        /* StringTemplateGroup group = new StringTemplateGroup(new FileReader("Pass.stg"));
          ANTLRInputStream in = new ANTLRInputStream(System.in);
           in= new ANTLRInputStream(new ByteArrayInputStream(("  \n"+ in.toString() + "\n").getBytes("UTF-8")));
          PassLexer lexer = new PassLexer(in);
          CommonTokenStream tokens = new CommonTokenStream(lexer);
          PassParser parser = new PassParser(tokens);
          parser.setTemplateLib(group);
          PassParser.iblock_return returnValue = parser.iblock();
          StringTemplate st = (StringTemplate)returnValue.getTemplate();
          System.out.println(st.toString());
        */
    }
}
