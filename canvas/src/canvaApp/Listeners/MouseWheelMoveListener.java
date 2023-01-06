package canvaApp.Listeners;


import canvaApp.FigureParametersHolder;

import java.awt.event.MouseWheelEvent;

public class MouseWheelMoveListener implements java.awt.event.MouseWheelListener {
    private static final int sizeChange = 5;

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        FigureParametersHolder.setSize( FigureParametersHolder.getSize() - e.getWheelRotation() * sizeChange );
    }
}
