import java.util.Arrays;

public class Rotate {
    // With extra space.
    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ret = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                ret[i][j] = matrix[n-1-j][i];
            }
        }
        return ret;
    }

    // In place.
    // Relation matrix[i][j] = matrix[n-1-j][i] holds.
    static void rotateInPlace(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; ++i) {
            for (int j = i; j < n-1-i; ++j) {
                // save top
                int tmp = matrix[i][j];
                // left to top
                matrix[i][j] = matrix[n-1-j][i];
                // bottom to left
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                // right to bottom
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                // top to right
                matrix[j][n-1-i] = tmp;
            }
        }
    }

    //TEST----------------------------------
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 5},
                {11,22,33,44,55},
                {5, 4, 3, 2, 1},
                {55,44,33,22,11},
                {6, 7, 8, 9, 0}};
        System.out.println(Arrays.deepToString(rotate(a)));
        System.out.println();
        rotateInPlace(a);
        System.out.println(Arrays.deepToString(a));
    }
}