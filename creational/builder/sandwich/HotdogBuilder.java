

public class HotdogBuilder extends SandwichBuilder{
    public void addBread(){
        System.out.println("Steaming up the buns");
        product.b = Bread.HotdogBun;
    }

    public void addProtein(){
        System.out.println("Boiling the hotdog in brine");
        product.p = Protein.Dog;
    }
    
    public void addWrapper(){
        System.out.println("Placing the hotdog into box");
        product.w = Wrapper.Box;
    }

    public void loadSides(){
        System.out.println("Loading up the Hotdog");
        addSide(Side.Onions);
    }

    public void drizzleSauces(){
        System.out.println("Drizzling the sauces");
        addSauces(Sauce.Mustard);
    }

}
