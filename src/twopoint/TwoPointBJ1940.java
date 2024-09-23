package twopoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointBJ1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println("[dbg] arr = " + Arrays.toString(arr));

        int start = 0, end = N-1, total = 0, count = 0;


        while (start < end) {
            total = arr[start] + arr[end];
            if(total < M){ // 우리의 합계가 target 합계(M)보다 작은 경우
                start++;
            }else if(total== M){
                count++;
                start++;
                end--;  // end는 감소해야 한다.
            }else{  // 우리의 합계가 target 합계(M)보다 큰 경우
                end--;
            }
        }

        System.out.println(count);


        br.close();


    }
}
