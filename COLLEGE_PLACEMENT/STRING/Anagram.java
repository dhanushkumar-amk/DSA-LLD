package COLLEGE_PLACEMENT.STRING;

public class Anagram {
    static void main(String[] args) {
        String s1 = "tea";
        String s2 = "eat";

        System.out.println(isValid(s1, s2));
    }


    private static boolean isValid(String s1, String s2){

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length())
            return false;


        int[] frequencyArray = new int[26];

        for(char element : s1.toCharArray())
            frequencyArray[element - 'a']++;

        for (char element : s2.toCharArray())
            frequencyArray[element - 'a']--;

        for(int element : frequencyArray)
            if (element != 0)
                return false;

        return true;
    }
}
