package DSA.LEARN.MATRIX;

public class PrintMatrixZigZagOrder {
    public static void main(String[] args) {
       int[][] matrix = {
               {1,2,3,4},
               {5,6,7,8},
               {9, 10, 11, 12}
       };

       zigZag(matrix);

    }

    public static void zigZag(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            if (i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }else{
                for (int j = n - 1; j >= 0 ; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
