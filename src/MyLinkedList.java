import java.util.LinkedList;

public class MyLinkedList {


    //Head of a list
    Node head;


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display() {

        while (head != null) {
            System.out.println(head.data);
             head=head.next;
        }
    }

    public static void main(String[] args) {


        MyLinkedList ml = new MyLinkedList();
        ml.head = new Node(3);
        Node second = new Node(3);
        Node third = new Node(4);
        ml.head.next = second;
        second.next = third;
        ml.display();
    }


}
