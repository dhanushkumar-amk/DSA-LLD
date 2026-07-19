package DSA.HACKER_RANK;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

     public static List<Integer> breakingRecords(List<Integer> scores) {

        List<Integer> ans = new ArrayList<>();

        int minScore = scores.get(0);
        int maxScore = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

         for (int i = 0; i < scores.size(); i++) {
             if (scores.get(i) < minScore){
                 minCount++;
                 minScore = scores.get(i);
             }

             if (scores.get(i) > maxScore){
                 maxCount++;
                 maxScore = scores.get(i);
             }
         }
         ans.add(maxCount);
         ans.add(minCount);
         return ans;
    }
}
