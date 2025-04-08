
public class SafeLogger {
    static SafeLogger logger;
    static int count = 0;

    private SafeLogger(){
        count++;
        System.out.println("New instance is created. No of instance: "+count);
    }
    

    public static void log(String message){
        System.out.println(message);
    }

    public static synchronized SafeLogger getLogger(){
         if( logger==null ){
             logger = new SafeLogger();
         }
         return logger;
    }

}
