import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] sarr = new String[str.length()];

            for (int j = 0; j < str.length(); j++) {
                sarr[j] = str.substring(j, j + 1);
            }

            int cnt = 0;
            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < sarr.length; j++) {
                if (sarr[j].equals("O")) {
                    cnt++;
                } else {
                    cnt = 0;
                }
                list.add(cnt);
            }

            for (int num : list) {
                sum += num;
            }
            System.out.println(sum);
        }

        br.close();
    }
}


