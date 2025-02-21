
public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStarStation = new WeatherStation();

        Observer observer1 = new Phone("Phone1");
        Observer observer2 = new Phone("Phone2");

        weatherStarStation.addObserver(observer1);
        weatherStarStation.addObserver(observer2);

        weatherStarStation.setTemperature(25.4);
    }
}
