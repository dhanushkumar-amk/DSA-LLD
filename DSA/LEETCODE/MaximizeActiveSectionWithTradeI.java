package DSA.LEETCODE;

import java.util.ArrayList;

public class MaximizeActiveSectionWithTradeI {

     public int maxActiveSectionsAfterTrade(String s) {
        int onesCount = 0;

        for(char ch : s.toCharArray()){
            if (ch == '1')
                onesCount++;
        }

        String augmented = "1" + s + "1";
        ArrayList<Character> characters = new ArrayList<>();
         ArrayList<Integer> characterLength = new ArrayList<>();

         int i = 0;
         while (i < augmented.length()){
             char character = augmented.charAt(i);
             int j = i;
             while (j < augmented.length() && augmented.charAt(j) == character)
                 j++;

             characters.add(character);
             characterLength.add(j - i);
             i = j;
         }
        int maxGain = 0;
        for (int j = 1; j < characters.size() - 1; j++) {
            if (characters.get(j) == '1' && characters.get(j - 1) == '0' && characters.get(j + 1) == '0'){
                int gain = characterLength.get(j - 1) + characters.get(j + 1);
                maxGain = Math.max(maxGain, gain);
            }
        }
        return onesCount + maxGain;
    }

}
