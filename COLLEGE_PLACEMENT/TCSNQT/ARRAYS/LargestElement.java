package COLLEGE_PLACEMENT.TCSNQT.ARRAYS;

public class LargestElement {
      static void main(String[] args) {
        int[] arr = {1,-6,3,0,4,7};
        System.out.println(largest(arr));
    }


    private static int largest(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
