import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] buckets = new int[n];

        for (int l = 0; l < m; l++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int k = sc.nextInt();

            for (int o = i; o <= j; o++) {
                buckets[o] = k;
            }
        }

        for (int ballNumber : buckets) {
            System.out.print(ballNumber + " ");
        }
    }
}
