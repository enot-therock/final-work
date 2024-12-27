public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String name, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить нового сотрудника");
        }
        Employee newEmployee = new Employee(name, department, salary);
        employees[size++] = newEmployee;
    }

    public void printId() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println("Ф.И.О. - " + employee.getName() + "; id - " + employee.getId() );
        }
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println("Ф.И.О. - " + employee.getName() + "; Отдел - " + employee.getDepartment() + "; Зарплата - " + employee.getSalary() + " руб.");
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                System.out.println("Ф.И.О. - " + employees[i].getName() + " - удален.");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
            }
        }
    }

    public void indexing(double percent) {
        for (int i = 0; i < size; i++) {
            employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * (percent / 100));
            System.out.println(employees[i].toString());
        }
    }

    public void departmentMinSalary(int department) {
        double minSalary = 100000;
        String name = "";
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    name = employees[i].getName();
                }
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Сотрудник с минимальной ЗП в отделе № " + department + " - " + name + ", получает - " + minSalary + "руб.");
    }

    public void departmentMaxSalary(int department) {
        double maxSalary = 0;
        String name = "";
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalary) {
                    maxSalary = employees[i].getSalary();
                    name = employees[i].getName();
                }
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Сотрудник с максимальной ЗП в отделе № " + department + " - " + name + ", получает - " + maxSalary + "руб.");
    }

    public void departmentSumSalary(int department) {
        double sumSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumSalary += employees[i].getSalary();
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Суммарные затраты на ЗП в отделе № " + department + " - " + sumSalary + "руб.");
    }

    public void departmentMidSalary(int department) {
        double sumSalary = 0;
        double midSalary = 0;
        int sumPeople = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumPeople += employees[i].getDepartment() / department;
                sumSalary += employees[i].getSalary();
                midSalary = sumSalary / sumPeople;
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Человек в отделе: " + sumPeople);
        System.out.println("Средняя ЗП в отделе № " + department + " - " + midSalary + "руб.");
    }

    public void departmentIndexSalary(int department, double percent) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * (percent / 100));
                System.out.println("ЗП в отделе № " + department + " у сотрудника: " + employees[i].getName() + " с учетом индексации - " + employees[i].getSalary() + "руб.");
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
    }

    public void departmentName(int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println("Сотрудник отдела № " + department + " " + employees[i].getName() +  "; ЗП - " + employees[i].getSalary() + " руб.");
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
    }
}
