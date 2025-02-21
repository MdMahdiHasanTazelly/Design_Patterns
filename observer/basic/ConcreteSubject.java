import java.util.ArrayList;

public class ConcreteSubject {

    ArrayList<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
