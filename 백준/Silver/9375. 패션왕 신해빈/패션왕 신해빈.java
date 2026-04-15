import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();

                String category = st.nextToken();
                if (map.containsKey(category)) {
                    map.put(category, map.get(category) + 1);
                } else {
                    map.put(category, 1);
                }
            }

//            System.out.println(map);

            int num = 1;
            for (String str : map.keySet()) {
                num *= map.get(str) + 1;
            }

            sb.append(num - 1).append("\n");
        }

        System.out.println(sb);
    }
}
