package Trees;

public class ancestors {

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    boolean ancestors(Node root, int target){
        if(root == null) return false;

        if(root.data == target) return true;

        if(ancestors(root.left, target) || ancestors(root.right, target)){
            System.out.print(root.data + " ");
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ancestors tree = new ancestors();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.left.right = new Node(4);

        int target = 3;
        tree.ancestors(root, target);

    }
}
