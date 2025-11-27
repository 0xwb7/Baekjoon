import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] buckets = new int[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = i + 1;
        }

        for (int l = 0; l < m; l++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            int temp = buckets[i];
            buckets[i] = buckets[j];
            buckets[j] = temp;
        }

        for (int ballNumber : buckets) {
            System.out.print(ballNumber + " ");
        }
    }
}
