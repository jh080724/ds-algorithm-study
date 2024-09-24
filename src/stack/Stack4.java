package stack;

// 문제정보 : https://www.acmicpc.net/problem/10799

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> stack = new Stack<>();

        int pieces = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '('){
                stack.push(input.charAt(i));
            } else {
                stack.pop();
                if(input.charAt(i-1) == '('){
                    pieces += stack.size();
                }else{
                    pieces++;
                }
            }
        }

        System.out.println("pieces = " + pieces);

        /* by jhjeong
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        int answer = 0;

        for (int i = 0; i < chArr.length; i++) {

            if (chArr[i] == '(') {
                stack.push(chArr[i]);
            } else if (chArr[i] == ')') {
                stack.pop();
                if (chArr[i - 1] == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }

            }

        }
        System.out.println(answer);

*/
    }
}
