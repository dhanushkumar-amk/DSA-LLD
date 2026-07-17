package DSA.HACKER_RANK;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoint = 0;
        int bobPoint = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b.get(i))
                continue;

            if (a.get(i) > b.get(i))
                alicePoint++;
            else
                bobPoint++;
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(0, alicePoint);
        ans.add(1, bobPoint);
        return ans;
    }
}
