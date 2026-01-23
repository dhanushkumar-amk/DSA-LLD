package DSA.LEARN.PATTERN;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    public static void pattern11(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0 ; j--) {
                if(j % 2 == 0)
                    System.out.print(0 + " ");
                else
                    System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}
