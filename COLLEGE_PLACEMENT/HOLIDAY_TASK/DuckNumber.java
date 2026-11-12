package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class DuckNumber {
    static void main(String[] args) {
        isDuckNumber(0124);
    }

    private  static void isDuckNumber(int n){
        boolean isDuck = false;

        while (n >= 10){
            int remainder = n % 10;
            if (remainder == 0)
                isDuck = true;

            n = n /10;
        }

        if (isDuck)
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}
