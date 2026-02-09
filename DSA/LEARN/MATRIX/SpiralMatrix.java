package DSA.LEARN.MATRIX;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        printSpiral(matrix);
    }

    private static void printSpiral(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right){

            // right
            for (int i = left; i <= right ; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            for (int i = right; i >= left ; i--) {
                System.out.print(matrix[bottom][i] + " ");
            }
            bottom--;

            for (int i = bottom; i >= top ; i--) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;
        }
    }
}
