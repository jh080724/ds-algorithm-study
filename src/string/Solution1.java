package string;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // Computercooler c
        // 2

        //String strTmp = "Cooler dfd fdfd";

        Scanner sc = new Scanner(System.in);
        String inStr = sc.next();

        char c = sc.next().charAt(0);

        inStr = inStr.toUpperCase();
        c = Character.toUpperCase(c);

//        System.out.println("c = " + c);
//        System.out.println("inStr = " + inStr);

        int cnt = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == c){
                cnt ++;
            }
        }

//        for (char x: inStr.toCharArray()){
//            if(x == c) count++;
//        }

        System.out.println(cnt);


    }
}
