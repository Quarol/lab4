package canvaApp.Listeners;

import canvaApp.FigurePanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClickListener extends MouseAdapter {
    private final FigurePanel panel;

    public MouseClickListener(FigurePanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        panel.addFigure(e);
    }
}