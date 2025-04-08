
public class SandwichDecorator {
    Sandwich sandwich;
    public SandwichDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public double getCost(){
        return sandwich.getCost();
    }

    public String getIngredients(){
        return sandwich.getIngredients();
    }
}
