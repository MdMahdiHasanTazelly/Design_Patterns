

public class Main {
    public static void main(String[] args) {
        ConcreteSubject sub = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");

        sub.addObserver(observer1);

        sub.notifyObserver();

    }
}
