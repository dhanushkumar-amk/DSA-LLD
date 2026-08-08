package COLLEGE_PLACEMENT.JAVA_LEARNING;

import java.util.Scanner;

public class Skip {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
              System.out.println("Is student is absent : ");
            String isAbsent  = sc.next();


            if (isAbsent.equals("yes"))
                continue;

            System.out.println("Enter the mark1 : ");
            int mark1 = sc.nextInt();

            System.out.println("Enter the mark2 : ");
            int mark2 = sc.nextInt();

            int total = mark1 + mark2;

            System.out.println(total);

        }
    }
}
