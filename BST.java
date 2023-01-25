/**
 * BST
 * The BST class creates a binary searh tree with researchers profiles on the
 * tree.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

public class BST {

    private BSTNode root;

    /**
     * The constructor for the BST is empty.
     */
    public BST() {

    }

    /**
     * This method inserts a researcher's profile as a node, by making a new
     * node, into the binary search tree. If the root is null, the node is 
     * placed at the root of the binary search tree, otherwise it calls a 
     * private recursive method.
     * @param p profile inserted as a node into the binary search tree.
     */
    public void insertResearcher(Profile p) {
        BSTNode researcherNode = new BSTNode(p);
        if (root == null) {
            root = new BSTNode(p);
        } else {
            recursiveNode(researcherNode, root);
        }
    }

    /**
     * This method adds researchers on the tree, starting at the node
     * and going hrough the tree from left to right, recursively. Researchers
     * are added to the tree in an alphabetical order,
     * @param newlyAddedResearcher researcher being added to the binary search tree.
     * @param existingNodeOnTree researcher already on the tree.
     */
    private void recursiveNode(BSTNode newlyAddedResearcher, BSTNode existingNodeOnTree) {
        int compareResearcherAlphabetically = newlyAddedResearcher
            .getResearcher()
            .getFamilyNames()
            .compareTo(existingNodeOnTree
            .getResearcher()
            .getFamilyNames());
        if (compareResearcherAlphabetically > 0) {
            if (existingNodeOnTree.getR() != null) {
                recursiveNode(newlyAddedResearcher, existingNodeOnTree.getR());
            } else {
                existingNodeOnTree.setR(newlyAddedResearcher);
            }
        } else {
            if (existingNodeOnTree.getL() != null) {
                recursiveNode(newlyAddedResearcher, existingNodeOnTree.getL());
            } else {
                existingNodeOnTree.setL(newlyAddedResearcher);
            }
        }
    }

    /**
     * This method prints the researcher's names in an alphabetic order.
     * @return the researcher's full names.
     */
    public String printAlphabetical() {
        return root.getL().getResearcher().getFamilyNames() + ", "
        + root.getL().getResearcher().getGivenNames()
        + "\n" + root.getResearcher().getFamilyNames()
        + ", " + root.getResearcher().getGivenNames()
        + "\n" + root.getR().getResearcher().getFamilyNames()
        + ", " + root.getR().getResearcher().getGivenNames();
    }

    /**
     * This method calls a private method to search for researchers profiles
     * on the binary search tree.
     * @param inputLastName the last name of the researcher.
     * @return the private method to find the reseacher's profuke
     */
    public Profile searchColloborators(String inputLastName) {
        return searchTree(inputLastName, root);
    }

    /**
     * This private method recursively searches the binary search tree
     * for researcher;s profiles and matches them to the input given 
     * which is the last name of the researcher.
     * @param inputLastName last name of the researcher.
     * @param element the current node being searched on the binary search tree.
     * @return the researchers profile.
     */
    public Profile searchTree(String inputLastName, BSTNode element) {
        Profile collaboratorsProfile = null;
        String profileLastName = element.getResearcher().getFamilyNames();

        if (inputLastName.equals(profileLastName)) {
            collaboratorsProfile = element.getResearcher();
        } else {
            if (inputLastName.compareTo(profileLastName) > 0) {
                if (element != null) {
                    searchTree(inputLastName, element.getR());
                }
            } else {
                if (element != null) {
                    searchTree(inputLastName, element.getL());
                }
            }
        }
        return collaboratorsProfile;
    }
}
