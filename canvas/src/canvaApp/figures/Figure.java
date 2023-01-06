package canvaApp.figures;

import java.awt.*;

public interface Figure{
    void initializeWithValues(int x, int y, int size, Color color);
    void draw(Graphics g);
}
