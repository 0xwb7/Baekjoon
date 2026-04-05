import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idx = 0;
        int num = 0;
        for (int i = 0; i < 3; i++) {
            String str = sc.next();

            if (str.equals("Fizz") || str.equals("Buzz") || str.equals("FizzBuzz")) {
                continue;
            } else {
                idx = i;
                num = Integer.parseInt(str);
            }
        }

        if (idx == 0) {
            num += 3;
        } else if (idx == 1) {
            num += 2;
        } else {
            num += 1;
        }

        if (num % 3 == 0 && num % 5 !=0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else {
            System.out.println(num);
        }
    }
}
