import org.antlr.runtime.*;

import java.util.*;

import org.antlr.runtime.tree.*;

import java.io.*;

public class PassC {
	public static PassParser grammar;
	CodeGenerator gen;
	public  void run(CharStream inputStream) throws Exception {
		PassLexer lex = new PassLexer(inputStream);
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
			if(tmp == s.peek()) {
				PassNode w = s.pop();
				w.setVisitedTrue();
				String decided = gen.nodeDecider(w);
				// System.out.println(w.text + " -> " + decided);
				w.setText(decided);
        	}
        }
    }

    public static void main(String[] args) throws Exception {
        PassC passCompiler = new PassC();

        if (args == null || args.length == 0) {
            Scanner lines = new Scanner(System.in);
            String input = "";

            while (lines.hasNext())
                input += lines.nextLine();

            passCompiler.run(new ANTLRStringStream(input));
            return;
        }

        else if (!args[0].endsWith(".pass")) {
            System.out.println(args[0] + ": Input file must be a \".pass\" file.");
            return;
        }

        try {
            passCompiler.run(new ANTLRFileStream(args[0]));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Cannot access \"" + args[0] + "\"");
            return;
        }
    }
}
