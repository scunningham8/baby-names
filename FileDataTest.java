package edu.unl.raikes.babynames;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class FileDataTest {

    @Test
    void testIfReadFileWorks() throws FileNotFoundException {
        //setup
        Scanner scnr = new Scanner(new File("./src/test.txt"));
        Name expected = new Name ('F', 1, "Raimee", 1, 2004);
        
        //execute
        Name actual = FileData.readFile(scnr,  "Raimee", 'F', 2004);
        
        //test
        assertEquals("readFile did not read the file correctly", expected, actual);
    }

}
