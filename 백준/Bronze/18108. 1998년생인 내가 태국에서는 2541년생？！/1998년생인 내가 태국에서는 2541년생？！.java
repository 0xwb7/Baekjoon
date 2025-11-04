import java.util.Scanner;

public class Main {

    private static final int YEAR_DIFFERENCE = 543;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bud_year = scanner.nextInt();
        System.out.println(bud_year - YEAR_DIFFERENCE);
    }
}
