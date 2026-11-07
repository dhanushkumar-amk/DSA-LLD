package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class NumberIsPalindrome {
    static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    private static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;

        while (temp != 0){
            int remainder = temp % 10;
            sum = sum * 10 + remainder;
            temp /= 10;
        }
        return  sum == n;
    }
}
