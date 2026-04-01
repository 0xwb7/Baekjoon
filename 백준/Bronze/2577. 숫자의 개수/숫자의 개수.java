import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mul = 1;

        for (int i = 0; i < 3; i++) {
            mul *= Integer.parseInt(br.readLine());
        }

        String str = Integer.toString(mul);

        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            String n = Integer.toString(i);

            for (int j = 0; j < str.length(); j++) {
                if (n.charAt(0) == str.charAt(j)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
