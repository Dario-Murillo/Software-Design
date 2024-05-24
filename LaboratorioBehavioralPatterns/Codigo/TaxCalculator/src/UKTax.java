
public class UKTax extends TaxStrategy {

  @Override
  public double Tax(double total) {
    return total * 0.13;
  }
  
}
