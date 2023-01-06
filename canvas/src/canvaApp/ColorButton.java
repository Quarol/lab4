package canvaApp;

import canvaApp.Listeners.ButtonListener;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ColorButton extends JButton{
    private static final Border blackLine = BorderFactory.createLineBorder(Color.black);

    public ColorButton(Color color) {
        this.setBorder(blackLine);
        this.setBackground(color);

        this.addActionListener(new ButtonListener(this));
    }

}
