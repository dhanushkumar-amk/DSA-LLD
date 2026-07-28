package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

import java.util.Arrays;

public class ConcatenationOfArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }


     public static int[] getConcatenation(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n * 2];

         for (int i = 0; i < n; i++) {
             ans[i] = arr[i];
             ans[i + n] = arr[i];
         }
        return ans;
    }
}
