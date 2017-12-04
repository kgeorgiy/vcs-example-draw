package info.kgeorgiy.draw;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends AbstractShape implements Shape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    protected void drawSpecific(Graphics g) {
        g.fillOval(x - radius, y- radius, 2 * radius, 2 * radius);
    }
}
