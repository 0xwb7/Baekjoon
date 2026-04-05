import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();

        br.close();

        int sum = 0;
        int idx = 0;
        for (int i = 0; i < 13; i++) {
            if (isbn.charAt(i) == '*') {
                idx = i;
            } else {
                if (i % 2 == 0) {
                    sum += Integer.parseInt(isbn.substring(i, i + 1));
                } else {
                    sum += Integer.parseInt(isbn.substring(i, i + 1)) * 3;
                }
            }
        }

        int num = 0;
        while (true) {
            if (idx % 2 == 0) {
                if ((sum + num) % 10 == 0) {
                    System.out.println(num);
                    break;
                }
            } else {
                if ((sum + num * 3) % 10 == 0) {
                    System.out.println(num);
                    break;
                }
            }

            num++;
        }
    }
}
