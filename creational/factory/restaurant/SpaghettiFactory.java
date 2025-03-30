
public class SpaghettiFactory implements FoodFactory{
    public FoodItem createFood(){
        return new Spaghetti();
    }
}
