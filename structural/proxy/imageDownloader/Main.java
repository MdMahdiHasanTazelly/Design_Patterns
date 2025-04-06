
public class Main {
    public static void main(String[] args) {
        Image proxy = new ProxyImage("dogs.png");

        proxy.display();

        System.out.println("---------");

        proxy.display();

    }
}
