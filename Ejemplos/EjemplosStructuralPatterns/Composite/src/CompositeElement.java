import java.util.List;
import java.util.ArrayList;

public class CompositeElement extends DrawingElement {
    private List<DrawingElement> elements = new ArrayList<>();

    // Constructor
    public CompositeElement(String name) {
        super(name);
    }

    @Override
    public void add(DrawingElement d) {
        elements.add(d);
    }

    @Override
    public void remove(DrawingElement d) {
        elements.remove(d);
    }

    @Override
    public void display(int indent) {
        System.out.println(new String(new char[indent]).replace("\0", "-") + "+ " + name);
        // Display each child element on this node
        for (DrawingElement d : elements) {
            d.display(indent + 2);
        }
    }
}
