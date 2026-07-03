package OOPS.STATIC;

public class Main {
    public static void main(String[] args) {
//        Human dhanush = new Human(21, "dhanushkumar", 100000, false);
//        Human rahul = new Human(25, "rahul", 10000, true);
//        Human raj = new Human(25, "rahul", 10000, true);
//
//        System.out.println(dhanush.name);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(raj.population);

//        Main main = new Main();
//        main.greeting();


        Human human1 = new Human(21, "dhanushkumar", 100000, false);
        Human human2 = new Human(21, "dhanushkumar", 100000, false);


        Human.message();


    }

        static void fun(){
            System.out.println("fun");
//            greeting(); non static things can't be access on static object
        }

    void greeting(){
        System.out.println("hello world");

    }
}
