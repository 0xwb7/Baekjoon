import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        int n = scanner.nextInt();
        int sumPrice = 0;

        while (n-- > 0) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();

            sumPrice += price * count;
        }

        if (totalPrice == sumPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
