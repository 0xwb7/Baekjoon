import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= arr[i]) {
                int tmp = k / arr[i]; // k=4, (1, 3) 있을 때, tmp = 4 / 3 = 1  / 1
                cnt += tmp; // cnt = 1
                k = k - arr[i] * tmp; // 4 = 4 - 3 * 1 = 1
            }
        }

        System.out.println(cnt);
    }
}
