package OOPS.COLLECTION_FRAMEWORK.VECTOR;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    static void main(String[] args) {

        // same as a arraylist but it synchronized so thread safety

        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);

        System.out.println(Arrays.toString(vector.toArray()));
    }
}
