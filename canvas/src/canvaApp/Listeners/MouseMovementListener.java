package canvaApp.Listeners;

import canvaApp.FigurePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseMovementListener extends MouseMotionAdapter {

    private final FigurePanel panel;

    public MouseMovementListener(FigurePanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        panel.addFigure(e);
    }
}
