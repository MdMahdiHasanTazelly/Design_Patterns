
public class Decorator implements Sandwich{
    private Sandwich sandwich;

    public Decorator(Sandwich decorateSandwich) {
        this.sandwich = decorateSandwich;
    }

    public double getCost(){
        return sandwich.getCost();
    }

    public String getIngredients(){
        return sandwich.getIngredients();
    }
    
}
