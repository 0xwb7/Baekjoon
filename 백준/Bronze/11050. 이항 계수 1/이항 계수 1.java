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

        br.close();

        int bc = factorial(n) / (factorial(k) * factorial(n - k));

        System.out.println(bc);
    }

    public static int factorial(int n) {
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
        }

        return tmp;
    }
}
