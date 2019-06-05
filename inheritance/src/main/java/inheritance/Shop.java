package inheritance;

public class Shop {
    private String name;
    private String description;
    private String numDollarSigns;

    public Shop(String name, String description, String numDollarSigns){
        this.name = name;
        this.description = description;
        this.numDollarSigns = numDollarSigns;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return String.format("This shop by the name of %s can be described as %s with a price rating of %s", this.name,
                this.description, this.numDollarSigns);
    }

}
