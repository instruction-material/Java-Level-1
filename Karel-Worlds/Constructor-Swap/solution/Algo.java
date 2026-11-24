import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class Algo implements Directions {
    static {
        World.setVisible(true);
        World.readWorld("world.txt");
    }

    public static void main(String[] args) {
        UrRobot sam = new UrRobot(4, 4, West, 1);
        // The same commands are used for all three predictions.
        sam.turnLeft();
        sam.turnLeft();
        sam.move();
    }
}
