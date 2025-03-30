
public class CheesePizzaFactory implements FoodFactory{
    public FoodItem createFood(){
        return new CheesePizza();
    }
}
