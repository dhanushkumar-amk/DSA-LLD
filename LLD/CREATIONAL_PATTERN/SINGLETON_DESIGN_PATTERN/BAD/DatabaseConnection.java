package LLD.CREATIONAL_PATTERN.SINGLETON_DESIGN_PATTERN.BAD;

public class DatabaseConnection {
    public DatabaseConnection() {
        System.out.println("Creating a new DatabaseConnection Connection...");
    }

    public void query(String sql) {
        System.out.println("Running query: " + sql);
    }
}