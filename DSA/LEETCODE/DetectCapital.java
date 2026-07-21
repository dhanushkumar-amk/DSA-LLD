package DSA.LEETCODE;

public class DetectCapital {
     public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;

          for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                uppercaseCount++;
        }

           if (uppercaseCount == word.length())
                return true;

            if (uppercaseCount == 0)
                return true;

            if (uppercaseCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
                return true;

            return false;
    }
}
