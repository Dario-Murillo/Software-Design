public class President extends Employee {
    // Constructor
    public President() {
        super("Eric", 45000.0, 21);
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
