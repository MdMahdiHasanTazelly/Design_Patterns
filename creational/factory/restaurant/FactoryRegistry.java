
import java.util.HashMap;
import java.util.Map;

public class FactoryRegistry {
    private static FactoryRegistry instance;
    private final Map<FoodType, FoodFactory> factories = new HashMap<>();

    public static FactoryRegistry getInstance(){
        if(instance == null){
            return new FactoryRegistry();
        }
        return instance;
    }

    public void registerFactory(FoodType type, FoodFactory factory){
        factories.put(type, factory);
    }

    public FoodFactory getFactory(FoodType type){
        return factories.get(type);
    }
}
