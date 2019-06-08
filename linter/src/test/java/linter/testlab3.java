package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class testlab3 {
    @Test
    public void testFindErrors(){
        lab3 classUnderTest = new lab3();
        assertEquals("function should return error message with line and error", 46,
                classUnderTest.findErrors("src/main/resources/gates.js"));
    }

    @Test
    public void testFindErrors_wrongFilePath(){
        lab3 classUnderTest = new lab3();
        assertEquals("should return -1 for wrong path", -1, classUnderTest.findErrors("test"));
    }
}
