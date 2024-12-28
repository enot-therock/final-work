import java.util.Objects;

public class Employee {
    private String name;
    private int department;
    private double salary;
    private int id;
    private static int nextId = 10;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = nextId++;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
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
        return Objects.hash(name, department, salary, id);
    }

    public static void printAll(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            System.out.println(array[i].toString());
        }
    }

    public static void maxSalary(Employee[] array) {
        double maxSalary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getSalary() > maxSalary) {
                maxSalary = array[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + " руб.");
    }

    public static void minSalary(Employee[] array) {
        double minSalary = 100000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getSalary() < minSalary) {
                minSalary = array[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary + " руб.");
    }

    public static void midSalary(Employee[] array) {
        double minSalary = 100000;
        double maxSalary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getSalary() < minSalary) {
                minSalary = array[i].getSalary();
            }
            if (array[i].getSalary() > maxSalary) {
                maxSalary = array[i].getSalary();
            }
        }
        System.out.println("Средняя зарплата " + (minSalary + maxSalary) / 2 + " руб.");
    }

    public static void printName(Employee[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            System.out.println("Сотрудник: " + array[i].getName());
        }
    }

    public static void sumSalary(Employee[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            sum += array[i].getSalary();
        }
        System.out.println("Затраты на ЗП в месяц: " + sum + " руб.");
    }

    public static void indexing(Employee[] array, double percent) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            array[i].setSalary(array[i].getSalary() + array[i].getSalary() * (percent / 100));
            System.out.println(array[i].toString());
        }
    }

    public static void departmentMinSalary(Employee[] array, int department) {
        double minSalary = 100000;
        String name = "";
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department && array[i].getSalary() < minSalary) {
                minSalary = array[i].getSalary();
                name = array[i].getName();
            }
        }
        System.out.println("Сотрудник с минимальной ЗП в отделе № " + department + " - " + name + ", получает - " + minSalary + "руб.");
    }

    public static void departmentMaxSalary(Employee[] array, int department) {
        double maxSalary = 0;
        String name = "";
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department && array[i].getSalary() > maxSalary) {
                maxSalary = array[i].getSalary();
                name = array[i].getName();
            }
        }
        System.out.println("Сотрудник с максимальной ЗП в отделе № " + department + " - " + name + ", получает - " + maxSalary + "руб.");
    }

    public static void departmentSumSalary(Employee[] array, int department) {
        double sumSalary = 0;
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                sumSalary += array[i].getSalary();
            }
        }
        System.out.println("Суммарные затраты на ЗП в отделе № " + department + " - " + sumSalary + "руб.");
    }

    public static void departmentMidSalary(Employee[] array, int department) {
        double sumSalary = 0;
        double midSalary = 0;
        int sumPeople = 0;
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                sumPeople += array[i].getDepartment();
                sumSalary += array[i].getSalary();
            }
        }
        midSalary = sumSalary / (sumPeople / department);
        System.out.println("Средняя ЗП в отделе № " + department + " - " + midSalary + "руб.");
    }

    public static void departmentIndexSalary(Employee[] array, int department, double percent) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                array[i].setSalary(array[i].getSalary() + array[i].getSalary() * (percent / 100));
                System.out.println("ЗП в отделе № " + department + " у сотрудника: " + array[i].getName() + " с учетом индексации - " + array[i].getSalary() + "руб.");
            }
        }
    }

    public static void departmentName(Employee[] array, int department) {
        if (department > 5 || department < 1) {
            throw new IllegalArgumentException("Такого отдела не существует!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                System.out.println("Сотрудник отдела № " + department + " " + array[i].getName() +  "; ЗП - " + array[i].getSalary() + " руб.");
            }
        }
    }

    public static void minNumberParameter(Employee[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getSalary() < number) {
                System.out.println("Сотрудник " + array[i].getName() + "; id - " + array[i].getId() + "; ЗП - " + array[i].getSalary() + " руб.");
            }
        }
    }

    public static void maxNumberParameter(Employee[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getSalary() >= number) {
                System.out.println("Сотрудник " + array[i].getName() + "; id - " + array[i].getId() + "; ЗП - " + array[i].getSalary() + " руб.");
            }
        }
    }
}
