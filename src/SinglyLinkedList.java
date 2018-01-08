import java.util.Scanner;

class Node {

    protected int data;
    protected Node link;


    //constructor
    public Node() {
        link = null;
        data = 0;
    }

    public Node(Node link, int data) {
        this.data = data;
        this.link = link;
    }
    //Getters and setters for both node and data.

    public void setLink(Node link) {
        this.link = link;

    }

    public Node getLink() {
        return link;
    }

    public void setData(int data) {
        this.data = data;

    }

    public int getData() {
        return data;
    }
}

class linkedList {
    //declaring nodes
    protected Node start;
    protected Node end;

    public int size;


    public linkedList() {
        start = null;
        end = null;
        size = 0;
    }
//
//    public linkedList(Node start, Node end, int size) {
//        this.start = start;
//        this.end = end;
//        this.size = size;
//    }


    public boolean isEmpty() {

        //It will return "null" only when the list node is null. So the list became empty.
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void insertAtStart(int val) {
        Node nptr = new Node(null, val);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            nptr.setLink(start);
            start = nptr;
        }

    }

    public void insertAtEnd(int val) {
        Node nptr = new Node(null, val);
        size++;
        if (start == null) {
            start = nptr;
            end = start;
        } else {
            end.setLink(nptr);
            end = nptr;
        }
    }

    public void insertAtPos(int val, int pos) {
        Node nptr = new Node(null, val);//current node

        Node ptr = start;//start node
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            if (i == pos) {
                Node tmp = ptr.getLink();
                ptr.setLink(nptr);
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size++;
    }

    public void deleteAtPos(int pos) {
        if (pos == 1) {
            start = start.getLink();
            size--;
            return;
        }
        if (pos == size) {
            //If we delete the tail element, we need to update the link of the node tail in a list.
            Node s = start;
            Node t = start;
            while (s != end) {
                //This is to get the another node using link of the node to get the end node.
                t = s;
                s = s.getLink();
            }

            end = t;
            //end node setting as null to delete it from the list.
            end.setLink(null);
            //decrementing the size of a list.
            size--;
            return;
        }

        Node ptr = start;
        pos = pos - 1;
        for (int i = 1; i < size; i++) {
            //Finding the position of the element.
            if (i == pos) {

                Node tmp = ptr.getLink();
                //
                tmp = tmp.getLink();
                ptr.setLink(tmp);//or//ptr.setLink(ptr.getLink);
                break;
            }
            ptr = ptr.getLink();
        }

        size--;
    }


    public void display() {
        System.out.println("\nSingly Linked List");
        if (size == 0) {
            System.out.println("empty\n");
            return;
        }
        if (start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }
        Node ptr = start;
        System.out.println(start.getData() + " -> ");
        ptr = start.getLink();
        while (ptr.getLink() != null) {
            System.out.println(ptr.getData() + " -> ");
        }

        System.out.println(ptr.getData() + "\n");


    }

}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        linkedList list = new linkedList();
        System.out.println("Singly Linked List Test\n");
        char ch;
        /*  Perform list operations  */
        do {
            System.out.println("\nSingly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insertAtStart(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to insert");
                    list.insertAtEnd(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt();
                    System.out.println("Enter position");
                    int pos = scan.nextInt();
                    if (pos <= 1 || pos > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;
                case 4:
                    System.out.println("Enter position");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5:
                    System.out.println("Empty status = " + list.isEmpty());
                    break;
                case 6:
                    System.out.println("Size = " + list.getSize() + " \n");
                    break;
                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }




}
