package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private String priceCategory;
    private ArrayList<Review> reviews;
    private int totalReviews;
    private int totalStars;


    public Restaurant(String name, int stars, String priceCategory){
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
        this.totalReviews = 0;
        this.totalStars = 5;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return String.format("A restaurant named %s with %d stars and %s price category.",
            this.name, this.stars, this.priceCategory);
    }

    public int getStars() {
        return stars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public int getTotalReviews() {
        return totalReviews;
    }

    public void addReview(Review review){
        if(review.getRestaurant() == this.name){
            this.reviews.add(review);
            this.totalReviews = this.totalReviews + 1;

//            this.stars = (this.stars + review.getReviewStars()) / this.totalReviews;
            if(this.stars >= 5 && this.totalReviews <= 1){
                this.stars = 5;
            } else {
                this.totalStars = this.totalStars + review.getReviewStars();
                this.stars = this.totalStars / this.totalReviews;
//                int temp = this.stars + review.getReviewStars();
//                int ans = temp / this.totalReviews;
//                this.stars = ans;
            }
        } else {
            System.out.println("Restaurant name does not match for review");
        }
    }


}
