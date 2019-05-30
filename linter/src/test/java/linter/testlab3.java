package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class testlab3 {
    @Test
    public void testFindErrors(){
        lab3 classUnderTest = new lab3();
        assertTrue("function should return error message with line and error",
                classUnderTest.findErrors());
    }
}
