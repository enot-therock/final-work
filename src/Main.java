import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Балуев Константин Юрьевич", 1, 32000);
        employees[1] = new Employee("Богданов Максим Сергеевич", 2, 34500);
        employees[2] = new Employee("Божков Игорь Андреевич", 3, 34000);
        employees[3] = new Employee("Веселов Виктор Андреевич", 4, 35600);
        employees[4] = new Employee("Грудинкин Александр Александрович", 5, 34000);


        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            System.out.println(employees[i].toString());
        }

        System.out.println();

        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary);

        System.out.println();

        int minSalary = 100000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary);

        System.out.println();

        System.out.println("Средняя зарплата: " + (maxSalary + minSalary) / 2);

        System.out.println();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                break;
            }
            System.out.println(employees[i].getName());
        }

    }
}