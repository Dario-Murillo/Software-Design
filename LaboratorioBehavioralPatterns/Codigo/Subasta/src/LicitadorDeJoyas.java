/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class LicitadorDeJoyas implements Licitador {

  @Override
  public void update(Oferta oferta) {
    System.out.println(String.format("LicitadorDeJoyas fue notificado de una nueva oferta del artículo %s por un monto de %.2f", oferta.getArticulo(), oferta.getMonto()));
  }
  
}
