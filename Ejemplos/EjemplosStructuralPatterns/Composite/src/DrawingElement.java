public abstract class DrawingElement {
    protected String name;

    // Constructor
    public DrawingElement(String name) {
        this.name = name;
    }

    public abstract void add(DrawingElement d);

    public abstract void remove(DrawingElement d);

    public abstract void display(int indent);
}
