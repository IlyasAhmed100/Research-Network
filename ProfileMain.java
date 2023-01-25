/**
 * ProfileMain
 * The ProfileMain class is used to test whether the Profile class works as 
 * expected by creating Profile objects and seeing if all the attributes of 
 * a researcher print properly.
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

import java.util.ArrayList;

public class ProfileMain {
    public static void main(String[] args) {

    Profile firstProfile = new Profile("Hale", "Charlie", 1985, 05, 03, "CharlieHale@gmail.com", new ArrayList<String>());
    Profile secondProfile = new Profile("Summons", "Alan", 1982, 01, 31, "AlanSummons@gmail.com", new ArrayList<String>());
    Profile thirdProfile = new Profile("Thomas", "Simon", 1999, 12, 07, "SimonThomas@gmail.com", new ArrayList<String>());
    Profile fourthProfile = new Profile("Ahmed", "Faisal", 2001, 10, 22, "FaisalAhmed@gmail.com", new ArrayList<String>());

    firstProfile.getResearchInts().add("Cyber Security");
    secondProfile.getResearchInts().add("Finance");
    thirdProfile.getResearchInts().add("Data Analysis");
    fourthProfile.getResearchInts().add("Quantitative Trading");


    System.out.println(firstProfile.toString());
    System.out.println(secondProfile.toString());
    System.out.println(thirdProfile.toString());
    System.out.println(fourthProfile.toString());

    System.out.println(firstProfile.getDateOfPhD());
    System.out.println(secondProfile.getDateOfPhD());
    System.out.println(thirdProfile.getDateOfPhD());
    System.out.println(fourthProfile.getDateOfPhD());


    firstProfile.collaborate(secondProfile);
    firstProfile.collaborate(fourthProfile);
    System.out.println(firstProfile.hasCollaboratedWith(secondProfile));
    System.out.println(firstProfile.hasCollaboratedWith(thirdProfile));

    System.out.println(firstProfile.numOfCollabs());
    System.out.println(secondProfile.numOfCollabs());
    }
}
