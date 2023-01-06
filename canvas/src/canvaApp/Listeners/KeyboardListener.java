package canvaApp.Listeners;

import canvaApp.FigureFactory;
import canvaApp.FigurePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public record KeyboardListener(FigurePanel panel) implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        char key = Character.toLowerCase(e.getKeyChar());

        if (FigureFactory.isAvailable(key))
            panel.setFigureIndicator(key);
        if (key == 'c')
            panel.clear();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
