import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            if (st.countTokens() == 1) {
                String str = st.nextToken();

                if (str.equals("all")) {
                    list.clear();
                    for (int j = 1; j <= 20; j++) {
                        list.add(j);
                    }

                } else if (str.equals("empty")) {
                    list.clear();
                }
            } else {
                String cmd = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if (cmd.equals("add")) {
                    if (list.isEmpty() || !list.contains(num)) {
                        list.add(num);
                    } else {
                        continue;
                    }
                }

                if (cmd.equals("remove")) {
                    if (list.contains(num)) {
                        list.remove(Integer.valueOf(num));
                    } else {
                        continue;
                    }
                }

                if (cmd.equals("check")) {
                    if (!list.contains(num)) {
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }

                }

                if (cmd.equals("toggle")) {
                    if (list.contains(num)) {
                        list.remove(Integer.valueOf(num));
                    } else {
                        list.add(num);
                    }
                }
            }
        }

        System.out.println(sb);
    }
}
