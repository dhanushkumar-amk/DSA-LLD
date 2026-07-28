package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK3;

public class SmallestAndLargest {
    static void main(String[] args) {
       int n = 232346714;

        System.out.println(smallest(n));
        System.out.println(largest(n));
    }


    private static int smallest(int n){
        int smallest = Integer.MAX_VALUE;

        while (n > 0){
            int remainder = n % 10;

            smallest = Math.min(smallest, remainder);

            n /= 10;
        }
        return smallest;
    }


    private static int largest(int n){
         int largest = Integer.MIN_VALUE;

        while (n > 0){
            int remainder = n % 10;

            largest = Math.max(largest, remainder);

            n /= 10;
        }
        return largest;
    }


}
