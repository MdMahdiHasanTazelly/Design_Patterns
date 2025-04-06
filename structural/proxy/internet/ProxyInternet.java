
import java.util.*;


public class ProxyInternet implements Internet{
    private RealInternet realInternet = new RealInternet();
    private static final List<String> bannedSites = Arrays.asList("abc.com", "xyz.com", "banned.com");

    public void connectTo(String serverHost) throws Exception{
        String lowerServerHost = serverHost.toLowerCase();

        if( bannedSites.contains(lowerServerHost) ){
            throw new Exception("Access Denied."+serverHost);
        }
        realInternet.connectTo(serverHost);
    }
}
