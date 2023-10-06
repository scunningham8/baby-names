package edu.unl.raikes.babynames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class to handle file reading and storing information from it.
 * 
 * @author sarahcunningham
 *
 */
public class FileData {
    
    private static final int BEGINNING_YEAR = 1880;
    private static final int FINAL_YEAR = 2022;

    /**
     * Reads the information in a file and stores it in order to be referenced.
     * 
     * @param scnr Scanner to read the information
     * @param name baby name that is stored
     * @param gender baby gender that is stored
     * @param year year of the baby name occurrence
     * @return Name object storing all of the information found
     */
    public static Name readFile(Scanner scnr, String name, char gender, int year) {
        // rank variable instantiation before the loop
        int rank = 0;

        String tempString = "";
        while (scnr.hasNextLine()) {
            String nextLine = scnr.nextLine();

            String[] info = nextLine.split(",");
            
            if (info[1].equals(gender + "")) {
                rank++;
            }
            if (info[2].equals(tempString)) {
                rank--;
            }

            if (info[0].equals(name) && info[1].equals(gender + "")) {
                int numBabies = Integer.parseInt(info[2]);

                Name object = new Name(gender, numBabies, name, rank, year);
                return object;
            }

            tempString = info[2];
        }
        scnr.close();
        return null;

    }

    /**
     * Gets the baby name information from all of the files.
     * 
     * @param name baby name that information is needed about
     * @param gender gender that information is needed about
     * @return arrayList of all the information collected
     */
    public static ArrayList<Name> getAllInfo(String name, char gender)  {
        ArrayList<Name> allInfo = new ArrayList<Name>();

        for (int i = BEGINNING_YEAR; i < FINAL_YEAR; i++) {
            Scanner scnr = getScanner(i);
            Name info = readFile(scnr, name, gender, i);

            if (info != null) {
                allInfo.add(info);
            }

        }
        
        // tells the user if a name is not in the files
        if (allInfo.size() == 0) {
            System.out.printf("\nI'm sorry for the inconvenience, but I couldn't find any information about %s\n"
                    + "babies named \"%s\"\n", BabyNamesMain.getFullGender(gender), name);
            System.exit(0);
        }

        // returns arrayList of all the info
        return allInfo;
    }

    /**
     * Creates a scanner that tries and catches a file not found exception.
     * 
     * @param year corresponds to the name of the file
     * @return a healthy scanner
     */
    public static Scanner getScanner(int year) {
        Scanner scnr = null;
        try {
            File file = new File("./names/yob" + year + ".txt");
            scnr = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }
        return scnr;
    }

}
