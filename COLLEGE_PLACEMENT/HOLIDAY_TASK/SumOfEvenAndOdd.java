package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class SumOfEvenAndOdd {
    static void main() {
        sum(123456);
    }

    private static void sum(int n){
        int oddSum = 0;
        int evenSum = 0;

         while (n != 0){
            int remainder = n % 10;

            if (remainder % 2 == 0)
                evenSum += remainder;
            else
                oddSum += remainder;

            n /= 10;
        }

        System.out.println("odd count : " + oddSum);
        System.out.println("even sum : " + evenSum);
    }
}
