import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        br.close();

        for (int i = m; i <= n; i++) {
            isPrime(i);
        }

        bw.write(sb.toString());

        bw.close();
    }

    public static void isPrime(int n) {
        if (n < 2) {
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return;
            }
        }

        sb.append(n).append("\n");
    }
}
