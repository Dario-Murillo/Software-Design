public class App {
    public static void main(String[] args) throws Exception {
        // Create RefinedAbstraction
        Customers customers = new Customers();
        // Set ConcreteImplementor
        customers.setData(new CustomersData("Chicago"));
        // Exercise the bridge
        customers.show();
        customers.next();
        customers.show();
        customers.next();
        customers.show();
        customers.add("Henry Velasquez");
        customers.showAll();
        // Wait for user
        System.out.println("Press any key to exit.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
