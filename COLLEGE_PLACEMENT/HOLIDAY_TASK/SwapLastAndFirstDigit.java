package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class SwapLastAndFirstDigit {
     public static int swapDigits(int num) {
        int last = num % 10;

        int divisor = 1;
        while (num / divisor >= 10) {
            divisor *= 10;
        }

        int first = num / divisor;
        int middle = (num % divisor) / 10;

        return last * divisor + middle * 10 + first;
    }

    public static void main(String[] args) {
        int num = 12345;

        int result = swapDigits(num);

        System.out.println(result);
    }
}
