package OOPS.OBJECT_RELATIONSHIP.COMPOSITION;

public class Room {
    private String type; // e.g., Bedroom, Kitchen, Hall

    public Room(String type) {
        this.type = type;
        System.out.println(type + " created!");
    }

    public String getType() {
        return type;
    }
}