package DSA.LEARN.RECURSION;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "abcde";
//        permutations("", str);
  int result = permutationsCount("", "abc", 0);
System.out.println(result);
    }

    private static  void permutations(String process, String unProcess){
        if (unProcess.isEmpty()){
            System.out.print(process + " ");
            return;
        }

        char firstCharacter = unProcess.charAt(0);

        for (int i = 0; i <= process.length() ; i++) {

            String first = process.substring(0, i);
            String second = process.substring(i);

            permutations(first + firstCharacter + second, unProcess.substring(1));
        }
    }


     public ArrayList<String> findPermutation(String s) {
        return helper("", s);
    }

    private static ArrayList<String> helper(String process, String unProcess){

        if (unProcess.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

         char firstCharacter = unProcess.charAt(0);

        for (int i = 0; i <= process.length() ; i++) {

            String first = process.substring(0, i);
            String second = process.substring(i);

            ans.addAll(helper(first + firstCharacter + second, unProcess.substring(1)));
        }

        return ans;
    }

    // permutation count
    private static  int permutationsCount(String process, String unProcess, int count){
        if (unProcess.isEmpty()){
            return count + 1;
        }

        char firstCharacter = unProcess.charAt(0);

        for (int i = 0; i <= process.length() ; i++) {

            String first = process.substring(0, i);
            String second = process.substring(i);

           count =  permutationsCount(first + firstCharacter + second, unProcess.substring(1), count);
        }
        return count;
    }

}
