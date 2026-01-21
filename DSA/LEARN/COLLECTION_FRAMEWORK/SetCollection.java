package DSA.LEARN.COLLECTION_FRAMEWORK;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(0);
        set.add(2);
        set.add(4);
        set.add(3);

//        set.remove(4);

        // set.clear(); // used to empty
        System.out.println(set);

        for (int value : set) {
            System.out.println("Element: " + value);
        }

        System.out.println();

        Set<Integer> set2 = new LinkedHashSet<>();

        set2.add(1);
        set2.add(0);
        set2.add(2);
        set2.add(4);
        set2.add(3);
        set2.add(3);

        for (int value : set2) {
            System.out.println("Element: " + value);
        }



    }
}
