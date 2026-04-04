import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            int len = str.length();
            String[] arr = new String[len];

            for (int i = 0; i < len; i++) {
                arr[i] = str.substring(i, i + 1);
            }

            int cnt = 0;
            
            for (int i = 0; i < len; i++) {
                if (arr[i].equals(arr[len - 1 - i])) {
                    cnt++;
                }
            }

            if (cnt == len) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
