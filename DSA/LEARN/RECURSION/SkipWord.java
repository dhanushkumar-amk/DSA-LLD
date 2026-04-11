package DSA.LEARN.RECURSION;

public class SkipWord {
    public static void main(String[] args) {
        String str = "abbappleabbike";
        System.out.println(skipWord(str, "bike"));
    }

    private static String skipWord(String str, String word){
        if (str.isEmpty()){
            return " ";
        }

        int wordLength = word.length();

        if (str.startsWith(word))
         return  skipWord(str.substring(wordLength), word);
        else
            return str.charAt(0) + skipWord(str.substring(1), word);
    }
}
