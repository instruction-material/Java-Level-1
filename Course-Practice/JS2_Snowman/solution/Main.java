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

		g.setColor(Color.white);

		// snowballs
		g.fillOval(150, 50, 50, 50);
		g.fillOval(125, 95, 100, 100);
		g.fillOval(100, 190, 150, 150);

		g.setColor(Color.black);

		// eyes
        g.fillOval(163, 66, 5, 5);
        g.fillOval(181, 66, 5, 5);

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
