package DSA.LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;

        // for rotating
        k = k % total;

        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % total;
                int newRow = newIndex / n;
                int newColumn = newIndex % n;

                ans[newRow][newColumn] = grid[i][j];
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                rowList.add(ans[i][j]);
            }
            result.add(rowList);
        }
        return result;
    }
}
