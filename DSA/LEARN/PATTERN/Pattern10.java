package DSA.LEARN.PATTERN;

public class Pattern10 {
    public static void main(String[] args) {
    pattern10(5);
    }

    public static void pattern10(int n) {

        // upper part
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower part
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
