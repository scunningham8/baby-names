package edu.unl.raikes.babynames;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class that takes in a baby name from the user and returns stats on it.
 * 
 * @author sarahcunningham
 *
 */
public class BabyNamesMain {

    /**
     * Main function that collects user input and outputs information.
     * 
     * @param args makes the code work right.
     */
    public static void main(String[] args) {

        // creates scanner
        Scanner scnr = new Scanner(System.in);

        // asks for name and stores user's input
        System.out.println("Welcome to the Baby Name Genie!\n"
                + "I can tell you information about the history of the first names across three centuries! "
                + "What first name would you like to learn more about?");
        String name = scnr.nextLine();

        // validates user input
        name = validateNameFormat(name);

        // asks for sex and stores user's input
        System.out.print("Which sex would you like statistics for? (F for female, M for male): ");
        char genderChar = scnr.next().charAt(0);
        genderChar = Character.toUpperCase(genderChar);

        // changes the inputed gender char to its corresponding string
        String fullGender = getFullGender(genderChar);

        // creates array list with all files containing the name
        ArrayList<Name> nameObjects = FileData.getAllInfo(name, genderChar);

        // tells the user what the program is looking for
        System.out.printf("Okay! Let me see what I can find about %s babies named \"%s.\"\n" + "..\n" + "....\n"
                + "...\n" + "....\n" + "...\n", fullGender, name);

        // outputs first bullet point to the user
        System.out.printf(
                "Okay, her's what I found:\n * %s first appeared as a popular %s first name in %d, at which time\n"
                        + "   it was ranked %s. There were 9 %s babies named %s that year.\n",
                name, fullGender, nameObjects.get(0).getYear(), getRankEnding(nameObjects.get(0).getRank()), fullGender,
                name);

        // outputs second bullet point
        System.out.printf(
                " * %s reached peak popularity in %d, at which time it was ranked %s.\n"
                        + "   There were %d %s babies named %s that year.\n",
                name, findPeakYear(nameObjects), getRankEnding(nameObjects.get(findPeakRank(nameObjects)).getRank()),
                findPeakNumBabies(nameObjects), fullGender, name);

        // outputs the third bullet point
        System.out.printf(
                " * The name %s was given to the most babies in %d (%d %s babies were\n"
                        + "   named %s in %d). %s was the %s most popular %s name that year.\n",
                name, findMostYear(nameObjects), findMostBabies(nameObjects), fullGender, name,
                findMostYear(nameObjects), name, getRankEnding(nameObjects.get(findMostRank(nameObjects)).getRank()),
                fullGender);

        // outputs fourth bullet point
        System.out.printf(
                " * Of the %d years that %s has been a popular %s name, %d %s\n"
                        + "   babies have been named %s and its average popularity has been %s\n",
                nameObjects.size(), name, fullGender, findAllBabies(nameObjects), fullGender, name,
                getRankEnding(findAveragePopularity(nameObjects)));

        // prints all the information below bullets
        System.out.printf("\nFull information about the years when %s was popular as a %s name\n", name, fullGender);
        printAllYears(nameObjects);
    }

    /**
     * Changes the user's name input in case it wasn't in the right format.
     * 
     * @param name the baby name
     * @return changed name
     */
    public static String validateNameFormat(String name) {
        // puts first letter of the name into a char
        char firstLetter = name.charAt(0);

        // saves the rest of the name
        name = name.substring(1, name.length());

        // changes the first char if the user enters a lowercase
        if (!Character.isUpperCase(name.charAt(0))) {
            firstLetter = Character.toUpperCase(firstLetter);
        }

        // changes the rest of the name if user entered all uppercase
        name = name.toLowerCase();

        return firstLetter + name;
    }

    /**
     * Prints out the full information of the years with the baby name.
     * 
     * @param nameObjects the array that holds the information
     */
    public static void printAllYears(ArrayList<Name> nameObjects) {
        // goes through all indices in the arrayList
        for (int i = 0; i < nameObjects.size(); i++) {
            // prints what is at the index
            System.out.print(nameObjects.get(i));
        }
    }

    /**
     * Finds the year in which the name occurs the most amount.
     * 
     * @param allInfo the array that holds the information needed
     * @param name the name that is being considered
     * @return the index of where the peak rank is in the array
     */
    public static int findPeakRank(ArrayList<Name> allInfo) {
        // sets max to its greatest possible value
        int max = Integer.MAX_VALUE;

        // initializes index before loop
        int index = -1;

        // goes through array list to find the max
        for (int i = 0; i < allInfo.size(); i++) {
            if (allInfo.get(i).getRank() < max) {
                max = allInfo.get(i).getRank();

                // finds corresponding index
                index = i;
            }
        }

        // returns needed index
        return index;

    }

