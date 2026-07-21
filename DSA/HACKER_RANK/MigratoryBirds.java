package DSA.HACKER_RANK;

import java.util.List;

public class MigratoryBirds {


      public static int migratoryBirds(List<Integer> arr) {

          int[] frequency = new int[arr.size() + 1];

          for (int i = 0; i < arr.size(); i++) {
              frequency[arr.get(i)]++;
          }

          int max = Integer.MIN_VALUE;
          int ans  = -1;
          for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max){
                max = frequency[i];
                ans = i;
            }

          }
        return ans;
    }
}
