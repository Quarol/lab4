package canvaApp.figures;

import java.awt.*;

public final class Circle extends Figure {

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
