package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class PeakElement2 {

    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 15},
                {21, 30, 14},
                {7, 16, 32}
        };

        int[] ans = findPeakGrid(matrix);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] findPeakGrid(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int maxRowIndex = findMaxIndex(matrix, n, mid);

            int left = (mid - 1 >= 0) ? matrix[maxRowIndex][mid - 1] : -1;
            int right = (mid + 1 < m) ? matrix[maxRowIndex][mid + 1] : -1;

            if (matrix[maxRowIndex][mid] > left &&
                matrix[maxRowIndex][mid] > right) {

                return new int[]{maxRowIndex, mid};
            }
            else if (matrix[maxRowIndex][mid] < left) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    private static int findMaxIndex(int[][] matrix, int n, int col) {

        int maxValue = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (matrix[i][col] > maxValue) {
                maxValue = matrix[i][col];
                index = i;
            }
        }

        return index;
    }
}