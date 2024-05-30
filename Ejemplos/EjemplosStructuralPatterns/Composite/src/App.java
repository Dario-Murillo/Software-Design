import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a tree structure 
        CompositeElement root = new CompositeElement("Picture");
        root.add(new PrimitiveElement("Red Line"));
        root.add(new PrimitiveElement("Blue Circle"));
        root.add(new PrimitiveElement("Green Box"));
        // Create a branch
        CompositeElement comp = new CompositeElement("Two Circles");
        comp.add(new PrimitiveElement("Black Circle"));
        comp.add(new PrimitiveElement("White Circle"));
        root.add(comp);
        // Add and remove a PrimitiveElement
        PrimitiveElement pe = new PrimitiveElement("Yellow Line");
        root.add(pe);
        root.remove(pe);
        // Recursively display nodes
        root.display(1);
        // Wait for user
        System.out.println("Press any key to exit.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
