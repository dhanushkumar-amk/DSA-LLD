package DSA.LEARN.RECURSION;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        int[] ans = mergeSort1(arr);
        System.out.println(Arrays.toString(ans));

        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // with extra array
    private static int[] mergeSort1(int[] arr){
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = mergeSort1(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort1(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left, right);
    }

    private static int[] mergeArray(int[] left, int[] right) {
        int length = left.length + right.length;
        int[] ans = new int[length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                ans[k] = left[i];
                i++;
            }else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length){
            ans[k] = left[i];
            i++;
            k++;
        }

         while (j < right.length){
            ans[k] = right[i];
            j++;
            k++;
        }
         return ans;
    }


    // inplace merge sort
        private static void mergeSortInPlace(int[] arr, int start, int end){
         if (end - start == 1)
            return;

        int mid = start + (end - start) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

       merge(arr, start, mid, end);
        }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] ans = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end){
              if (arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

         while (i < mid){
            ans[k] = arr[i];
            i++;
            k++;
        }

         while (j < end){
            ans[k] = arr[i];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[start + l] = ans[l];
        }

        // System.arraycopy(ans, 0, arr, start + 0, ans.length);

    }
}
