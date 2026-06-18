package DSA.PRATICE.NEETCODE_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeString {

    // Separator character
    private static final String SEPARATOR = Character.toString((char) 257);

    // Empty list marker
    private static final String EMPTY_LIST = Character.toString((char) 258);

    public static void main(String[] args) {

        List<String> input = Arrays.asList(
                "neet",
                "code",
                "love",
                "you"
        );

        String encoded = encode(input);

        System.out.println("Encoded:");
        System.out.println(encoded);

        List<String> decoded = decode(encoded);

        System.out.println("\nDecoded:");
        System.out.println(decoded);

        System.out.println("\nSeparator Character:");
        System.out.println((char) 257);

        System.out.println("\nEmpty List Character:");
        System.out.println((char) 258);
    }

    public static String encode(List<String> strings) {

        // Empty list case
        if (strings.size() == 0) {
            return EMPTY_LIST;
        }

        StringBuilder sb = new StringBuilder();

        for (String string : strings) {
            sb.append(string);
            sb.append(SEPARATOR);
        }

        // Remove last separator
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public static List<String> decode(String string) {

        // Empty list case
        if (string.equals(EMPTY_LIST)) {
            return new ArrayList<>();
        }

        return Arrays.asList(string.split(SEPARATOR, -1));
    }
}