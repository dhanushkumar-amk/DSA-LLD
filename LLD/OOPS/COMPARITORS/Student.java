package LLD.OOPS.COMPARITORS;

public class Student implements Comparable<Student> {

    // Instance variables
    int rollno;
    float marks;

    // Constructor
    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    /*
        Comparable Interface
        --------------------
        Comparable<T> is used to define the natural ordering of objects.

        Syntax:
            class Student implements Comparable<Student>

        We must implement:
            public int compareTo(Student o)

        Here:
            this -> current object
            o    -> object to compare with
     */

    /*
        compareTo() Return Values
        -------------------------

        Negative (< 0)
            Current object is smaller.
            Example:
                this.marks = 70
                o.marks    = 90
                return -20

        Zero (0)
            Both objects are equal.
            Example:
                this.marks = 90
                o.marks    = 90
                return 0

        Positive (> 0)
            Current object is greater.
            Example:
                this.marks = 95
                o.marks    = 80
                return 15

        NOTE:
        Java DOES NOT care whether you return exactly -1 or 1.
        It only checks whether the value is:

            < 0
            = 0
            > 0

        So these are all valid:

            return -1;
            return -50;
            return -1000;

            return 1;
            return 10;
            return 500;

        Java only checks the SIGN of the number.
     */

    @Override
    public int compareTo(Student o) {

        // Compare marks of current student with another student.
        // Positive  -> this student has more marks
        // Negative  -> other student has more marks
        // Zero      -> both have same marks

        int difference = (int) (this.marks - o.marks);

        return difference;

        /*
            Better implementation (recommended):

            return Float.compare(this.marks, o.marks);

            Why?
            ----
            Because converting float to int can lose decimal values.

            Example:

            90.5 - 90.2 = 0.3

            (int)0.3 = 0

            Java thinks both students are equal,
            which is incorrect.

            Float.compare() handles this properly.
         */
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}