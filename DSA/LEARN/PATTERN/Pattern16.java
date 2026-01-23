package DSA.LEARN.PATTERN;

public class Pattern16 {
    public static void main(String[] args) {
        pattern16(5);
    }

    public static void pattern16(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1));
            }
            System.out.println();
        }
    }
}
