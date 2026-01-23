package DSA.LEARN.PATTERN;

public class Pattern14 {
    public static void main(String[] args) {
        pattern14(5);
    }

    public static void pattern14(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
