public class VicePresident extends Approver {
    @Override
    public void processRequest(Purchase purchase) {
        if (purchase.getAmount() < 25000.0) {
            System.out.printf("%s approved request# %d\n",
                    this.getClass().getSimpleName(), purchase.getNumber());
        } else if (successor != null) {
            successor.processRequest(purchase);
        }
    }
}