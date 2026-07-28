package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK3;

public class StrongNumber {
    static void main(String[] args) {
        boolean ans = isStrong(145);
        System.out.println(ans);
    }

    private static boolean isStrong(int n){
        int originalNumber = n;
        int temp = n;

        int sum = 0;

        while (temp > 0){
            int remainder = temp % 10;

            int factorial = fact(remainder);

            sum += factorial;

            temp /= 10;

        }

        return sum == originalNumber;

    }

    private static int fact(int n){
        int fact = 1;

        for (int i = 2; i <= n ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
