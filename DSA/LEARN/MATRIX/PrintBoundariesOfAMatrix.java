package DSA.LEARN.MATRIX;

public class PrintBoundariesOfAMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        printBoundaries(matrix);
    }

    private static void printBoundaries(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        if (m == 0 || n == 0) return;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        // Top row
        for (int i = left; i <= right; i++) {
            System.out.print(matrix[top][i] + " ");
        }

        // Right column
        for (int i = top + 1; i <= bottom; i++) {
            System.out.print(matrix[i][right] + " ");
        }

        // Bottom row
        if (top < bottom) {
            for (int i = right - 1; i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
            }
        }

        // Left column
        if (left < right) {
            for (int i = bottom - 1; i > top; i--) {
                System.out.print(matrix[i][left] + " ");
            }
        }
    }
}
