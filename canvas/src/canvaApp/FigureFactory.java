package canvaApp;

import canvaApp.Builders.FigureBuilder;
import canvaApp.Builders.OvalBuilder;
import canvaApp.Builders.SquareBuilder;
import canvaApp.figures.Figure;

import java.util.HashMap;

public class FigureFactory {
    private FigureFactory() {}

    private static final HashMap<Character, FigureBuilder> shapes;
    static {
        shapes = new HashMap<>();
        shapes.put('1', new SquareBuilder());
        shapes.put('2', new OvalBuilder());
    }

    public static Figure getFigure(Character key) {
        return shapes.get(key).getObject();
    }

    public static boolean isAvailable(Character key) {
        return shapes.get(key) != null;
    }
}
