package OOPS.OBJECT_RELATIONSHIP.AGGREGRATION;



public class Main {
    static void main() throws NullPointerException {
        Player p1 = new Player("dhanushkumar", "batsman");
        Player p2 = new Player("sanjayKumar", "Bowler");
        Player p3 = new Player("Aswin", "water boy");

        Team teamIndia = new Team("India");

        teamIndia.addPlayer(p1);
        teamIndia.addPlayer(p2);
        teamIndia.addPlayer(p3);

        teamIndia.showTeam();

        // now  team is disabled but still the player exists they can join the other teams
        teamIndia = null;

      // team is disbanded but still player exits
        System.out.println(p1.getName() + " => " + p1.getRole());
        System.out.println(p2.getName() + " => " + p2.getRole());
        System.out.println(p3.getName() + " => " + p3.getRole());

        try {
            teamIndia.showTeam();
        } catch (NullPointerException exception) {
            System.out.println("Message: " + exception.getMessage());
        }

    }
}
