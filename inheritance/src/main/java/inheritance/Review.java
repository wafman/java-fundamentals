package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public String getAuthor(){
        return author;
    }

    public String toString(){
        return String.format("%s says %s and gives %d stars", this.author, this.body, this.stars);
    }


}
