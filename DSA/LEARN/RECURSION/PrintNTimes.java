package DSA.LEARN.RECURSION;

public class PrintNTimes {
    public static void main(String[] args) {
        print();
    }

    static int count = 0;
    private static void print(){
        if (count == 5)
            return;

        System.out.print(count + " ");
        count++;

        print();
    }

}
