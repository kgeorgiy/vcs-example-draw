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
        int h = 1024;
        int w = 512;
        BufferedImage image = ImageUtil.createImage(h, w);
        Graphics g = image.getGraphics();

        Line line = new Line(0, 0, h, w, Color.WHITE);
        line.draw(g);

        ImageUtil.writeImage("image.jpg", image);
        ImageUtil.showImage(image);
    }
}
