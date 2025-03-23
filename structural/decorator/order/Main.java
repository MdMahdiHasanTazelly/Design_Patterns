
public class Main {
    public static void main(String[] args) {
        Sandwich sandwitch = new BasicSandwich();

        Sandwich deluxSandwitch = new DeluxSandwich(sandwitch);

        System.out.println("Delux Sandwich: "+deluxSandwitch.getCost()+"   "+deluxSandwitch.getIngredients());
    }  
}
