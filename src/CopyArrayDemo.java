import java.util.Scanner;

public class CopyArrayDemo {



    void checkWhile(int a)
    {
        int k=10;
        while(a<k)
        {
           k++;
        }
        System.out.println(k);

    }
    public static void main(String[] args) {

        new CopyArrayDemo().checkWhile(20);
//        Scanner s=new Scanner(System.in);
//
//        int a[]=new int[s.nextInt()+1];
//        for (int i=1;i<a.length;i++)
//        {
//            a[i]=i;
//            System.out.println(a[i]);
//        }
//        int item[]=new int[a.length*2+1];
//        for (int i=0;i<a.length;i++)
//        {
//            item[i]=a[i];
//            System.out.println(item[i]);
//
//        }
//        System.out.println(item.length);
    }
}
