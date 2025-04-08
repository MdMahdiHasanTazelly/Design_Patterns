
public class Main {

    public static void userLog(){
        SafeLogger logger1 = SafeLogger.getLogger();
        logger1.log("This is from user 1");
        
    }

    public static void user2Log(){
        SafeLogger logger2 = SafeLogger.getLogger();
        logger2.log("This is from user 2");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread( ()-> userLog() );
        Thread t2 = new Thread( ()-> user2Log() );

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        

       
    }
}
