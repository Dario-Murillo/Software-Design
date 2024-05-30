public class App {
    public static void main(String[] args) throws Exception {
        // Facade
        Mortgage mortgage = new Mortgage();
        
        // Evaluate mortgage eligibility for customer
        Customer customer = new Customer("Ann McKinsey");
        boolean eligible = mortgage.isEligible(customer, 125000);
        System.out.println("\n" + customer.getName() +
                " has been " + (eligible ? "Approved" : "Rejected"));
        
        // Wait for user
        System.out.println("Press any key to exit.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
