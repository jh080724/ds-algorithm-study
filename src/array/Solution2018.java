package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2018 {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        /*
        https://www.acmicpc.net/problem/2018
        입력: 15, 출력: 4
        * */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

//        System.out.println(Arrays.toString(arr));

        int start = 0, end = 0, count = 0, sum = 1;

//        while(end < arr.length){
        while(end < N){

            if(sum == N){
                count++;
                end++;
                if(end < N) sum+=arr[end];
            } else if(sum > N){
                sum -= arr[start];
                start++;
            } else{
                end++;
                sum+=arr[end];  // 터졌음. 확인할 것. --> 29Line: sum 초기값을 0->1로 수정함.
            }

        }

        System.out.println(count);

        sc.close();
    }
}
