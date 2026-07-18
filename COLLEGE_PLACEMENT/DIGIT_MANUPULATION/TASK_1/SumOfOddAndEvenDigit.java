package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK_1;

public class SumOfOddAndEvenDigit {
    public static void main(String[] args) {
        // testcase 1 : 246813
        oddAndEvenSum(246813);

        //testcase 2 : 987654
        oddAndEvenSum(987654);
    }


    public static void  oddAndEvenSum(int n){
        int evenSum = 0;
        int oddSum = 0;

         while (n > 0){
            int remainder = n % 10;

            if (remainder % 2 == 0)
                evenSum += remainder;
            else
               oddSum += remainder;

            n /= 10;
        }

        System.out.println("OddSum : " + oddSum + " EvenSum : " + evenSum);
    }
}