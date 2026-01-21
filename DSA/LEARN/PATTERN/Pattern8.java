package DSA.LEARN.PATTERN;

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(5);
    }

    public static void pattern8(int n){
        for (int i = 0; i < n; i++) {

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
