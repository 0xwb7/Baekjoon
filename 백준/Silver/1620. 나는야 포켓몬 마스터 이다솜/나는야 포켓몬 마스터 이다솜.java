import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> reverse = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            map.put(input, i);
            reverse.put(i, input);
        }

        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (!isNumeric(input)) {
                sb.append(map.get(input) + 1).append("\n");
            } else {
                sb.append(reverse.get(Integer.parseInt(input) - 1)).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }

    public static boolean isNumeric(String str) {
        boolean isNumeric = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isNumeric = false;
                break;
            }
        }

        return isNumeric;
    }
}
