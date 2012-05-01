import javax.xml.soap.Node;
import java.util.HashMap;


//todo check node inheritance behavior 
public class CodeOptimizer {
    private static final String LOG = "log";
    private static final String CONSOLE_LOG = "console.log";
    private static final String TAG = "tag";
    private static final String STDLIB_TAG = "stdlib.tag";
    private static final String CONTAINS = "contains";
    private static final String STDLIB_CONTAINS = "stdlib.contains";
    private static final String UNTAG = "untag";
    private static final String STDLIB_UNTAG = "stdlib.untag";
    private static final String TAGS = "tags";
    private static final String STDLIB_TAGS = "stdlib.tags";
    private static final String CONNS = "conns";
    private static final String STDLIB_CONNS = "stdlib.conns";
    private static final String RIGHT_PAREN = ")";
    private static final String WHITE_SPACE = " ";
    private static final String EMPTY_STRING = "";

    private boolean stdLibFunctionsCalled = false;
    private static HashMap<String, String> stdLibMembers = new HashMap<String, String>();
    //the dir needs to be modified later
    private static final String jsIncludeString = "var stdlib = require('../lib/stdlib.js');\n\n";
    private boolean errors = false;
    private boolean warnings = false;

    public CodeOptimizer() {
        stdLibMembers.put(LOG, EMPTY_STRING);
        stdLibMembers.put(TAG, EMPTY_STRING);
        stdLibMembers.put(TAGS, EMPTY_STRING);
        stdLibMembers.put(CONTAINS, EMPTY_STRING);
        stdLibMembers.put(CONNS, EMPTY_STRING);
        stdLibMembers.put(UNTAG, EMPTY_STRING);
    }

    public boolean hasErrors() {
        return errors;
    }

    public boolean hasWarnings() {
        return warnings;
    }

    public void IBLOCK(PassNode n) {

    }

    // n.child(0) + n.getText + n.child(1)
    public void GENERIC_OP(PassNode n) {
    }

    public void DICT_ACCESS(PassNode n) {
    }

    public void ASSIGNMENT(PassNode n) {

    }

    public void PROG(PassNode n) {
    }


    //if a variable is defined as an argument to the function, don't add var to it
    public void FUNCTION(PassNode n) {
        n = (PassNode) n.getChild(0);
        for (int i = 0; i < n.getChildCount(); i++) {
            n.setDefined(n.getChild(i).getText());
        }
    }

    public void WHILE(PassNode n) {
    }

    //for
    public void FOR(PassNode n) {
    }

    public void ARRAY_DECLARATION(PassNode n) {
    }

    //arrayName accessElement, accessELEMENT....
    public void ARRAY_ACCESS(PassNode n) {

    }

    //parent of dict_declar
    public void DICTIONARY_DEFINITION(PassNode n) {
    }       //child of dict_def

    public void DICTIONARY_DECLARATION(PassNode n) {
    }

    public void IF(PassNode n) {
    }

    public void LT(PassNode n) {
        PassNode parent = (PassNode) n.getParent();
        if (parent.getChildCount() == 1) {
            parent.deleteChild(0);


        }
    }

    public void ELSE(PassNode n) {
    }

    public void ELSE_IF(PassNode n) {
    }

    public void IF_CONDITIONS(PassNode n) {
    }

    //TODO get line numbers working
    public void removeNodesAfter(PassNode n) {
        PassNode parent = (PassNode) n.getParent();
        int i;
        for (i = 0; i < parent.getChildCount(); i++) {
            if ((PassNode) parent.getChild(i) == n)
                break;
        }
        int line = n.getLine();
        //now delete dead code
        boolean removed = false;
        for (int j = parent.getChildCount() - 1; i < j; j--) {
            if (!"LT".equals(((PassNode) parent.deleteChild(j)).getText()))
                removed = true;
        }
        if (removed == true) {
            System.out.println("Warning: line " + line + " dead code in control block after line " + line);
            warnings = true;
        }


    }

    public String genericCombine(PassNode n, String middleString) {
        return genericCombine(n, middleString, middleString);
    }

    //double check failure handling
    public String genericCombine(PassNode n, String middleString, String middleString1) {
        if (n == null || middleString == null || middleString1 == null)
            return EMPTY_STRING;

        int childCount = n.getChildCount();
        switch (childCount) {
            case 0:
                return EMPTY_STRING;
            case 1:
                return n.getChild(0).getText();
            case 2:
                return n.getChild(0).getText() + middleString + n.getChild(1).getText();
            case 3:
                return n.getChild(0).getText() + middleString + n.getChild(1).getText() + middleString1 + n.getChild(2).getText();
            default:
                String s = n.getChild(0).getText();
                for (int i = 1; i < n.getChildCount(); i++)
                    s += middleString + n.getChild(i).getText();
                return s;
        }
    }

    public void nodeDecider(PassNode n) {
        if (n == null) {
            return;
        }
        int nodeNumber = n.getType();
        switch (nodeNumber) {
            case PassParser.PROG:
                PROG(n);
                break;
            case PassParser.IBLOCK:
                IBLOCK(n);
                break;
            case PassParser.GENERIC_OP:
                GENERIC_OP(n);
                break;
            case PassParser.RETURN:
                removeNodesAfter(n);
                break;
            case PassParser.BREAK:
                removeNodesAfter(n);
                break;
            case PassParser.ARRAY_ACCESS:
                ARRAY_ACCESS(n);
                break;
            case PassParser.DICT_ACCESS:
                DICT_ACCESS(n);
                break;
            case PassParser.ASSIGNMENT:
                ASSIGNMENT(n);
                break;
            case PassParser.FUNCTION:
                FUNCTION(n);
                break;
            case PassParser.WHILE:
                WHILE(n);
                break;
            case PassParser.FOR:
                FOR(n);
                break;
            case PassParser.ARRAY_DECLARATION:
                ARRAY_DECLARATION(n);
                break;
            case PassParser.DICTIONARY_DECLARATION:
                DICTIONARY_DECLARATION(n);
                break;
            case PassParser.DICTIONARY_DEFINITION:
                DICTIONARY_DEFINITION(n);
                break;
            case PassParser.LT:
                LT(n);
                break;
            default:
                break;
        }


    }

}
