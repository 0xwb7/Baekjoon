import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int cnt;
    static boolean[] visited;
    static List[] com;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        com = new List[n + 1];
        cnt = 0;

        for (int i = 1; i < n + 1; i++) {
            com[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            com[a].add(b);
            com[b].add(a);
        }

        dfs(1);

        System.out.println(cnt - 1);

        br.close();
    }

    private static void dfs(int index) {
        if (!visited[index]) {
            visited[index] = true;
            cnt++;

            for (int i = 0; i < com[index].size(); i++) {
                dfs((Integer) com[index].get(i));
            }
        }
    }
}
