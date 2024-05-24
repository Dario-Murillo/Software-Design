/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.ArrayList;
import java.util.List;

public class LicitadorInteresadoEnPromedio implements Licitador {
    private List<Double> ofertasNotificadas = new ArrayList<>();

    private double calcularPromedio() {
        if (ofertasNotificadas.isEmpty()) {
            return 0.0; // Si no hay ofertas, el promedio es 0
        }
        
        double suma = 0;
        for (double monto : ofertasNotificadas) {
            suma += monto;
        }
        
        return suma / ofertasNotificadas.size();
    }
    
    @Override
    public void update(Oferta oferta) {
        ofertasNotificadas.add((double) oferta.getMonto());
        double promedio = calcularPromedio();
        System.out.println(String.format("Promediador: Después de recibir la oferta de %s por un monto de %.2f, el promedio es %.2f", oferta.getArticulo(), oferta.getMonto(), promedio));
    }
}
