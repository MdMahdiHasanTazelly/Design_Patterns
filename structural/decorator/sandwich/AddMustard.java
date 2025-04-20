import sandwich.Sandwich;

public class AddMustard extends SandwichDecorator{
    public AddMustard(Sandwich sandwich){
        super(sandwich);
    }

    public double getPrice(){
        return super.getPrice()+2;
    }

    public String serve(){
       return super.serve()+" [Mustard] ";
    }
}
