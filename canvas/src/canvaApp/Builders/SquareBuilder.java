package canvaApp.Builders;

import canvaApp.figures.Figure;
import canvaApp.figures.Square;


public class SquareBuilder implements FigureBuilder{
    @Override
    public Figure getObject() {
        return new Square();
    }
}
