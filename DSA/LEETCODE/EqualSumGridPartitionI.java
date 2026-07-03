package DSA.LEETCODE;

public class EqualSumGridPartitionI {
    public static void main(String[] args) {

    }


     public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int totalSum = 0;
        for(int[] row : grid){
            for(int col : row){
                totalSum += col;
            }
        }

        int[] rowSum = new int[m];
         for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
                 rowSum[i] += grid[i][j];
             }
         }

         int topSum = 0;
         for (int i = 0; i < m - 1; i++) {
             topSum += rowSum[i];

             if (topSum * 2 == totalSum)
                 return true;
         }

         int[] columnSum = new int[n];
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 columnSum[j] += grid[i][j];
             }
         }

         int leftSum = 0;
         for (int i = 0; i < n - 1; i++) {
             leftSum += columnSum[i];
             if (leftSum * 2 == totalSum)
                 return true;
         }
    return false;
    }
}
