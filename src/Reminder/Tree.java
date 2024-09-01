package Reminder;

public class Tree {
    Node root;
    static class Node{
        Node left;
        Node right;
        int value;
        public Node(int x) {
            this.value = x;
        }
    }
    // root.rıght
    //root.rıght.rıght
    // tree.ısBst()
    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBSTUtil(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.value < min  || root.value > max) {
            return false;
        }

        return isBSTUtil(root.left, min, root.value - 1) && isBSTUtil(root.right,root.value + 1, max);
    }


}
