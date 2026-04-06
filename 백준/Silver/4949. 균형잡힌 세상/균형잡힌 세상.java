import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            Stack<String> stack = new Stack<>();

            boolean nonBalance = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(' || input.charAt(i) == '[') {
                    stack.push(input.substring(i, i + 1));
                } else if (input.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        nonBalance = true;
                        break;
                    }

                    if (stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        nonBalance = true;
                        break;
                    }
                } else if (input.charAt(i) == ']') {
                    if (stack.isEmpty()) {
                        nonBalance = true;
                        break;
                    }

                    if (stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        nonBalance = true;
                        break;
                    }
                } else {
                    continue;
                }
            }

            if (nonBalance || !stack.isEmpty()) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}
