import java.util.Arrays;

public class Main {

//    private static final Employee[] employee = {
//            new Employee("Балуев Константин Евгеньевич", 1, 32000),
//            new Employee("Богданов Макси Сергеевич", 2, 31500),
//            new Employee("Божков Игорь Андреевич", 3, 34000),
//            new Employee("Веселов Виктор Андреевич", 4, 33600),
//            new Employee("Грудинкин Александ Александрович", 5, 34000),
//    };

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];

        DataEmployee dataEmployee = new DataEmployee();
        dataEmployee.addEmployee("Балуев Константин Евгеньевич", 1, 32000);
        dataEmployee.addEmployee("Богданов Максим Сергеевич", 2, 31500);
        dataEmployee.addEmployee("Божков Игорь Андреевич", 3, 34000);
        dataEmployee.addEmployee("Веселов Виктор Андреевич", 4, 33600);
        dataEmployee.addEmployee("Грудинкин Александр Александрович", 5, 34000);

        dataEmployee.printAllEmployee();
    }
}