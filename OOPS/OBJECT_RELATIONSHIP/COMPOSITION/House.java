package OOPS.OBJECT_RELATIONSHIP.COMPOSITION;

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private List<Room> rooms; // <-- STRONG ownership (Composition)

    public House(String address) {
        this.address = address;
        this.rooms = new ArrayList<>();

        // KEY DIFFERENCE: Rooms are created INSIDE House, not passed in from outside
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
        rooms.add(new Room("Hall"));
    }

    public void showHouse() {
        System.out.println("House at: " + address);
        for (Room r : rooms) {
            System.out.println("  -> " + r.getType());
        }
    }

    // No getRooms() exposing individual Room objects to outside world!
    // Because Room has NO independent existence outside House
}