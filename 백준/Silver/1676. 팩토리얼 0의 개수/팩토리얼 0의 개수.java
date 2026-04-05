import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = fact(n);

        int cnt = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == 0) {
                cnt++;
            } else {
                break;
            }
        }

        System.out.println(cnt);
    }

    public static int[] fact(int n) {
        BigInteger num = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }

        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(str.substring(i, i + 1));
        }

        return arr;
    }
}
