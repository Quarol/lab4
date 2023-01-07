package canvaApp.Listeners;

import canvaApp.ColorButton;
import canvaApp.FigureParametersHolder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public record ButtonListener(ColorButton button) implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        FigureParametersHolder.setColor(button.getBackground());
    }
}