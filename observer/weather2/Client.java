

public class Client implements Observer{
    String name;
    public Client(String name){
        this.name = name;
    }

    public void update(double temp, double humidity){
        System.out.println(name+" Got temperature "
        +temp+" Humidity: "+humidity);
    }
}
