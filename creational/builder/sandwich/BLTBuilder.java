
public class BLTBuilder extends SandwichBuilder{
    public void addBread(){
        System.out.println("Toasting bread in toaster");
        product.b = Bread.Toast;
    }

    public void addProtein(){
        System.out.println("Sizzling bacon in cast iron pan");
        product.p = Protein.Bacon;
    }

    public void addWrapper(){
        System.out.println("Wrapping up in a compostable plastic wrap");
        product.w = Wrapper.Plastic;
    }

    public void loadSides(){
        System.out.println("Loading up the BLT");
        addSide(Side.Tomato);
        addSide(Side.Lettuce);
    }

    public void drizzleSauces(){
        System.out.println("Drizzling with the sauces");
        addSauces(Sauce.Mayo);
    }
}
