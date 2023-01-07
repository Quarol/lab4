package canvaApp.Listeners;


import canvaApp.FigureParametersHolder;

import java.awt.event.MouseWheelEvent;

public class MouseWheelMoveListener implements java.awt.event.MouseWheelListener {
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        FigureParametersHolder.changeSize(e.getWheelRotation());
    }
}