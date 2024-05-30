public class Customers extends CustomersBase {
    @Override
    public void showAll() {
        // Add separator lines
        System.out.println();
        System.out.println("------------------------");
        super.showAll();
        System.out.println("------------------------");
    }
}
