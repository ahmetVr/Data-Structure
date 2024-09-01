package Tree;

public class Tree1 {
    Node root;
     static class Node {
        int value;
        Node left;
        Node right;
        public Node(int x) {
            this.value = x;
        }
    }

    public Tree1(int val) {
        root = new Node(val);
    }

    public Node addToLeftChild(Node parent,int val) {
        Node node = new Node(val);
        parent.left = node;
        return node;
    }

    public Node addToRightChild(Node parent,int val) {
        Node node = new Node(val);
        parent.right = node;
        return node;
    }

    public void preOrderTraversal(Node root) {
         if(root == null) {
             // Do nothıng
         } else {
             System.out.print(root.value + " ");
             preOrderTraversal(root.left);
             preOrderTraversal(root.right);
         }
    }

    public void inorderTraversal(Node root) {
         if(root == null) {

         } else {
             inorderTraversal(root.left);
             System.out.print(root.value + " ");
             inorderTraversal(root.right);
         }
    }



    // method(123)
    // method(num/10) => method(12)



}
