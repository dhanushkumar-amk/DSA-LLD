package DSA.LEARN.RECURSION;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        String str = "abc";
        subset(" ", str);

        System.out.println();

        ArrayList<String> ans = subsets1(" ", str);
        System.out.println(ans);
    }

    // no return type
    private static void subset(String picked, String unpicked){
        if (unpicked.isEmpty()){
            System.out.print(picked + " ");
            return;
        }

        char firstCharacter = unpicked.charAt(0);

        // picked
        subset(firstCharacter + picked, unpicked.substring(1));

        // unpicked
        subset(picked, unpicked.substring(1));
    }


    // return type of arrayList
    public static ArrayList<String> subsets1(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char firstCharacter = unProcessed.charAt(0);

        ArrayList<String> picked  = subsets1(firstCharacter + processed, unProcessed.substring(1));
        ArrayList<String> unPicked  = subsets1(processed, unProcessed.substring(1));

        // concatenate
        picked.addAll(unPicked);
        return picked;
    }
}
