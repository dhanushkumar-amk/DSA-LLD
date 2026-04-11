package DSA.LEARN.RECURSION;

public class MazeProblem4 {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                 {true, false, true},
                 {true, true, true},
        };

        possiblePaths(maze, "", 0, 0);
    }

    // path with obstacles
    private static void possiblePaths(boolean[][] maze, String processed, int row, int col){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(processed);
            return;
        }

        if (!maze[row][col])
            return;

        if (row < maze.length - 1)
            possiblePaths(maze, processed + 'D', row + 1, col);

        if (col < maze[0].length - 1)
            possiblePaths(maze, processed + 'R', row, col + 1);
    }
}
