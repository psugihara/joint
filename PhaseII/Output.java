//for has three children
//function 2 //args and
//arguments 2
// assignment

public class Output {


    private String output = "";

    public static void main(String args[]) {
        Output o = new Output();

    }

    public String IBLOCK(TestNode n) {
        String text = genericCombine(n, "");
        //text = text.replace("\n","\n  ");
        return "{" + text + "}\n";
    }

    //3 EXPR GENERIC EXPR
    public String OP(TestNode n) {
        return genericCombine(n, " ");

    }

    public String GENERIC_OP(TestNode n) {
        return genericCombine(n, " ");
    }

    //figure out case for 2d arrays later
    public String ARRAY_ACCESS(TestNode n) {
        return genericCombine(n, "[") + "]";
    }

    public String DICT_ACCESS(TestNode n) {
        return genericCombine(n, ".");
    }

    public String ASSIGN(TestNode n) {
        return genericCombine(n, " ");
    }

    //not sure what to do here
    public String LVALUE(TestNode n) {
        String text = genericCombine(n, "");
        return null;
    }

    public String ARG(TestNode n) {
        return genericCombine(n, ", ");
    }


    public String FUNC_DEF(TestNode n) {
        return "function (" + genericCombine(n, ",") + ")";
    }

    public String RETURN(TestNode n) {
        return "return " + genericCombine(n, "");
    }

    public String WHILE(TestNode n) {
        return "while(" + genericCombine(n, ")");
    }

    //for
    public String FOR(TestNode n) {
        //for(var i in ARRAY) IBLOCK
        String text = "for(var "+genericCombine(n," in ", ")");
        return null;
    }

    public String ARRAY_DEC(TestNode n) {
        String text = genericCombine(n, "");
        return null;
    }

    public String DICT_DEF(TestNode n) {
        String text = genericCombine(n, "");
        return null;
    }

    public String FUNC_CALL(TestNode n) {
        String text = genericCombine(n, "");
        return null;
    }

    public String genericCombine(TestNode n, String middleString) {
        return genericCombine(n, middleString, middleString);

    }

    //double check failure handling
    public String genericCombine(TestNode n, String middleString, String middleString1) {
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
    }

    public void nodeCombiner() {

    }

    public String nodeDecider(TestNode n) {
        String s = "";
        if (n == null) {
            return null;
        }
        int nodeNumber = n.getNodeNumber();
        switch (nodeNumber) {
            case TestNode.IBLOCK:
                s = IBLOCK(n);
                break;
            case TestNode.OP:
                s = OP(n);
                break;
            case TestNode.GENERIC_OP:
                s = GENERIC_OP(n);
                break;
            case TestNode.ARRAY_ACCESS:
                s = ARRAY_ACCESS(n);
                break;
            case TestNode.DICT_ACCESS:
                s = DICT_ACCESS(n);
                break;
            case TestNode.ASSIGN:
                s = ASSIGN(n);
                break;
            case TestNode.LVALUE:
                s = LVALUE(n);
                break;
            case TestNode.ARG:
                s = ARG(n);
                break;
            case TestNode.FUNC_DEF:
                s = FUNC_DEF(n);
                break;
            case TestNode.RETURN:
                s = RETURN(n);
                break;
            case TestNode.WHILE:
                s = WHILE(n);
                break;
            case TestNode.FOR:
                s = FOR(n);
                break;
            case TestNode.ARRAY_DEC:
                s = ARRAY_DEC(n);
                break;
            case TestNode.DICT_DEF:
                s = DICT_DEF(n);
                break;
            case TestNode.FUNC_CALL:
                s = FUNC_CALL(n);
                break;
            default:
                System.out.println("INVALID NODE TYPE");
                return null;
        }
        return s;
    }

}
