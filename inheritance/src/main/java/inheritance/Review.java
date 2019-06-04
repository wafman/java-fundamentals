package inheritance;

public class Review {
    private String author;
    private String body;
    private int reviewStars;
    private String restaurant;

    public Review(String body, String author, int reviewStars, String restaurant){
        this.body = body;
        this.author = author;
        this.reviewStars = reviewStars;
        this.restaurant = restaurant;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return String.format("%s says %s about %s and gives %d stars", this.author, this.body, this.restaurant, this.reviewStars);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setStars(int reviewStars) {
        this.reviewStars = reviewStars;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getBody() {
        return body;
    }

    public int getReviewStars() {
        return reviewStars;
    }

    public String getRestaurant() {
        return restaurant;
    }
}
