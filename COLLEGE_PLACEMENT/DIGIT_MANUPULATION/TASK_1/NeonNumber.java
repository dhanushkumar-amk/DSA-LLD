package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK_1;

public class NeonNumber {
    static void main(String[] args) {
        // testcase 1 : 9
        neonNumber(9);

        // testcase 2 : 10
        neonNumber(10);
    }


    public static void neonNumber(int n){
        int temp = n;
        int sum = 0;
        int squareValue = n * n;

        while (squareValue > 0){
            int remainder = squareValue % 10;
            sum += remainder;
            squareValue /= 10;
        }

        if (sum == temp)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");

    }
}
