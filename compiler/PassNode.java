import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PassNode extends CommonTree {
    public String text;
    public int type;
    private boolean visited;

    private HashMap<String, String> defined = new HashMap<String, String>();
	public void setVisitedTrue(){
		visited = true;
	}
	public boolean isVisited(){
		return visited;
	}
    public boolean isDefined(String varName) {

    	if(varName == null)
    		return false;
        if (defined.containsKey(varName))
            return true;
 /*       PassNode tmp;
        while ((tmp = (PassNode) getParent()) != null){
            if (defined.containsKey(varName))
                return true;
            System.out.println("DEFED");
        }
     */   defined.put(varName,"");
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

    @SuppressWarnings("unchecked")
    public void setChild(int i, PassNode t) {
        if (children == null) {
            children = createChildrenList();
        }
        children.set(i, t);
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
