
public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){  
        this.turkey = turkey;
    }

    public void quack(){
        turkey.gooble();
    }

    public void fly(){
        turkey.fly();
    }
}
