import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        br.close();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = (int) str.charAt(i) - 'a' + 1;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] * pow(31, i);
            sum %= 1234567891;
        }

        System.out.println(sum);
    }

    public static long pow(int n, int i) {
        long result = 1;

        for (int j = 0; j < i; j++) {
            result *= n;
            result %= 1234567891;
        }

        return result;
    }
}
