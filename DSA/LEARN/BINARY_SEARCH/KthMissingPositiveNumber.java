package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,11};
        int k = 5;

        int ans = missingNumber1(arr, k);
        System.out.println(ans);

    }

    // bruteForce
    private static int missingNumber1(int[] arr, int k){
        int count = 0;
        int ans = 0;

        int max = Arrays.stream(arr).max().getAsInt();
        int currentElement = 0;

        for (int i = 1; i <= max + k; i++) {

            if (currentElement < arr.length && arr[currentElement] == i) {
                currentElement++;
            }
            else {
                count++;
                ans = i;

                if (count == k)
                    break;
            }
        }
        return ans;
    }
}
