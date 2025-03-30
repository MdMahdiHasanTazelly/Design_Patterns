public class Main {
    public static void main(String[] args) {
        BasicSandwich base = new BasicSandwich();
        System.out.println(base.getPrice()+"----------"+base.serve());

        AddMayo mayo = new AddMayo(base);
        AddMustard mustard = new AddMustard(mayo);
        AddPickle pickle = new AddPickle(mustard);

        System.out.println(pickle.getPrice()+"----------"+pickle.serve());
    }
}
