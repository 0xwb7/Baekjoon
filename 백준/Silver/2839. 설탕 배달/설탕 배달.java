import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        // 13 10
        while (true) {
            if (n == 0) {
                break;
            } else if (n < 0) {
                cnt = -1;
                break;
            } else if (n % 5 == 0) {
                n -= 5;
                cnt++;
            } else {
                n -= 3;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
