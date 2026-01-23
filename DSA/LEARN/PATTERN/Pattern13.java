package DSA.LEARN.PATTERN;

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    public static void pattern13(int n){
        int value = 1;
        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value++ + " ");
            }
            System.out.println();
        }
    }
}
