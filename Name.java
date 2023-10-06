package edu.unl.raikes.babynames;

/**
 * Class that stores information about a baby name.
 * 
 * @author sarahcunningham
 *
 */
public class Name {

    private char gender;

    private int numBabies;

    private String name;

    private int rank;

    private int year;

    /**
     * Constructor that takes in the information and sets them to fields.
     * 
     * @param gender char representing the gender of the baby
     * @param numBabies number of babies with that name in that year
     * @param name baby name for which the information is stored
     * @param rank how popular that name was in that year
     * @param year the year in which the baby name occurred
     */
    public Name(char gender, int numBabies, String name, int rank, int year) {
        this.gender = gender;
        this.numBabies = numBabies;
        this.name = name;
        this.rank = rank;
        this.year = year;
    }

    /**
     * Gets the gender of the baby name.
     * 
     * @return male or female distinction of the name
     */
    public char getGender() {
        return this.gender;
    }

    /**
     * Sets the gender of the baby name.
     * 
     * @param gender male or female distinction of the name
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * Gets the number of babies in a given year with a given name.
     * 
     * @return how many babies corresponding to the name and year
     */
    public int getNumBabies() {
        return this.numBabies;
    }

    /**
     * Sets the number of babies in a given year with a given name.
     * 
     * @param numBabies how many babies corresponding to the name and year
     */
    public void setNumBabies(int numBabies) {
        this.numBabies = numBabies;
    }

    /**
     * Gets the baby name corresponding to the other information.
     * 
     * @return the baby name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the baby name corresponding to the other information.
     * 
     * @param name the baby name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets how popular the name was in a given year.
     * 
     * @return the rank of the name
     */
    public int getRank() {
        return this.rank;
    }

    /**
     * Sets how popular the name was in a given year.
     * 
     * @param rank the rank of the name
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Gets the year corresponding to the stats.
     * 
     * @return the year of the file with the information
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Sets the year corresponding to the stats.
     * 
     * @param year the year of the file with the information
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Determines equality between two name objects.
     * 
     * @param o the object that needs to be compared
     */
    public boolean equals(Object o) {
        Name name = (Name) o;
        if (this.gender == name.gender && this.numBabies == name.numBabies && this.name == name.name
                && this.rank == name.rank && this.year == name.year) {
            return true;
        }
        return false;
    }

    /**
     * Creates a string to identify information about a name.
     * 
     * @return the string with information about the name object
     */
    public String toString() {
        return String.format("%d - %s was ranked %s for %s babies (%d babies given that name)\n", this.year, this.name,
                BabyNamesMain.getRankEnding(this.rank), BabyNamesMain.getFullGender(this.gender), this.numBabies);
    }

}
