public class InsertNode {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    void push(int data) {
        //Allocate the node and put the data

        Node newNode = new Node(data);
        //Make new node to m
        newNode.next = head;
        head = newNode;
    }

}
