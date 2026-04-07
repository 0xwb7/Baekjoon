import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new String[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(str.charAt(j));
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                min = Math.min(min, getMin(i, j));
            }
        }

        System.out.println(min);
    }

    public static int getMin(int i, int j) {
        int w = 0;
        int b = 0;

        for (int k = i; k < i + 8; k++) {
            for (int l = j; l < j + 8; l++) {
                if ((k + l) % 2 == 0) {
                    if (arr[k][l].equals("B")) {
                        w++;
                    } else {
                        b++;
                    }
                } else {
                    if (arr[k][l].equals("W")) {
                        w++;
                    } else {
                        b++;
                    }
                }
            }
        }

        return Math.min(w, b);
    }
}
