
public class Main {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        testDuck(duck);

        Turkey turkey = new WildTurkey();
        testTurkey(turkey);

        System.out.println("\nTurkey Adapter performing");
        Duck tAdapter = new TurkeyAdapter(turkey);
        testDuck(tAdapter);

        System.out.println("\nDuck adapter performing.");
        Turkey dAdapter = new DuckAdapter(duck);
        testTurkey(dAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();;
        duck.fly();
    }

    public static void testTurkey(Turkey turkey) {
        turkey.gooble();
        turkey.fly();
    }
}
