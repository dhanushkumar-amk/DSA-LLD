package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int ans = minimum1(arr);
        System.out.println(ans);

        //using  streams
       int minimum =  Arrays.stream(arr).min().getAsInt();
        System.out.println(minimum);
    }

    // bruteForce
    private static int minimum1(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            min = Math.min(min, i);
        }
        return min;
    }

    private static int minimum2(int[] arr){


        return -1;
    }


}
