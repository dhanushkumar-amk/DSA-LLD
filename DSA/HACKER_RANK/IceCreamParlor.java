package DSA.HACKER_RANK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IceCreamParlor {

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {

            int requiredNumber = m - arr.get(i);

            if (hashMap.containsKey(requiredNumber)) {

                ans.add(hashMap.get(requiredNumber) + 1);
                ans.add(i + 1);

                return ans;
            }

            hashMap.put(arr.get(i), i);
        }

        return ans;
    }
}