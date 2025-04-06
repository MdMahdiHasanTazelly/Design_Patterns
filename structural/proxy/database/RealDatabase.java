public class RealDatabase implements Database{
    public RealDatabase(){
        System.out.println("Connecting to the Database........");
    }

    public void fetchData(){
        System.out.println("Fetching data from database.");
    }
}