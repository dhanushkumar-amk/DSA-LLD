package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class CountOccurance {
    static void main(String[] args) {
        count(1233232, 2);
    }

    private static void count(int n, int digit){
        int count = 0;

       while (n != 0){
           int ld = n % 10;
           if (ld == digit)
               count++;
           n /= 10;
       }
        System.out.println(count);
    }
}
