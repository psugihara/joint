/**
 * author: Rafael Castelllanos
 * PassC.java
 * This file contains the tree walker and hookups to the grammar and code 
 * generator.
 * It is the main class you use to compile Pass code
 */
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenRewriteStream;

import java.util.Scanner;
import java.util.Stack;

public class PassC {
    public static PassParser grammar;
    SecondPass gen;
    FirstPass opt;

    public void run(CharStream inputStream) throws Exception {
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
        gen = new SecondPass();
        opt = new FirstPass();
        try {
            /*generate code by walking the AST */
            walkTree1(tree);
            walkTree2(tree);
            /*tree building error  */
        } catch (java.lang.ClassCastException e) {
            System.out.println("ERROR: unable to parse input program");
            System.exit(-1);
        }

        System.out.println(tree.getText());

        if (opt.hasErrors() || gen.hasErrors())
            System.exit(-1);
        if (opt.hasWarnings() || gen.hasWarnings())
            System.exit(-2);
    }


    /*first pass */
    public void walkTree1(PassNode n) throws java.lang.ClassCastException {
        Stack<PassNode> s = new Stack<PassNode>();
        s.push(n);
        PassNode tmp = null;
        while (!s.empty()) {
            tmp = s.peek();
            for (int i = 0; i < tmp.getChildCount(); i++) {
                PassNode thisChild = (PassNode) tmp.getChild(i);
                if (!thisChild.isVisited()) {
                    s.push(thisChild);
                    break;
                }
            }
            if (tmp == s.peek()) {
                PassNode w = s.pop();
                w.setVisitedTrue();
                opt.nodeDecider(w);
            }
        }
    }

    /*second pass */
    public void walkTree2(PassNode n) {
        Stack<PassNode> s = new Stack<PassNode>();
        s.push(n);
        PassNode tmp = null;
        while (!s.empty()) {
            tmp = s.peek();
            for (int i = 0; i < tmp.getChildCount(); i++) {
                PassNode thisChild = (PassNode) tmp.getChild(i);
                if (thisChild.isVisited()) {
                    s.push(thisChild);
                    break;
                }
            }
            if (tmp == s.peek()) {
                PassNode w = s.pop();
                w.setVisitedFalse();
                String decided = gen.nodeDecider(w);
                w.setText(decided);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        PassC passCompiler = new PassC();

        /* If no arguments are present, compile input from stdin.*/
        if ((args == null || args.length == 0)) {
            Scanner lines = new Scanner(System.in);
            while (true) {
                String input = lines.nextLine();
                passCompiler.run(new ANTLRStringStream(input));
            }
        }

        if (!args[0].endsWith(".pass")) {
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
