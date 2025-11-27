import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.max;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        for  (int i = 0; i < 9; i++) {
            numList.add(sc.nextInt());
        }

        int max = max(numList);

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == max) {
                System.out.println(max);
                System.out.println(i + 1);
            }
        }
    }
}
