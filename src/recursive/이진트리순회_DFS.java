package recursive;

class Node {

    int data;
    queue.Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class 이진트리순회_DFS {

    static queue.Node root;   // 루트 노드 담을 변수

    public static void DFS(queue.Node node) {
        if(node == null) return;
//        System.out.print(node.data+" ");  // 전위
        DFS(node.lt);
//        System.out.print(node.data+" ");  // 중위
        DFS(node.rt);
        System.out.print(node.data+" ");  // 후위
    }

    public static void main(String[] args) {

        root = new queue.Node(1);

        root.lt = new queue.Node(2);
        root.rt = new queue.Node(3);

        root.lt.lt = new queue.Node(4);
        root.lt.rt = new queue.Node(5);

        root.rt.lt = new queue.Node(6);
        root.rt.rt = new queue.Node(7);


        DFS(root); // 루트 Node를 기점으로 탐색을 시작

    }
}
