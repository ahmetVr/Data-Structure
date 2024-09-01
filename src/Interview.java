public class Interview {
    Node head;
    static class Node {
        String name;
        Node next;

        public Node(String str) {
            this.name = str;
        }
    }

    public void printList() {
        Node tmp = head;

        while(tmp != null) {
            tmp = tmp.next;
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
