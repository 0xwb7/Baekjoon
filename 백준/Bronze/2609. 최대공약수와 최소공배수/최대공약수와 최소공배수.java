import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        br.close();

        System.out.println(gcd(n, m));
        System.out.println(n * m / gcd(n, m));

    }

    public static int gcd(int n, int m) {
        int gcd = Math.max(n, m) % Math.min(n, m);

        if (gcd == 0) {
            return Math.min(n, m);
        } else {
            return gcd(Math.min(n, m), gcd);
        }
    }
}
