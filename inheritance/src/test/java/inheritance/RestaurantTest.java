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
                "A restaurant named Red Robin with 3 stars and $$ price category.",
                r.toString());
    }

    @Test
    public void testAddReview(){
        Restaurant r = new Restaurant("Red Robin", 5, "$$$");
        Review review = new Review("crappy place", "William", 1, "Red Robin");
        r.addReview(review);
        assertEquals("should add a review to the restaurant and increase review count", 5,
                r.getStars());
    }

    @Test
    public void testAddReview_multipleReviews(){
        Restaurant r = new Restaurant("Red Robin", 5, "$$$");
        Review review1 = new Review("crappy place", "William", 1, "Red Robin");
        Review review2 = new Review("horrible", "Jack", 1, "Red Robin");
        Review review3 = new Review("middle of the road", "John", 3, "Red Robin");
        Review review4 = new Review("great place", "Jill", 5, "Red Robin");
        r.addReview(review1);
        r.addReview(review2);
        r.addReview(review3);
        r.addReview(review4);
        assertEquals("should add all reviews to the restaurant and increase review count", 3,
                r.getStars());

    }

}