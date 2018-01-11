public class ListNode {

   ListNode check;

   int item;
   ListNode()
   {

   }
   ListNode(int item,ListNode check)
   {
       this.item=item;
       this.check=check;
   }

    public ListNode getCheck() {
        return check;
    }

    public void setCheck(ListNode check) {
        this.check = check;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    void insertData(int data)
   {
       ListNode ll=new ListNode(data,null);
       ll.check=ll.getCheck();

       System.out.println(ll.getItem());

   }

    public static void main(String[] args) {
        ListNode ln=new ListNode();
        ln.insertData(33);

        ln.insertData(34);
    }
}
