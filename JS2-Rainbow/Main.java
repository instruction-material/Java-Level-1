import java.awt.*;
import java.applet.Applet;

public class Rainbow extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillArc(50, 50, 300, 300, 0, 180);

        g.setColor(Color.orange);
        g.fillArc(75, 75, 250, 250, 0, 180);

        g.setColor(Color.yellow);
        g.fillArc(100, 100, 200, 200, 0, 180);

        g.setColor(Color.green);
        g.fillArc(125, 125, 150, 150, 0, 180);

        g.setColor(Color.blue);
        g.fillArc(150, 150, 100, 100, 0, 180);

        g.setColor(Color.magenta);
        g.fillArc(175, 175, 50, 50, 0, 180);
    }
}
