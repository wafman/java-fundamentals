package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testConstructor(){
        Restaurant r = new Restaurant("Red Robin", 0, "$$");
        assertEquals("should return restaurant name", "Red Robin", r.getName());
    }

    @Test
    public void testToString(){
        Restaurant r = new Restaurant("Red Robin", 0, "$$");
        assertEquals("should give a string with the restaurant information",
                "A restaurant named Red Robin with 0 stars and $$ price category.",
                r.toString());
    }

    @Test
    public void testAddReview(){
        Restaurant r = new Restaurant("Red Robin", 0, "$$$");
        Review review = new Review("crappy place", "William", 1, r);

        assertEquals("should add a review to the restaurant and increase review count", 1,
                r.getStars());
    }

    @Test
    public void testAddReview_multipleReviews(){
        Restaurant r = new Restaurant("Red Robin", 0, "$$$");
        Review review1 = new Review("crappy place", "William", 1, r);
        Review review2 = new Review("horrible", "Jack", 1, r);
        Review review3 = new Review("middle of the road", "John", 3, r);
        Review review4 = new Review("great place", "Jill", 5, r);
        assertEquals("should add all reviews to the restaurant and increase review count", 2,
                r.getStars());

    }

}