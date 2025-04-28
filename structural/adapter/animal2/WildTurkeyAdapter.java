
public class WildTurkeyAdapter implements Duck{
    private WildTurkey wTurkey;

    public WildTurkeyAdapter(){
        this.wTurkey = new WildTurkey(); //in class adapter, object is created , not passed
    }

    public void quack(){
        wTurkey.gooble();
    }
    public void fly(){
        wTurkey.fly();
    }
}
