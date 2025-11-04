import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        if (minutes >= 45) {
            System.out.println(hours + " " + (minutes - 45));
        } else {
            if (hours == 0) {
                System.out.println("23 " + (minutes + 15));
            } else {
                System.out.println((hours - 1) + " " + (minutes + 15));
            }
        }
    }
}
