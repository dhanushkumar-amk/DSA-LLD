package OOPS.OBJECT_RELATIONSHIP.AGGREGRATION;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players; // <-- HAS-A relationship (Aggregation)

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Notice: Player object is created OUTSIDE and just added here
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void showTeam() {
            System.out.println("Team: " + teamName);
        for (Player p : players) {
            System.out.println("  -> " + p.getName() + " (" + p.getRole() + ")");
        }
    }
}