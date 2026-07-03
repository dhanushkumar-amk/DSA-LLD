package LLD.OOPS.COMPARITORS;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Creating Student Objects
        Student dhanush = new Student(10, 98.0f);
        Student rahul   = new Student(5, 79.98f);
        Student sachin  = new Student(6, 72.98f);
        Student kunal   = new Student(4, 92.98f);
        Student arun    = new Student(7, 62.98f);

        // Store all students inside an array
        Student[] list = {dhanush, rahul, sachin, kunal, arun};

        // Before Sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(list));

        /*
            Arrays.sort()

            Arrays.sort() checks whether the object implements
            Comparable.

            Since Student implements Comparable<Student>,
            Java automatically calls compareTo() multiple times
            to compare two Student objects.

            compareTo() returns:

                Negative (<0)  -> Current object comes first
                Zero (0)       -> Both are equal
                Positive (>0)  -> Current object comes later

            Here, students are sorted based on marks.
         */

        Arrays.sort(list);

        // After Sorting
        System.out.println("\nAfter Sorting (Ascending by Marks):");
        System.out.println(Arrays.toString(list));

        /*
            compareTo() Examples

            dhanush marks = 98
            rahul marks   = 79.98

            98 - 79.98 = 18.02
            (int)18.02 = 18

            Positive value means:
                dhanush > rahul
         */

        if (dhanush.compareTo(rahul) > 0) {
            System.out.println("\nDhanush has more marks than Rahul.");
        } else if (dhanush.compareTo(rahul) < 0) {
            System.out.println("\nRahul has more marks than Dhanush.");
        } else {
            System.out.println("\nBoth students have the same marks.");
        }

        /*
            Another Example

            sachin = 72.98
            kunal  = 92.98

            72.98 - 92.98 = -20

            Negative value means:
                sachin < kunal
         */

        if (sachin.compareTo(kunal) < 0) {
            System.out.println("Kunal has more marks than Sachin.");
        }

        /*
            Equal Marks Example
         */

        Student s1 = new Student(11, 85);
        Student s2 = new Student(12, 85);

        if (s1.compareTo(s2) == 0) {
            System.out.println("s1 and s2 have equal marks.");
        }
    }
}