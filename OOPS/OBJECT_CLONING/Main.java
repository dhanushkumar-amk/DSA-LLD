package OOPS.OBJECT_CLONING;

import java.util.Arrays;

public class Main{
    static void main() throws CloneNotSupportedException{
        Human dhanush = new Human(21, "dhanushkumar");
        // Human twin = new Human(dhanush); // it takes more processing time so we use clonable interface

        Human twin = (Human) dhanush.clone();

        System.out.println(twin.name);
        System.out.println(twin.age);


        System.out.println(Arrays.toString(dhanush.arr));
        System.out.println(Arrays.toString(twin.arr));

        System.out.println("\n ------- \n");

        // shallow copy and deep copy
        twin.arr[0] = 10;

        System.out.println(Arrays.toString(dhanush.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
