package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

public class PrimesBetweenTwoNumbers {

    public static void main(String[] args) {
        printPrimes(11, 50);
    }


    private static boolean isPrime(int n) {

        // base case
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;


        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    private static void printPrimes(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {

            boolean primeNumber = isPrime(i);

            if (primeNumber) {
                System.out.println(i);
            }

        }
    }
}
