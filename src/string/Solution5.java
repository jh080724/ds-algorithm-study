package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();
        System.out.println("str = " + str);


        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            System.out.println(c);
            System.out.println(Character.isLetter(c));

            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        System.out.println(sb);
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
        sc.close();
/*
        String inputStr = "found7, time: study; Yduts; emit, 7Dnuof";
        char[] tmpChar = inputStr.toCharArray();

        int idx = 0;

        for (char c : tmpChar) {
            if(Character.isAlphabetic(c)) {
                idx++;
            }
        }
        System.out.println("idx = " + idx);

        char[] tmpChar2 = new char[idx];
        char[] tmpChar3 = new char[idx];
        
        idx = 0;
        for (int i = 0; i < tmpChar.length; i++) {
            if(Character.isAlphabetic(tmpChar[i])) {
                tmpChar2[idx] = Character.toUpperCase(tmpChar[i]);
                idx++;
            }
        }

        System.out.println("tmpChar2 === > ");
        for (char c : tmpChar2) {
            System.out.print(c);
        }
        System.out.println("");

        String strSource = String.valueOf(tmpChar2);
        System.out.println("strSource = " + strSource);
        String revSource = String.valueOf(tmpChar2);
        String newStr = new StringBuilder(strSource).reverse().toString();
        System.out.println("newStr = " + newStr);

        if(strSource.equals(newStr)) System.out.println("YES");
        else System.out.println("NO");;
*/

    }
}
