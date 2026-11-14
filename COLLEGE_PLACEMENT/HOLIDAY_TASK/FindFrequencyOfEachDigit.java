package COLLEGE_PLACEMENT.HOLIDAY_TASK;

public class FindFrequencyOfEachDigit {
    static void main(String[] args) {
        freq(1223452);
    }

    private static void freq(int n){
        int[] arr = new int[10];

       while(n != 0){
           int ld = n % 10;
           arr[ld]++;
           n /= 10;
       }

        for (int i = 1; i < arr.length ; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }
}
