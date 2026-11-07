package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class LargestDigit {
    static void main(String[] args) {
        largestDigit(235978);
    }


    private static void largestDigit(int n){
        int max = Integer.MIN_VALUE;

        while (n != 0){
            int remainder = n % 10;
            max = Math.max(max, remainder);
            n /= 10;
        }
        System.out.println(max);
    }
}
