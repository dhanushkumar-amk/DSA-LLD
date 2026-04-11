package DSA.LEARN.RECURSION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Permutations {
    public static void main(String[] args) {
        String str = "abcde";
        permutations("", str);
    }

    private static void permutations(String process, String unProcess){
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
        ArrayList<String> list = helper("", s);

        list = removeDuplicates(list);      // remove duplicates
        list = sortLexicographically(list); // sort result

        return list;
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

    // Function 1: Remove duplicates
    private ArrayList<String> removeDuplicates(ArrayList<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    // Function 2: Sort lexicographically
    private ArrayList<String> sortLexicographically(ArrayList<String> list) {
        Collections.sort(list);
        return list;
    }
}