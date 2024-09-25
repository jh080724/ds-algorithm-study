package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.StringTokenizer;

public class Graph2 {

    static int N, M, answer = 0;
    static List<List<Integer>> graph;
    static int[] visitFlag;

    static void DFS(int v) {
        if (v == N) {
            answer++;
        } else {
            // graph[v][i] == 1 ? <-- 인접행렬이었을 때.
            for (int i : graph.get(v)) {
                if(visitFlag[i] == 0){
                    visitFlag[i] = 1;
                    DFS(i);
                    visitFlag[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visitFlag = new int[N + 1];

        graph = new ArrayList<>(); // 바깥을 감싸는 큰 리스트
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>()); // 짜잘짜잘 리스트 (각 노드의 인접 노드 표현용)
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        visitFlag[1] = 1;
        DFS(1);

        for (List<Integer> integers : graph) {
            System.out.println("[dbg] " + integers);
        }
        System.out.println("answer = " + answer);
    }

}
