import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factura {
    private ImpresionService impresion = new ImpresionService();
    private List<Item> items = new ArrayList<>();
    private int total;
    private Pais pais;

    public Factura(Pais pais) {
        this.pais = pais;
    }

    public double getImpuesto() {
        double porcentajeImpuesto = 0;

        switch (pais) {
            case USA:
                porcentajeImpuesto = 0.05;
                break;

            case UK:
                porcentajeImpuesto = 0.07;
                break;

            case CostaRica:
                porcentajeImpuesto = 0.13;
                break;
        }

        return porcentajeImpuesto * total;
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
