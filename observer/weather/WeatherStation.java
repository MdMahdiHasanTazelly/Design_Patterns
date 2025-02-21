
import java.util.ArrayList;

public class WeatherStation implements Subject{

    ArrayList<Observer> observers = new ArrayList<>();

    private double temperature;

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(temperature);
        }
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
        notifyObserver();
    }


}
