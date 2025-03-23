
public class MilkCoffee extends CoffeeDecorator{

    public MilkCoffee(CoffeeComponent coffee) {
        super(coffee);
    }

    public String getDesc(){
        return super.getDesc()+": Milk Coffee.";
    }
    public double getPrice(){
        return super.getPrice()+1.5;
    }
    
}
