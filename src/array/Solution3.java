package array;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        for (int i = 0; i < n; i++) {
            if(A[i]  == B[i]) System.out.println("D");
            else if(A[i] == 1 && B[i] == 3) System.out.println("A");
            else if(A[i] == 2 && B[i] == 1) System.out.println("A");
            else if (A[i] == 3 && B[i] == 2) System.out.println("A");
            else System.out.println("B");
        }

        br.close();
/*

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        StringTokenizer stA= new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(stA.nextToken());
        }
        System.out.println(Arrays.toString(arrA));

        StringTokenizer stB = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arrB[i] = Integer.parseInt(stB.nextToken());
        }

        System.out.println(Arrays.toString(arrB));

        for (int i = 0; i < n; i++) {
            if(arrA[i] > arrB[i]){
                System.out.println("A");
            } else if(arrA[i] < arrB[i]){
                System.out.println("B");
            }
            else if(arrA[i] == arrB[i]) {
                System.out.println("D");
            }
        }

*/


    }
}
