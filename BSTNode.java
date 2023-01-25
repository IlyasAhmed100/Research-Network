/**
 * BSTNode
 * The BSTNode class represents a node or nodes containg researcher profiles
 * on a binary search tree.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

public class BSTNode {

    private Profile researcher;
    private BSTNode l;
    private BSTNode r;

    /**
     * @param researcher the researcher and their profile on a node.
     */
    public BSTNode(Profile researcher) {
       this.researcher = researcher;
    }

    /**
     * This method gets the researcher's profile.
     * @return the researcher's full profile.
     */
    public Profile getResearcher() {
        return researcher;
    }

    /**
     * This method sets the left node on the binary seach tree.
     * @param l sets the current l to the local l.
     */
    public void setL(BSTNode l) {
        this.l = l;
    }

    /**
     * This method gets the left node on the binary search tree.
     * @return the left node.
     */
    public BSTNode getL() {
        return l;
    }

    /** 
     * This method sets the right node on the binary search tree.
     * @param r sets the current r to the local r.
     */
    public void setR(BSTNode r) {
        this.r = r;
    }

    /**
     * This method gets the right node on the binary search tree.
     * @return the right node.
     */
    public BSTNode getR() {
        return r;
    }
}
