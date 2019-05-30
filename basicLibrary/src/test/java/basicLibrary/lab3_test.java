package basicLibrary;

import org.junit.Test;

import java.util.ArrayList;

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
        String expectedOutput = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";
        assertEquals("minumum value should return high, low and all temperatures not in array.",
                expectedOutput,
                classUnderTest.analyzeWeather(arr));
    }

    @Test
    public void testTally(){
        lab3 classUnderTest = new lab3();
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expectedOutput = "Bush";
        assertEquals("function should return Bush as winner",
                expectedOutput,
                classUnderTest.tally(votes));
    }

}
