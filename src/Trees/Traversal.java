package Trees;

public class Traversal {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right); // ✅ fixed
    }

    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        Traversal t = new Traversal();

        Node root = t.new Node(1);
        root.left = t.new Node(2);
        root.right = t.new Node(3);
        root.left.left = t.new Node(4);
        root.left.right = t.new Node(5);

        // Preorder
        System.out.print("Preorder: ");
        t.preorder(root);

        // Inorder
        System.out.print("\nInorder: ");
        t.inorder(root);

        // Postorder
        System.out.print("\nPostorder: ");
        t.postorder(root);
    }
}