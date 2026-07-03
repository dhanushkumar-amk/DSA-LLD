package OOPS.CLASS;

public class into {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        Student dhanush = new Student(21, "dhanushkumar", 98.00f);
        Student alice = new Student(22, "alice", 99.00f);
        Student bob = new Student(23, "bob", 97.00f);

        System.out.println(dhanush.name);
        System.out.println(alice.name);
        System.out.println(bob.name);

//        students[0] = new Student(21, "hans", 23.f);
//        System.out.println(students[0].name);
    }



}

 class Student{
       int rollno;
        String name;
        float marks;

     public Student(int rollno, String name, float marks) {
         this.rollno = rollno;
         this.name = name;
         this.marks = marks;
     }
 }
