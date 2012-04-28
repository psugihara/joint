//for has three children
//function 2 //args and
//arguments 2
// assignment

public class CodeGenerator {


    public String IBLOCK(PassNode n) {
        String text = genericCombine(n, "");
        //text = text.replace("\n","\n  ");
        return "{" + text + "}\n";
    }

    // n.child(0) + n.getText + n.child(1)
    public String GENERIC_OP(PassNode n) {
        String text;
        if ((text = n.getText()) == null)
            return "";
        return genericCombine(n, " " + text + " ");
    }


    public String DICT_ACCESS(PassNode n) {
        return genericCombine(n, ".");
    }

    public String ASSIGNMENT(PassNode n) {
        return genericCombine(n, " ");
    }


    public String ARGUMENTS(PassNode n) {
        return genericCombine(n, ", ");
    }


    public String FUNCTION(PassNode n) {
        return "function (" + genericCombine(n, ",") + ")";
    }

    public String RETURN(PassNode n) {
        return "return " + genericCombine(n, "");
    }

    public String WHILE(PassNode n) {
        return "while(" + genericCombine(n, ")");
    }

    //for
    public String FOR(PassNode n) {
        //for(var i in ARRAY) IBLOCK
        String text = "for(var " + genericCombine(n, " in ", ")");
        return null;
    }

    //todo this needs to be worked out on cody's end
    public String ARRAY_DECLARATION(PassNode n) {
        String text = "[" + genericCombine(n, ", ") + "]";
        return null;
    }

    /*todo CHECK FOR STDLIB FUNCTION CALLS*/
    public String FUNC_CALL(PassNode n) {
        String text = genericCombine(n, "(") + ")";
        return text;
    }

    //arrayName accessElement, accessELEMENTi....
    public String ARRAY_ACCESS(PassNode n) {
        if (n.getText() == null || n.getChildCount() < 2)
            return ""; //error
        String ret = n.getChild(0).getText();
        for (int i = 1; n.getChildCount() < i; i++)
            ret += "[" + n.getChild(i).getText() + "]";
        return ret;
    }

    //parent of dict_declar
    public String DICTIONARY_DEFINITION(PassNode n) {
        return "{" + genericCombine(n, ",") + "}";
    }       //child of dict_def

    public String DICTIONARY_DECLARATION(PassNode n) {
        return genericCombine(n, ":");
    }


    public String genericCombine(PassNode n, String middleString) {
        return genericCombine(n, middleString, middleString);

    }

    //double check failure handling
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
                return n.getChild(0).getText() + middleString + n.getChild(1).getText() + middleString1 + n.getChild(2).getText();
            default:
                String s = n.getChild(0).getText();
                for (int i = 1; n.getChildCount() < i; i++)
                    s += middleString + n.getChild(i);
                return s;
        }
    }                         //root


    public String nodeDecider(PassNode n) {
        String s = "";
        if (n == null) {
            return null;
        }
        int nodeNumber = n.getType();
        switch (nodeNumber) {
            case PassParser.IBLOCK:
                s = IBLOCK(n);
                break;
        /*  DONOT DELETE
            case PassParser.GENERIC_OP:
                s = GENERIC_OP(n);
                break;
            case PassParser.RETURN:
                s = RETURN(n);
                break;
      */
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
            default:
                return "";
               // System.out.println("INVALID NODE TYPE GRAMMAR FAIL");
               // System.exit(-1);
        }
        return s;
    }

}
