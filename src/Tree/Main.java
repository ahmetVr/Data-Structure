package Tree;

public class Main {
    public static void main(String[] args) {
        Tree1 tree = new Tree1(4);
        Tree1.Node node2 = tree.addToLeftChild(tree.root,2);
        Tree1.Node node1 = tree.addToLeftChild(node2,1);
        Tree1.Node node3 = tree.addToRightChild(node2,3);
        Tree1.Node node6 = tree.addToRightChild(tree.root,6);
        Tree1.Node node5 = tree.addToLeftChild(node6,5);
        Tree1.Node node7 = tree.addToRightChild(node6,7);
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.inorderTraversal(tree.root);

     }
    /*
            4
          2    6
        1  3   5  7
    */
}
