package canvaApp.Listeners;

import canvaApp.FigureFactory;
import canvaApp.FigurePanel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public final class KeyboardListener extends KeyAdapter {
    private final FigurePanel panel;

    public KeyboardListener(FigurePanel panel) {
        this.panel = panel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = Character.toLowerCase(e.getKeyChar());

        if (FigureFactory.isAvailable(key))
            panel.setFigureIndicator(key);
        if (key == 'c')
            panel.clear();
    }
}