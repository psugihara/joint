import org.antlr.runtime.*;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.TokenRewriteStream;

import java.util.*;

import org.antlr.runtime.tree.*;

import java.io.*;

public class PassC {
    public static PassParser grammar;
CodeGenerator gen;
    public  void run(String inputFile) throws Exception {
        ANTLRFileStream fs = new ANTLRFileStream(inputFile);
        PassLexer lex = new PassLexer(fs);
        TokenRewriteStream tokens = new TokenRewriteStream(lex);
        PassParser grammar = new PassParser(tokens);
        PassAdaptor pass_adaptor = new PassAdaptor();
        grammar.setTreeAdaptor(pass_adaptor);
        PassParser.prog_return ret = grammar.prog();
        PassNode tree = (PassNode) ret.getTree();
         gen = new CodeGenerator();
        walkTree((PassNode)tree);
	System.out.println(tree.getText());
    }

//todo write iterative version of this method
    public String walkTree(PassNode n) {
        if (n == null) 
        	return "";

String s = "";
            for (int i = 0; i < n.getChildCount(); i++) {
            	PassNode thisChild = (PassNode)n.getChild(i);
            	 n.setText(walkTree(thisChild));  
          
               thisChild.setText(gen.nodeDecider(thisChild));                 	
               	n.setChild(i, thisChild);   
               	s+= thisChild.getText();
               	       //  System.out.println("S: "+thisChild.getText());
            }

            System.out.println(n.getText() + ":s:"+s);
            return s;
        
    }

    public static void main(String[] args) throws Exception {
        if (args == null || args.length == 0) {
            System.out.println("usage: pass <INPUT_FILE.pass>\n");
            return;
        }
        if (!args[0].endsWith(".pass")) {
            System.out.println(args[0] + ": Input file must be a \".pass\" file.");
            return;
        }

        try {
         PassC passCompiler = new PassC();
            passCompiler.run(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot access \"" + args[0] + "\"");
            return;
        }
    }
}
