import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Algo implements Directions {
    static {
        World.setVisible(true);
        World.readWorld("world.txt");
    }

    public static void main(String[] args) {
        UrRobot sam = new UrRobot(2, 2, East, 0);
        sam.pickBeeper();
        sam.move();
        sam.move();
        sam.putBeeper();
    }
}
