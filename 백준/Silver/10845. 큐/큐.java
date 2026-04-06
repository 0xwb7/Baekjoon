import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        int last = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                q.add(num);
                last = num;
            }

            if (cmd.equals("pop")) {
                if (q.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(q.poll() + "\n");
                }

            }

            if (cmd.equals("size")) {
                if (q.isEmpty()) {
                    bw.write(0 + "\n");
                } else {
                    bw.write(q.size() + "\n");
                }
            }

            if (cmd.equals("empty")) {
                if (q.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }

            if (cmd.equals("front")) {
                if (q.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(q.peek() + "\n");
                }
            }

            if (cmd.equals("back")) {
                if (q.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(last + "\n");
                }
            }
        }

        br.close();
        bw.close();
    }
}
