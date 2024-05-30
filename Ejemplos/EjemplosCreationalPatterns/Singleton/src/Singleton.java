public class Singleton {
    public static void main(String[] args) throws Exception {
        LoadBalancer b1 = LoadBalancer.getInstance();
        LoadBalancer b2 = LoadBalancer.getInstance();
        LoadBalancer b3 = LoadBalancer.getInstance();
        LoadBalancer b4 = LoadBalancer.getInstance();

        if (b1 == b2 && b2 == b3 && b3 == b4){
            System.out.println("Same instance of balancer");
        }

        for(var i = 0; i < 15; i++){
            String server = b1.getServer();
            System.out.println(server);
        }
    }
}
