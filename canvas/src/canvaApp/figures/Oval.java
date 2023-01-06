package canvaApp.figures;

import java.awt.*;

public final class Oval implements Figure {
    private int x;
    private int y;
    private int size;
    private Color color;

    public void initializeWithValues(int x, int y, int size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
