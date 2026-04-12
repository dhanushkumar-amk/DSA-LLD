package DSA.LEARN.RECURSION;

import java.util.Arrays;

public class BackTrackingProblem2 {
        public static void main(String[] args) {
  boolean[][] maze = {
                {true, true, true},
                 {true, true, true},
                 {true, true, true},
        };

  int[][] path = new int[maze.length][maze[0].length];
        possiblePaths(maze, "", 0, 0, path, 1);
    }

  private static void possiblePaths(boolean[][] maze, String processed, int row, int col, int[][] path, int steps){
        if (row == maze.length - 1 && col == maze[0].length - 1){

            // for last call
            path[row][col] = steps;

            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();

            return;
        }

        if (!maze[row][col])
            return;


        // if visited mark false for particular function call
        maze[row][col] = false;
        path[row][col] = steps;

        if (row < maze.length - 1)
            possiblePaths(maze, processed + 'D', row + 1, col, path, steps + 1);

        if (col < maze[0].length - 1)
            possiblePaths(maze, processed + 'R', row, col + 1, path, steps + 1);

        if (row > 0)
            possiblePaths(maze, processed + 'U', row - 1, col, path, steps + 1);

        if(col > 0)
            possiblePaths(maze, 'L'+ processed, row , col - 1, path, steps + 1);

        // backtracking
      // mark true if over while return to next
      maze[row][col] = true;
      path[row][col] = 0;
    }
}
