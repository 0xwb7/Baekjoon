import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            String floor;
            String roomNum;

            if (h >= n) {
                floor = Integer.toString(n);
                roomNum = "1";

                System.out.println(floor + "0" + roomNum);
            } else {
                if (n % h == 0) {
                    floor = Integer.toString(h);
                    roomNum = Integer.toString(n / h);
                } else {
                    floor = Integer.toString(n % h);
                    roomNum = Integer.toString(n / h + 1);
                }

                if (roomNum.length() == 1) {
                    System.out.println(floor + "0" + roomNum);
                } else {
                    System.out.println(floor + roomNum);
                }
            }
        }

        br.close();
    }
}
