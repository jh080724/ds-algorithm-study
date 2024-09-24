package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    // 스택과규 문제6.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String requiredSubject = br.readLine();
        String subjectApplied = br.readLine();

        // 필수과목을 위한 큐를 생성
        Queue<Character> queue = new LinkedList<>();
        for (char c : requiredSubject.toCharArray()) {
            queue.add(c);
        }

        for (char c : subjectApplied.toCharArray()) {
            if(queue.contains(c)){  // 수강신청 과목이 필수과목에 포함되는지 확인
                if(queue.poll() != c){  // 수간싵청 과목이 필수과목 수강 순서와 맞는지 확인.
                    // 필수과목 순서가 잘못됨.
                    System.out.println("NO");
                    return;
                }
            }
        }

        // 필수과목을 다 신청했는지 확인 필요
        if(!queue.isEmpty()) System.out.println("NO");
        else System.out.println("YES");

        br.close();
    }

}
