import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numList.add(sc.nextInt());
        }

        int v = sc.nextInt();
        int cnt = 0;
        for (Integer integer : numList) {
            if (integer == v) {
                cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}
