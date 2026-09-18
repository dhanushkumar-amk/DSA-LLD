package COLLEGE_PLACEMENT.STRING;

public class ReverseString {
    static void main(String[] args) {
        String ans = reverse("hello");
        System.out.println(ans);
    }

    private static String reverse(String str) {

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left <= right)

        {

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }




}
