import sandwich.Sandwich;

public class SideDecorator extends SandwichDecorator{
    String side;
    public SideDecorator(Sandwich sandwich, String side){
        super(sandwich);
        this.side = side;
    }

    public String getIngredients(){
        return super.getIngredients()+" "+side;
    }

    public double getCost(){
        return super.getCost()+2.5;
    }


}
