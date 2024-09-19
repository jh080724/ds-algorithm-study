package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution6 {
    public static void main(String[] args) throws IOException {

//
//        teachermode e
//        10121012210
/*
        Scanner sc = new Scanner(System, in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String t =sc.next();
        String str = sc.next();
*/


        // 거리계산은 같으면 0, 다르면 +1 씩 증가, 같으면 다시 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s = st.nextToken();
        char t = st.nextToken().charAt(0);

        System.out.println(s);
        System.out.println(t);

        int[] result = new int[s.length()]; // 거리 담을 변수
        int p = 100; //거리 비교를 위해서 선언한 변수, 0으로 초기화하면 안됨. 0은 찾고자 하는 문자와 같다라는 의미.

        // 왼쪽에서 오른쪽으로 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t){
                p = 0; // t 문자를 만나면 거리는 0
            } else{
                p++; // t가 아니라면 이전 t와의 거리 +1
            }

            result[i] = p; // 결과 배열에 저장
        }

        // 오른쪽에서 왼쪽으로 거리 계산.
        p = 100;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == t){
                p=0;
            } else{
                p++;
            }

            // 위에서 계산한 결과와 비교해서 더 작은 값으로 할당.
            result[i] = Math.min(result[i], p);
        }


        // 결과 출력
        for (int i : result) {
            System.out.print(i+" ");
        }

        br.close();
        
        
/*
        String strSource = "teachermode";
        char indiCh = 'e';
        char compCh = '\0';
        char[] tmpChar = {};
        int startIdx = 0, leftidx = 0, rightidx = 0;

        tmpChar = strSource.toCharArray();
        for (int i = 0; i < tmpChar.length; i++) {
            indiCh = tmpChar[i];
            System.out.println("tmpChar[i]: " + tmpChar[i]);
            startIdx = i;

            for(int j = i+1; j<tmpChar.length;j++){
                if(indiCh == tmpChar[j]){
                  rightidx = j;
                }
            }
            System.out.println(tmpChar[i] + ": rightidx = " + rightidx);
            rightidx = 0;
        }
*/


    }
}
