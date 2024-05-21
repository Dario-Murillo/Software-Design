public class VisitorMain {
    public static void main(String[] args) throws Exception {
        // Setup employee collection
        Employees employees = new Employees();
        employees.Attach(new Clerk());
        employees.Attach(new Director());
        employees.Attach(new President());
        
        // Employees are 'visited'
        employees.Accept(new IncomeVisitor());
        employees.Accept(new VacationVisitor());
    }
}
