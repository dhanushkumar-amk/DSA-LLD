package COLLEGE_PLACEMENT.BASIC;

public class AdamNumber {

    public static void main(String[] args) {

        int n = 12;

        if (checkAdamOrNot(n))
            System.out.println("adam number");
        else
            System.out.println("not adam number");
    }

    public static boolean checkAdamOrNot(int n) {
//        example if n = 12
        // reverse orginal value 12 => 21
        int reverseOfN = reverse(n);

        // square of the orginal value 12 * 12 => 144
        int squareOfN = square(n);

        // Reverse the square of the orginal number 144 => 441
        int reverseOfSquareOfN = reverse(squareOfN);

        // Square the reversed number 21 * 21 => 441
        int squareOfReverse = square(reverseOfN);

        return reverseOfSquareOfN == squareOfReverse;
    }

    //square function
    public static int square(int n) {
        return n * n;
    }

    // revverse function
    public static int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        return reverse;
    }
}