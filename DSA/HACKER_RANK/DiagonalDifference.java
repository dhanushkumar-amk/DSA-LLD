package DSA.HACKER_RANK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int leftSum = 0;
        int rightSum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            leftSum += arr.get(i).get(i);

            // Secondary diagonal
            rightSum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(leftSum - rightSum);
    }

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(1, 2, 3));
        arr.add(Arrays.asList(4, 5, 6));
        arr.add(Arrays.asList(9, 8, 9));

        System.out.println(diagonalDifference(arr));
    }
}