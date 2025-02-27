// Concrete Subject

import java.util.ArrayList;

public class WeatherStation {
    private double temp;
    private double humidity;
    ArrayList<Observer> observers = new ArrayList<>();

    public WeatherStation(double temp, double humidity){
        this.temp = temp;
        this.humidity = humidity;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyObserver(){
        for(Observer observer: observers){
            observer.update(temp, humidity);
        }
    }
}

