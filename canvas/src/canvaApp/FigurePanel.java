package canvaApp;

import canvaApp.Listeners.KeyboardListener;
import canvaApp.Listeners.MouseClickListener;
import canvaApp.Listeners.MouseMovementListener;
import canvaApp.Listeners.MouseWheelMoveListener;
import canvaApp.figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FigurePanel extends JPanel {
    private ArrayList<Figure> figures = new ArrayList<>();
    private Character figureIndicator = '1';

    public void setFigureIndicator(Character figureIndicator) {
        this.figureIndicator = figureIndicator;
    }

    public FigurePanel() {
        this.addKeyListener(new KeyboardListener(this));
        this.addMouseWheelListener(new MouseWheelMoveListener());
        this.addMouseListener(new MouseClickListener(this));
        this.addMouseMotionListener(new MouseMovementListener(this));

        this.setFocusable(true);
    }

    @Override
    public void paintComponent(Graphics g){
        this.requestFocus(true);
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        for (Figure f :  figures)
            f.draw(g2d);
    }

    public void addFigure(MouseEvent e) {
        int size = FigureParametersHolder.getSize();
        int x = e.getX() - size/2;
        int y = e.getY() - size/2;
        Color color = FigureParametersHolder.getColor();

        Figure figure = FigureFactory.getFigure(figureIndicator);
        figure.initializeWithValues(x, y, size, color);

        figures.add(figure);
        this.repaint();
    }

    public void clear() {
        figures = new ArrayList<>();
        this.removeAll();
        this.repaint();
    }
}

