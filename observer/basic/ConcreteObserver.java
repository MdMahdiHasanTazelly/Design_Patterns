

public class ConcreteObserver implements Observer{
    String name;
    public ConcreteObserver(String name){
        this.name = name;
    }
    
    public void update(){
        System.out.println(name+ "Concrete observer is notified.");
    }
}
