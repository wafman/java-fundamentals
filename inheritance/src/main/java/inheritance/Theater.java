package inheritance;

import java.util.ArrayList;

public class Theater {
    private String name;
    private ArrayList<String> movies;
    private ArrayList<Review> movieReviews;
    private String body;
    private String numDollarSigns;
    private int stars;
    private int totalReviews;
    private int totalStars;

    public Theater(String name, int stars, String numDollarSigns){
        this.name = name;
        this.stars = stars;
        this.numDollarSigns = numDollarSigns;
        this.movies = new ArrayList<>();
        this.movieReviews = new ArrayList<>();
        this.totalReviews = 0;
        this.totalStars = 0;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return String.format("The name of this theater is %s and is currently showing movies.", this.name);
    }

    public int getStars() {
        return stars;
    }

    public String getMovies() {
        String answer = "";
        if(movies.size() == 0){
            answer += "No movies showing at this time";
        } else {

            for(String movie : movies){
                answer += movie;
            }
        }
        return answer;
    }

    public void addReview(Review review){
        if(review.getTheater() == this){
            this.movieReviews.add(review);
            this.totalReviews = this.totalReviews + 1;
            this.totalStars = this.totalStars + review.getTheaterReviewStars();
            this.stars = this.totalStars / this.totalReviews;
        } else {
            System.out.println("Theater name does not match for review");
        }
    }

    public void addMovie(String movieName){
        movies.add(movieName);
    }

    public void removeMovie(String movieName){
        if(movies.size() == 0){
            throw new IllegalArgumentException("cannot remove movie when now movies showing");
        }
        if(!movies.contains(movieName)){
            throw new IllegalArgumentException("movie not showing at this theater");
        }
        while(movies.contains(movieName)){
            for(int i = 0; i < movies.size(); i++){
                if(movies.get(i) == movieName){
                    movies.remove(i);
                }
            }
        }

    }


}
