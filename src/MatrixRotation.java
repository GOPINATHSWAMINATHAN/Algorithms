import java.util.LinkedList;

public class MatrixRotation {

    static void mirrorNWSE(int[][] matrix, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        for (int i[] : matrix) {
            for (int k : i) {
                System.out.println(k);
            }
        }
    }

    static void mirrorNESW(int[][] matrix, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = tmp;
            }
        }
        for (int i[] : matrix) {
            for (int k : i) {
                System.out.println(k);
            }
        }
    }

    static void mirrorHorizontal(int[][] matrix, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 2; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }
        for (int i[] : matrix) {
            for (int k : i) {
                System.out.println(k);
            }
        }
    }

    static void mirrorVertical(int[][] matrix, int n) {
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = tmp;
            }
        }
        for (int i[] : matrix) {
            for (int k : i) {
                System.out.println(k);
            }
        }
    }

    //SQUARE OF A NUMBER.
    static int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);

        }
        return sum;
        //1+3+5+7+9
    }

    static int pairSum(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
         mirrorNWSE(a, 3);
         mirrorNESW(a,3);

         mirrorHorizontal(a,3);

         mirrorVertical(a,3);
         System.out.println(pairSumSequence(8));
        int m[] = {5};
        getElement(2, m);

        LinkedList ll=new LinkedList();
        ll.add("gopinath");
        ll.add("pulipandy");
        ll.add("raja");
        ll.add("mani");
        getElementFromList(0,ll);

    }


    //Hackerrank coding interview questions
    //M-th to Last Element

    //Using array
    static void getElement(int number, int array[]) {
        if (array.length > 2) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[(array.length) - number]);
            }
        } else {
            System.out.println("NIL");
        }
    }

    //Using LinkedList

    static void getElementFromList(int number,LinkedList list)
    {
        Object a=list.getLast();
        System.out.println(a);
        /**
         * Still need to implement this.
         */
    }


}
