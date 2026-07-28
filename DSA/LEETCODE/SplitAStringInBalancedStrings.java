package DSA.LEETCODE;

public class SplitAStringInBalancedStrings {


   public int balancedStringSplit(String s) {
        int RCount = 0;
        int LCount = 0;

        int ans = 0;

       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == 'R')
               RCount++;
           else
               LCount++;

           if (RCount == LCount){
               ans++;

               RCount = 0;
               LCount = 0;
           }
       }
       return ans;
    }

}
