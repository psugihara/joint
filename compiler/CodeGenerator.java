//for has three children
//function 2 //args and
//arguments 2
// assignment
//todo check node inheritance behavior 
public class CodeGenerator {

    public String IBLOCK(PassNode n) {
        String text = genericCombine(n, "");
        text = "  "+text.replace("\n", "\n  ");
        return "{\n  " + text.trim() + "\n}";
    }

    // n.child(0) + n.getText + n.child(1)
    public String GENERIC_OP(PassNode n) {
        return genericCombine(n, " ");
    }

    public String DICT_ACCESS(PassNode n) {
        return genericCombine(n, ".");
    }

    public String ASSIGNMENT(PassNode n) {
    	PassNode node = (PassNode)n.getChild(0);
    	String varName = node.getText();
	System.out.println(n.getChild(0).toString());
	System.out.println("Testing node " + n.getText()  + " " +  n.isDefined(n.getChild(0).toString()) + (n.getType() == PassParser.DICT_ACCESS));
    	if(varName == null){
    	//this should never happen
    		System.out.println("FATAL ERROR: no function name ");
    		System.exit(-1);
    	}
	else if(n.getChild(0).getType() == PassParser.DICT_ACCESS) {
	    if(n.isDefined(n.getChild(0).toString()))
		{
		    System.out.println("hey");
		    node.setText(varName);
		}
	    else
		{
		    /**
		    System.out.println("ERROR");
		    System.exit(-1);
		    return;
		    **/
		}
	}
    	else if(n.isDefined(varName) == false){
    		node.setText("var " + varName);
    		n.setChild(0, node);	
    	}
        return genericCombine(n, " ");
    }

    public String PROG(PassNode n) {
        String res = "";
        for (int i = 0; i < n.getChildCount(); i++){
	    
            res += n.getChild(i).getText();
	}

	return res.trim();
    }

    public String ARGUMENTS(PassNode n) {
        return genericCombine(n, ", ");
    }

    public String FUNCTION(PassNode n) {
        return "function (" + n.getChild(0).getText() + ") " + n.getChild(1).getText();
    }

    public String RETURN(PassNode n) {
        return "return " + genericCombine(n, "");
    }

    public String WHILE(PassNode n) {
        return "while (" + n.getChild(0).getText() + ") " + n.getChild(2).getText();
    }

    //for
    public String FOR(PassNode n) {
        //for(var i in ARRAY) IBLOCK
        return  "for (var " + genericCombine(n, " in ", ")") + "\n";
       
    }

    //todo this needs to be worked out on cody's end
    public String ARRAY_DECLARATION(PassNode n) {
        return "[" + genericCombine(n, ", ") + "]";
    }

    public String FUNC_CALL(PassNode n) {
    	PassNode node = (PassNode)n.getChild(0);
    	String funcName = node.getText();
    	if(funcName == null){
    	//this should never happen
    		System.out.println("FATAL ERROR: no function name ");
    		System.exit(-1);
    	}
    	if(funcName.equals("log")){
    		funcName = "console.log";
    	}// todo add other special functions
    	/*else if(funcName.equals("")){
        	funcName = "";
        }*/
        node.setText(funcName);
    	n.setChild(0, node);	
        String text = genericCombine(n, "(") + ")";
        return text;
    }

    //arrayName accessElement, accessELEMENTi....
    public String ARRAY_ACCESS(PassNode n) {
        if (n.getText() == null || n.getChildCount() < 2)
            return ""; //error
        String ret = n.getText();
        for (int i = 0; n.getChildCount() < i; i++)
            ret += "[" + n.getChild(i).getText() + "]";
        return ret;
    }

    //parent of dict_declar
    public String DICTIONARY_DEFINITION(PassNode n) {
        return  genericCombine(n, ":");
    }       //child of dict_def

    public String DICTIONARY_DECLARATION(PassNode n) {
        return "{" + genericCombine(n, ",") + "}";
    }

    public String IF(PassNode n) {
        return "if (" + n.getChild(0).getText() + ") " + n.getChild(1).getText() + "\n";
    }

    public String ELSE(PassNode n) {
	return "else " + n.getChild(0).getText() + "\n";
    }
   
    public String ELSE_IF(PassNode n) {
	return "else if (" + n.getChild(0).getText() + ") " + n.getChild(1).getText() + "\n";
    }

    public String IF_CONDITIONS(PassNode n) {
        return genericCombine(n, "");
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
            default:
                return n.getText();
        }

        return s;
    }

}
