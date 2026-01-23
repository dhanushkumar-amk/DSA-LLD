package DSA.LEARN.PATTERN;

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(5);
    }

    public static void pattern12(int n){
        int spaces = 2 * n - 1;
        for (int i = 1; i <= n ; i++) {
            for (int leftj = 1; leftj <= i; leftj++) {
                System.out.print(leftj);
            }

            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }

            for (int rightj = i; rightj >= 1 ; rightj--) {
                System.out.print(rightj);
            }
            System.out.println();
            spaces -= 2;
        }
    }
}
