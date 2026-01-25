package DSA.LEARN.PATTERN;

public class Pattern19 {
    public static void main(String[] args) {
        pattern19(5);
    }

    private static void pattern19(int n) {

        // Upper part
        for (int i = 0; i < n; i++) {

            for (int star = 0; star < n - i; star++) {
                System.out.print("*");
            }

            for (int space = 0; space < 2 * i; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < n - i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for (int i = 1; i <= n; i++) {

            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }

            for (int space = 0; space < 2 * (n - i); space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
