// Cncrete Observer

public class Friends implements iObserver{
    String name;
    public Friends(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println(name+" revceived message "+message);
    }
}
