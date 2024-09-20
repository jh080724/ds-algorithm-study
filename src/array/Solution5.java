package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n;

        int[][] mt = new int[m][n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                mt[i][j] = Integer.parseInt(st.nextToken());
            }
        }
// 입력값 확인
//        System.out.println(Arrays.deepToString(mt));
//        for (int[] ints : mt) {
//            System.out.println(Arrays.toString(ints));
//        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mt[i][j]; // i번째 행의 값
                colSum += mt[j][i]; // i번째 열의 값
            }

            maxSum = Math.max(maxSum, rowSum);
            maxSum = Math.max(maxSum, colSum);
        }

        // 두 대각선의 합을 계산
        int diag1Sum = 0;
        int diag2Sum = 0;

        // oo, 11, 22, 33, 44
        // 04, 13, 22, 31, 40
        for (int i = 0; i < n; i++) {
            diag1Sum += mt[i][i];
            diag2Sum += mt[i][n-1-i];
        }

        maxSum = Math.max(maxSum, diag1Sum);
        maxSum = Math.max(maxSum, diag2Sum);

        System.out.println("maxSum = " + maxSum);
    }
}
