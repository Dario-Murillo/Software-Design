
public class CostaRicaTax extends TaxStrategy {

  @Override
  public double Tax(double total) {
    return total * 0.07;
  }  
}
