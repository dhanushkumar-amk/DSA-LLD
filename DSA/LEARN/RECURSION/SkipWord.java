package DSA.LEARN.RECURSION;

public class SkipWord {
    public static void main(String[] args) {

    }

    private static String skipWord(String str, String word){
        if (str.isEmpty()){
            return " ";
        }

        if (str.startsWith(word))
         return  skipWord(str.substring(word.length()), word);
        else
            return str.charAt(0) + skipWord(str.substring(1), word);
    }
}
