package string;

import java.util.*;

public class Solution4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
/*        KSEKKET
        K 0 0
        S 1 1
        E 2 2
        K 3 0
        K 4 0
        E 5 2
        T 6 6
        */
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        System.out.println(answer);



      /*  String a = "ksekkset";

        char[] tmpChar = a.toCharArray();
        int idx = 0;

        System.out.println(tmpChar.length);


        for (int i = 0; i < tmpChar.length; i++) {

            for (int j = i+1; j < tmpChar.length; j++) {
                if(tmpChar[i] == tmpChar[j]){
                    System.out.println("j = " + j);
                    tmpChar[j] = '\0';
                }
            }


            System.out.println("-------------------");
        }


        for (char c : tmpChar) {
            if(c != '\0') System.out.print(c);
        }
*/
    }
}
