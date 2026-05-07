package DSA.LEARN.GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    // 🔹 MAIN METHOD (int[][] version)
    public static int getTotalIslands(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean[][] visited = new boolean[n][m];
        int count = 0;

        NumberOfIslands obj = new NumberOfIslands();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && !visited[i][j]) {
                    count++;
                    obj.bfsInt(i, j, visited, mat);
                }
            }
        }

        return count;
    }

    // 🔹 BFS for int[][]
    private void bfsInt(int row, int col, boolean[][] visited, int[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col));
        visited[row][col] = true;

        int n = grid.length;
        int m = grid[0].length;

        // ✅ ONLY 4 DIRECTIONS
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int r = curr.first;
            int c = curr.second;

            for (int i = 0; i < 4; i++) {
                int nrow = r + dRow[i];
                int ncol = c + dCol[i];

                if (nrow >= 0 && nrow < n &&
                    ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == 1 &&
                    !visited[nrow][ncol]) {

                    visited[nrow][ncol] = true;
                    queue.add(new Pair(nrow, ncol));
                }
            }
        }
    }

    // 🔹 CHAR VERSION (LeetCode style)
    public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int count = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (!visited[row][col] && grid[row][col] == '1') {
                    count++;
                    bfs(row, col, visited, grid);
                }
            }
        }
        return count;
    }

    private void bfs(int row, int col, boolean[][] visited, char[][] grid) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col));
        visited[row][col] = true;

        int n = grid.length;
        int m = grid[0].length;

        // ✅ FIX: ONLY 4 DIRECTIONS
        int[] dRow = {-1, 0, 1, 0};
        int[] dCol = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int r = curr.first;
            int c = curr.second;

            for (int i = 0; i < 4; i++) {
                int nrow = r + dRow[i];
                int ncol = c + dCol[i];

                if (nrow >= 0 && nrow < n &&
                    ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == '1' &&
                    !visited[nrow][ncol]) {

                    visited[nrow][ncol] = true;
                    queue.add(new Pair(nrow, ncol));
                }
            }
        }
    }

    // 🔹 Pair class
    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    // 🔹 TEST DRIVER
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0},
            {1, 0, 0, 1},
            {0, 0, 1, 1}
        };

        System.out.println(getTotalIslands(mat)); // Output: 3
    }


// dfs code
  public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int islandCount = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    public void dfs(char[][] grid, int row, int col, boolean[][] visited) {

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length
            || visited[row][col] || grid[row][col] == '0') {
            return;
        }

        visited[row][col] = true;

        dfs(grid, row + 1, col, visited);
        dfs(grid, row - 1, col, visited);
        dfs(grid, row, col + 1, visited);
        dfs(grid, row, col - 1, visited);
    }
}