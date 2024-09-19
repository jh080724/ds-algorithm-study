package string;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution8 {
    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String str = br.readLine();
//        int cnt = Integer.parseInt(str);
//        System.out.println("cnt = " + cnt);
//        str = br.readLine();
//        System.out.println("str = " + str);

        String str = "#****###**#####**#####**##**";

        String strConv = "";

        char[] arrCh = {};

        arrCh = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if(arrCh[i] == '#') arrCh[i] = '1';
            else if(arrCh[i] == '*') arrCh[i] = '0';
        }

        str = String.valueOf(arrCh);


        for (int i = 0; i < str.length(); i+=7) {
            strConv = str.substring(i, i + 7);
//            System.out.println("strConv = " + strConv);

            int intTmp = Integer.parseInt(strConv, 2);
//            System.out.println("intTmp = " + intTmp);
            char a = (char)intTmp;
            System.out.print(a);
        }




    }
}
