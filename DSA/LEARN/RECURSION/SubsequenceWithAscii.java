package DSA.LEARN.RECURSION;

public class SubsequenceWithAscii {
    public static void main(String[] args) {
        String str = "abc";
        ascii(" ", str);
    }


    private static void ascii(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.print(processed + " ");
            return;
        }

        char firstCharacter = unProcessed.charAt(0);

        // picked
            ascii(firstCharacter + processed, unProcessed.substring(1));
        // unpicked
            ascii(processed, unProcessed.substring(1));
        // ascii
        ascii((firstCharacter + 0) + processed, unProcessed.substring(1));
    }
}
