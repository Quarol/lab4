package canvaApp;

import java.awt.*;

public class FigureParametersHolder {
    private static Color color = Color.GREEN;
    private static int size = 40;
    private static final int minSize = 10;

    public static Color getColor() { return color; }
    public static int getSize() {
        return size;
    }

    public static void setColor(Color color) { FigureParametersHolder.color = color; }
    public static void setSize(int size) {
        FigureParametersHolder.size = (size < minSize) ? minSize : size;
    }
}