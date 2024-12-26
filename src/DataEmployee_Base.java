public class DataEmployee_Base {

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
}

