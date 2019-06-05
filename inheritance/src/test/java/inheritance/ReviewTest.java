package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void testConstructor(){
        Restaurant restaurant = new Restaurant("Red Robin", 5, "$$$");
        Review r = new Review("a great place to eat", "William", 3, restaurant);
        assertEquals("should return the author's name", "William", r.getAuthor());
    }

    @Test
    public void testToString(){
        Restaurant restaurant = new Restaurant("Red Robin", 5, "$$$");
        Review r = new Review("a great place to eat", "William", 3, restaurant);
        assertEquals("should return a string with author name, review body and stars rating",
                "William says a great place to eat about Red Robin and gives 3 stars",
                r.toString());
    }

}