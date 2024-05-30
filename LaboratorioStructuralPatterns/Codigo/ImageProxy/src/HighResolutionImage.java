import java.util.concurrent.TimeUnit;

public class HighResolutionImage implements Image {
    private String rutaImagen;

    public HighResolutionImage(String imageFilePath) {
        this.rutaImagen = imageFilePath;
        loadImage();
    }

    private void loadImage() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void showImage() {
        System.out.println("Mostrando la imagen " + rutaImagen + " en alta resolución");
    }
}