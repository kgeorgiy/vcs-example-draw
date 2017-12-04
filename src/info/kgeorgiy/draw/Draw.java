package info.kgeorgiy.draw;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import java.util.List;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public class Draw {

    public static void main(String[] args) throws IOException {
        int w = 1024;
        int h = 512;
        BufferedImage image = ImageUtil.createImage(w, h);
        Graphics g = image.getGraphics();

        for (int i = 0; i < 10; i++) {
            new Line(0, h / 10 * i, w, h / 10 * i, Color.YELLOW).draw(g);
        }

        Circle circle = new Circle(w / 2, h / 2, (h + w) / 4, Color.YELLOW);
        circle.draw(g);

        ImageUtil.writeImage("image.jpg", image);
        ImageUtil.showImage(image);
    }
}
