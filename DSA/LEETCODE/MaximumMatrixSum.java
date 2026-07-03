package DSA.LEETCODE;

// problem url => https://leetcode.com/problems/maximum-matrix-sum/?envType=daily-question&envId=2026-01-05
// problem name => Maximum Matrix Sum

public class MaximumMatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {-1,-2,-3},
                {1,2,3}
        };

        long ans = maxMatrixSum(matrix);
        System.out.println(ans);
    }

    public static long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int min = Integer.MAX_VALUE;
        int countNegative = 0;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                sum += Math.abs(matrix[i][j]);
                min = Math.min(min, Math.abs(matrix[i][j]));

                if (matrix[i][j] < 0)
                    countNegative++;
            }
        }

        if (countNegative % 2 == 0)
            return  sum;
        return sum - 2 * min;
    }
}
