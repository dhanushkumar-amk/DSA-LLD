package COLLEGE_PLACEMENT.STRING;

public class LengthOfTheLastWord {
    static void main(String[] args) {

    }

    public static int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        return stringArray[stringArray.length - 1].length();
    }
}
