import java.util.Scanner;

public class CopyArrayDemo {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int a[]=new int[s.nextInt()+1];
        for (int i=1;i<a.length;i++)
        {
            a[i]=i;
            System.out.println(a[i]);
        }
        int item[]=new int[a.length*2+1];
        for (int i=0;i<a.length;i++)
        {
            item[i]=a[i];
            System.out.println(item[i]);

        }
        System.out.println(item.length);
    }
}
