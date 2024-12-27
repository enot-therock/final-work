public class MainHard {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Балуев Константин Юрьевич", 1, 32000);
        employeeBook.addEmployee("Богданов Максим Сергеевич", 2, 34500);
        employeeBook.addEmployee("Божков Игорь Андреевич", 3, 34000);
        employeeBook.addEmployee("Веселов Виктор Андреевич", 4, 35600);
        employeeBook.addEmployee("Грудинкин Александр Александрович", 5, 34000);
        employeeBook.addEmployee("Дорохов Илья Михайлович", 1, 36700);
        employeeBook.addEmployee("Коловский Эмиль Сергеевич", 2, 34700);
        employeeBook.addEmployee("Лучкин Дмитрий Васильевич", 3, 39000);

        employeeBook.printAll();
        System.out.println();

        employeeBook.indexing(15);
        System.out.println();

        employeeBook.departmentMinSalary(2);
        System.out.println();

        employeeBook.departmentMaxSalary(2);
        System.out.println();

        employeeBook.printAll();
        System.out.println();

        employeeBook.departmentSumSalary(4);
        System.out.println();

        employeeBook.departmentMidSalary(4);
        System.out.println();

        employeeBook.departmentIndexSalary(3, 15);
        System.out.println();

        employeeBook.addEmployee("Литвиненко Виталий Вадимович", 5, 39500);
        System.out.println();

        employeeBook.departmentName(5);
        employeeBook.printId();
        System.out.println();

        employeeBook.deleteEmployee(15);
        System.out.println();

        employeeBook.printAll();
    }
}
