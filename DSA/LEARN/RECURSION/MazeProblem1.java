package DSA.LEARN.RECURSION;

public class MazeProblem1 {
    public static void main(String[] args) {

        System.out.println(countPaths(3,3));
    }

    private static int countPaths(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        // right
        int right = countPaths(row,col - 1);
        // down
        int down = countPaths(row - 1, col);

        return right + down;
    }

}
