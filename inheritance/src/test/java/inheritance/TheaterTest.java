package inheritance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testGetName(){
        Theater t = new Theater("Bonney Lake", 0, "$$");
        assertEquals("should return theater name", "Bonney Lake", t.getName());
    }

    @Test
    public void testToString(){
        Theater t = new Theater("Bonney Lake", 0, "$$");
        assertEquals("should return all information about theater", "The name of this theater is Bonney Lake" +
                " and is currently showing movies.", t.toString());
    }

    @Test
    public void testAddReview_withMovieName(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        Review review = new Review("very clean", "william", 5, theater, "Jaws");
        assertEquals("should add theater review to theater array", 5, theater.getStars());
    }

    @Test
    public void testAddReview_withoutMovieName(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        Review review = new Review("very clean", "william", 5, theater);
        assertEquals("should add theater review to theater array", 5, theater.getStars());
    }

    @Test
    public void testAddReview_multipleReviews_withMovieName(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        Review review1 = new Review("very clean", "william", 5, theater, "Jaws");
        Review review2 = new Review("not so bad", "luke", 3, theater, "Saw");
        Review review3 = new Review("decent place", "Chai", 4, theater, "Saw 2");
        assertEquals("should add all reviews, and re-calculate the theater stars",
                4, theater.getStars());
    }

    @Test
    public void testAddReview_multipleReviews_withoutMovieName(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        Review review1 = new Review("very clean", "william", 5, theater);
        Review review2 = new Review("not so bad", "luke", 3, theater);
        Review review3 = new Review("decent place", "Chai", 4, theater);
        assertEquals("should add all reviews, and re-calculate the theater stars",
                4, theater.getStars());
    }

    @Test
    public void testAddMovie(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        theater.addMovie("Saw");
        assertEquals("should add movie to list and return", "Saw", theater.getMovies());
    }

    @Test
    public void testAddMovie_multiple(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        theater.addMovie("Saw");
        theater.addMovie("Scream");
        theater.addMovie("The Conjuring");
        String expectedOutput = "Saw" +
                "Scream" +
                "The Conjuring";
        assertEquals("should return all movies", expectedOutput, theater.getMovies());
    }

    @Test
    public void testAddMovie_noMovies(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        String expectedOutput = "No movies showing at this time";
        assertEquals("should return that no movies are present", expectedOutput, theater.getMovies());
    }

    @Test
    public void testRemoveMovie(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        theater.addMovie("Saw");
        theater.addMovie("Scream");
        theater.addMovie("The Conjuring");
        theater.removeMovie("Scream");
        String expectedOutput = "Saw" +
                "The Conjuring";
        assertEquals("should return only Saw and The Conjuring", expectedOutput, theater.getMovies());
    }

    @Test
    public void testRemoveMovie_multiple(){
        Theater theater = new Theater("Bonney Lake", 0, "$$");
        theater.addMovie("Saw");
        theater.addMovie("Scream");
        theater.addMovie("The Conjuring");
        theater.addMovie("I Know What You Did Last Summer");
        theater.addMovie("The Exorcist");
        theater.removeMovie("Saw");
        theater.removeMovie("The Exorcist");
        String expectedOutput = "Scream" +
                "The Conjuring" +
                "I Know What You Did Last Summer";
        assertEquals("should return list of movies without Saw or The Exorcist", expectedOutput, theater.getMovies());
    }

}