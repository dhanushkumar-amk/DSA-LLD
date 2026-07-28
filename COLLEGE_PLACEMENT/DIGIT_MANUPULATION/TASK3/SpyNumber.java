package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK3;

public class SpyNumber {
    public static void main(String[] args) {
        boolean ans = isSpy(1124);
        System.out.println(ans);
    }

    private static boolean isSpy(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            sum += digit;
            product *= digit;

            temp /= 10;
        }

        return sum == product;
    }
}