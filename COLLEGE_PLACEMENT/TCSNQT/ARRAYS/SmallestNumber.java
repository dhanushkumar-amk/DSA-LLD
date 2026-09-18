package COLLEGE_PLACEMENT.TCSNQT.ARRAYS;

public class SmallestNumber {
    static void main(String[] args) {
        int[] arr = {1,-6,3,0,4,7};
        System.out.println(smallest(arr));
    }


    private static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
