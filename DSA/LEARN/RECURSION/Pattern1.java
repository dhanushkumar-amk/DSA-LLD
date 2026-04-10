package DSA.LEARN.RECURSION;

public class Pattern1 {
    public static void main(String[] args) {
        print(4, 0);
    }


    private static void  print(int row, int column){
        if (row == 0)
            return;

        if (column < row) {
            System.out.print("* ");
            print(row, column + 1);
        }else{
            System.out.println();
            print(row - 1, 0);
        }
    }
}
