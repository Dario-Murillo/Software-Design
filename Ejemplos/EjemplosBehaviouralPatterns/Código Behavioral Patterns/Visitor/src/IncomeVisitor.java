public class IncomeVisitor implements IVisitor {
    private void Visit(Employee employee, double percentageExtraIncome) {
        employee.setIncome(employee.getIncome() * (1 + percentageExtraIncome));
        System.out.printf("%s %s's new income: %.2f%n",
                employee.getClass().getSimpleName(), employee.getName(),
                employee.getIncome());
    }

    @Override
    public void Visit(Clerk clerk) {
        Visit(clerk, 0);
    }

    @Override
    public void Visit(Director director) {
        Visit(director, 0.10);
    }

    @Override
    public void Visit(President president) {
        Visit(president, 0.25);
    }
}