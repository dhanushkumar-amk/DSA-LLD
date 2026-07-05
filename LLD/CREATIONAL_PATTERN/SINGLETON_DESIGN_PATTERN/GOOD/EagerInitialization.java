package LLD.CREATIONAL_PATTERN.SINGLETON_DESIGN_PATTERN.GOOD;

public class EagerInitialization {
    // Created immediately when class loads - JVM guarantees this is thread-safe
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {
        System.out.println("Creating a new Database Connection...");
    }

    public static EagerInitialization getInstance() {
        return instance;
    }

    public void query(String sql) {
        System.out.println("Running query: " + sql);
    }
}

// If you don't need "lazy" creation (create only when first used), just create
// it immediately when the class loads. Java guarantees this is thread-safe automatically:

// Simplest, safest, no synchronized needed anywhere.
// Only downside: the object gets created even if you never end up using it (not "lazy").
