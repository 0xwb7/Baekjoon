import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int n = input.length();
        List<Integer> list = new ArrayList<>();

        for (int i = n; i <= n * 9; i++) {
            int tmp = Integer.parseInt(input);

            if (tmp - i < 0) {
                break;
            }

            String str = String.valueOf(tmp - i);

            int sum = Integer.parseInt(str);
            String num = "";
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.substring(j, j + 1));
                num += str.charAt(j);
            }

            if (tmp == sum) {
                list.add(Integer.parseInt(num));
            }
        }

        Collections.sort(list);

        if (list.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(list.get(0));
        }
    }
}
