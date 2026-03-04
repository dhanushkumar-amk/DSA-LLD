package DSA.PRATICE.CODING_NINJA;

public class HighestOccuringCharacter {
    public static void main(String[] args) {
        String s = "abcdeapapqarr";
        char ans = highestOccuringChar(s);
        System.out.println(ans);
    }

    public static char highestOccuringChar(String str) {

        int[] frequency = new int[26];

        for (char c : str.toCharArray()) {
            frequency[c - 'a']++;
        }

        int maxCount = 0;
        char element = 'a';

        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                element = (char) ('a' + i);
            }
        }

        return element;
    }


    // optimal
       public static char highestOccuringChar2(String str) {

        int[] freq = new int[26];
        int maxCount = 0;
        char result = 'a';

        for (char c : str.toCharArray()) {

            int index = c - 'a';
            freq[index]++;

            if (freq[index] > maxCount) {
                maxCount = freq[index];
                result = c;
            }
        }

        return result;
    }
}