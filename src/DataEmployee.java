public class DataEmployee {
    private Employee[] employees;
    private int staff;
    private int minSalary;
    private int maxSalary;
    private int midSalary;


    public DataEmployee() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String employeeName, int employeeDepartament, int employeeSalary) {
        if (staff >= employees.length) {
            System.out.println("Штат сотрудников полон");
        }
        Employee newEmployee = new Employee(employeeName, employeeDepartament, employeeSalary);
        employees[staff++] = newEmployee;
    }

    public void printAllEmployee() {
        for (int i = 0; i < staff; i++) {
            Employee employee = employees[i];
            System.out.println("Ф.И.О. - " + employee.getName() + "; Отдел - " + employee.getDepartment()
                    + "; Зарплата - " + employee.getSalary() + " руб.");
        }
    }

}
