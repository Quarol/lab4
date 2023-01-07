package canvaApp.figures;

import java.awt.*;

public abstract class Figure{
    protected int x;
    protected int y;
    protected int size;
    protected Color color;

    public void initializeWithValues(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }
    public void draw(Graphics g) {}
}