public class Prototype {
    public static void main(String[] args) throws Exception {
        ColorManager colormanager = new ColorManager();
        // Initialize with standard colors
        colormanager.setColor("red", new Color(255, 0, 0));
        colormanager.setColor("green", new Color(0, 255, 0));
        colormanager.setColor("blue", new Color(0, 0, 255));
        // User adds personalized colors
        colormanager.setColor("angry", new Color(255, 54, 0));
        colormanager.setColor("peace", new Color(128, 211, 128));
        colormanager.setColor("flame", new Color(211, 34, 20));
        // User clones selected colors
        Color color1 = colormanager.getColor("red").Clone();
        Color color2 = colormanager.getColor("peace").Clone();
        Color color3 = colormanager.getColor("flame").Clone();

    }
}
