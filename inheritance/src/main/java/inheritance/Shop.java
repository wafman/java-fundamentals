package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private String numDollarSigns;
    private int stars;
    private ArrayList<Review> shopReviews;
    private int totalReviews;
    private int totalStars;

    public Shop(String name, String description, String numDollarSigns){
        this.name = name;
        this.description = description;
        this.numDollarSigns = numDollarSigns;
        this.shopReviews = new ArrayList<>();
        this.totalReviews = 0;
        this.totalStars = 0;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return String.format("This shop by the name of %s can be described as %s with a price rating of %s", this.name,
                this.description, this.numDollarSigns);
    }

    public int getStars() {
        return stars;
    }

    public void addReview(Review review){
        if(review.getShop() == this){
            this.shopReviews.add(review);
            this.totalReviews = this.totalReviews + 1;
            this.totalStars = this.totalStars + review.getShopReviewStars();
            this.stars = this.totalStars / this.totalReviews;
        } else {
            System.out.println("Shop name does not match for review");
        }
    }

}
