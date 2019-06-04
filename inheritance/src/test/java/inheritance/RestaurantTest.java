package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testConstructor(){
        Restaurant r = new Restaurant("Red Robin", 3, "$$");
        assertEquals("should return restaurant name", "Red Robin", r.getName());
    }

    @Test
    public void testToString(){
        Restaurant r = new Restaurant("Red Robin", 3, "$$");
        assertEquals("should give a string with the restaurant information",
                "A restaurant named Red Robin with 3 stars and $$ price category",
                r.toString());
    }

}