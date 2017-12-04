package info.kgeorgiy.draw;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends AbstractShape {
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    protected void drawSpecific(Graphics g) {
        g.drawLine(x, y, x2, y2);
    }

    public void translate(int dx, int dy) {
        super.translate(dx, dy);
        x2 += dx;
        y2 += dy;
    }
}
