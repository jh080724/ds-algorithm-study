package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
5 2
60 50 70 80 90
 */
class Patient{
    int index;  // 환자의 인덱스(M번째 환자를 확인하기 위함.)
    int risk;  // 환자의 위험도

    public Patient(int index, int risk) {
        this.index = index;
        this.risk = risk;
    }
}

public class Queue3a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<Patient> queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int risk = Integer.parseInt(st.nextToken());
            queue.offer(new Patient(i, risk));
        }

        int count = 0; // 몇 번째로 진료받는지 카운트
        while(!queue.isEmpty()){
            Patient current = queue.poll();
            boolean flag = false;

            // 현재 환자보다 위험도가 높은 환자가 있는지 확인.
            for (Patient p : queue) {
                if(p.risk > current.risk){
                    flag = true;
                    break;
                }
            }

            // 위험도가 높은 환자가 존재한다면, 현재 환자를 맨뒤로 보낸다.
            if(flag){
                queue.offer(current);
            }else { // 진료받자.
                count++;
                if(current.index == M){  // M번째 환자니 ?
                    System.out.println(count);
                    return;
                }
            }
        }
        br.close();
    }
}
