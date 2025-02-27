// Concrete Subject

import java.util.ArrayList;

public class GroupChat {
    ArrayList<iObserver> observers = new ArrayList<>();

    public void subscribe(iObserver observer){
        observers.add(observer);
    }

    public void unsubscribe(iObserver observer){
        observers.remove(observer);
    }

    public void notify(String message){
        for(iObserver observer : observers){
            observer.update(message);
        }
    }

    public void sendMessage(String message){
        notify(message);
    }
}
