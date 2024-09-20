package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];
        int max = 0; // 제일 긴 행의 글자 수를 확인해서 행의 범위 선정

// 입력값 처리
        for (int i = 0; i < arr.length; i++) {

            String str = br.readLine();
            if(max < str.length()) max = str.length();

            for (int j = 0; j < str.length(); j++) {
                arr[i][j]= str.charAt((j));
            }
        }

        // 2차원 배열을 열로 읽자
        /*
          AABCDD
          afzz
          09121
          a8EWg6
          P5h3kx
          */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {

            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] == '\0') continue;
                sb.append(arr[j][i]);
            }
        }

        System.out.println("sb = " + sb);

        br.close();
    }
}
