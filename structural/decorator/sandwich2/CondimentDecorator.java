import sandwich.Sandwich;

public class CondimentDecorator extends SandwichDecorator{
    String condiment;
    public CondimentDecorator(Sandwich sandwich, String condiment){
        super(sandwich);
        this.condiment = condiment;
    }

    public double getCost(){
        return super.getCost()+2.50;
    }

    public String getIngredients(){
        return super.getIngredients()+" "+condiment;
    }
}
