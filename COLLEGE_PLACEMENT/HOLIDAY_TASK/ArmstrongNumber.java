package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class ArmstrongNumber {
    static void main(String[] args) {
        System.out.println(isArmstrong(163));
    }

    private static boolean isArmstrong(int n){
        int temp  = n;
        int sum = 0;
        while (temp != 0){
            int remainder = temp % 10;
            sum += remainder * remainder * remainder;
            temp /= 10;
        }
        if (sum == n)
            return true;
        else
            return false;
    }
}
