public class CoffeeDecorator implements CoffeeComponent{

    private CoffeeComponent coffee;
    
    CoffeeDecorator(CoffeeComponent coffee){
        this.coffee = coffee;
    }

    public String getDesc(){
        return coffee.getDesc();
    }
    public double getPrice(){
        return  coffee.getPrice();
    }
 
}
