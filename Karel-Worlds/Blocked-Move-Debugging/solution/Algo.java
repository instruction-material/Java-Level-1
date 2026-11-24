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
        sam.turnLeft(); // North, around the wall.
        sam.move();
        turnRight(sam);
        sam.move();
        turnRight(sam);
        sam.move();
    }

    private static void turnRight(UrRobot robot) {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    }
}
