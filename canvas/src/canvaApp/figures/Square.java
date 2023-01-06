package canvaApp.figures;

import java.awt.*;

public final class Square extends Figure {

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }
}
