import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employees = new ArrayList<Employee>();

    public void Attach(Employee employee) {
        employees.add(employee);
    }

    public void Detach(Employee employee) {
        employees.remove(employee);
    }

    public void Accept(IVisitor visitor) {
        for (Employee employee : employees) {
            employee.Accept(visitor);
        }
        System.out.println();
    }
}