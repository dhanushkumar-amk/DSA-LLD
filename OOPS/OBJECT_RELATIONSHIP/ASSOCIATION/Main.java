package OOPS.OBJECT_RELATIONSHIP.ASSOCIATION;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        Student dhanush = new Student("Dhanushkumar", 10);
        Student kumar  = new Student("Kumar", 11);

        Teacher teacher = new Teacher("priya", "Maths");

        List<Student> studentList = Arrays.asList(dhanush, kumar);
        teacher.teach(studentList);

        // here the student can exits without teacher and viseversa
        System.out.println(dhanush.getName());



    }
}
