package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class ReverseANumber {
    static void main(String[] args) {
        reverse(1234);
    }


    private static void reverse(int n){
        int sum = 0;
        while(n != 0){
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n /= 10;
        }

        System.out.println(sum);
    }
}
