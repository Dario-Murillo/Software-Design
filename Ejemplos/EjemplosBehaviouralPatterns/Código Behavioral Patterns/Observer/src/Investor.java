public class Investor implements IInvestor {
    private String name;
    private Stock stock;

    // Constructor
    public Investor(String name) {
        this.name = name;
    }

    public void update(Stock stock) {
        System.out.printf("Notified %s of %s's change to %.2f%n", name, stock.getSymbol(), stock.getPrice());
    }

    // Gets or sets the stock
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}