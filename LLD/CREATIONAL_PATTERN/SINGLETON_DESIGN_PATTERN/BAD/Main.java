package LLD.CREATIONAL_PATTERN.SINGLETON_DESIGN_PATTERN.BAD;

public class Main {
    static void main() {

        // 🚨 PROBLEM: anyone can create as many connections as they want!
        DatabaseConnection conn1 = new DatabaseConnection();
        DatabaseConnection conn2 = new DatabaseConnection();
        DatabaseConnection conn3 = new DatabaseConnection();

        conn1.query("SELECT * FROM users");
        conn2.query("SELECT * FROM orders");

        System.out.println(conn1 == conn2); // false - these are DIFFERENT objects!

    }
}
