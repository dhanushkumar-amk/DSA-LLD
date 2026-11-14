package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class DigitialRoot {
    static void main(String[] args) {
        isDigital(9875);
    }
    private static void isDigital(int n){
        while (n > 9){
            int sum = 0;
            int ld = n % 10;
            sum += ld;
            n /= 10;
            n += sum;
        }

        System.out.println(n);
    }
}
