public class VacationVisitor implements IVisitor {
    private void Visit(Employee employee, int extraDays) {
        employee.setVacationDays(employee.getVacationDays() + extraDays);
        System.out.printf("%s %s's new vacation days: %d%n",
                employee.getClass().getSimpleName(), employee.getName(),
                employee.getVacationDays());
    }

    @Override
    public void Visit(Clerk clerk) {
        Visit(clerk, 0);
    }

    @Override
    public void Visit(Director director) {
        Visit(director, 2);
    }

    @Override
    public void Visit(President president) {
        Visit(president, 3);
    }
}
