package queue;

import java.util.LinkedList;
import java.util.Queue;

class Node {

    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class 이진트리순회_BFS {

    static Node root;   // 루트 노드 담을 변수

    public static void BFS(Node node) {

        // BFS는 재귀를 사용하지 않음. 큐를 사용함.
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        int level = 0;
        while(!queue.isEmpty()){

            System.out.print("[dbg] level " + level);

            for (int i = 0; i < queue.size(); i++) {
                Node curr = queue.poll();
                System.out.print(curr.data);

                //자식 있는지 체크() 있다면 큐에 추가 없으면 넘어가기
                if(curr.lt != null) queue.add(curr.lt);
                if(curr.rt != null) queue.add(curr.rt);
            }
            level++;
            System.out.println("[dbg]");

        }
    }

    public static void main(String[] args) {

        root = new Node(1);

        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);


        BFS(root); // 루트 Node를 기점으로 탐색을 시작

    }
}
