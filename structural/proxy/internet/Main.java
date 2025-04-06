
public class Main {
    public static void attemptConnection (Internet internet, String serverHost) {
        try {
            internet.connectTo(serverHost);
            System.out.println("Successfully connected to "+serverHost);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        attemptConnection(internet, "example.com");

        attemptConnection(internet, "abc.com");
    }
}
