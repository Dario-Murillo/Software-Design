/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class LicitadorDeAntiguedades implements Licitador {
    
    @Override
    public void update(Oferta oferta) {
        System.out.println(String.format("LicitadorDeAntiguedades fue notificado de una nueva oferta del artículo %s por un monto de %.2f", oferta.getArticulo(), oferta.getMonto()));
    }
}