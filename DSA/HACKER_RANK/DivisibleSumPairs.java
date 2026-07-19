package DSA.HACKER_RANK;

import java.util.List;

public class DivisibleSumPairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
              int sum =  ar.get(i)  + ar.get(j);
              if (sum % k == 0)
                  count++;
            }
        }
        return count;
    }

}
