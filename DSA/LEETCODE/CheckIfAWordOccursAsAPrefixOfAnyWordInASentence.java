package DSA.LEETCODE;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    static void main(String[] args) {

        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence obj =
                new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();

        String sentence = "i love eating burger";
        String searchWord = "eat";

        int result = obj.isPrefixOfWord(sentence, searchWord);

        System.out.println(result);
    }

    public int isPrefixOfWord(String sentence, String searchWord) {

        // Convert sentence into individual words
        String[] words = sentence.split(" ");

        // Check every word
        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            // If current word is smaller than searchWord,
            // it cannot contain searchWord as prefix
            if (currentWord.length() < searchWord.length()) {
                continue;
            }

            char[] charArray = currentWord.toCharArray();
            char[] searchArray = searchWord.toCharArray();

            boolean flag = true;

            int left = 0;
            int right = 0;

            // Compare characters
            while (right < searchArray.length) {

                if (charArray[left] != searchArray[right]) {
                    flag = false;
                    break;
                }

                left++;
                right++;
            }

            // Prefix found
            if (flag) {
                return i + 1;
            }
        }

        return -1;
    }
}