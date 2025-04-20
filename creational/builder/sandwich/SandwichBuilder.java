

public abstract class SandwichBuilder {
    Sandwich product = new Sandwich();

    public abstract void addBread();

    public abstract void addProtein();

    public abstract void addWrapper();

    public abstract void loadSides();

    public abstract void drizzleSauces();

    public void addSide(Side s){
        product.sides.add(s);
    }

    public void addSauces(Sauce s){
        product.sauces.add(s);
    }

    public Sandwich returnProduct(){
        return product;
    }
}
