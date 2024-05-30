public class Clerk extends Employee {
    public Clerk() {
        super("Kevin", 25000.0, 14);
    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.Visit(this);
    }
}
