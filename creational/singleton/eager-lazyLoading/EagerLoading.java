//when instance is created at run-time, is called eager singleton
public class EagerLoading {

    private static final EagerLoading instance = new EagerLoading();

    private EagerLoading(){
        System.out.println("Eager Singleton object is created");
    }

    public static EagerLoading getInstance(){
       return instance;
    }
}
