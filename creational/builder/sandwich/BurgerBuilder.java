

public class BurgerBuilder extends SandwichBuilder{
    public void addBread(){
        System.out.println("Heating up the Sesame sprinkled Bun.");
        product.b = Bread.BurgerBun;
    }

    public void addProtein(){
        System.out.println("Grilling the Wagyu");
        product.p = Protein.BeefPatty;
    }

    public void addWrapper(){
        System.out.println("Wrapping with 100% recycled paper");
        product.w = Wrapper.Paper;
    }

    public void loadSides(){
        System.out.println("Loading up the Burger");
        addSide(Side.Lettuce);
        addSide(Side.Tomato);
    }

    public void drizzleSauces(){
        System.out.println("Drizzling the sauces");
        addSauces(Sauce.YumYum);
    }
}
