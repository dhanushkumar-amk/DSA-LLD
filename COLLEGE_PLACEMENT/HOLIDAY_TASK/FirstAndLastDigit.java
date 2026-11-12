package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class FirstAndLastDigit {
    static void main(String[] args) {
        firstAndLasDigit(1024);
    }

    private static void firstAndLasDigit(int n){

        int temp = n;
        while (temp >= 10){
            temp = temp / 10;
        }

        System.out.println("First digit : " + temp);
        System.out.println("Last Digit " + n % 10);
    }
}
