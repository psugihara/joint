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
        PassNode node = (PassNode) n.getChild(0);
        String varName = node.getText();
        int type = 0;
        if (node != null)
            type = node.getType();
        if (varName == null) {
            //this should never happen
            System.out.println("FATAL ERROR: no function name ");
            System.exit(-1);
        } else if (type != PassParser.DICT_ACCESS && type != PassParser.ARRAY_ACCESS && !stdLibMembers.containsKey(varName) && n.isDefined(varName) == false) {
            node.setText("var " + varName);
            n.setChild(0, node);
        }
    }

    public void PROG(PassNode n) {
    }



    public void FUNCTION(PassNode n) {
  /*      n = (PassNode) n.getChild(1);
        for(int i=0; i<n.getChildCount();i++){
            System.out.println(n.getChild(i).getText());
        }
    */

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

    public void ELSE(PassNode n) {
    }

    public void ELSE_IF(PassNode n) {

    }

    public void IF_CONDITIONS(PassNode n) {
    }

    public void removeNodesAfter(PassNode n){

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
            default:
                break;
        }
    }

}
