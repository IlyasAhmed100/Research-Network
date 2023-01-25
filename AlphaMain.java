/**
 * AlphaMain 
 * AlphaMain ensures that the researchers on the binary search tree
 * are printed in alphabetical order.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */
import java.util.ArrayList;

public class AlphaMain {
    public static void main(String[] args) {

        Profile firstProfile = new Profile("Hale", "Charlie", 1985, 05, 03, "CharlieHale@gmail.com", new ArrayList<String>());
        Profile secondProfile = new Profile("Summons", "Alan", 1982, 01, 31, "AlanSummons@gmail.com", new ArrayList<String>());
        Profile thirdProfile = new Profile("Thomas", "Simon", 1999, 12, 07, "SimonThomas@gmail.com", new ArrayList<String>());
        Profile fourthProfile = new Profile("Ahmed", "Faisal", 2001, 10, 22, "FaisalAhmed@gmail.com", new ArrayList<String>());
        Profile fifthProfile = new Profile("Carey", "Henry", 1963, 07, 02, "HenryCarey@gmail.com", new ArrayList<String>());
        Profile sixthProfile = new Profile("Morgan", "Louis", 2011, 11, 10, "LouisMorgan@gmail.com", new ArrayList<String>());
        Profile seventhProfile = new Profile("Robson", "Kieran", 2020, 10, 28, "KieranRobson@gmail.com", new ArrayList<String>());

        BST binaryTree = new BST();
        binaryTree.insertResearcher(firstProfile);
        binaryTree.insertResearcher(secondProfile);
        binaryTree.insertResearcher(thirdProfile);
        binaryTree.insertResearcher(fourthProfile);
        binaryTree.insertResearcher(fifthProfile);
        binaryTree.insertResearcher(sixthProfile);
        binaryTree.insertResearcher(seventhProfile);

        System.out.println(binaryTree.printAlphabetical());
    }
}
