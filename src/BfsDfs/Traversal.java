package BfsDfs;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.value = x;
        }
    }
    public void bfs(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right != null) {
                queue.add(current.right);
            }
            System.out.print(current.value + " ");
        }

    }

    public   void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.println(current.value);
            if(current.right != null) {
                stack.push(current.right);
            }
            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Traversal traverse = new Traversal();

        traverse.bfs(root);
        traverse.dfs(root);
    }
}
