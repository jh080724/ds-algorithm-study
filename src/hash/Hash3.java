package hash;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hash3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 내림차 TreeSet 생성
        Set<Integer> tSet = new TreeSet<>(Comparator.reverseOrder());
//        Set<Integer> tSet = new TreeSet<>(Collections.reverseOrder()); 가능함.

        // i, j 고정시키고, K 끝까지 순회하고,
        // i, j +1부터서, K 끝까지 순회하고....
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    tSet.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }

        // K번째 큰값 찾기
        int count = 0;
        for (int i : tSet) {
            count++;
            if(count == K){
                System.out.println(i);
                break;
            }
        }

        System.out.println(tSet);

        br.close();

    }
}

