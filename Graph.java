/**
 * Graph
 * The Graph class creates a graph with a reference to the binary search tree
 * and the text file. Collaborators will be added to specific researchers.
 * This class has not been fully completed.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Graph {

    private BST vertices;

    /**
     * Constructor makes a grpah with a reference to the BST and the text file.
     * @param vertices the binary search tree.
     * @param edge the text file.
     */
    public Graph(String edge, BST vertices) {
        this.vertices = vertices;
        readEdgesFile(edge);
    }

    /**
     * This method reads in the text file and identifies researchers profile
     * based on their last names and collaborates the appropriate reseachers.
     * @param filename parameter for the text file.
     */
    public void readEdgesFile(String filename) {
        File edgesFile = new File(filename);
        Scanner edgesScanner = new Scanner(System.in);

        try {
            edgesScanner = new Scanner(edgesFile);
        } catch (FileNotFoundException e) {
            System.err.println("The edges file could not be found.");
            System.exit(0);
        }

        while (edgesScanner.hasNext()) {
            String edges = edgesScanner.nextLine();
            Scanner edgesLineScanner = new Scanner(edges);
            edgesLineScanner.useDelimiter(",");
            String firstLastName = edgesLineScanner.next();
            Profile firstProfile = vertices.searchColloborators(firstLastName);
            String secondLastName = edgesLineScanner.next();
            Profile secondProfile = vertices.searchColloborators(secondLastName);
            addCollaboratorsForReseacher(firstProfile, secondProfile);
            edgesLineScanner.close();
        }
    }

    /**
     * This method collaborates two researchers together if they are collaborating.
     * @param firstProfile the first initial researcher's profile.
     * @param secondProfile the second researcher's profile, collaborating.
     */
    public void addCollaboratorsForReseacher(Profile firstProfile, Profile secondProfile) {
        firstProfile.collaborate(secondProfile);
    }

    /**
     * This method is meant to find any influencer's who have a lot 
     * of researchers.
     * This method has not been completed.
     * @param familyNames string of the researcher's family names.
     * @return influencer's who have a lot of collaborators.
     */
    public Profile findInfluencer(String familyNames) {
        return findInfluencer(familyNames);
    }
}
