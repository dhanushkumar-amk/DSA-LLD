package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class CountEvenAndOddDigit {
    static void main(String[] args) {
        countDigit(123456);
    }

    private static void countDigit(int n){
        int evenCount = 0;
        int oddCount = 0;

        while (n != 0){
            int remainder = n % 10;

            if (remainder % 2 == 0)
                evenCount++;
            else
                oddCount++;

            n /= 10;
        }

        System.out.println("odd count : " + oddCount);
        System.out.println("even count : " + evenCount);
    }
}
