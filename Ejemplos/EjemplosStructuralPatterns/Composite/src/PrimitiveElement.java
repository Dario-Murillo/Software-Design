public class PrimitiveElement extends DrawingElement {
    // Constructor
    public PrimitiveElement(String name) {
        super(name);
    }

    @Override
    public void add(DrawingElement c) {
        System.out.println("Cannot add to a PrimitiveElement");
    }

    @Override
    public void remove(DrawingElement c) {
        System.out.println("Cannot remove from a PrimitiveElement");
    }

    @Override
    public void display(int indent) {
        System.out.println(new String(new char[indent]).replace("\0", "-") + " " + name);
    }
}
