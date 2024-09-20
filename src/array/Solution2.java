package array;

import java.io.*;
import java.util.StringTokenizer;

public class Solution2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 학생 수 입력

        int[] arrInt = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//        130 135 148 140 145 150 150 153
        int max = arrInt[0], cnt = 0;

        for (int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(st.nextToken());
//            System.out.println("arrInt = " + arrInt[i]);

//            max = arrInt[i];
            if (arrInt[i] > max) {
                max = arrInt[i];
                cnt++;
//                System.out.println("max = " + max);
            }
        }

//        System.out.println("cnt = " + cnt);
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
