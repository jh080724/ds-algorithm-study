package string;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strTmp = sc.next();

        char[] arr= strTmp.toCharArray();
        int left = 0, right = arr.length-1;


        while(left<right){
            if(!Character.isAlphabetic(arr[left])) left++;
            else if(!Character.isAlphabetic(arr[right])) right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; right--;
            }
        }

        for (char c : arr) {
            System.out.print(c);
        }



/*
        Scanner sc = new Scanner(System.in);
        String strTmp = sc.next();
        int len = 0;

        for (int i = 0; i < strTmp.length(); i++) {
            char c = strTmp.charAt(i);
//            System.out.println(Character.isAlphabetic(c));
            System.out.println(c);
            System.out.println(Character.isLetter(c)); // 글자인지 확인.. 한글도 됨.
            if(Character.isLetter(c)) len++;
        }

        System.out.println("len = " + len);
        char[] tmp;
        tmp = new char[len];


        int j = 0;
        for (int i = strTmp.length()-1; i >= 0; i--) {
            char c = strTmp.charAt(i);

            if(Character.isLetter(c)){
                tmp[j] = c;
                System.out.print(tmp[j]);
                j++;
            }
        }

        System.out.println("");
        System.out.println(strTmp);
        System.out.println("");

        char[] tmpChar = new char[0];
        int chgPosition = 0;


        tmpChar = strTmp.toCharArray();
        for (int i = 0; i < strTmp.length(); i++) {
            char c = strTmp.charAt(i);
            if(Character.isAlphabetic(c)){
                tmpChar[i] = tmp[chgPosition];
                chgPosition++;
            }
        }

        for (char c : tmpChar) {
            System.out.print(c);
        }
*/

    }
}
