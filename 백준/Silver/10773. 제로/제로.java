import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                stack.pop();
            } else {
                stack.push(n);
            }
        }

        System.out.println(sum(stack));
    }

    public static int sum(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return 0;
        }

        int n = stack.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stack.peek();
            stack.pop();
        }

        return sum;
    }
}
