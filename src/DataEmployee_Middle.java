public class DataEmployee_Middle {

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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                if (array[i].getSalary() < minSalary) {
                    minSalary = array[i].getSalary();
                    name = array[i].getName();
                }
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Сотрудник с минимальной ЗП в отделе № " + department + " - " + name + ", получает - " + minSalary + "руб.");
    }

    public static void departmentMaxSalary(Employee[] array, int department) {
        double maxSalary = 0;
        String name = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                if (array[i].getSalary() > maxSalary) {
                    maxSalary = array[i].getSalary();
                    name = array[i].getName();
                }
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Сотрудник с максимальной ЗП в отделе № " + department + " - " + name + ", получает - " + maxSalary + "руб.");
    }

    public static void departmentSumSalary(Employee[] array, int department) {
        double sumSalary = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                sumSalary += array[i].getSalary();
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println("Суммарные затраты на ЗП в отделе № " + department + " - " + sumSalary + "руб.");
    }

    public static void departmentMidSalary(Employee[] array, int department) {
        double sumSalary = 0;
        double midSalary = 0;
        int sumPeople = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                sumPeople += array[i].getDepartment() / department;
                sumSalary += array[i].getSalary();
                midSalary = sumSalary / sumPeople;
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
        System.out.println(sumPeople);
        System.out.println("Средняя ЗП в отделе № " + department + " - " + midSalary + "руб.");
    }

    public static void departmentIndexSalary(Employee[] array, int department, double percent) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                array[i].setSalary(array[i].getSalary() + array[i].getSalary() * (percent / 100));
                System.out.println("ЗП в отделе № " + department + " у сотрудника: " + array[i].getName() + " с учетом индексации - " + array[i].getSalary() + "руб.");
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
            }
        }
    }

    public static void departmentName(Employee[] array, int department) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                break;
            }
            if (array[i].getDepartment() == department) {
                System.out.println("Сотрудник отдела № " + department + " " + array[i].getName() +  "; ЗП - " + array[i].getSalary() + " руб.");
            }
            if (department > 5 || department < 1) {
                throw new IllegalArgumentException("Такого отдела не существует!");
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
