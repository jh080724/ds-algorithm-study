package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = br.readLine().toCharArray();

        StringBuilder sb = new StringBuilder();

//        char tmpCh = '\0';
//        String flag = "";

        Stack<Character> stack = new Stack<>();

        for (char c : ch) {

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else{
                if(stack.isEmpty()){
                    sb.append(c);
                }
            }
        }

        System.out.println(sb);
    }
}
