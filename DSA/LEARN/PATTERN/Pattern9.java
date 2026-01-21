package DSA.LEARN.PATTERN;

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    public static void pattern9(int n){

        // upper part
        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }

            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        // lower pert
        for (int i = 1; i < n; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 2 * n - (2 * i + 1); star++) {
                System.out.print("*");
            }

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
