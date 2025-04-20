import sandwich.Sandwich;

public class AddMayo extends SandwichDecorator{
    public AddMayo(Sandwich sandwich){
        super(sandwich);
    }

    public double getPrice(){
        return super.getPrice()+1.5;
    }
    public String serve(){
        return super.serve()+" [Add mayo] ";
    }
}
