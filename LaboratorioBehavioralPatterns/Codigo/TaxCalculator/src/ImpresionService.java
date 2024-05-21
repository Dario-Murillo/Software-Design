import java.util.List;

public class ImpresionService {
    public void imprimir(Factura factura) {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Descripción     | Cantidad | Costo Unitario | Costo Total |");
        System.out.println("-----------------------------------------------------------");

        List<Item> items = factura.getItems();
        for (Item item : items) {
            System.out.printf("%-15s | %8d | %14d | %11d |%n", 
                              item.getDescripcion(), item.getCantidad(), item.getCostoUnitario(), item.getCostoTotal());
        }
        System.out.println("-----------------------------------------------------------");

        System.out.printf("SubTotal %10d%n", factura.getTotal());
        System.out.printf("Impuesto %10.2f%n", factura.getImpuesto());
        System.out.printf("Total %13.2f%n", factura.getTotal() + factura.getImpuesto());
    }
}
