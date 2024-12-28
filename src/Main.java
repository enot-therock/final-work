public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Балуев Константин Юрьевич", 1, 32000);
        employees[1] = new Employee("Богданов Максим Сергеевич", 2, 34500);
        employees[2] = new Employee("Божков Игорь Андреевич", 3, 34000);
        employees[3] = new Employee("Веселов Виктор Андреевич", 4, 35600);
        employees[4] = new Employee("Грудинкин Александр Александрович", 5, 34000);
        employees[5] = new Employee("Дорохов Илья Михайлович", 1, 36700);
        employees[6] = new Employee("Коловский Эмиль Сергеевич", 2, 34700);
        employees[7] = new Employee("Лучкин Дмитрий Васильевич", 3, 39000);
        employees[8] = new Employee("Мушнов Константин Иннокентьевич", 4, 32600);

        System.out.println();

        Employee.printAll(employees); // Базовая сложность (a)
        System.out.println();

        Employee.sumSalary(employees); // Базовая сложность (b)
        System.out.println();

        Employee.minSalary(employees); // Базовая сложность (c)
        System.out.println();

        Employee.maxSalary(employees); // Базовая сложность (d)
        System.out.println();

        Employee.midSalary(employees); // Базовая сложность (e)
        System.out.println();

        Employee.printName(employees); // Базовая сложность (f)
        System.out.println();

        Employee.indexing(employees, 12); // Повышенная сложность (1)
        System.out.println();

        Employee.departmentMinSalary(employees, 2); // Повышенная сложность (2.a)
        System.out.println();

        Employee.departmentMaxSalary(employees, 3); // Повышенная сложность (2.b)
        System.out.println();

        Employee.departmentSumSalary(employees, 3); // Повышенная сложность (2.c)
        System.out.println();

        Employee.departmentMidSalary(employees, 3); // Повышенная сложность (2.d)
        System.out.println();

        Employee.departmentIndexSalary(employees, 3, 15); // Повышенная сложность (2.e)
        System.out.println();

        Employee.departmentName(employees, 3); // Повышенная сложность (2.f)
        System.out.println();

        Employee.minNumberParameter(employees, 38000); // Повышенная сложность (3.a)
        System.out.println();

        Employee.maxNumberParameter(employees, 39500); // Повышенная сложность (3.b)
        System.out.println();
    }

}