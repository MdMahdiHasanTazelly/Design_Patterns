import java.util.ArrayList;
public class ConcreteSubject implements Subject{
    ArrayList<Observer> observers = new ArrayList<>();


    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update();
        }
    }
}
