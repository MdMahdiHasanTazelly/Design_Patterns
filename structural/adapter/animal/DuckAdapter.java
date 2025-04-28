
public class DuckAdapter implements Turkey{
    private Duck duck;
    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    public void gooble(){
        duck.quack();
    }

    public void fly(){
        duck.fly();
    }
}
