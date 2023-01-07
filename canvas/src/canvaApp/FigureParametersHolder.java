package canvaApp;

import java.awt.*;

public class FigureParametersHolder {
    private static Color COLOR = Color.GREEN;
    private static int SIZE = 40;
    private static final int MIN_SIZE = 10;
    private static final int SIZE_CHANGE = 5;

    public static void setColor(Color color) { COLOR = color; }
    public static Color getColor() { return COLOR; }
    public static int getSize() {
        return SIZE;
    }

    public static void changeSize(int wheelRotation) {
        int size = SIZE - wheelRotation * SIZE_CHANGE;
        SIZE = Math.max(size, MIN_SIZE);
    }
}