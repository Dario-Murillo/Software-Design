import java.util.HashMap;

public class ColorManager
{
    private HashMap<String, Color> colors = new HashMap<String, Color>();

    public Color getColor(String key)
    {
        return colors.get(key);
    }

    public void setColor(String key, Color color)
    {
        colors.put(key, color);
    }

}