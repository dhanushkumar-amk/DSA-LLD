package OOPS.ABSTRACT_CLASS;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career(String name);
    abstract void partner(String name, int age);

    static void greetings(){
        System.out.println("Hello world");
    }
}
