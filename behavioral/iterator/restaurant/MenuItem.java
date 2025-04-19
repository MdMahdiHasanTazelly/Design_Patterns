
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean isVageterian(){
        return this.vegetarian;
    }

    public double getPrice(){
        return this.price;
    }

    public String toString(){
        return this.name+" -> $"+this.price+" -> "+this.description;
    }
}
