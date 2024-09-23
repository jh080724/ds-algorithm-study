package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) throws IOException {
//        352+*9-

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arrCh = br.readLine().toCharArray();

        Stack<Integer> stack = new Stack<>();

        for (char c : arrCh) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.println(stack.pop());
    }
}
