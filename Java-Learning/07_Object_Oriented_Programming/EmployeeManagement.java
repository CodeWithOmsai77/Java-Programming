class Employee {
    private final int employeeId;
    private final String name;
    private final double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        return basicSalary + hra + da;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.printf("Basic salary: %.2f%n", basicSalary);
        System.out.printf("Total salary: %.2f%n", calculateSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Om", 20000);
        employee.display();
    }
}
