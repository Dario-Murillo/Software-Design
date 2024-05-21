public class ObserverMain {
    public static void main(String[] args) {
        // Create IBM stock and attach investors
        IBM ibm = new IBM("IBM", 120.00);
        ibm.attach(new Investor("Carlos"));
        var ana = new Investor("Ana");
        ibm.attach(ana);

        // Fluctuating prices will notify investors
        ibm.setPrice(120.10);

        ibm.detach(ana);
        ibm.setPrice(121.00);
        ibm.setPrice(120.50);
        ibm.setPrice(120.75);
    }
}
