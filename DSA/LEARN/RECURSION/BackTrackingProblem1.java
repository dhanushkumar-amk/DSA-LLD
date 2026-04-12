package DSA.LEARN.RECURSION;


public class BackTrackingProblem1 {
    public static void main(String[] args) {
  boolean[][] maze = {
                {true, true, true},
                 {true, true, true},
                 {true, true, true},
        };

        possiblePaths(maze, "", 0, 0);
    }

  private static void possiblePaths(boolean[][] maze, String processed, int row, int col){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(processed);
            return;
        }

        if (!maze[row][col])
            return;

        // if visited mark false for particular function call
        maze[row][col] = false;

        if (row < maze.length - 1)
            possiblePaths(maze, processed + 'D', row + 1, col);

        if (col < maze[0].length - 1)
            possiblePaths(maze, processed + 'R', row, col + 1);

        if (row > 0)
            possiblePaths(maze, processed + 'U', row - 1, col);

        if(col > 0)
            possiblePaths(maze, 'L'+ processed, row , col - 1);

        // backtracking
      // mark true if over while return to next
      maze[row][col] = true;
    }
}
