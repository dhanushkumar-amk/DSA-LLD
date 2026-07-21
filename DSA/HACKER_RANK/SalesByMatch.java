package DSA.HACKER_RANK;

import java.util.List;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {

            int pairCount = 0;

        int[] frequency = new int[101];

        for (int i = 0; i < ar.size(); i++) {
            frequency[ar.get(i)]++;
        }


        for (int i = 0; i < frequency.length; i++) {
            int countOfSocks = frequency[i];
            pairCount = pairCount + countOfSocks / 2;
        }

        return pairCount;
    }
}
