package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {4,6,3,12,55,76,2,8,43};

        brute(arr);
        int ansBrute = arr[arr.length - 1];
        System.out.println(ansBrute);

        int ans = largest(arr);
        System.out.println(ans);
    }

    // brute force
    private static void brute(int[] arr){
        Arrays.sort(arr);
    }

    // optimal
    private static int largest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

}
