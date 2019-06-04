package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private String priceCategory;

    public Restaurant(String name, int stars, String priceCategory){
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return String.format("A restaurant named %s with %d stars and %s price category",
            this.name, this.stars, this.priceCategory);
    }


}
