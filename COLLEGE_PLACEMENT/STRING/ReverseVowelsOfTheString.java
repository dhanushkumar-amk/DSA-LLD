package COLLEGE_PLACEMENT.STRING;

public class ReverseVowelsOfTheString {
    static void main(String[] args) {
       String s = "IceCreAm";

        System.out.println(reverse(s));

    }


    private static String reverse(String s){

        int left = 0;
        int right = s.length() - 1;

        char[] charArray = s.toCharArray();

        while (left <= right) {

            while (left < right && charArray[left] != 'a' && charArray[left] != 'e' && charArray[left] != 'i' && charArray[left] != 'o' && charArray[left] != 'u' &&
                    charArray[left] != 'A' && charArray[left] != 'E' && charArray[left] != 'I' && charArray[left] != 'O' && charArray[left] != 'U')
                left++;

            while (right > left && charArray[right] != 'a' && charArray[right] != 'e' && charArray[right] != 'i' && charArray[right] != 'o' && charArray[right] != 'u' &&
                    charArray[right] != 'A' && charArray[right] != 'E' && charArray[right] != 'I' && charArray[right] != 'O' && charArray[right] != 'U')
                right--;

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }


         return new String(charArray);
    }



}
