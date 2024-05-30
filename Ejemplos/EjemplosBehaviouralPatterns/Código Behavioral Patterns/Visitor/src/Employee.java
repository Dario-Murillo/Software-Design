public abstract class Employee {
    private String name;
    private double income;
    private int vacationDays;

    public Employee(String name, double income, int vacationDays) {
        this.name = name;
        this.income = income;
        this.vacationDays = vacationDays;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public abstract void Accept(IVisitor visitor);
}
