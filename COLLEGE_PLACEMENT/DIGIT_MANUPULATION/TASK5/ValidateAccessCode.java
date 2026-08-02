package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK5;

public class ValidateAccessCode {
    static void main(String[] args) throws Exception {
        System.out.println(isValid(125));
    }

    private static boolean isValid(int n) throws Exception {

        if (n < 10){
            throw new Exception("We need a atleast two digits");
        }

        int temp = n;

        int lastDigit = n % 10;

        while (temp > 10){
            temp /= 10;
        }

        int firstDigit = temp;

        return lastDigit % 2 == 1 && firstDigit % 2== 0;
    }
}
