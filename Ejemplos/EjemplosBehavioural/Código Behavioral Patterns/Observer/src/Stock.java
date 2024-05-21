import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
    private String symbol;
    private double price;
    private List<IInvestor> investors = new ArrayList<IInvestor>();

    // Constructor
    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void attach(IInvestor investor) {
        investors.add(investor);
    }

    public void detach(IInvestor investor) {
        investors.remove(investor);
    }

    public void notifyInvestors() {
        for (IInvestor investor : investors) {
            investor.update(this);
        }
        System.out.println("");
    }

    // Gets or sets the price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (this.price != price) {
            this.price = price;
            notifyInvestors();
        }
    }

    // Gets the symbol
    public String getSymbol() {
        return symbol;
    }
}
