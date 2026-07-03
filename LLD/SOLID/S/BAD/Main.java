package LLD.SOLID.S.BAD;

public class Main {
   public static void main(String[] args) {
        Invoice customer1 = new Invoice("dhanushkumar", 2000.00);
        Invoice customer2 = new Invoice("aswin", 30000.00);
        customer1.calculateTotalWithTax();
        customer1.printInvoice();
        customer1.saveToDatabase();
    }

    /*
        🔑 What's wrong here?
        Ask yourself: "What are the reasons this class might change?"

        If the tax calculation formula changes (business/finance team's decision)
        If the print format changes (UI/presentation team's decision)
        If the database schema changes (infrastructure team's decision)

        THREE completely different teams, THREE completely different reasons,
        but ONE class getting modified by all of them. That's the exact violation
        SRP warns against — this class has THREE actors depending on it, not one.
  */
}
