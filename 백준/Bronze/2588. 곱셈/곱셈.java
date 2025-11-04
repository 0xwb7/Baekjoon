import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int first_place = num2 % 10;
        int second_place = num2 % 100 / 10;
        int third_place = num2 / 100;

        System.out.println(num1 * first_place);
        System.out.println(num1 * second_place);
        System.out.println(num1 * third_place);
        System.out.println(num1 * num2);
    }
}
