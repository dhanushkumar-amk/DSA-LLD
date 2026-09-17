package COLLEGE_PLACEMENT.STRING;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        countVowels(str);
    }

    private static void countVowels(String str){
        int vowel = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vowel++;
            else
                consonants++;
        }

        System.out.println("vowels count : " + vowel);
        System.out.println("consonants count : " + consonants);
    }
}
