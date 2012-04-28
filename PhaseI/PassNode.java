import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

public class PassNode extends CommonTree {
	public String text; 
	public int type;

    public PassNode(Token t) {
		super(t);
		text = (t != null? t.getText(): "[]");
		this.type = type;
	}

	public String toString() {
	    return text + " " + super.toString() + " " + super.getType();
	}

       
    
    public int get_type() {
	return type;
    }
}

class PassAdaptor extends CommonTreeAdaptor {
    public Object create(Token payload) {
	return new PassNode(payload);
    }
}
