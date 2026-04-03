import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();
            String[] vps = new String[str.length()];

            for (int j = 0; j < str.length(); j++) {
                vps[j] = str.substring(j, j + 1);
            }

            int cnt = 0;
            for (int j = 0; j < vps.length; j++) {
                if (vps[j].equals("(")) {
                    cnt++;
                } else {
                    cnt--;
                }

                if (cnt < 0) {
                    break;
                }
            }
            if (cnt == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
