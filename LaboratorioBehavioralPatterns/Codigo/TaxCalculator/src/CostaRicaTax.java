/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class CostaRicaTax extends TaxStrategy {

  @Override
  public double Tax(double total) {
    return total * 0.07;
  }  
}
