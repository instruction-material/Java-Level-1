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
        int x1 = 0;
        int y1 = 0;

        int x2 = 250;
        int y2 = 0;

        for (int i = 0; i <= 10; i++)
        {
            g.setColor(Color.cyan);
            g.fillOval(x1, y1, 25, 25);
            g.fillOval(x2, y2, 25, 25);

            x1 += 25;
            y1 += 25;

            x2 -= 25;
            y2 += 25;
        }
    }
}
