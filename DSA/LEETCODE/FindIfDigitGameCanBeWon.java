package DSA.LEETCODE;

public class FindIfDigitGameCanBeWon {
     public boolean canAliceWin(int[] nums) {
       int singleSum = 0;
        int doubleSum = 0;

        for (int num : nums) {
            if (num <= 9)
                singleSum += num;
            else
                doubleSum += num;
        }

        return singleSum != doubleSum;
    }
}
