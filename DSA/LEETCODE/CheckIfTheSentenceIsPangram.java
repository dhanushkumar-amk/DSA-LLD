package DSA.LEETCODE;

public class CheckIfTheSentenceIsPangram {
    static void main(String[] args) {

    }


    public static boolean checkIfPangram(String sentence) {

        if (sentence.length() < 26)
            return false;

        int[] frequency = new int[26];

        for(char character : sentence.toCharArray())
            frequency[character - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (frequency[i] == 0)
                return false;
        }
        return true;
    }
}
