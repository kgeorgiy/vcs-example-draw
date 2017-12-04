package info.kgeorgiy.draw;

import java.awt.Graphics;
import java.awt.Color;

public interface Shape {
    void draw(Graphics g);
    Color getColor();
    void setColor(Color color);
    void translate(int dx, int dy);
    void toGrayScale();
}
