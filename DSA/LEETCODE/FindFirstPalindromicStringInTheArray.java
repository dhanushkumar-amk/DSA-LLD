package DSA.LEETCODE;

public class FindFirstPalindromicStringInTheArray {
     public String firstPalindrome(String[] words) {
        StringBuilder ans = new StringBuilder();

         for (int i = 0; i < words.length; i++) {
             String currentString = words[i];
             if (isPalindrome(currentString)){
                 ans.append(currentString);
                 break;
             }
         }
         return ans.toString();
    }


    public boolean isPalindrome(String word){
         if (word.length() == 1)
             return true;


         int left = 0;
         int right = word.length() - 1;

         while (left < right){
                if (word.charAt(left) != word.charAt(right))
                   return false;
                left++;
                right--;
         }
         return true;
    }
}
