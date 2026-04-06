import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int trimmedMean = (int) Math.round(n * 0.15);

        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tmp);

        int[] arr = new int[n - trimmedMean * 2];
        for (int i = trimmedMean; i < n - trimmedMean; i++) {
            arr[i - trimmedMean] = tmp[i];
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println(Math.round((float) sum / arr.length));
    }
}
