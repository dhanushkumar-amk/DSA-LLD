package DSA.LEARN.RECURSION;

public class MazeProblem3 {
    public static void main(String[] args) {
        printPossiblePath("",3,3);
    }

    // print diagonals also
    private static void printPossiblePath(String processed, int row, int col){

        if (row == 1 && col == 1){
            System.out.println(processed);
            return;
        }

        if (row > 1)
            printPossiblePath(processed + 'D', row - 1, col );

        if (col > 1)
            printPossiblePath(processed + 'R', row, col - 1);

        if (row > 1 && col > 1)
            printPossiblePath(processed + 'C', row - 1, col - 1);
    }
}
