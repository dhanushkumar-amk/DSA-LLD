package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK_1;

public class CountOfOddAndEvenDigits {
    static void main(String[] args) {

        // testcase 1 : 2468137
        countOddEven(2468137);

        // testcase 2 : 98765411
        countOddEven(98765411);
    }

    public static void countOddEven(int n){
        int evenCount = 0;
        int oddCount = 0;

        while (n > 0){
            int remainder = n % 10;

            if (remainder % 2 == 0)
                evenCount++;
            else
                oddCount++;

            n /= 10;
        }

        System.out.println("OddCount : " + oddCount + " EvenCount : " + evenCount);
    }
}
