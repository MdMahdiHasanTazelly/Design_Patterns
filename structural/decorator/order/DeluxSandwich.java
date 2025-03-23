
public class DeluxSandwich extends Decorator{
    public DeluxSandwich(Sandwich sandwich){
        super(sandwich);
    }
    public double getCost(){
        return super.getCost()+15;
    }
    public String getIngredients(){
        return super.getIngredients()+", Lattos, Cheese, vaggies,";
    }
}
