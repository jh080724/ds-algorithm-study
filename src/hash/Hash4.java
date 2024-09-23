package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Hash4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chArr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();


        int answer = 0;

        for (int i = 0; i < chArr.length; i++) {

            if(chArr[i] == '('){
                stack.push(chArr[i]);
            } else if(chArr[i] == ')'){
                stack.pop();
                if(chArr[i -1] == '('){
                    answer += stack.size();
                } else{
                    answer++;
                }

            }

        }
        System.out.println(answer);


    }
}
