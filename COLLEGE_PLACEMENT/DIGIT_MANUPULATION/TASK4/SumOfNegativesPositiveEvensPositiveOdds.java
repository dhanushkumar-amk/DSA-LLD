package COLLEGE_PLACEMENT.DIGIT_MANUPULATION.TASK4;

import java.util.Arrays;

public class SumOfNegativesPositiveEvensPositiveOdds {
    static void main(String[] args) {
        int[] arr = {-1,4,6,3,2,6, -4,-7, -8,32,8,43,2,9};

        int[] ans = sum(arr);

        System.out.println(Arrays.toString(ans));
    }

    private static int[] sum(int[] arr){
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                negativeSum++;
            else if(arr[i] % 2 == 0)
                positiveEvenSum++;
            else
                positiveOddSum++;
        }
        return new int[]{negativeSum, positiveEvenSum, positiveOddSum};
    }
}
