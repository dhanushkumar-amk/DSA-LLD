package LLD.CREATIONAL_PATTERN.SINGLETON_DESIGN_PATTERN.GOOD;

public class Main {
    static void main() {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        DatabaseConnection conn3 = DatabaseConnection.getInstance();

        conn1.query("SELECT * FROM users");
        conn2.query("SELECT * FROM orders");

        System.out.println(conn1 == conn2); // true - SAME object!x
    }
}
