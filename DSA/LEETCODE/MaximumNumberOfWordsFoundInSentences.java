package DSA.LEETCODE;

public class MaximumNumberOfWordsFoundInSentences {
     public static int mostWordsFound(String[] sentences) {

      int maxCount = Integer.MIN_VALUE;

         for (int i = 0; i < sentences.length; i++) {

             String individualSentence = sentences[i];
             int wordCount = 0;

             for (int j = 0; j < individualSentence.length(); j++) {
                if (individualSentence.charAt(j) == ' ')
                    wordCount++;
                maxCount = Math.max(maxCount, wordCount);
             }
         }
         return maxCount;
    }
}
