package DSA.HACKER_RANK;

public class CamelCase {
    static void main(String[] args) {
        System.out.println((int) 'A');
    }

    public static int camelcase(String s) {
    int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            int asciiValue = (int) character;

            if (asciiValue >= 65 && asciiValue <= 90)
                count++;

        }

    return count + 1;
    }
}
