package DSA.LEARN.PATTERN;

public class Pattern18 {
    public static void main(String[] args) {
        pattern18(5);
    }

    private static void pattern18(int n) {

        for (int i = 0; i < n; i++) {
            for(char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
