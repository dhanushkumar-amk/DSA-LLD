package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class StrongNumber {
    static void main(String[] args) {
        System.out.println(isStrongNumber(146));
    }

    private static boolean isStrongNumber(int n){
        int temp = n;
        int sum  = 0;

        while (temp != 0){
            int ld = temp % 10;
            sum += factorial(ld);
            temp /= 10;
        }

        if (sum == n)
            return true;
        else
            return false;
    }

    private static int factorial(int value){
        int fact = 1;
        for (int i = 2; i <= value ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
