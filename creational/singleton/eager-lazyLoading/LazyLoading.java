// // In lazy loading instance is created when it's needed

public class LazyLoading {
    private static LazyLoading instance;

    private LazyLoading() {
        System.out.println("Lazy loading instance is created.");
    }
    // "synchronized" is for thread safety situtaion. If multiple threads create multiple instances at a time
    // If thread A & B executes getInstance() at a same time
    // thread A gets --> instance==null
    // thread B gets --> instance==null
    // so both creates instance and breakes singleton's purpose
    public static synchronized LazyLoading getInstnce(){
        if( instance==null ){
            instance = new LazyLoading();
        }
        return instance;
    }
}
