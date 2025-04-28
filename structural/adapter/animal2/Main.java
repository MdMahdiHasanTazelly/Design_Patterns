// This is class adapter example
public class Main {
    public static void main(String[] args) {

        Duck mDuck = new MallardDuck();
        testDuck(mDuck);

        Turkey wTurkey = new WildTurkey();
        testTurkey(wTurkey);

        System.out.println("\nWild turkey adapter is performing.");
        Duck tAdapter = new WildTurkeyAdapter();
        testDuck(tAdapter);

        System.out.println("\nMallardduck is performing.");
        Turkey dAdapter = new MallardDuckAdapter();
        testTurkey(dAdapter);

        
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gooble();;
        turkey.fly();
    }
}
