package DSA.LEARN.RECURSION;

public class Pattern2 {
    public static void main(String[] args) {
        print(4, 0);
    }

    private static void print(int row, int column){
        if (row == 0)
            return;

        if (column < row){
            print(row, column + 1);
            System.out.print("* ");
        }
        else{
            print(row - 1, 0);
            System.out.println();
        }
    }
}
