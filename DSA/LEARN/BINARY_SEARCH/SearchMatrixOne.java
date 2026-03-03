package DSA.LEARN.BINARY_SEARCH;

public class SearchMatrixOne {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}
        };

        boolean ans = search2(matrix, 11);
        System.out.println(ans);

    }

    // brute force
    private static boolean search1(int[][] matrix, int target){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    // binary search
     private static boolean search2(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0;
        int high = m * n - 1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target)
                return true;

            else if (matrix[row][col] > target)
                high = mid - 1;
            else
                low= mid + 1;
        }
        return false;
     }

}
