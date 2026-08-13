package COLLEGE_PLACEMENT.ARRAYS.TWO_POINTERS;

public class Sort0s1s2s {
    static void main(String[] args) {

    }

 private static void sort2(int[] arr) {
     int low = 0;
     int mid = 0;
     int high = arr.length - 1;

     while (mid <= high) {
         if (arr[mid] == 0) {
             swap(arr, low, mid);
             mid++;
             low++;
         } else if (arr[mid] == 1)
             mid++;
         else {
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
