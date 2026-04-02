import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.substring(i, i + 1));
        }

        Set<String> hSet = new HashSet<>();

        char a = 'a';
        for (int i = 0; i < 26; i++) {
            hSet.add(String.valueOf(a));
            a++;
        }

        for (String s : hSet) {
            System.out.print(list.indexOf(s) + " ");
        }

        br.close();
    }
}
