package DSA.LEARN.ARRAY;

import java.util.Arrays;

public class SortAnArrayOf0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,2,0,0,0,1,1,2,2};
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // brute force
    private static void sort1(int[] arr){
        Arrays.sort(arr);
    }

    // optimal approach => Dutch National Flag Algorithm
    private static void sort2(int[] arr){
       int low = 0;
       int mid = 0;
       int high = arr.length - 1;

      while (mid <= high){
          if (arr[mid] == 0){
              swap(arr, low, mid);
              mid++;
              low++;
          }else if (arr[mid] == 1)
              mid++;
          else{
              swap(arr, high, mid);
              high--;
          }
      }
    }


    private static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
