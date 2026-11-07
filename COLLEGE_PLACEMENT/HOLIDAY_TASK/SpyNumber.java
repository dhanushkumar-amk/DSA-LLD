package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class SpyNumber {
    static void main(String[] args) {
        System.out.println(isSpy(123));
    }

    private static boolean isSpy(int n){
        int temp = n;

        int sum = 0;
        int product = 1;

        while (temp != 0){
            int remainder = temp % 10;
            sum += remainder;
            product *= remainder;
            temp /= 10;
        }
        return sum == product;
    }
}
