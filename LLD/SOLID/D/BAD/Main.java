package LLD.SOLID.D.BAD;

public class Main {
    public static void main(String[] args) {
        Switch mySwitch = new Switch();
        mySwitch.operate(true);
    }

    /*This Switch can ONLY EVER control a Bulb. If tomorrow you want the same switch to control a Fan instead, you literally cannot — the Switch class is hardwired (pun intended 😄)
    to Bulb specifically. You'd have to open up Switch.java and rewrite it.*/
}