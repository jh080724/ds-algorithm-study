package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BSFSolution2 {

    static int answer = 0;  // 점프횟수, static 선언은 객체생성 없이 변수 사용하기 위함.
    static int[] dist = {1, -1, 5}; // 이동할 수 있는 거리
    static int[] check; // 방문 체크
    static Queue<Integer> queue = new LinkedList<>();

    private static void BFS(int s, int e) {  // s:현수, e:소
        check = new int[10001];
        check[s] = 1;
        queue.offer(s);
        int L = 0; // 트리 레벨
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int curr = queue.poll();
                for (int j = 0; j < 3; j++) {  // dis.length는 3으로 고정되어 있음.
                    int next = curr + dist[j];
                    if(next == e){  // 소를 찾았으면, 레벨(L) 출력
                        System.out.println(L+1);
                        return;
                    }

                    // 범위내의 움직인지 검사하고, 방문여부(check 배열) 검사
                    // check 배여을 사용해서 이미 확인했던 경로는 다시 체크하지 않도록 제어
                    if (next >= 1 && next <= 10000 && check[next] == 0) {
                        check[next] = 1;
                        queue.offer(next);
                    }

                }
            }
            L++;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        BFS(S, E);
    }
}
