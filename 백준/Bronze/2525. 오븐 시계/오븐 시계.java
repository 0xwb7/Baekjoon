import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int cookingTime = scanner.nextInt();
        minutes += cookingTime;
        hours += minutes / 60;
        minutes = minutes % 60;

        if (hours >= 24) {
            hours -= 24;
            System.out.println(hours + " " + minutes);
        } else {
            System.out.println(hours + " " + minutes);
        }
    }
}
