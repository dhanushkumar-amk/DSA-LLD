package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK_1;

public class FirstAndLastDigit {
    static void main(String[] args) {
        // testcase 1 : 58392
        firstAndLastDigit(5839);

        // testcase 2 : 4071
        firstAndLastDigit(4071);
    }


    public static void  firstAndLastDigit(int n){

        int lastDigit = n % 10;
        int firstDigit = n % 10;

        while (n > 0){
            int remainder = n % 10;
            firstDigit = remainder;
            n /= 10;
        }

        System.out.println("FirstDigit " + firstDigit);
        System.out.println("LastDigit " + lastDigit);

    }
}
