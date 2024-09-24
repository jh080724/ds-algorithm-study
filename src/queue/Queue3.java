package queue;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// Queue3a 문제와 동일한 문제 풀이. --> 개발 미완료 상태임.
public class Queue3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int kDegree = 0;

        st = new StringTokenizer(br.readLine(), " ");
        int[] degreeRisk = new int[N];
        int maxRisk = 0;

        for (int i = 0; i < N; i++) {
            degreeRisk[i] = Integer.parseInt(st.nextToken());
            maxRisk = Math.max(maxRisk, degreeRisk[i]);
        }

        System.out.println("maxRisk = " + maxRisk);

        kDegree = degreeRisk[K];



        System.out.println("Arrays.toString(degreeRisk) = " + Arrays.toString(degreeRisk));

        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> person = new HashMap<>();

        for (int i = 0; i < N; i++) {
            queue.add(degreeRisk[i]);
        }

        int cnt = 0;
        int tmpPoll = 0;

        for (int i = 0; i < N; i++) {
            tmpPoll = queue.poll();
            if (tmpPoll >= kDegree) {
                if (tmpPoll >= maxRisk) {
                    cnt++;
                }else{
                    queue.offer(tmpPoll);
                }
            } else {
                queue.offer(tmpPoll);
            }
        }

        System.out.println(cnt);

    }
}
