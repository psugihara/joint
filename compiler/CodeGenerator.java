import javax.xml.soap.Node;
import java.util.HashMap;

//for has three children
//function 2 //args and
//arguments 2
// assignment
//todo check node inheritance behavior 
public class CodeGenerator {
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
    private static final String IF = "if (";
    private static final String ELSE = "else";
    private static final String ELSE_IF = "else if (";
    private static final String FOR = "for (var ";
    private static final String WHILE = "while (";
    private static final String RETURN = "return ";
    private static final String FUNCTION = "function (";
    private static final String RIGHT_PAREN = ")";
    private static final String WHITE_SPACE = " ";
    private static final String EMPTY_STRING = "";
    private boolean stdLibFunctionsCalled = false;
    private static final String jsRequire = "var pass = require('pass');\nfor (var x in pass)\n  global[x] = pass[x];\n\n";


    public String IBLOCK(PassNode n) {
        String text = genericCombine(n, EMPTY_STRING);
        text = "  " + text.replace("\n", "\n  ");
        return " {\n  " + text.trim() + "\n}";
    }

    // n.child(0) + n.getText + n.child(1)
    public String GENERIC_OP(PassNode n) {
        return genericCombine(n, WHITE_SPACE);
    }

    public String DICT_ACCESS(PassNode n) {
        return genericCombine(n, ".");
    }

    public String ASSIGNMENT(PassNode n) {
        return genericCombine(n, WHITE_SPACE);
    }

    public String PROG(PassNode n) {
        String res = EMPTY_STRING;
        for (int i = 0; i < n.getChildCount(); i++) {
            res += n.getChild(i).getText();
        }
        return (stdLibFunctionsCalled ? jsRequire : EMPTY_STRING) + res.trim();
    }

    public String ARGUMENTS(PassNode n) {
        return genericCombine(n, ", ");
    }

    public String FUNCTION(PassNode n) {

        return FUNCTION + n.getChild(0).getText() + RIGHT_PAREN + n.getChild(1).getText();
    }

    public String RETURN(PassNode n) {
        return RETURN + genericCombine(n, WHITE_SPACE);
    }

    public String WHILE(PassNode n) {
        return WHILE + genericCombine(n, RIGHT_PAREN);
    }

    //for
    public String FOR(PassNode n) {
        //for(var i in ARRAY) IBLOCK
        return FOR + genericCombine(n, " in ", RIGHT_PAREN) + "\n";

    }

    //todo this needs to be worked out on cody's end
    public String ARRAY_DECLARATION(PassNode n) {
        return "[" + genericCombine(n, ", ") + "]";
    }

    public String FUNC_CALL(PassNode n) {
        PassNode node = (PassNode) n.getChild(0);
        String funcName = node.getText();
        if (funcName == null) {
            //this should never happen
            System.out.println("FATAL ERROR: no function name ");
            System.exit(-1);
        }
        /*function transformations */
        if (funcName.equals(LOG)) {
            funcName = CONSOLE_LOG;
            stdLibFunctionsCalled = true;
        } else if (funcName.equals(TAG)) {
            funcName = STDLIB_TAG;
            stdLibFunctionsCalled = true;
        } else if (funcName.equals(CONTAINS)) {
            funcName = STDLIB_CONTAINS;
            stdLibFunctionsCalled = true;
        } else if (funcName.equals(UNTAG)) {
            funcName = STDLIB_UNTAG;
            stdLibFunctionsCalled = true;
        } else if (funcName.equals(TAGS)) {
            funcName = STDLIB_TAGS;
            stdLibFunctionsCalled = true;
        } else if (funcName.equals(CONNS)) {
            funcName = STDLIB_CONNS;
            stdLibFunctionsCalled = true;
        } /*else if (funcName.equals(EMPTY_STRING)) {
            funcName = "stdlib.";
            stdLibFunctionsCalled = true;
        }*/
        node.setText(funcName);
        n.setChild(0, node);
        String text = genericCombine(n, "(") + RIGHT_PAREN;
        return text;
    }

    //arrayName accessElement, accessELEMENT....
    public String ARRAY_ACCESS(PassNode n) {
        if (n.getText() == null || n.getChildCount() < 2)
            return EMPTY_STRING; //error
        String ret = n.getChild(0).getText();
        for (int i = 1; i <  n.getChildCount(); i++)
            ret += "[" + n.getChild(i).getText() + "]";
        return ret;
    }

    //parent of dict_declar
    public String DICTIONARY_DEFINITION(PassNode n) {
        return genericCombine(n, ":");
    }       //child of dict_def

    public String DICTIONARY_DECLARATION(PassNode n) {
        return "{" + genericCombine(n, ",") + "}";
    }

    public String IF(PassNode n) {
        return IF + n.getChild(0).getText() + RIGHT_PAREN + n.getChild(1).getText() + "\n";
    }

    public String ELSE(PassNode n) {
        return ELSE + n.getChild(0).getText() + "\n";
    }

    public String ELSE_IF(PassNode n) {
        return ELSE_IF + n.getChild(0).getText() + RIGHT_PAREN + n.getChild(1).getText() + "\n";
    }

    public String IF_CONDITIONS(PassNode n) {
        return genericCombine(n, EMPTY_STRING);
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

    public String nodeDecider(PassNode n) {
        String s;

        if (n == null) {
            return null;
        }
        int nodeNumber = n.getType();
        switch (nodeNumber) {
            case PassParser.PROG:
                s = PROG(n);
                break;
            case PassParser.IBLOCK:
                s = IBLOCK(n);
                break;
            case PassParser.GENERIC_OP:
                s = GENERIC_OP(n);
                break;
            case PassParser.RETURN:
                s = RETURN(n);
                break;
            case PassParser.ARRAY_ACCESS:
                s = ARRAY_ACCESS(n);
                break;
            case PassParser.DICT_ACCESS:
                s = DICT_ACCESS(n);
                break;
            case PassParser.ASSIGNMENT:
                s = ASSIGNMENT(n);
                break;
            case PassParser.ARGUMENTS:
                s = ARGUMENTS(n);
                break;
            case PassParser.FUNCTION:
                s = FUNCTION(n);
                break;
            case PassParser.WHILE:
                s = WHILE(n);
                break;
            case PassParser.FOR:
                s = FOR(n);
                break;
            case PassParser.ARRAY_DECLARATION:
                s = ARRAY_DECLARATION(n);
                break;
            case PassParser.FUNC_CALL:
                s = FUNC_CALL(n);
                break;
            case PassParser.DICTIONARY_DECLARATION:
                s = DICTIONARY_DECLARATION(n);
                break;
            case PassParser.DICTIONARY_DEFINITION:
                s = DICTIONARY_DEFINITION(n);
                break;
            case PassParser.LT:
                s = ";\n";
                break;
            case PassParser.IF:
                s = IF(n);
                break;
            case PassParser.ELSE:
                s = ELSE(n);
                break;
            case PassParser.ELSE_IF:
                s = ELSE_IF(n);
                break;
            case PassParser.IF_CONDITIONS:
                s = IF_CONDITIONS(n);
                break;
            case PassParser.BREAK:
                s = "break;";
                break;
            default:
                return n.getText();
        }

        return s;
    }

}
