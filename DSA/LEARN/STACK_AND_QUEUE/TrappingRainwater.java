package DSA.LEARN.STACK_AND_QUEUE;

public class TrappingRainwater {

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};

        int result = trap(height);
        System.out.println("Total Water Trapped: " + result);
    }

    public static int trap(int[] arr) {
        int n = arr.length;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]);
        }

        suffixMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], arr[i]);
        }

        int totalWater = 0;

        for (int i = 0; i < n; i++) {
            int water = Math.min(prefixMax[i], suffixMax[i]) - arr[i];
            totalWater += water;
        }

        return totalWater;
    }
}