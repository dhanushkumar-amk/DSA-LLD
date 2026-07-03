package OOPS.OBJECT_CLONING;

import java.util.Arrays;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }


    @Override
    public String toString() {
        return "Human{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
//    clone of the object might be throw  exception
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//        return super.clone();
//    }


     @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human twin = (Human) super.clone(); // shallow copy

         // make deep copy
         twin.arr = new int[twin.arr.length];

         System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);

         return twin;
    }
}
