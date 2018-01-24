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
        //Make new node
        newNode.next = head;
        //Assigning the value of newnode to the head. so, now the pointer points  to head of current data.
        head = newNode;
    }

    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        //Creating new node to the next of previous node.
        new_node.next = prev_node.next;

        //Assigning the value to the current node which is next node of previous node.
        prev_node.next = new_node;
    }

    public void append(int new_data)
    {
        Node new_node=new Node(new_data);
        if(head==null)
        {
            head=new Node(new_data);
            return;
        }

        new_node.next=null;
        Node last=head;
        while(last.next!=null)
            last=last.next;

            last.next=new_node;
            return;
        }
    }


