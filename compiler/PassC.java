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
		if (tree == null) {
			System.out.println("Input Rejected by grammar: no tree generated");
			System.exit(-1);
		}
		gen = new CodeGenerator();
        tree = (PassNode) tree.getChild(0);
		walkTree(tree);
		System.out.println(tree.getText());
	}

	public void walkTree(PassNode n) {
		Stack<PassNode> s = new Stack<PassNode>();
		s.push(n);
		PassNode tmp = null;
		PassNode leftMostUnvisited = null;
		while(!s.empty()){
			tmp = s.peek();
			for (int i = 0; i < tmp.getChildCount(); i++){
				PassNode thisChild = (PassNode)tmp.getChild(i);
				if(!thisChild.isVisited()){
					s.push(thisChild);
					break;
				}		
			}	
			if(tmp==s.peek()){
				PassNode w = s.pop();
				w.setVisitedTrue();
				String decided = gen.nodeDecider(w);
				System.out.println(w.text + " -> " + decided);
				w.setText(decided);
        	}
        }
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
