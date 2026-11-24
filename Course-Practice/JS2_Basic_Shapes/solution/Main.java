import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.createGraphics();
        g.setColor(new Color(210, 226, 240));
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.BLACK);
        draw(g);
        g.dispose();
        ImageIO.write(image, "png", new File("drawing.png"));
        System.out.println("Saved drawing.png");
    }

    static void draw(Graphics g) {
        // fillRect() takes in x, y, width, height
        g.setColor(Color.red);
        g.fillRect(50, 50, 100, 100);

        // fillOval() takes in x, y, width, height
        g.setColor(Color.cyan);
        g.fillOval(200, 50, 100, 100);

        // fillArc() takes in x, y, width, height, startAngle, arcAngle
        g.setColor(Color.green);
        g.fillArc(50, 200, 100, 100, 90, 270);

        // colors: https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html
    }
}
