import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    private static int nextId = (int) (Math.random() * 10);
    private Employee[] employees;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = (int) (nextId * Math.random() * 100);
        this.employees = new Employee[10];
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О - " + name + "; Отдел - " + department + "; Зарплата - " + salary + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    public void printAll() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }
}
