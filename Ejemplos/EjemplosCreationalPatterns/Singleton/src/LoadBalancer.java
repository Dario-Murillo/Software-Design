import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private volatile  static LoadBalancer instance;
    List<String> servers = new ArrayList<String>();
    Random random = new Random();
    
    private LoadBalancer() {
        // Private constructor to prevent external instantiation
        servers.add("ServerI");
        servers.add("ServerII");
        servers.add("ServerIII");
        servers.add("ServerIV");
        servers.add("ServerV");
    }

    public static LoadBalancer getInstance() {

        if (instance == null) {

            synchronized (LoadBalancer.class) 
            {  
                // Double checked 
                if (instance == null) {  
                    instance = new LoadBalancer(); 
                } 
            } 
        }

        return instance;
    } 

    public String getServer() {
        int r = random.nextInt(servers.size());
        return servers.get(r);
    }
}
