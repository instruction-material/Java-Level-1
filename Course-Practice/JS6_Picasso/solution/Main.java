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
        for (int i = 0; i < 500; i++) {
            int red = (int)(Math.random() * 256);
            int green = (int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            drawSquare(red, green, blue, position(), position(), size(), g);
            drawCircle(red, green, blue, position(), position(), size(), g);
            drawPacman(red, green, blue, position(), position(), size(), g);
        }
    }
    static int position() { return (int)(Math.random() * 450); }
    static int size() { return 1 + (int)(Math.random() * 50); }

    static void drawSquare(int red, int green, int blue, int x, int y, int sideLength, Graphics g) {
        Color c = new Color(red, green, blue);
        g.setColor(c);
        g.fillRect(x, y, sideLength, sideLength);
    }

    static void drawCircle(int red, int green, int blue, int x, int y, int diameter, Graphics g) {
        Color c = new Color(red, green, blue);
        g.setColor(c);
        g.fillOval(x, y, diameter, diameter);
    }

    static void drawPacman(int red, int green, int blue, int x, int y, int diameter, Graphics g) {
        Color c = new Color(red, green, blue);
        g.setColor(c);
        g.fillArc(x, y, diameter, diameter, 50, 270);
    }
}
