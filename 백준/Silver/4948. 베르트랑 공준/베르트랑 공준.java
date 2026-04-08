import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= n * 2; i++) {
                if (isPrime(i)) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");
        }

        bw.write(String.valueOf(sb));

        br.close();
        bw.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
