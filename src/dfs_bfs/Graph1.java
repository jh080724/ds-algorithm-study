package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Graph1 {

    static int N, M, answer = 0;
    static int[][] graph;
    static int[] visitFlag;

    static void DFS(int v) {
        if(v == N){   // 종료조건
            answer++;
        }else {
            for (int i = 1; i <= N; i++) {
                if (graph[v][i] == 1 && visitFlag[i] == 0) {  //다음 노드에서 다시 그래프 순회하기.
                    visitFlag[i] = 1;  // 방문한 노드 기록
                    DFS(i);
                    visitFlag[i] = 0;  // 노드 방문 기록 제거
                }
            }

        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visitFlag = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }

        for (int[] ints : graph) {
            System.out.println(Arrays.toString(ints));
        }

        visitFlag[1] = 1;
        DFS(1);  // 깊이 우선탐색: 재귀함수 사용
        System.out.println(answer);
    }
}
