import java.util.Scanner;

public class Main {

    private static final String SURPRISE_EMOTION = "??!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(input + SURPRISE_EMOTION);
    }
}
