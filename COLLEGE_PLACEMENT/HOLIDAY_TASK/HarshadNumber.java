package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class HarshadNumber {
    static void main(String[] args) {
        System.out.println(isHarshadNumber(18));
    }

    private static boolean isHarshadNumber(int n){
        int sum = 0;
        int temp = n;
        while (temp != 0){
            int remainder = temp % 10;
            sum += remainder;
            temp /= 10;
        }
        return n % sum == 0;
    }
}
