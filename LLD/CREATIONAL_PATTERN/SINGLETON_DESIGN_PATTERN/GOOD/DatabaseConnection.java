package LLD.CREATIONAL_PATTERN.SINGLETON_DESIGN_PATTERN.GOOD;

public class DatabaseConnection {
    // Step 1: ONE static instance, shared by the whole class
    private static DatabaseConnection instance;

    // Step 2: Constructor is PRIVATE - nobody outside can do "new DatabaseConnection()"
    private DatabaseConnection() {
        System.out.println("Creating a new Database Connection...");
    }

    // Step 3: The ONLY way to get the instance - creates it once, reuses after
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Running query: " + sql);
    }
}