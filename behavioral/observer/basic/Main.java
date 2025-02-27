public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        
        ConcreteObserverA observer1 = new ConcreteObserverA();
        ConcreteObserverB observer2 = new ConcreteObserverB();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObserver();

        subject.removeObserver(observer1);

        subject.notifyObserver();
    }
}
