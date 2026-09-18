package COLLEGE_PLACEMENT.STRING;

public class RemovePalindromeWords {
    static void main(String[] args) {
        String str= "He did a good deed";

        String ans = skip(str);
        System.out.println(ans);

        System.out.println(ans.length());
    }


    private static String  skip(String str){
        String[] strArray = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArray.length; i++) {
            String element = strArray[i];

            if (element.length() == 1)
                continue;

            boolean palindorme = isPalindrome(element);

            if (!palindorme){
                sb.append(element);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }


     private static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;


        while(left <= right){
            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
