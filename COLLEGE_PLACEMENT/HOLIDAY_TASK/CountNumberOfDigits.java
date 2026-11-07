package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class CountNumberOfDigits {
    static void main(String[] args) {
        count(12345);
    }

    private static void count(int n){
        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }
            System.out.println(count);
    }
}
