/*
 * Dario Murillo Chaverri C15406
 * José Fabián Guzmán González C23660 
 */

public class App {
    public static void main(String[] args) throws Exception {
        Factura facturaCR = new Factura(new CostaRicaTax());
        facturaCR.addItem(new Item("Uvas", 10, 10));
        facturaCR.addItem(new Item("Bananos", 5, 5));
        facturaCR.addItem(new Item("Manzanas", 8, 100));

        facturaCR.imprimir();
        System.out.println();

        Factura facturaUSA = new Factura(new USATax());
        facturaUSA.addItem(new Item("Uvas", 10, 10));
        facturaUSA.addItem(new Item("Bananos", 5, 5));
        facturaUSA.addItem(new Item("Manzanas", 8, 100));

        facturaUSA.imprimir();
        System.out.println();

        Factura facturaUK = new Factura(new UKTax());
        facturaUK.addItem(new Item("Uvas", 10, 10));
        facturaUK.addItem(new Item("Bananos", 5, 5));
        facturaUK.addItem(new Item("Manzanas", 8, 100));

        facturaUK.imprimir();

    }
}
