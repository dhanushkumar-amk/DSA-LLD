package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK3;

public class HarshadNumber {
    static void main(String[] args) {
        boolean ans = isHarshad(18);
        System.out.println(ans);
    }

    public static boolean isHarshad(int n){

        int temp = n;
        int sum = 0;

        while (temp > 0){
            int remainder = temp % 10;
            sum += remainder;
            temp /= 10;
        }

        return n % sum == 0;
    }
}
