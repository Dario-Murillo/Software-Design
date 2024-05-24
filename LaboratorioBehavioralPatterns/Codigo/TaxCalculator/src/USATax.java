
public class USATax extends TaxStrategy {

  @Override
  public double Tax(double total) {
    return  total * 0.05;
  }
  
}
