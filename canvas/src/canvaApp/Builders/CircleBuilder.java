package canvaApp.Builders;

import canvaApp.figures.Figure;
import canvaApp.figures.Circle;


public class CircleBuilder implements FigureBuilder{
    @Override
    public Figure getObject() {
        return new Circle();
    }
}