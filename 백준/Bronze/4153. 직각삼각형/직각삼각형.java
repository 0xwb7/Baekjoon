import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);

            if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
                break;
            }

            int tmp = (int) (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2));

            if (tmp == (int) Math.pow(list.get(2), 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
