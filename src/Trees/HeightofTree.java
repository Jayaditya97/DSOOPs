package Trees;

public class HeightofTree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    int height(Node root){
        if(root == null) return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }
}