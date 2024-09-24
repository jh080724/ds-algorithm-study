package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue2 {
    public static void main(String[] args) throws IOException {
        // 스택과규 문제5.
        // 백준 2164와 동일한 개념
        // 2장 붙이고 한장 버리고

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 왕자수
        int K = Integer.parseInt(st.nextToken()); // K번째 왕자는 나가야 한다.

        Queue<Integer> queue = new LinkedList<>();  // offer(뒤에서 채워넣기) , poll(앞에서 빼기)
        // 큐에 왕자 번호를 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            // K-1번만큼 뒤로 붙임.
            for (int i = 1; i < K; i++) {
                queue.offer(queue.poll());
            }

            queue.poll(); // K번째는 내보냄.
        }

        System.out.println(queue.poll());  // 큐에 남은 최종 왕자 출력
    }
}
