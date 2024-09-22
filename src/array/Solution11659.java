package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution11659 {
    public static void main(String[] args) throws IOException {

        /* 백준
        https://www.acmicpc.net/problem/11659
           입력:
            5 3
            5 4 3 2 1
            1 3
            2 4
            5 5

            출력:
            12
            9
            1
         */
        /*
        입력부터 제대로 처리하기
        for(숫자 개수 만큽 반복){
          구간합 배열 생성하기 (s[i] = s[i-1] + A[i]
        }

        for(범위 개수만큼 반복){
            범위 입력받은 값 가져와서
            구각합 출력하기.( s[y] = S[x-1], x가 0일경우 S[0]
        }
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] S=  new int[N+1];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

//        S[0] = Integer.parseInt(st2.nextToken());
        for (int i = 1; i < N + 1; i++) {
            // 런타임 오류 있음 , 확인할 것. --> 확인함, 47라인 토큰확인을 위한 디버깅 코드 주석처리함.
            S[i] = S[i - 1] + Integer.parseInt(st2.nextToken());
        }
//        System.out.println(Arrays.toString(S));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st3.nextToken());
            int y = Integer.parseInt(st3.nextToken());
//            System.out.println(S[y] - S[x - 1]);
            sb.append(S[y] - S[x - 1] + "\n");
        }

        System.out.println(sb);

        br.close();

    }
}
