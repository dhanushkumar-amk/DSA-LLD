package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class NeonNumber {
    static void main(String[] args) {
        System.out.println(isNeon(10));
    }

    private static boolean isNeon(int n){
        int square = n * n;

        int sum = 0;
        while (square != 0){
            int ld = square % 10;
            sum += ld;
            square /= 10;
        }

        if (n == sum)
            return true;
        else
            return false;
    }
}
