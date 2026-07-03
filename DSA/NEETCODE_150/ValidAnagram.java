package DSA.NEETCODE_150;

public class ValidAnagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        int[] frequency = new int[26];

        for(char character : s.toCharArray()){
            frequency[character - 'a']++;
        }

        for(char character : t.toCharArray()){
            frequency[character - 'a']--;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0)
                return false;
        }
        return  true;
    }
}
