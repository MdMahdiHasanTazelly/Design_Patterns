
public class Main {
    public static Sandwich createSandwich(SandwichBuilder builder){
        builder.addBread();
        builder.addProtein();
        builder.loadSides();
        builder.drizzleSauces();
        builder.addWrapper();

        return builder.returnProduct();
    }

    public static void main(String[] args) {

        System.out.println("Creating Burger........");
        Sandwich burger = createSandwich( new BurgerBuilder() );
        System.out.println(burger);


        System.out.println("\n\nCreating hotdog...........");
        Sandwich hotdog = createSandwich( new HotdogBuilder() );
        System.out.println(hotdog);

        System.out.println("\n\nCreating BLT................");
        Sandwich blt = createSandwich( new BLTBuilder() );
        System.out.println(blt);
    }
}
