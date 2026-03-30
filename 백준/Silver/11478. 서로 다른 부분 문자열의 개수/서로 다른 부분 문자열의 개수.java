import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int length = str.length();
        Set<String> set = new HashSet<>();

//        System.out.println(str.substring(0, 1));
//        System.out.println(str.substring(0, 2));
//        System.out.println(str.substring(0, 3));
//        System.out.println(str.substring(0, 4));
//        System.out.println(str.substring(0, 5));
//
//        System.out.println(str.substring(1, 2));
//        System.out.println(str.substring(1, 3));
//        System.out.println(str.substring(1, 4));
//        System.out.println(str.substring(1, 5));
//
//        System.out.println(str.substring(2, 3));
//        System.out.println(str.substring(2, 4));
//        System.out.println(str.substring(2, 5));
//
//        System.out.println(str.substring(3, 4));
//        System.out.println(str.substring(3, 5));
//
//        System.out.println(str.substring(4, 5));

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                set.add(str.substring(i, j));
            }
        }

        bw.write(set.size() + "");

        br.close();
        bw.close();
    }
}
