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

    @Test
    public void testAddReview(){
        Shop shop = new Shop("Store", "sells things", "$$$");
        Review review = new Review("crappy place", "william", 1, shop);
        shop.addReview(review);
        assertEquals("should add a review to the shop and re-calculate review stars count", 1,
                shop.getStars());
    }

    @Test
    public void testAddReview_multipleReviews(){
        Shop shop = new Shop("Store", "sells things", "$$");
        Review review1 = new Review("great place", "william", 5, shop);
        Review review2 = new Review("horrible joint", "Robert", 1, shop);
        Review review3 = new Review("mediocre business", "Stephen", 3, shop);
        assertEquals("should add all reviews to the shop and re-calculate review stars count", 3,
                shop.getStars());
    }


}