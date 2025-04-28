
public class MallardDuckAdapter implements Turkey{
    private MallardDuck mDuck;

    public MallardDuckAdapter(){
        this.mDuck = new MallardDuck(); //in class adapter, object is created , not passed
    }

    public void gooble(){
        mDuck.quack();
    }

    public void fly(){
        mDuck.fly();
    }
}
