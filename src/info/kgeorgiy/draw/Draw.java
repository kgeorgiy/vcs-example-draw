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

        Line line1 = new Line(0, 0, w, h, Color.WHITE);
        Line line2 = new Line(0, h, w, 0, Color.WHITE);
        line1.draw(g);
        line2.draw(g);

        ImageUtil.writeImage("image.jpg", image);
        ImageUtil.showImage(image);
    }
}
