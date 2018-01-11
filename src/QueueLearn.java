import java.util.Scanner;

public class QueueLearn {

    QueueLearn left;
    QueueLearn right;
    int data;


    QueueLearn(int data)
    {
        this.data=data;
        this.left=right=null;
    }
    static QueueLearn insert(QueueLearn root, int data) {

    if(root==null)
    {
        return new QueueLearn(data);
    }
    else
    {
        QueueLearn cur;
        if (data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
            System.out.println(root.left.data);
        } else {
            cur = insert(root.right, data);
            root.right = cur;
            System.out.println(root.right.data);
        }
        return root;
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        QueueLearn root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            System.out.println(insert(root, data).data);
        }


    }
}
