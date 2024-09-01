public class PreOrder {
    static class Node {
        String val;
        Node r;
        Node l;

        public Node(String x) {
            val = x;
        }
    }

    public void preorder(Node root) {


    }

    public static void main(String[] args) {
        Node root = new Node("a");

        root.l = new Node("b");
        root.r = new Node("e");

        root.l.l = new Node("c");
        root.l.r = new Node("d");

        root.r.l = new Node("f");
        root.r.r = new Node("g");

        root.r.r.r = new Node("h");
    }
}
