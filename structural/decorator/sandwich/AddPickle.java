import sandwich.Sandwich;

public class AddPickle extends SandwichDecorator{
    public AddPickle(Sandwich sandwich){
        super(sandwich);
    }
    public double getPrice(){
        return super.getPrice()+2;
    }
    public String serve(){
        return super.serve()+" [Pickle] ";
    }
}
