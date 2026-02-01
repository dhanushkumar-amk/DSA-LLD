package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-5,-6,7};
        int[] ans = reArrange1(arr);
        System.out.println(Arrays.toString(ans));
    }

    // optimal code
    private static int[] reArrange1(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0){
                ans[negativeIndex] = arr[i];
                negativeIndex += 2;
            }else {
                ans[positiveIndex] = arr[i];
                positiveIndex += 2;
            }
        }
        return ans;
    }
}
