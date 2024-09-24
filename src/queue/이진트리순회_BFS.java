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

    public static void BSF(Node node) {

        // BFS는 재귀를 사용하지 않음. 큐를 사용함.
        Queue<Node> queue = new LinkedList<>();


        queue.add(node);
        while(!queue.isEmpty()){

            for (int i = 0; i < queue.size(); i++) {
                Node curr = queue.poll();
                System.out.println(curr.data);
            }
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
