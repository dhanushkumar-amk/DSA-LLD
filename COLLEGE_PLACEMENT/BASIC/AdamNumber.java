package COLLEGE_PLACEMENT.BASIC;

// https://www.geeksforgeeks.org/problems/adam-number2650/1

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
        int reverseOfN = reverseOfANumber(n);

        // square of the orginal value 12 * 12 => 144
        int squareOfN = squareOfANumber(n);
        // Reverse the square of the orginal number 144 => 441
        int reverseOfSquareOfN = reverseOfANumber(squareOfN);

        // Square the reversed number 21 * 21 => 441
        int squareOfReverse = squareOfANumber(reverseOfN);

        return reverseOfSquareOfN == squareOfReverse; // 441 == 441 true
    }

    //square function
    public static int squareOfANumber(int n) {
        return n * n;
    }

    // revverse function
    public static int reverseOfANumber(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum * 10 + remainder;
            n = n / 10;
        }
        return sum;
    }
}