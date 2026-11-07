package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class SmallestDigit {
    static void main(String[] args) {
        smallestDigit(34567);
    }

    private static void smallestDigit(int n){
        int min = Integer.MAX_VALUE;

        while (n != 0){
            int remainder = n % 10;
            min = Math.min(min, remainder);
            n /= 10;
        }
        System.out.println(min);
    }
}
