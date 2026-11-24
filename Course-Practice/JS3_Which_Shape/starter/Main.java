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
        // Use the shape string to select a circle, square or Pac-Man. Test all three and give unknown values a visible fallback.
    }
}
