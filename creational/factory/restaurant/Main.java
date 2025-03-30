
public class Main {
    public static void main(String[] args) {
        // singleton instance
        FactoryRegistry registry = FactoryRegistry.getInstance();

        registry.registerFactory(FoodType.PASTA, new SpaghettiFactory());
        registry.registerFactory(FoodType.PIZZA, new CheesePizzaFactory());

        FoodFactory pastaFactory = registry.getFactory(FoodType.PASTA);
        FoodItem food = pastaFactory.createFood();
        food.prepare();

        FoodFactory pizzFactory = registry.getFactory(FoodType.PIZZA);
        FoodItem pizza = pizzFactory.createFood();
        pizza.prepare();
    }
}
