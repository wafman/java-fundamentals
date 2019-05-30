package basicLibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class lab3_test {
    @Test
    public void seattleWeater_min(){
        lab3 classUnderTest = new lab3();
        int[][] arr = new int[][]{
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
        };
        int expectedOutputMin = 51;
        assertEquals("minumum value should equal 51",
                expectedOutputMin,
                classUnderTest.analyzeWeather(arr));
    }

    @Test
    public void seattleWeater_max(){
        lab3 classUnderTest = new lab3();
        int[][] arr = new int[][]{
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int expectedOutputMax = 72;
        assertEquals("maximum temperature should be 72",
                expectedOutputMax,
                classUnderTest.analyzeWeather(arr));
    }
}
