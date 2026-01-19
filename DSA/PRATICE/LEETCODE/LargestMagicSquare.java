package DSA.PRATICE.LEETCODE;

// https://leetcode.com/problems/largest-magic-square/

public class LargestMagicSquare {

    public static void main(String[] args) {
        int[][] grid = {
                {5, 1, 3, 1},
                {9, 3, 3, 1},
                {1, 3, 3, 8}
        };

        System.out.println(largestMagicSquare(grid));
    }

    public static int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] rowPrefix = new int[m][n];
        int[][] colPrefix = new int[m][n];

        for (int i = 0; i < m; i++) {
            rowPrefix[i][0] = grid[i][0];
            for (int j = 1; j < n; j++) {
                rowPrefix[i][j] = rowPrefix[i][j - 1] + grid[i][j];
            }
        }

        for (int j = 0; j < n; j++) {
            colPrefix[0][j] = grid[0][j];
            for (int i = 1; i < m; i++) {
                colPrefix[i][j] = colPrefix[i - 1][j] + grid[i][j];
            }
        }

        for (int size = Math.min(m, n); size >= 2; size--) {
            for (int i = 0; i + size <= m; i++) {
                for (int j = 0; j + size <= n; j++) {

                    int target = rowPrefix[i][j + size - 1] - (j > 0 ? rowPrefix[i][j - 1] : 0);
                    boolean valid = true;

                    for (int r = i; r < i + size; r++) {
                        int sum = rowPrefix[r][j + size - 1] - (j > 0 ? rowPrefix[r][j - 1] : 0);
                        if (sum != target) {
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) continue;

                    for (int c = j; c < j + size; c++) {
                        int sum = colPrefix[i + size - 1][c] - (i > 0 ? colPrefix[i - 1][c] : 0);
                        if (sum != target) {
                            valid = false;
                            break;
                        }
                    }
                    if (!valid) continue;

                    int diag1 = 0;
                    int diag2 = 0;
                    for (int k = 0; k < size; k++) {
                        diag1 += grid[i + k][j + k];
                        diag2 += grid[i + k][j + size - 1 - k];
                    }

                    if (diag1 == target && diag2 == target) {
                        return size;
                    }
                }
            }
        }

        return 1;
    }
}
