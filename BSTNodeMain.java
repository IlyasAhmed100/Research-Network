/**
 * BSTNodeMain
 * The BSTNodeMain class is used to test whether the BSTNode class works as 
 * expected by creating a BSTNode and assigning researcher's profiles to 
 * a node.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

import java.util.ArrayList;

public class BSTNodeMain {
    public static void main(String[] args) {

        Profile profileOne = new Profile("Hale", "Charlie", 1985, 05, 03, "CharlieHale@gmail.com", new ArrayList<String>());
        Profile profileTwo = new Profile("Summons", "Alan", 1982, 01, 31, "AlanSummons@gmail.com", new ArrayList<String>());
        Profile profileThree = new Profile("Thomas", "Simon", 1999, 12, 07, "SimonThomas@gmail.com", new ArrayList<String>());
        Profile profileFour = new Profile("Ahmed", "Faisal", 2001, 10, 22, "FaisalAhmed@gmail.com", new ArrayList<String>());


        System.out.println(profileOne.toString());
        System.out.println(profileTwo.toString());
        System.out.println(profileThree.toString());
        System.out.println(profileFour.toString());

        BSTNode firstNode = new BSTNode(profileOne);
        BSTNode secondNode = new BSTNode(profileTwo);

        profileTwo.getResearchInts().add("Fixing Computers");
        firstNode.setL(firstNode);
        secondNode.setR(secondNode);

        System.out.println(firstNode.getL().getResearcher());
        System.out.println(secondNode.getR().getResearcher());
    }
}
