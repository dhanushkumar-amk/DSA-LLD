package OOPS.ENUM_EXAMPLES;

public class Basic {
    // enum constants
    // public static and final
    // since its final but here we create a child enums
    // type is week

    enum Week{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }

    static void main() {
        Week firstDay = Week.Tuesday;
        System.out.println(firstDay);


        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(firstDay.ordinal()); // 1 because the index of tuesday is 1

    }
}
