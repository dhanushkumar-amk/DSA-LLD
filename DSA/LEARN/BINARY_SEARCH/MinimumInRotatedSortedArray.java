package DSA.LEARN.BINARY_SEARCH;

import java.util.Arrays;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int ans = minimum2(arr);
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
        int low = 0;
        int high = arr.length;
        int ans = Integer.MAX_VALUE;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }


}
