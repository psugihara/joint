import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassNode extends CommonTree {
    public String text;
    public int type;
    private boolean visited;
    private static final Pattern variablePattern = Pattern.compile("([a-zA-Z])+[0-9_]*[a-zA-Z 0-9_]*");
             
    private HashMap<String, String> defined = new HashMap<String, String>();
    private HashMap<String, String> definedInFunction = new HashMap<String, String>();

    public String getDefinedVarNames(){
     Iterator<String> it = getDefinedVars();
       String varNames="var ";
    	int i =0;
       while(it.hasNext()){
            String s = it.next();
            Matcher m = variablePattern.matcher(s);
            //make sure it's actually a valid var
            if(m.matches()){
            	i++;
                varNames +=  s+", ";
            }
        }
        if(i>0)
        	return varNames.substring(0, varNames.length()-2) +";\n";
        return "";

    }
    
    public boolean isValidDefinedVar(String s){
      if(variablePattern.matcher(s).matches()){
    	      
      }
      return false;
    }
    public Iterator<String> getDefinedVars(){
        return defined.keySet().iterator();
    }
    public void setVisitedTrue() {
        visited = true;
    }

    public void setVisitedFalse() {
        visited = false;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setDefined(String varName) {
        ((PassNode) getParent()).defined.put(varName, "");
    }
    public void setDefinedFunctionVar(String varName) {
        ((PassNode) getParent()).definedInFunction.put(varName, "");
    }
    /*check if we need to add var and set the scope of a new variable*/
    public boolean isDefined(String varName) {
        if (varName == null)
            return false;
        PassNode tmp = this;
        do {
            if (tmp.defined.containsKey(varName) || tmp.definedInFunction.containsKey(varName))
                return true;
        }
        while ((tmp = (PassNode) tmp.getParent()) != null);

	tmp = (PassNode) getParent();
	while(tmp != null && tmp.getType() == PassParser.ASSIGNMENT)
		tmp = (PassNode) tmp.getParent();
	if(tmp == null){
		System.out.println("FATAL ERROR: improperly constructed AST!");
		System.exit(-1);
	}
        tmp.defined.put(varName, "");
        return false;
    }
    public boolean isVarDefined(String varName) {
        if (varName == null)
            return false;
        PassNode tmp = this;
        do {
            if (tmp.defined.containsKey(varName) || tmp.definedInFunction.containsKey(varName))
                return true;
        }
        while ((tmp = (PassNode) tmp.getParent()) != null);

        return false;
    }

    public PassNode(Token t) {
        super(t);
        text = (t != null ? t.getText() : "[]");
        this.type = type;
    }

    public String toString() {
        return text + " " + super.toString() + " " + super.getType();
    }

    public int get_type() {
        return type;
    }

    /*   @Override
       public int getLine(){
           return super.getToken().getLine();
       }
    */
    @SuppressWarnings("unchecked")
    public void setChild(int i, PassNode t) {
        if (children == null) {
            children = createChildrenList();
        }
        children.set(i, t);
    }

    public Object deleteChild(int i) {
        return super.deleteChild(i);
    }

    public void setText(String s) {
        text = s;
        token.setText(s);
    }

    protected List createChildrenList() {
        return new ArrayList();
    }

}

class PassAdaptor extends CommonTreeAdaptor {
    public Object create(Token payload) {
        return new PassNode(payload);
    }
}
