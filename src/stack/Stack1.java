package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : ch) {
            if(c == '('){
                stack.push(c);
            } else if (c ==')'){
                // stack 비었는데 pop을 하면 예외가 발생함.
                if(stack.isEmpty()){
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");

        br.close();

    }
}
