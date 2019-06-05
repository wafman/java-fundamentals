package inheritance;

public class Review {
    private String author;
    private String body;
    private int restaurantReviewStars;
    private int shopReviewStars;
    private int theaterReviewStars;
    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movieName;

    public Review(String body, String author, int restaurantReviewStars, Restaurant restaurant){
        this.body = body;
        this.author = author;
        this.restaurantReviewStars = restaurantReviewStars;
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }

    public Review(String body, String author, int shopReviewStars, Shop shop){
        this.body = body;
        this.author = author;
        this.shopReviewStars = shopReviewStars;
        this.shop = shop;
        shop.addReview(this);
    }

    public Review(String body, String author, int theaterReviewStars, Theater theater, String movieName){
        this.body = body;
        this.author = author;
        this.theaterReviewStars = theaterReviewStars;
        this.theater = theater;
        this.movieName = movieName;
        theater.addReview(this);
    }

    public Review(String body, String author, int theaterReviewStars, Theater theater){
        this.body = body;
        this.author = author;
        this.theaterReviewStars = theaterReviewStars;
        this.theater = theater;
        theater.addReview(this);
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return String.format("%s says %s about %s and gives %d stars", this.author, this.body, restaurant.getName(), this.restaurantReviewStars);
    }

    public int getRestaurantReviewStars() {
        return restaurantReviewStars;
    }

    public int getShopReviewStars() {
        return shopReviewStars;
    }

    public int getTheaterReviewStars() {
        return theaterReviewStars;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Shop getShop() {
        return shop;
    }

    public Theater getTheater() {
        return theater;
    }
}
