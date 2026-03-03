package DSA.PRATICE.GFG;

import java.util.Arrays;

public class CountOddAndEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = countOddEven(arr);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] countOddEven(int[] arr) {
        int oddCount = 0;
        int eventCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                eventCount++;
            else
                oddCount++;
        }
        return new int[]{oddCount, eventCount};
    }
}
