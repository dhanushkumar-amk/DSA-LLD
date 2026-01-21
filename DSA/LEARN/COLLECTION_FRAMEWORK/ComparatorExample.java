package DSA.LEARN.COLLECTION_FRAMEWORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<People> personList = new ArrayList<>();

        personList.add(new People("dhanushkumar", 21));
        personList.add(new People("arunkumar", 20));
        personList.add(new People("sanjaykumar", 31));

        Collections.sort(personList, new AgeComparator());

        for (People person : personList) {
            System.out.println(person);
        }
    }
}

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " ( " + age + " )";
    }
}

class AgeComparator implements Comparator<People> {
    @Override
    public int compare(People p1, People p2) {
        return p2.getAge() - p1.getAge();
    }
}
