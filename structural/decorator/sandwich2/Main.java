
public class Main {
    public static void serve(double cost, String ingredients){
        System.out.println("Cost: "+cost+"  Ingredients: "+ingredients);
    }
    public static void main(String[] args) {
        Sandwich basic = new BasicSandwich();
        serve(basic.getCost(), basic.getIngredients());

        Sandwich decorate1 = new CondimentDecorator(basic, "mustard, pickle");
        serve(decorate1.getCost(), decorate1.getIngredients());

        // SideDecorator decorate2 = new SideDecorator(decorate1, " cheese, veggies");
        // serve(decorate2.getCost(), decorate2.getIngredients());


    }
}
