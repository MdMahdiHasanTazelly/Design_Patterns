public class DatabaseProxy implements Database{
    private RealDatabase realDatabase;
    private boolean isCached = false;

   public void fetchData(){
    if( !isCached ){
        realDatabase = new RealDatabase();
        isCached = true;
    }
    System.out.println("Returning cached data.......");
   }
}
