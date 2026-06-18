package LLD.OOPS.INTRODUCTION;

public class Main {
    public static void main(String[] args) {
        // store 5 roll no
        int[] number = new int[5];

        // stores 5 names
        String[] names = new String[5];

        // data of 5 student {rollno, name, marks}

        int[] rollno = new int[5];
        String[] name  = new String[5];
        float[] mark = new float[5];


        Student Dhanush = new Student(4, "dhanushkumar", 100.00f);
        System.out.println(Dhanush.name);


    }




}


 class Student{
        int rollno;
        String name;
        float marks;


        public  Student(int rollno, String name, float marks){
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }
    }
