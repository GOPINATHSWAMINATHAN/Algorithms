public class LinkDemo {

    /**
     * Runner Technique:
     *              It is used in many linked list problems. It means that you interate
     *              through the linkedlist with two pointers simulteaneously, with one ahead of the other.
     *
     *              The "fast" node might be ahead by a fixed amount, or it might be hopping multiple nodes for each
     *              one node that the "slow" node iterates through.
     *
     */

    LinkDemo next = null;

    int data;

    public LinkDemo(int d) {
        data = d;
    }

    void appendToTail(int d) {
        LinkDemo end = new LinkDemo(d);
        LinkDemo n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    LinkDemo deleteNode(LinkDemo head, int d) {
        LinkDemo l = head;

        if (l.data == d)
            return head.next;

        while (l.next != null) {
            if (l.next.data == d) {
                l.next = l.next.next;
                return head;
            }
            l = l.next;
        }
        return head;
    }
}
