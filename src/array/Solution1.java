package array;

import java.io.*;
import java.util.StringTokenizer;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            arrInt[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(arrInt[0] + " ");

        for (int i = 1; i < arrInt.length ; i++) {
            if (arrInt[i] > arrInt[i - 1]) {
                bw.write(arrInt[i] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();

/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String inStr = br.readLine();
        StringTokenizer st = new StringTokenizer(inStr, " ");
        System.out.println("n = " + n);
        System.out.println("inStr = " + inStr);

        int[] arrInt = new int[st.countTokens()];

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(st.nextToken());
//            System.out.println("arrInt = " + arrInt[i]);

            if(i == 0){
                System.out.print(arrInt[i] + " ");
            }
            else if(arrInt[i] > arrInt[i-1]){
                System.out.print(arrInt[i] + " ");
            }
        }
*/
    }
}
