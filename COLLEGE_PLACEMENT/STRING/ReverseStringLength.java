package COLLEGE_PLACEMENT.STRING;

public class ReverseStringLength {
    static void main(String[] args) {
        String str = "good morning dhanush";

        System.out.println(reverse(str));
    }

    private static String reverse(String input){


        String[] words = input.split(" ");

         StringBuilder allChars = new StringBuilder();

         for(String word : words)
             allChars.append(word);

            allChars.reverse();

         StringBuilder ans = new StringBuilder();

         int index= 0;

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            int currentWordLength = currentWord.length();

            String substring = allChars.substring(index, index + currentWordLength);
            index = index + currentWordLength;

            ans.append(substring);

            if (i != words.length - 1)
                ans.append(" ");
        }
        return ans.toString();

    }
}
