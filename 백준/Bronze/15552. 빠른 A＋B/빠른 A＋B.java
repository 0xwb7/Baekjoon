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

        while (t-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            bufferedWriter.write((Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken())) + "\n");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
