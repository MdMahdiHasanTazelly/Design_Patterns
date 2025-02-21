
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation(24, 34.2);

        Client cli1 = new Client("Client 1");
        Client cli2 = new Client("Client 2");

        station.addObserver(cli1);
        station.addObserver(cli2);

        station.notifyObserver();
    }
}
