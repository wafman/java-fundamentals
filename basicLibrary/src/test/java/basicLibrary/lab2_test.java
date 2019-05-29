package basicLibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class lab2_test {

    @Test
    public void testLab2_roll(){
        lab2 classUnderTest = new lab2();
        int n = 10;
        assertTrue("output array should contain n number of indexes",
                classUnderTest.roll(n).length == n);
    }

    @Test
    public void testLab2_containsDuplicates_True(){
        lab2 classUnderTest = new lab2();
        int[] arr = new int[]{1,2,3,4,5,3};
        assertTrue("output should return true when containing duplicates",
                classUnderTest.containsDuplicates(arr) == true);
    }

    @Test
    public void testLab2_containsDuplicates_False(){
        lab2 classUnderTest = new lab2();
        int[] arr = new int[]{1,2,3,4,5};
        assertFalse("output should return false when containing duplicates",
                classUnderTest.containsDuplicates(arr) == false);
    }

    @Test
    public void testLab2_averages(){
        lab2 classUnderTest = new lab2();
        int[] arr = new int[]{1,2,3,4,5};
        double expectedOutput = 3.0;
        assertEquals("output should return 3",
                expectedOutput,
                classUnderTest.averages(arr), 0);
    }

    @Test
    public void testLab2_avgAverages(){
        lab2 classUnderTest = new lab2();
        int[][] arr = new int[][]{
                {1,2,3,4,5},
                {2,4,6,8,10},
                {3,6,9,12,15}
        };
        double expectedOutput = 3.0;
        assertEquals("output should equal 3.0", expectedOutput,
                classUnderTest.avgAverages(arr), 0);
    }

}
