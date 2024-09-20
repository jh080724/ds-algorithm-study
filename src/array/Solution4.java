package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution4 {

    // 소수 판단 함수
    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arrInt = new int[n];

        for (int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arrInt.length; i++) {
            int tmp = arrInt[i];
            int result = 0;

            // 숫자 뒤집기
            while (tmp > 0) {
                int t = tmp % 10;
                result = result * 10 + t;
                tmp = tmp / 10;
            }

            if(isPrime(result)) System.out.print(result + " ");
        }

        br.close();
    }



}
