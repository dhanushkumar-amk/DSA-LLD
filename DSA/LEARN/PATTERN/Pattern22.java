package DSA.LEARN.PATTERN;

public class Pattern22 {
    public static void main(String[] args) {
        pattern22(5);
    }

    private static void pattern22(int n) {

        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int top = i;
                int left = j;
                int right = (size - 1)-j;
                int bottom = (size -1)- i;

                int value = n - Math.min(top, Math.min(left, Math.min(right, bottom)));
                System.out.print(value + " ");
;            }
            System.out.println();
        }
    }
}
