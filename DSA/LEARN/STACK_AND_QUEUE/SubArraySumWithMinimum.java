package DSA.LEARN.STACK_AND_QUEUE;

import java.util.Stack;

public class SubArraySumWithMinimum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};

        int brute = subarray(arr);
        int optimal = sumSubarrayMins(arr);

        System.out.println("Brute: " + brute);
        System.out.println("Optimal: " + optimal);
    }

    static final int mod = 1000000007;

    // Brute Force
    private static int subarray(int[] arr) {
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = i; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                totalSum += min;
            }
        }

        return totalSum % mod;
    }

    // Optimal
    private static int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] left = previousSmaller(arr);
        int[] right = nextSmaller(arr);

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long leftCount = i - left[i];
            long rightCount = right[i] - i;

            sum = (sum + (arr[i] * leftCount * rightCount) % mod) % mod;
        }

        return (int) sum;
    }

    // Previous Smaller Index
    private static int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return left;
    }

    // Next Smaller Index
    private static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        return right;
    }
}