package DSA.LEARN.ARRAY;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1, -2, 1 , 5, -3};
        System.out.println(maximumSum3(arr));
    }

    // bruteforce
    private static int maximumSum1(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // better solution
    private static int maximumSum2(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    // optimal solution => Kadane's algorithm
    private static int maximumSum3(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }
            if (max < 0) {
                max = 0;
            }
        return max;
    }
}
