public class App {
    public static void main(String[] args) throws Exception {
        // Create math proxy
        MathProxy proxy = new MathProxy();
        
        // Do the math
        System.out.println("4 + 2 = " + proxy.add(4, 2));
        System.out.println("4 - 2 = " + proxy.sub(4, 2));
        System.out.println("4 * 2 = " + proxy.mul(4, 2));
        System.out.println("4 / 2 = " + proxy.div(4, 2));
        
        // Wait for user
        System.out.println("Press any key to exit.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
