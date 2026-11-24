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
