package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class RemoveLastDigit {
    static void main(String[] args) {
        removeLastDigit(12345);
    }

    private static void removeLastDigit(int n){
        int lastDigit = n / 10;
        System.out.println(lastDigit);

    }
}
