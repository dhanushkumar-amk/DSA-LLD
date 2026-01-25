package DSA.LEARN.PATTERN;

public class Pattern20 {
    public static void main(String[] args) {
        pattern20(5);
    }

    private static void pattern20(int n) {

        for (int i = 1; i < n; i++) {

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

    }

}
