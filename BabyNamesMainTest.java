package edu.unl.raikes.babynames;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BabyNamesMainTest {

    @Test
    public void testIfFindPeakRankIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 0;

        //execute
        int actual = BabyNamesMain.findPeakRank(allInfo);
        
        //test
        assertEquals("findPeakRank is not outputting the correct index for the highest ranked name",expected, actual);
        
        
    }
    
    @Test
    public void testIfFindPeakYearIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 1936;

        //execute
        int actual = BabyNamesMain.findPeakYear(allInfo);
        
        //test
        assertEquals("findPeakYear is not outputting the correct year for the highest ranked name",expected, actual);
        
        
    }
    
    @Test
    public void testIfFindPeakNumBabiesIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 53036;

        //execute
        int actual = BabyNamesMain.findPeakNumBabies(allInfo);
        
        //test
        assertEquals("findPeakNumBabies is not outputting the correct number of babies for the highest ranked name",expected, actual);
        
        
    }
    
    @Test
    public void testIfFindMostBabiesIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 53036;
        
        //execute
        int actual = BabyNamesMain.findMostBabies(allInfo);
        
        //test
        assertEquals("findMostBabies is not outputting the correct number of babies for the highest amount of babies",expected, actual);

    }

    @Test
    public void testIfFindMostYearIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 1936;
        
        //execute
        int actual = BabyNamesMain.findMostYear(allInfo);
        
        //test
        assertEquals("findMostYear is not outputting the correct year for when the highest amount of babies is",expected, actual);

    }
    
    @Test
    public void testIfFindMostRankIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 0;
        
        //execute
        int actual = BabyNamesMain.findMostRank(allInfo);
        
        //test
        assertEquals("findMostRank is not outputting the correct index for when the highest amount of babies is",expected, actual);

    }
    
    @Test
    public void testIfFindAllBabiesIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 161070;
        
        //execute
        int actual = BabyNamesMain.findAllBabies(allInfo);
        
        //test
        assertEquals("findAllBabies is not outputting the correct number when finding all the babies",expected, actual);

    }
    
    @Test
    public void testIfFindAveragePopularityIsCorrect() {
        //setup
        ArrayList<Name> allInfo = new ArrayList<Name>();
        allInfo.add(new Name('F', 53036, "Lisa", 1, 1936));
        allInfo.add(new Name('F', 41551, "Lisa", 2, 1937));
        allInfo.add(new Name('F', 33997, "Lisa", 3, 1938));
        allInfo.add(new Name('F', 32486, "Lisa", 4, 1939));
        int expected = 2;
        
        //execute
        int actual = BabyNamesMain.findAveragePopularity(allInfo);
        
        //test
        assertEquals("findAveragePopularity is not outputting the correct average when finding all the babies",expected, actual);

    }
    
}
