/**
 * FileReader
 * FileReader reads in a file of researchers from a text file and 
 * constructs a binary search tree and adds the researchers to it.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    /**
     * This method reads in a tet file and if the right text file is found it
     * will call a method to add researchers to the binary search tree and 
     * construct the binary search tree.
     * @param filename the name of the text file.
     * @return the fully constructed binary search tree.
     */
    public static BST readResearcherProfiles(String filename) {
        File researcherFile = new File(filename);
        Scanner readLines = new Scanner(System.in);
        BST binarySearchTree = new BST();

        try {
            readLines = new Scanner(researcherFile);
        } catch (FileNotFoundException e) {
            System.err.println("The researchers file could not be found");
            System.exit(0);
        }

        while (readLines.hasNextLine()) {
            String newLine = readLines.nextLine();
            binarySearchTree.insertResearcher(profilesFromFile(newLine));
        }
        
        return binarySearchTree;

    }

    /**
     * This method assigns the researcher's attributes and maks a profile
     * which from the method above in the class can construct the binary search
     * tree with the researchers profiles on it.
     * @param newLine the new lines in the text file.
     * @return a researchers profile.
     */
    private static Profile profilesFromFile(String newLine) {
        Scanner readToken = new Scanner(newLine);
        readToken.useDelimiter(",|/");

        String givenName = readToken.next();
        String familyName = readToken.next();
        String dateOfResearch = readToken.next();
        String emailAddress = readToken.next();

        ArrayList<String> interests = new ArrayList<String>();

        while (readToken.hasNext()) {
            interests.add(readToken.next());
        }

        String[] splitDateOfResearch = dateOfResearch.split("-");
        int day = Integer.parseInt(splitDateOfResearch[2]);
        int month = Integer.parseInt(splitDateOfResearch[1]);
        int year = Integer.parseInt(splitDateOfResearch[0]);

        Profile profileFromFile = new Profile(familyName, givenName, year, month, day, emailAddress, interests);

        return profileFromFile;
    }
}
