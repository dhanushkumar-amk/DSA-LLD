package OOPS.OBJECT_RELATIONSHIP.COMPOSITION;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House("Avinasi Road, Coimbatore");
        myHouse.showHouse();

        // Now imagine the house is demolished
        myHouse = null;

        // Rooms are GONE too - there's no way to access them anymore
        // We never had a reference to individual Room objects outside House
        // This proves Composition - Rooms cannot outlive the House
        System.out.println("\nHouse demolished. Rooms demolished with it. No orphan rooms exist!");
    }
}