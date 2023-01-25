/** 
 * Profile 
 * Profile is a class that reprsenets a researcher and all their attributes 
 * from their names, to the date of their PhD, their email as well as any 
 * research interests they have and other researches they may have 
 * collaborated with. 
 * @version 1.0.0
 * @author Ilyas Ahmed
 * @since 2022-04-27
 */

import java.util.ArrayList;
//import java.util.LinkedList;

public class Profile {

    private String familyNames; 
    private String givenNames;
    private int yearPhD;
    private int monthPhD;
    private int dayPhD;
    private String email;
    private ArrayList<String> researchInts = new ArrayList<String>();
    private ArrayList<Profile> collaborators = new ArrayList<Profile>(); 

    /**
     * @param familyNames the researcher's family or surname.
     * @param givenNames the researcher's first name and middle names.
     * @param yearPhD the year of the PhD.
     * @param monthPhD the month of the PhD.
     * @param dayPhD the day of the PhD.
     * @param email the email address of the researcher.
     * @param researchInts the research interests of the researcher.
     */

    public Profile(String familyNames, String givenNames, int yearPhD, int monthPhD, int dayPhD, String email, ArrayList<String> researchInts) {
        setFamilyNames(familyNames);
        setGivenNames(givenNames);
        setYearPhD(yearPhD);
        setMonthPhD(monthPhD);
        setDayPhD(dayPhD);
        setEmail(email);
        setResearchInts(researchInts);
    }

    /**
     * This method will add researcher's profile to another's researcher's
     * collobprate list.
     * @param p adds the researcher's profile to the collaborators list.
     */
    public void collaborate(Profile p) {
        collaborators.add(p);
    }

    /**
     * Method to check if a certain's researcher's profile is in another's
     * collaborator's list.
     * @param p checks if a profile is in the collaborator's list.
     * @return whether a specific profile is in a given researcher's collaborator's list.
     */
    public boolean hasCollaboratedWith(Profile p) {
        return collaborators.contains(p);
    }

    /**
     * The method checks how many collaborator's a certain researcher has.
     * @return the size of the collaborator's list.
     */
    public int numOfCollabs() {
        return collaborators.size();
    }

    /**
     * This method gets the entire date of the researcher's PhD by merging
     * the year, month a day of the PhD.
     * @return the entire date of the researcher's PhD.
     */
    public String getDateOfPhD() {
        if ((getMonthPhD() >= 1 && getMonthPhD() <= 9) ||
                ((getDayPhD() >= 1 && getDayPhD() <= 9))) {
            return getYearPhD() + "-" + String.format("%02d", getMonthPhD())
            + "-" + String.format("%02d", getDayPhD());
        } else {
            return getYearPhD() + "-" + getMonthPhD() + "-" + getDayPhD();
        }
    }

    /**
     * This method gets the full name of the researcher by merging their family.
     * name and their given names.
     * @return the full name of the researcher.
     */
    public String getName() {
        return givenNames + ", " + familyNames;
    }

    /**
     *This method gets the researcher's family names.
     * @return the researcher's family names.
     */
    public String getFamilyNames() {
        return familyNames;
    }

    /**
     * This method sets the researcher's family names.
     * @param familyNames sets the current familyNames to the local familyNames.
     */
    public void setFamilyNames(String familyNames) {
        this.familyNames = familyNames;
    }

    /**
     * This method gets the given names of the researcher.
     * @return the researcher's given names.
     */
    public String getGivenNames() {
        return givenNames;
    }

    /**
     * This method sets the researcher's given names.
     * @param givenNames sets the current givenNames to the local givenNames.
     */
    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }

    /**
     * The method gets the year of the researcher's PhD.
     * @return the year of the researcher's PhD.
     */
    public int getYearPhD() {
        return yearPhD;
    }

    /**
     * This method sets the researcher's PhD year.
     * @param yearPhD sets the current yearPhD to the local yearPhD.
     */
    public void setYearPhD(int yearPhD) {
        this.yearPhD = yearPhD;
    }

    /**
     * The method gets the month of the researcher's PhD.
     * @return the month of the researcher's PhD.
     */
    public int getMonthPhD() {
        return monthPhD;
    }

    /**
     * This method sets the researcher's PhD month.
     * @param monthPhD sets the current monthPhD to the local monthPhD.
     */
    public void setMonthPhD(int monthPhD) {
        this.monthPhD = monthPhD;
    }

    /**
     * The method gets the day of the researcher's PhD.
     * @return the day of the researcher's PhD.
     */
    public int getDayPhD() {
        return dayPhD;
    }

    /**
     * This method sets the researcher's PhD day.
     * @param dayPhD sets the current dayPhD to the local dayPhD.
     */
    public void setDayPhD(int dayPhD) {
        this.dayPhD = dayPhD;
    }

    /**
     * The method gets the email address of the researcher.
     * @return the researcher's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method sets the email address of the researcher.
     * @param email sets the current email to the local email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The method gets the researcher's interests.
     * @return the researcher's interests.
     */
    public ArrayList<String> getResearchInts() {
        return researchInts;
    }

    /** This method sets the researcher's interests.
     * @param researchInts sets the current researchInts to the local researchInts.
     */
    public void setResearchInts(final ArrayList<String> researchInts) {
        this.researchInts = researchInts;
    }

    /**
     * This toString method prints all the attributes of a researcher into a readable format.
     * @return all the attributes of the researcher.
     */
    public String toString() {
        return "Family Names = " + getFamilyNames() + " "
        + "Given Names = " + getGivenNames() + " "
        + "Date of PhD = " + getDateOfPhD() + " "
        + "Email Address = " + getEmail() + " "
        + "Research Interests = " + getResearchInts() + " "
        + "Collaborators = " + collaborators.toString();
    }
}
