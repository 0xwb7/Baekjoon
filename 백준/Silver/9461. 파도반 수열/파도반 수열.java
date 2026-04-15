import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Long dp[] = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            sb.append(padovan(n)).append("\n");
        }

        System.out.println(sb);
    }

    public static long padovan(int n) {
        if (dp[n] == null) {
            dp[n] = padovan(n - 3) + padovan(n - 2);
        }

        return dp[n];
    }
}
