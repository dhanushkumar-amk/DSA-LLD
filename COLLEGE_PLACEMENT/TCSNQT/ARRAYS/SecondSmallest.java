package COLLEGE_PLACEMENT.TCSNQT.ARRAYS;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1,-2};

        System.out.println(secondSmallest(arr));
    }

    private static int secondSmallest(int[] arr){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if (arr[i] < second && arr[i] > first)
                second = arr[i];
        }
        return second;
    }
}