    /**
     * Finds the year in which the rank for the name was the highest.
     * 
     * @param allInfo the array that holds the information needed
     * @return the year with the highest rank of the name
     */
    public static int findPeakYear(ArrayList<Name> allInfo) {
        // finds the needed index
        int rank = allInfo.get(findPeakRank(allInfo)).getRank();

        // initializes year before the loop
        int year = 0;

        // goes through arrayList to find the year
        for (int i = 0; i < allInfo.size(); i++) {
            if (allInfo.get(i).getRank() == rank) {
                year = allInfo.get(i).getYear();
            }
        }

        // returns year
        return year;

    }

    /**
     * Finds the number of babies with the name when it was most popular.
     * 
     * @param allInfo the array that holds the information needed
     * @return the highest number of babies
     */
    public static int findPeakNumBabies(ArrayList<Name> allInfo) {
        // finds the needed index
        int rank = allInfo.get(findPeakRank(allInfo)).getRank();

        // initializes num before the loop
        int num = 0;

        // goes through allInfo the find the most babies
        for (int i = 0; i < allInfo.size(); i++) {
            if (allInfo.get(i).getRank() == rank) {
                num = allInfo.get(i).getNumBabies();
            }
        }

        // returns the amount of babies
        return num;
    }

    /**
     * Finds the most amount of babies born with a given name.
     * 
     * @param allInfo the array that holds the information needed
     * @return the highest number of babies.
     */
    public static int findMostBabies(ArrayList<Name> allInfo) {
        // initializes num before loop
        int num = 0;

        // goes through allInfo to find the most babies in a year
        for (int i = 0; i < allInfo.size(); i++) {
            if (allInfo.get(i).getNumBabies() > num) {
                num = allInfo.get(i).getNumBabies();
            }
        }

        // returns the amount of babies
        return num;
    }

    /**
     * Finds the year corresponding to when the most babies were named a given name.
     * 
     * @param allInfo the array that holds the information needed
     * @return the year that had the most babies
     */
    public static int findMostYear(ArrayList<Name> allInfo) {
        // initializes year before loop
        int year = 0;

        // finds the most babies occurrence
        int num = findMostBabies(allInfo);

        // goes through allInfo to find corresponding year
        for (int i = 0; i < allInfo.size(); i++) {
            if (allInfo.get(i).getNumBabies() == num) {
                year = allInfo.get(i).getYear();
            }
        }

        // returns year
        return year;
    }

    /**
     * Finds the rank for the name when it had the most babies born with it.
     * 
     * @param allInfo the array that holds the information needed
     * @return the index of the name in the array list with the most babies.
     */
    public static int findMostRank(ArrayList<Name> allInfo) {
        // finds the most babies occurrence
        int num = findMostBabies(allInfo);

        // initializes index before loop
        int index = -1;

        // goes through allInfo to find corresponding index
        for (int i = 0; i < allInfo.size(); i++) {
            if (allInfo.get(i).getNumBabies() == num) {
                index = i;
            }
        }

        // returns index
        return index;
    }

    /**
     * Finds how many babies were born with a given name throughout all the names provided.
     * 
     * @param allInfo the array that holds the information needed
     * @return the number of babies
     */
    public static int findAllBabies(ArrayList<Name> allInfo) {
        // total amount of babies with the name
        int babies = 0;

        // adds all babies up
        for (int i = 0; i < allInfo.size(); i++) {
            babies += allInfo.get(i).getNumBabies();
        }

        // returns number of total babies with the name
        return babies;
    }

    /**
     * Finds the average popularity for the designated baby name.
     * 
     * @param allInfo the array that holds the information needed
     * @return the average popularity
     */
    public static int findAveragePopularity(ArrayList<Name> allInfo) {
        // sets rank at lowest possible value
        int ranks = 0;

        // adds all ranks up
        for (int i = 0; i < allInfo.size(); i++) {
            ranks += allInfo.get(i).getRank();
        }

        // divides all ranks by the number to find the average rank
        int average = ranks / allInfo.size();

        return average;

    }

    /**
     * Turns the rank into a string and adds the ending corresponding to the last number (3"rd," 2"nd," etc).
     * 
     * @https://stackoverflow.com/questions/6810336/is-there-a-way-in-java-to-convert-an-integer-to-its-ordinal-name
     * 
     * @param rank the place that the name has in the popularity during that year
     * @return String of the rank with an ending
     */
    public static String getRankEnding(int rank) {
        final int RANK_END = 100;
        final int RANK_RETURN = 10;
        final int EDGE_CASE_11 = 11;
        final int EDGE_CASE_12 = 12;
        final int EDGE_CASE_13 = 13;

        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        switch (rank % RANK_END) {
            case EDGE_CASE_11:
            case EDGE_CASE_12:
            case EDGE_CASE_13:
                return rank + "th";
            default:
                return rank + suffixes[rank % RANK_RETURN];

        }
    }

    /**
     * Turns the gender char into the corresponding full gender string.
     * 
     * @return String that represents the baby name's gender
     */
    public static String getFullGender(char gender) {
        // turns gender char into corresponding string
        if (gender == 'F') {
            return "female";
        } else if (gender == 'M') {
            return "male";
        }

        return null;
    }

}
