/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factura {
    private ImpresionService impresion = new ImpresionService();
    private List<Item> items = new ArrayList<>();
    private int total;
    private TaxStrategy strategy;

    public Factura(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double getImpuesto() {
        double porcentajeImpuesto = strategy.Tax(total);
        return porcentajeImpuesto;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public int getTotal() {
        return total;
    }

    public void addItem(Item item) {
        total += item.getCostoTotal();
        items.add(item);
    }

    public void imprimir() {
        impresion.imprimir(this);
    }
}
