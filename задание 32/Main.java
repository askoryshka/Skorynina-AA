import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        boolean turn = true;
        while (n > 1) {
            if (n % 2 == 0) {
                if (turn) {
                    n = n / 2;
                } else {
                    n = n - 1;
                }
            } else {
                n = n - 1;
            }
            turn = !turn;
        }
        if (turn) {
            System.out.println("Таня");
        } else {
            System.out.println("Саша");
        }
    }
}