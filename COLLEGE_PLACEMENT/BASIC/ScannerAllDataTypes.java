package COLLEGE_PLACEMENT.BASIC;

import java.util.Scanner;

public class ScannerAllDataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // int
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // long
        System.out.print("Enter your phone number: ");
        long phone = sc.nextLong();

        // float
        System.out.print("Enter your height : ");
        float height = sc.nextFloat();

        // double datatype
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // char
        System.out.print("Enter your gender first letter: ");
        char gender = sc.next().charAt(0);

        // boolean
        System.out.print("Are you a student? : ");
        boolean student = sc.nextBoolean();

        // byte
        System.out.print("Enter your lucky number within 127: ");
        byte luckyNumber = sc.nextByte();

        // short
        System.out.print("Enter your PIN code: ");
        short pin = sc.nextShort();

        // Display Output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone : " + phone);
        System.out.println("Height: " + height );
        System.out.println("Salary : " + salary);
        System.out.println("Gender: " + gender);
        System.out.println("Student : " + student);
        System.out.println("Lucky Number: " + luckyNumber);
        System.out.println("PIN Number: " + pin);
    }
}