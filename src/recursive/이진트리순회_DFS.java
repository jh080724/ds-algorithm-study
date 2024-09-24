package recursive;

class Node {

    int data;
    Node lt, rt;

    public Node(int data) {
        this.data = data;
        lt = rt = null;
    }
}

public class 이진트리순회_DFS {

    static Node root;   // 루트 노드 담을 변수

    public static void DFS(Node node) {
        if(node == null) return;
//        System.out.print(node.data+" ");  // 전위
        DFS(node.lt);
//        System.out.print(node.data+" ");  // 중위
        DFS(node.rt);
        System.out.print(node.data+" ");  // 후위
    }

    public static void main(String[] args) {

        root = new Node(1);

        root.lt = new Node(2);
        root.rt = new Node(3);

        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);

        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);


        DFS(root); // 루트 Node를 기점으로 탐색을 시작

    }
}
