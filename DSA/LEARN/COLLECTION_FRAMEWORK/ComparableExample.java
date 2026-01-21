package DSA.LEARN.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
}

class Person implements Comparable<Person>{
   private  String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " ( " + age + " ) ";
    }


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("dhanushkumar", 21));
        personList.add(new Person("arunkumar", 20));
        personList.add(new Person("sanjaykumar", 31));

        Collections.sort(personList);

        for (Person person : personList)
            System.out.println(person );
    }

    @Override
    public int compareTo(Person o) {
        return o.name.compareTo(this.name);
    }
}
