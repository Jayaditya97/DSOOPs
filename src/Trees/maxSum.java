package Trees;

public class maxSum {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left = right = null;
        }

        int maxSum = Integer.MIN_VALUE;

        int maxPath(Node root){
            if(root == null) return 0;

            int left = Math.max(0, maxPath(root.left));
            int right = Math.max(0, maxPath(root.right));

            maxSum = Math.max(maxSum,left+right+root.data);

            return root.data + Math.max(left,right);
        }

        public static void main(String[] args) {

        }
    }
}
