import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> q = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                q.add(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;
            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isPriority = true;

                for (int j = 0; j < q.size(); j++) {
                    if (front[1] < q.get(j)[1]) {
                        q.add(front);

                        for (int k = 0; k < j; k++) {
                            q.add(q.poll());
                        }

                        isPriority = false;
                        break;
                    }
                }

                if (!isPriority) {
                    continue;
                }

                cnt++;

                if (front[0] == m) {
                    break;
                }
            }
            sb.append(cnt).append("\n");
        }

        bw.write(String.valueOf(sb));

        bw.close();
        br.close();
    }
}
