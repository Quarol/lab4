package canvaApp.Builders;

import canvaApp.figures.Figure;
import canvaApp.figures.Oval;


public class OvalBuilder implements FigureBuilder{
    @Override
    public Figure getObject() {
        return new Oval();
    }
}
