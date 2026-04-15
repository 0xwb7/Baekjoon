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

        long[] modCount = new long[m];

        long sum = 0;
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            modCount[(int) (sum % m)]++;
        }

        long result = 0;

        result += modCount[0];

        for (int i = 0; i < m; i++) {
            if (modCount[i] >= 2) {
                result += (modCount[i] * (modCount[i] - 1)) / 2;
            }
        }

        System.out.println(result);
        
        br.close();
    }
}
