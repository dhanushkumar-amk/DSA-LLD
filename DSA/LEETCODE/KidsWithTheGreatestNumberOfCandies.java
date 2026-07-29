package DSA.LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {


     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int maxValue = Arrays.stream(candies).max().getAsInt();

         for (int i = 0; i < candies.length; i++) {
             int finalCandy = candies[i] + extraCandies;

             if (finalCandy >= maxValue){
                 ans.add(i, true);
             }
             else{
                 ans.add(i, false);
             }
         }
        return ans;
    }

}
