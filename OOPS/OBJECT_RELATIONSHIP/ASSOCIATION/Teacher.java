package OOPS.OBJECT_RELATIONSHIP.ASSOCIATION;

import java.util.List;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

      // Teacher USES Student objects here - this is the ASSOCIATION
    public void teach(List<Student> students) {
        System.out.println(name + " is teaching " + subject + " to:");
        for (Student s : students) {
            System.out.println("  -> " + s.getName() + " (Roll No: " + s.getRollNumber() + ")");
        }
    }
}
