

public class Phone implements Observer {
    private String name;

    public Phone(String name){
        this.name = name;
    }

    public void update(double temperature){
        System.out.println(name+" Received temperature "+ temperature);
    }
}
