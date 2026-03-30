import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>(new Comparator<>() {
            public int compare(Integer a, Integer b) {
                if (Math.abs(a) > Math.abs(b)) {
                    return Math.abs(a) - Math.abs(b);
                } else if (Math.abs(a) == Math.abs(b)) {
                    return a - b;
                } else {
                    return -1;
                }
            }
        });

        sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (pQ.isEmpty()) {
                    sb.append("0").append("\n");
                } else {
                    sb.append(pQ.poll()).append("\n");
                }
            } else {
                pQ.offer(x);
            }
        }
        System.out.println(sb);
    }
}
