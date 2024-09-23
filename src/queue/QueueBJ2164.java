package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueBJ2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        //큐에 1부터 N까지 넣자
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 카드가 1장 남을때까지 반복
        while (queue.size() > 1){
            queue.poll(); // 첫장 버리기
            queue.offer(queue.poll()); // 맨 앞장 카드 뽑아서 뒤에 붙이기
        }

        System.out.println(queue.poll());

    }
}
