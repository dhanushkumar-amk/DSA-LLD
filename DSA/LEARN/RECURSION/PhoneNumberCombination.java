package DSA.LEARN.RECURSION;

public class PhoneNumberCombination {
    public static void main(String[] args) {
        printPhoneCombination("", "12");
    }


    static void printPhoneCombination(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        // get the first character and convert into integer
        char firstCharacter = unprocessed.charAt(0);
        int digit = firstCharacter - '0';

        for (int i = (digit - 1) * 3; i < digit * 3 ; i++) {
            char characterToAdd  = (char) ('a' + i);
            printPhoneCombination(processed + characterToAdd, unprocessed.substring(1));
        }
    }
}
