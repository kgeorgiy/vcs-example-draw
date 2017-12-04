package info.kgeorgiy.draw;

import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractShape implements Shape {
    protected Color color;
    protected int x;
    protected int y;

    public AbstractShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        drawSpecific(g);
    }

    protected abstract void drawSpecific(Graphics g);

    public void toGrayScale() {
        setColor(ImageUtil.toGrayScale(getColor()));
    }
}
