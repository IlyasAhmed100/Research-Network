/**
 * GraphMain
 * GraphMain is a class used to test whether a graph is constructed and 
 * if collaborators are added to the researchers collaboration list.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

import java.util.ArrayList;

public class GraphMain {
    public static void main(String[] args) {

        Profile firstProfile = new Profile("Hale", "Charlie", 1985, 05, 03, "CharlieHale@gmail.com", new ArrayList<String>());
        Profile secondProfile = new Profile("Summons", "Alan", 1982, 01, 31, "AlanSummons@gmail.com", new ArrayList<String>());
        Profile thirdProfile = new Profile("Thomas", "Simon", 1999, 12, 07, "SimonThomas@gmail.com", new ArrayList<String>());
        Profile fourthProfile = new Profile("Ahmed", "Faisal", 2001, 10, 22, "FaisalAhmed@gmail.com", new ArrayList<String>());
        Profile fifthProfile = new Profile("Carey", "Henry", 1963, 07, 02, "HenryCarey@gmail.com", new ArrayList<String>());
        Profile sixthProfile = new Profile("Morgan", "Louis", 2011, 11, 10, "LouisMorgan@gmail.com", new ArrayList<String>());
        Profile seventhProfile = new Profile("Robson", "Kieran", 2020, 10, 28, "KieranRobson@gmail.com", new ArrayList<String>());

        BST testTree = new BST();
        testTree = FileReader.readResearcherProfiles("researchers.txt");
        Graph graphOfCollaborators = new Graph("edges.txt", testTree);
        System.out.println(graphOfCollaborators);
        System.out.println(firstProfile.numOfCollabs());
    }
}
