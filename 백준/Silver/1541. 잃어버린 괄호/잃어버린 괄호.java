import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] splitMinus = input.split("-");

//        System.out.println(Arrays.toString(splitMinus));

        int[] sum = new int[splitMinus.length];
        for (int i = 0; i < splitMinus.length; i++) {
            String[] splitPlus = splitMinus[i].split("\\+");
//            System.out.println(Arrays.toString(splitPlus));

            for (int j = 0; j < splitPlus.length; j++) {
                sum[i] += Integer.parseInt(splitPlus[j]);

            }
        }
//        System.out.println(Arrays.toString(sum));

        int total = sum[0];
        for (int i = 1; i < sum.length; i++) {
            total -= sum[i];
        }

        bw.write(total + "");

        br.close();
        bw.close();
    }
}
