public class SandwichDecorator implements Sandwich{
    Sandwich sandwich;
    public SandwichDecorator(Sandwich basic){
        this.sandwich = basic;
    }

    public double getPrice(){
        return sandwich.getPrice();
    }

    public String serve(){
        return sandwich.serve();
    }
}
