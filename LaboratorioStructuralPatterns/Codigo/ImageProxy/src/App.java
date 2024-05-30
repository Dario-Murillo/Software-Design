public class App {
    public static void main(String[] args) throws Exception {
        Stopwatch crono = new Stopwatch();

        // //Creamos tres imagenes con proxy
        // crono.start();
        // Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
        // Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
        // Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");
        // System.out.println("Cargando las imagenes con proxy duró " + crono.elapsedMillis() + " milisegundos.");
        // crono.stop();

        // //Simulamos que el usuario hace click en la imagen 1
        // crono.start();
        // highResolutionImage1.showImage();
        // System.out.println("Mostrando la imagen 1 duró " + crono.elapsedMillis() + " milisegundos.");
        // crono.stop();

        //Usamos ahora las imagenes directamente (las que se cargan en el constructor)
        crono.start();
        Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImageNoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");
        System.out.println("Cargando las imagenes sin proxy duró " + crono.elapsedMillis() + " milisegundos.");
        crono.stop();

        //Simulamos que el usuario hace click en la imagen 2
        highResolutionImageNoProxy2.showImage();
    }
}
