public class ImageProxy implements Image {
    HighResolutionImage image;
    String path;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void showImage() {
        this.image = new HighResolutionImage(path);
        this.image.showImage();
    }
}
