package DSA.LEARN.RECURSION;

public class SkipCharacter {
    public static void main(String[] args) {
        System.out.println(  skip2( "aaaabbbabababa"));
    }

    // approach 1 pass two arguments
    private static  void skip1(String processed, String unProcessed){

        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char firstCharacter = unProcessed.charAt(0);

        // skip the character
        if (firstCharacter == 'a'){
            skip1(processed, unProcessed.substring(1));
        }else{
            skip1(processed + firstCharacter, unProcessed.substring(1));
        }
    }


    // return a string and pass one arguments
     private static String skip2(String string){

        if (string.isEmpty()){
            return " ";
        }

        char firstCharacter = string.charAt(0);

        // skip the character
        if (firstCharacter == 'a'){
            return skip2(string.substring(1));
        }else{
           return firstCharacter + skip2( string.substring(1));
        }
    }

}
