import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Балуев Константин Юрьевич", 1, 32000);
        employees[1] = new Employee("Богданов Максим Сергеевич", 2, 34500);
        employees[2] = new Employee("Божков Игорь Андреевич", 3, 34000);
        employees[3] = new Employee("Веселов Виктор Андреевич", 4, 35600);
        employees[4] = new Employee("Грудинкин Александр Александрович", 5, 34000);

        System.out.println();

        DataEmployee.printAll(employees);

        System.out.println();

        DataEmployee.maxSalary(employees);

        System.out.println();

        DataEmployee.minSalary(employees);

        System.out.println();

        DataEmployee.midSalary(employees);

        System.out.println();

        DataEmployee.printName(employees);

        System.out.println();

        DataEmployee.sumSalary(employees);
    }
}