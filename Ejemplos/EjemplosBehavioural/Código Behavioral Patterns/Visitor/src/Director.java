public class Director extends Employee {
    public Director() {
        super("Elly", 35000.0, 16);
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
