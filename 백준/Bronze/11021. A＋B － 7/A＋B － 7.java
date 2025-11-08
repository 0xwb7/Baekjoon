import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i <= t; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int sum = Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write("Case #" + i + ": " + sum + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
