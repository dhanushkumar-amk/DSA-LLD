package DSA.LEARN.BINARY_SEARCH;

public class RowWithMaximumNumberOfOnes {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,0,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {0,1,1,1,1},
        };

        int ans = rowWithMax1s(matrix);
        System.out.println(ans);
    }

    public static int rowWithMax1s(int matrix[][]) {
        int maxCount = 0;
        int index = -1;

        for (int i = 0; i < matrix.length; i++) {

            int firstOneIndex = lowerBound(matrix[i], 1);

            if (firstOneIndex != matrix[i].length) {
                int countOnes = matrix[i].length - firstOneIndex;

                if (countOnes > maxCount) {
                    maxCount = countOnes;
                    index = i;
                }
            }
        }
        return index;
    }

    private static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;   // default if 1 not found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}