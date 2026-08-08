import java.awt.*;
import java.applet.Applet;

public class BasicShapes extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.white);

        // snowballs
        g.fillOval(150, 50, 50, 50);
        g.fillOval(125, 95, 100, 100);
        g.fillOval(100, 190, 150, 150);

        g.setColor(Color.black);

        // hat
        g.fillRect(150, 30, 50, 30);
        g.fillRect(140, 50, 70, 10);

        // arms
        g.fillRect(75, 145, 50, 5);
        g.fillRect(225, 145, 50, 5);

        g.setColor(Color.yellow);

        // ribbon on hat
        g.fillRect(150, 45, 50, 5);
    }
}
