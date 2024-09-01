package LinkedList;

public class LinkedListDeneme {
    Node head;
  static class Node {
      int value;
      Node next;

      public Node(int x) {
          value = x;
          next = null;
      }
  }

  public void insert(int data) {
    Node node1 = new Node(data);
    if(this.head == null) {
        this.head = node1;
    }else {
        Node tmp = this.head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node1;
    }
  }

  public void printList() {
      Node tmp = this.head;
      while(tmp != null) {
          System.out.print(tmp.value + " ");
          tmp = tmp.next;
      }
  }

  public void removeList(int index){
      if(this.head == null) {
          return;
      }
      Node tmp = this.head;
      for(int i = 0; tmp != null && i < index-1; i++) {
          tmp = tmp.next;
      }
      tmp.next = tmp.next.next;
      tmp.next.next = null;
  }

  public void insertAddIndexList(int index,int data) {
      Node node1 = new Node(data);
      Node tmp = this.head;
      if(this.head == null) {
          tmp = node1;
      }
      for(int i = 0; tmp != null && i < index-1; i++) {
          tmp = tmp.next;
      }
      Node tmp2 = tmp.next;
      tmp.next = node1;
      node1.next = tmp2;

  }
}
