package DSA.PRATICE.CODING_NINJA;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String s = "aabccba";
        String ans = removeConsecutiveDuplicates(s);
        System.out.println(ans);
    }

    public static String removeConsecutiveDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder result = new StringBuilder();

        for(char character : s.toCharArray()){
            if (!seen[character]){
                seen[character] = true;
                result.append(character);
            }
        }
        return result.toString();
	}


    // remove duplicates from consecutive elements

    public static String removeDuplicates(String str) {

        if (str.length() == 0) return "";

        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }

        }

        return result.toString();
    }
}
