import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BTreeNode
{
    BTreeNode left,right;
    int data;
    BTreeNode(int data)
    {
        this.data=data;
        left=right=null;
    }
}

public class BTreeSolution {

    static void levelOrder(BTreeNode root)
    {
        Queue<BTreeNode> queue=new LinkedList<BTreeNode>();
        queue.add(root);
    while(queue.peek()!=null)
    {
        BTreeNode node=queue.remove();
        System.out.println(""+node.data+" ");
        if(node.left!=null)
            queue.add(node.left);
        if(node.right!=null)
            queue.add(node.right);
    }

    }
    public static BTreeNode insert(BTreeNode root,int data)
    {
        if(root==null)
        {
            return new BTreeNode(data);
        }
        else
        {
            BTreeNode cur;
            if(data<=root.data)
            {
                cur=insert(root.left,data);
                root.left=cur;
            }
            else
            {
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }


    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     BTreeNode root=null;
     while(T-->0)
     {
         int data=sc.nextInt();
         root=insert(root,data);
     }
     levelOrder(root);
    }
}
