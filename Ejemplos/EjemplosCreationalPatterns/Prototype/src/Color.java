public class Color extends ColorPrototype
{
    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public Color Clone()
    {
        System.out.println("Cloning color RGB: " + red + ", " + green + ", " + blue);
        return new Color(this.red, this.green, this.blue);
    }
}