/**
 * author: Rafael Castellanos
 * FirstPass.java
 * This file contains the first pass. It is nessasary to mark certain nodes for
 * variable declaration checking
 */

public class FirstPass {

    private boolean errors = false;
    private boolean warnings = false;

    public boolean hasErrors() {
        return errors;
    }

    public boolean hasWarnings() {
        return warnings;
    }

    /**
     * if a variable is defined as an argument to the function, don't add var to it 
     * @param n
     */
    public void FUNCTION(PassNode n) {
        n = (PassNode) n.getChild(0);
        for (int i = 0; i < n.getChildCount(); i++) {
            n.setDefinedFunctionVar(n.getChild(i).getText());
        }
    }


    public void LT(PassNode n) {
        PassNode parent = (PassNode) n.getParent();
        if (parent.getChildCount() == 1) {
            parent.deleteChild(0);
        }
    }

    /**
     * remove dead code after a node
     * @param n
     */
    public void removeNodesAfter(PassNode n) {
        PassNode parent = (PassNode) n.getParent();
        int i;
        for (i = 0; i < parent.getChildCount(); i++) {
            if ((PassNode) parent.getChild(i) == n)
                break;
        }
        int line = n.getLine();
        /*now delete dead code */
        boolean removed = false;
        for (int j = parent.getChildCount() - 1; i < j; j--) {
            if (!"LT".equals(((PassNode) parent.deleteChild(j)).getText()))
                removed = true;
        }
        if (removed == true) {
            System.err.println("Warning: line " + line + " dead code in control block after line " + line);
            warnings = true;
        }

    }


    /**
     * decide what type of node it is and call the approriate method
     * @param n
     */
    public void nodeDecider(PassNode n) {
        if (n == null) {
            return;
        }
        int nodeNumber = n.getType();
        switch (nodeNumber) {
            case PassParser.RETURN:
                removeNodesAfter(n);
                break;
            case PassParser.BREAK:
                removeNodesAfter(n);
                break;
            case PassParser.FUNCTION:
                FUNCTION(n);
                break;
            case PassParser.LT:
                LT(n);
                break;
            default:
                break;
        }

    }

}
