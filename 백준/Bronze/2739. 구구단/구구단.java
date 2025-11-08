import java.util.Scanner;

public class Main {

    private static final int GUGU_MAX_SIZE = 9;
    private static final String ASTERISK = " * ";
    private static final String EQUAL = " = ";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= GUGU_MAX_SIZE; i++) {
            System.out.println(n + ASTERISK + i + EQUAL + n * i);
        }
    }
}
