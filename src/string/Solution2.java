
package string;

import java.util.Scanner;

public class Solution2 {

    public static void solution(String[] arr) {
        for (String s : arr) {
            String newStr = new StringBuilder(s).reverse().toString();
            System.out.println("newStr = " + newStr);
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int intN = 0;
        intN = sc.nextInt();
        String[] arrStr = new String[intN];


        for (int i = 0; i < intN; i++) {
            arrStr[i] = sc.next();
        }

        solution(arrStr);


    }
}
