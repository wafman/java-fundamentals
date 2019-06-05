package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void testConstructor(){
        Shop s = new Shop("Zoomies", "place for 'punk' clothes", "$$$");
        assertEquals("should return name", "Zoomies", s.getName());
    }

    @Test
    public void testToString(){
        Shop s = new Shop("TestToString", "a test to test the toString method", "$");
        String expectedOutput = "This shop by the name of TestToString can be described " +
                "as a test to test the toString method with a price rating of $";
        assertEquals("should return the store information", expectedOutput, s.toString());
    }

}