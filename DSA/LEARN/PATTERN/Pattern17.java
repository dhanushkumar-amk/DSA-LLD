package DSA.LEARN.PATTERN;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(5);
    }

    public static void pattern17(int n){
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2 * i + 1)/2;
            for (int character = 0; character < 2 * i + 1; character++) {
                if (character < breakPoint)
                    System.out.print(ch++);
                else
                    System.out.print(ch--);
            }
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
