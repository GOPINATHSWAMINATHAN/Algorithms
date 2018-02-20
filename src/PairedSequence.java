public class PairedSequence {

    void pairSequence(int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=pairSum(i,i+1);
        }
        System.out.println(sum);
    }

   static int pairSum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        PairedSequence ps=new PairedSequence();
        ps.pairSequence(5);
    }
}
