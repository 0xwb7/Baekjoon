import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] size = new int[6];
        int[] bundle = new int[2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2; i++) {
            bundle[i] = Integer.parseInt(st.nextToken());
        }

        int clothCount = 0;
        for (int i = 0; i < 6; i++) {
            if (size[i] % bundle[0] == 0) {
                clothCount += size[i] / bundle[0];
            } else {
                if (size[i] < bundle[0]) {
                    clothCount++;
                } else {
                    clothCount += size[i] / bundle[0] + 1;
                }
            }
        }

        System.out.println(clothCount);
        System.out.println(n / bundle[1] + " " + n % bundle[1]);
    }
}
