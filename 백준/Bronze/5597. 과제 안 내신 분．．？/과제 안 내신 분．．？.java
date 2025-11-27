import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> noSubmitStudent = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            numList.add(sc.nextInt());
        }

        for (int i = 1; i <= 30; i++) {
            if (!numList.contains(i)) {
                noSubmitStudent.add(i);
            }
        }

        for (int i = 0; i < noSubmitStudent.size(); i++) {
            System.out.println(noSubmitStudent.get(i));
        }
    }
}
