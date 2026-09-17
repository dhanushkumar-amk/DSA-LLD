package COLLEGE_PLACEMENT.STRING;

public class NextLetterLogic {

    public static void main(String[] args) {
        System.out.println(process("java1234"));//javb1234
        System.out.println(process("python1223"));//python1234
    }

    public static String process(String str) {

//        char[] ans = new char[];
        StringBuilder ans = new StringBuilder();

        // to track the use of the letter
        boolean[] isLetterUsed = new boolean[26];
        boolean[] isNumberUsed = new boolean[10];

        for (int i = 0; i < str.length(); i++) {

            // paticular element on a string
            char element = str.charAt(i);

            // check given character is letter or number
            if (Character.isLetter(element)) {

                // convert the letter into ascii value
                int asciValue = element - 'a';

                // already used or not (it stores true or false)
                if (isLetterUsed[asciValue] ) {

                    // find the next letter and check if it is already used, convert into ascii
                    // // we store on array of 26 but ascii value of letter are  next value must be wrap
                    // example z = 25 on our array and next element is a => 26 (index out of bounds) so mod with 26 26 % 26 == 0
                    // so we store next as a

                    int nextLetterAsciiValue = (asciValue + 1) % 26;

                    while (isLetterUsed[nextLetterAsciiValue]) {
                        nextLetterAsciiValue = (nextLetterAsciiValue + 1) % 26;
                    }

                    // convert nextLetterAsciiValue into that particular character
                    char nextCharacter = (char) ('a' + nextLetterAsciiValue);


                    // add to the answer
                    ans.append(nextCharacter);

                    // make it true as used
                    isLetterUsed[nextLetterAsciiValue] = true;

                } else {

                    // if not used means simpley append to the answer and make true as used
                    isLetterUsed[asciValue] = true;
                    ans.append(element);
                }


                // if the element is number
            } else if (Character.isDigit(element)) {

                int asciValue = element - '0'; // for number

                if (isNumberUsed[asciValue]) {

                    int nextDigitAsciiValue = (asciValue + 1) % 10; // here array size of 10, so we mod with 10

                    while (isNumberUsed[nextDigitAsciiValue]) {
                        nextDigitAsciiValue = (nextDigitAsciiValue + 1) % 10;
                    }

                    char nextCharacter = (char) ('0' + nextDigitAsciiValue);

                    ans.append(nextCharacter);

                    isNumberUsed[nextDigitAsciiValue] = true;

                } else {
                    isNumberUsed[asciValue] = true;
                    ans.append(element);
                }
            }

            // final case for special characters
            else
                ans.append(element);
        }

        return ans.toString();
    }

}