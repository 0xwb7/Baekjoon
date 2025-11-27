import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }

        System.out.println(min(numList) + " " + max(numList));
    }
}
