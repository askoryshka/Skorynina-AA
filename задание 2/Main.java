import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] visitors = {true, true, true, true, true, true, true, false, true, true, true, true, false, true, false, false, true, true, true, true, true, false, false, true, true};

        int employeesCount = 0;
        for (boolean visitor : visitors) {
            if (visitor) {
                employeesCount++;
            }
        }

        System.out.println("Сотрудников на предприятии: " + employeesCount);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив через запятую и без пробелов (1,0,1,1,1):");
        String input = scanner.nextLine();
        String[] values = input.split(",");
        int employeesCount2 = 0;
        for (String value : values) {
            if (value.trim().equals("1")) {
                employeesCount2++;
            }
        }
        System.out.println("Кол-во сотрудников: " + employeesCount2);
    }
}