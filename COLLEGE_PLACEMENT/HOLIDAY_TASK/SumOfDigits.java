package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class SumOfDigits {
    static void main(String[] args) {
        sum(1234);
    }

    private static void sum(int n){
        int sum = 0;

        while (n != 0) {
            int remainder = n % 10;
            sum += remainder;
            n /= 10;
        }
            System.out.println(sum);
    }
}
