package DSA.LEETCODE;

public class MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold {
    public static void main(String[] args) {

    }

    public static int maxSideLength(int[][] matrix, int threshold) {
         int m = matrix.length;
         int n = matrix[0].length;

         int[][] ps = new int[m + 1][n + 1];

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                ps[i][j] = matrix[i][j - 1] + ps[i - 1][j] + ps[i][j - 1] - ps[i - 1][j - 1];
            }
        }

        int low = 0;
        int high = Math.min(m, n);
        int ans = 0;
        while (low <= high){
            int mid = (low + high)/2;

            if (existSquare(ps, m, n, mid, threshold)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;

    }

    private static boolean existSquare(int[][] ps, int m, int n, int k, int threshold) {
        for (int i = 0; i + k <= m; i++) {
            for (int j = 0; j + k <= n; j++) {
                int sum = ps[i + k][j + k] - ps[i][j + k] - ps[i + k][j] + ps[i][j];
                if (sum <= threshold) {
                    return true;
                }
            }
        }
        return false;
    }
}
