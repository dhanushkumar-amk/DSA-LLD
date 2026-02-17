package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class RepeatingAndMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,1,1};
        int[] ans = missingNumberAndRepeatingNumber1(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] missingNumberAndRepeatingNumber1(int[] arr){
        int n = arr.length;

        int[] hashArray = new int[n + 1];

        for (int j : arr)
            hashArray[j]++;

        int repeatingElement = -1;
        int missingElement = -1;

        for (int i = 1; i < n; i++) {
            if (hashArray[i] == 2)
                repeatingElement = i;
            else if(hashArray[i] == 0)
                missingElement = i;

            if (repeatingElement != -1 && missingElement != -1)
                break;
        }
        return new int[]{repeatingElement, missingElement};
    }
}
