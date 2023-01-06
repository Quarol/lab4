package buttonApp;

import canvaApp.Canvas;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class EscButtonFrame extends JFrame {
    private static final int WINDOW_WIDTH = 500;
    private static final int WINDOW_HEIGHT = 500;

    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 100;
    private final JButton escapingBtn = new JButton();

    private static final int MARGIN = 40;
    private static final int MIN_PROXIMITY = 20;
    private static final int SHIFT = 20;
    private int currentX;
    private int currentY;

    public EscButtonFrame() {
        this.setTitle("Escaping button");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        currentX = WINDOW_WIDTH/2 - BUTTON_WIDTH/2;
        currentY = WINDOW_HEIGHT/2 - BUTTON_HEIGHT/2;


        escapingBtn.addActionListener(e -> {
            setVisible(false);
            dispose();
            new Canvas();
        });

        escapingBtn.setBounds(currentX, currentY, BUTTON_WIDTH, BUTTON_HEIGHT);
        escapingBtn.setText("Catch me");
        escapingBtn.setVisible(true);
        this.add(escapingBtn);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                buttonMovement(e);
            }
        });

        this.setVisible(true);
    }

    private void buttonMovement(MouseEvent e) {
        int middleX = currentX + BUTTON_WIDTH/2;
        int middleY = currentY + BUTTON_HEIGHT/2;

        int rightSide = e.getX() - currentX - BUTTON_WIDTH;
        int leftSide = currentX - e.getX();
        int upSide = currentY - e.getY();

        /*Jesli nawet kursor jest w miejscu krytycznym -  przycisk nie powinien sie przesunac
        * w momencie gdy kursor nie jest w granicach przycisku. Stad jezeli np. zblizamy
        * sie od prawej strony ale 100 pikseli powyzej przycisku, to przycisk pozostanie w miejscu
        * Za takie zachowanie odpowiada dodatkowy warunek isCursonInButtonBorder()*/
        //From Right:
        if (isCursorClose(rightSide) && isCursorInYButtonBorder(e))
            currentX = getSmallerCoordinate(middleX, BUTTON_WIDTH, WINDOW_WIDTH);

        //From Left:
        if (isCursorClose(leftSide) && isCursorInYButtonBorder(e))
            currentX = getBiggerCoordinate(middleX, BUTTON_WIDTH, WINDOW_WIDTH);

        //From Above:
        if (isCursorClose(upSide) && isCursorInXButtonBorder(e))
            currentY = getBiggerCoordinate(middleY, BUTTON_HEIGHT, WINDOW_HEIGHT);


        escapingBtn.setLocation(currentX, currentY);
    }

    private int getBiggerCoordinate(int middle, int buttonDimension, int frameDimension) {
        int buttonEdge = buttonDimension/2 + SHIFT;

        if (middle + buttonEdge > frameDimension - MARGIN)
            return MARGIN;
        else
            return middle - buttonDimension/2 + SHIFT;
    }

    private int getSmallerCoordinate(int middle, int buttonDimension, int frameDimension) {
        int buttonEdge = buttonDimension/2 + SHIFT;

        if (middle - buttonEdge < MARGIN)
            return frameDimension - buttonDimension - MARGIN;
        else
            return middle - buttonDimension/2 - SHIFT;
    }


    private boolean isCursorInXButtonBorder(MouseEvent e) {
        return (e.getX() > currentX && e.getX() < currentX + BUTTON_WIDTH);
    }

    private boolean isCursorInYButtonBorder(MouseEvent e) {
        return (e.getY() > currentY && e.getY() < currentY + BUTTON_HEIGHT);
    }

    private boolean isCursorClose(int position) {
        return (position <= MIN_PROXIMITY && position > 0);
    }
}
