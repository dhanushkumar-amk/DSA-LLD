package DSA.LEARN.PATTERN;

public class Pattern15 {
    public static void main(String[] args) {
        pattern15(5);
    }

    public static void pattern15(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
