/**
 * Algorithm to set entire row and column are set to 0,
 * if an element in MxN matrix is 0.
 */

public class SetZero {

    static void setZeros(int[][] matrix)
    {
        boolean[] rows=new boolean[matrix.length];
        boolean[] cols=new boolean[matrix[0].length];


        for (int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows[i]=cols[j]=true;
                }
            }
        }

        for(int i=0;i<matrix.length;++i)
        {
            for(int j=0;j<matrix[0].length;++j)
            {
                if(rows[i]||cols[j])
                    matrix[i][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        int a[][]={{1,3},{2,4},{6,5}};

        //Here, {1,3}-->it takes as 0th index
        //{2,4}-->it takes as 1st index.
        //{6,5}-->it takes as 2nd index.
        setZeros(a);
    }


}
