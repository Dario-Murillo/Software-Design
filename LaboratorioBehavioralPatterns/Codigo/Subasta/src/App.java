public class App {
    public static void main(String[] args) {
        Subastador s = new Subastador();
        s.attach(new LicitadorDeAntiguedades());
        s.attach(new LicitadorInteresadoEnBlog());
        s.attach(new LicitadorInteresadoEnPromedio());
        s.attach(new LicitadorDeJoyas());
        Oferta oferta = new Oferta();
        oferta.setArticulo("Candelabro");
        oferta.setMonto(1000.00);

        imprimirMensajeDeControl("Presione <Enter> para procesar la primera oferta por 1000.");
        s.notify(oferta);

        imprimirMensajeDeControl("Presione <Enter> para procesar la segunda oferta por 1200.");
        oferta.setMonto(1200);
        s.notify(oferta);

        imprimirMensajeDeControl("Presione <Enter> para procesar la tercera oferta por 1500.");
        oferta.setMonto(1500);
        s.notify(oferta);

        // Wait for user input before exiting
        new java.util.Scanner(System.in).nextLine();
    }

    private static void imprimirMensajeDeControl(String mensaje) {
        System.out.println("\u001B[32m" + mensaje); // Set console text color to green
        System.out.print("\u001B[0m"); // Reset console text color
        new java.util.Scanner(System.in).nextLine();
    }
}
