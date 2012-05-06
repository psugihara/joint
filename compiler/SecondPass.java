/**
 * -----------------------------------------------------------------------------
 * author: Rafael Castellanos
 * contributors: Cody, Peter
 * SecondPass.java
 * This file contains the second pass code generation rules
 *------------------------------------------------------------------------------
 */
 
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class SecondPass {
    private static final Set<String> STDLIB = new HashSet<String>(Arrays.asList(
            new String[]{"getTag", "getTags", "contains", "untag", "conns"}
    ));

    private static final Pattern variablePattern = Pattern.compile("([a-zA-Z])+[0-9_]*[a-zA-Z 0-9_]*");
    private boolean errors = false;
    private boolean warnings = false;
    private boolean stdLibFunctionsCalled = false;
    private static final String jsRequire = "var pass = require('pass');\n"
            + "for (var x in pass)\n"
            + "  global[x] = pass[x];\n";
    private int uniqueID = 0;


    public boolean hasErrors() {
        return errors;
    }

    public boolean hasWarnings() {
        return warnings;
    }

    public String IBLOCK(PassNode n) {
        String text = n.getDefinedVarNames() + genericCombine(n, "");
        text = "  " + text.replace("\n", "\n  ");
        return " {\n  " + text.trim() + "\n}";
    }

    public String GENERIC_OP(PassNode n) {
        return genericCombine(n, " ");
    }

    public String DICT_ACCESS(PassNode n) {
        return genericCombine(n, ".");
    }

    public String ASSIGNMENT(PassNode n) {
        PassNode lval = (PassNode) n.getChild(0);
        PassNode rval = (PassNode) n.getChild(2);
        String varName = lval.getText();
        int type = lval.getType();
        if (type != PassParser.DICT_ACCESS && type != PassParser.ARRAY_ACCESS && !STDLIB.contains(varName) &&
                n.isDefined(varName) == false) {
            lval.setText(varName);
            n.setChild(0, lval);
        } else if (type == PassParser.DICT_ACCESS && rval.getType() == PassParser.FUNCTION &&
                lval.getText().startsWith("server.")) {
            if (rval.getText().contains("\\bvar\\b")) {
                String[] func = rval.getText().split(";", 2);
                rval.setText(func[0] + ";\n  conn = this.conn;" + func[1]);
            } else {
                String[] func = rval.getText().split("\\{", 2);
                rval.setText(func[0] + "{\n  var conn = this.conn;" + func[1]);
            }
        }
        return genericCombine(n, " ");
    }

    public String PROG(PassNode n) {
        String res = "var server = {};\n\n";
        for (int i = 0; i < n.getChildCount(); i++) {
            res += n.getChild(i).getText();
        }
        res += "\nmodule.exports = server;";
        return (stdLibFunctionsCalled ? jsRequire : "") + n.getDefinedVarNames() + res.trim();
    }

    public String ARGUMENTS(PassNode n) {
        return genericCombine(n, ", ");
    }

    public String BPARENS(PassNode n) {
        return '(' + n.getChild(0).getText() + ')';
    }

    public String FORMAL_PARAMETERS(PassNode n) {
        return genericCombine(n, ", ");
    }

    public String NEGATION(PassNode n) {
        return '!' + n.getChild(0).getText();
    }

    public String FUNCTION(PassNode n) {
        if (n.getChild(1).getType() != PassParser.IBLOCK)
            return "function (" + n.getChild(0).getText() + ") { " + n.getChild(1).getText() + " }";
        return "function (" + n.getChild(0).getText() + ")" + n.getChild(1).getText();
    }

    public String RETURN(PassNode n) {
        String value = "";
        if (!"".equals(value = genericCombine(n, " ")))
            return "return " + value;
        return "return;";
    }

    public String WHILE(PassNode n) {
        return "while (" + genericCombine(n, ")");
    }


    public String FOR(PassNode n) {
        String iterator = n.getChild(0).getText();
        String collection = n.getChild(1).getText();
        String tmp = Integer.toString(uniqueID++);
        String body = n.getChild(2).getText();
        body = body.replaceAll("\\b" + iterator + "\\b", "__" + tmp + "[__" + iterator + "]");
        return "var __" + tmp + " = " + collection + ";\n"
                + "for (var __" + iterator + " = 0, __" + tmp + "len = __" + tmp + ".length; __" + iterator
                + " < __" + tmp + "len; __" + iterator + "++)" + body + "\n";
    }

    public String ARRAY_DECLARATION(PassNode n) {
        return "[" + genericCombine(n, ", ") + "]";
    }

    public String FUNC_CALL(PassNode n) {
        PassNode node = (PassNode) n.getChild(0);
        String funcName = node.getText();
        if (funcName == null) {
            /*this should never happen   */
            System.out.println("FATAL ERROR: no function name ");
            System.exit(-1);
        }
        /*function transformations */
        if (funcName.equals("log")) {
            funcName = "console.log";
            stdLibFunctionsCalled = true;
        }
        if (funcName.equals("num")) {
            funcName = "parseFloat";
        }
        if (funcName.equals("str")) {
            String number = n.getChild(1).getText();
            if (variablePattern.matcher(number).matches()) {
                return number + ".toString()";
            }

            return "(__num = " + number + ").toString()";
        }
        if (funcName.equals("include")) {
            funcName = "require";
        } else if (STDLIB.contains(funcName)) {
            stdLibFunctionsCalled = true;
        }
        node.setText(funcName);
        n.setChild(0, node);
        String text = genericCombine(n, "(") + ")";
        return text;
    }

    public String ARRAY_ACCESS(PassNode n) {
        if (n.getText() == null || n.getChildCount() < 2)
            return ""; /*error */
        String ret = n.getChild(0).getText();
        for (int i = 1; i < n.getChildCount(); i++)
            ret += "[" + n.getChild(i).getText() + "]";
        return ret;
    }

    public String DICTIONARY_DEFINITION(PassNode n) {
        return genericCombine(n, ":");
    }

    public String DICTIONARY_DECLARATION(PassNode n) {
        return "{" + genericCombine(n, ",") + "}";
    }

    public String IF(PassNode n) {
        return "if (" + n.getChild(0).getText() + ")" + n.getChild(1).getText() + "\n";
    }

    public String ELSE(PassNode n) {
        return "else" + n.getChild(0).getText() + "\n";
    }

    public String ELSE_IF(PassNode n) {
        return "else if (" + n.getChild(0).getText() + ")" + n.getChild(1).getText() + "\n";
    }

    public String IF_CONDITIONS(PassNode n) {
        return genericCombine(n, "");
    }

    public String genericCombine(PassNode n, String middleString) {
        return genericCombine(n, middleString, middleString);
    }

    public String genericCombine(PassNode n, String middleString, String middleString1) {
        if (n == null || middleString == null || middleString1 == null)
            return "";

        int childCount = n.getChildCount();
        switch (childCount) {
            case 0:
                return "";
            case 1:
                return n.getChild(0).getText();
            case 2:
                return n.getChild(0).getText() + middleString + n.getChild(1).getText();
            case 3:
                return n.getChild(0).getText() + middleString + n.getChild(1).getText() + middleString1 +
                        n.getChild(2).getText();
            default:
                String s = n.getChild(0).getText();
                for (int i = 1; i < n.getChildCount(); i++)
                    s += middleString + n.getChild(i).getText();
                return s;
        }
    }

    public String nodeDecider(PassNode n) {
        String s = "";

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
            case PassParser.NEGATION:
                s = NEGATION(n);
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
            case PassParser.BPARENS:
                s = BPARENS(n);
                break;
            case PassParser.ARGUMENTS:
                s = ARGUMENTS(n);
                break;
            case PassParser.FORMAL_PARAMETERS:
                s = FORMAL_PARAMETERS(n);
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
            case PassParser.EOF:
                s = "";
                break;
            default:
                return n.getText();
        }

        return s;
    }

}
