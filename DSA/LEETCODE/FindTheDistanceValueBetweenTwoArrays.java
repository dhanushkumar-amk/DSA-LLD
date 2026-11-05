package DSA.LEETCODE;

public class FindTheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
       int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr2.length; j++) {
                int current = Math.abs(arr1[i] - arr2[j]);
                if (current <= d)
                    flag = false;
            }
            if (flag)
                count++;
        }
        return count;
    }
}
