package canvaApp;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Canvas extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 700;
    private static final int MARGIN = 25;

    private static final int PANEL_HEIGHT = 450;
    private static final FigurePanel panel = new FigurePanel();

    private static final JLabel setColorLabel = new JLabel("Select a color:");

    private static final ColorButton greenButton = new ColorButton(Color.GREEN);
    private static final ColorButton redButton = new ColorButton(Color.RED);
    private static final ColorButton yellowButton = new ColorButton(Color.yellow);
    private static final ColorButton blueButton = new ColorButton(Color.blue);
    private static final ColorButton blackButton = new ColorButton(Color.BLACK);
    private static final ColorButton whiteButton = new ColorButton(Color.WHITE);
    private static final ColorButton orangeButton = new ColorButton(Color.ORANGE);
    private static final ColorButton brownButton = new ColorButton(new Color(150, 75, 0));

    private final JTextArea instructions;
    private static final Color BACKGROUND_COLOR = new Color(251, 251, 240);
    private static final Color PANEL_COLOR = Color.WHITE;


    public Canvas() {
        this.setTitle("Canvas");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(BACKGROUND_COLOR);

        panel.setBackground(PANEL_COLOR);
        panel.setBounds(MARGIN, MARGIN, WINDOW_WIDTH - 2*MARGIN, PANEL_HEIGHT);
        panel.setVisible(true);
        this.add(panel);
        panel.setOpaque(true);
        Border blackLine = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackLine);



        setColorLabel.setBounds(495, 500, 170, 10);
        setColorLabel.setVisible(true);
        this.add(setColorLabel);

        blackButton.setBounds(495, 530, 30, 30);
        this.add(blackButton);

        whiteButton.setBounds(535, 530, 30, 30);
        this.add(whiteButton);

        brownButton.setBounds(575, 530, 30, 30);
        this.add(brownButton);

        redButton.setBounds(615, 530, 30, 30);
        this.add(redButton);

        orangeButton.setBounds(495, 570, 30, 30);
        this.add(orangeButton);

        yellowButton.setBounds(535, 570, 30, 30);
        this.add(yellowButton);

        greenButton.setBounds(575, 570, 30, 30);
        this.add(greenButton);

        blueButton.setBounds(615, 570, 30, 30);
        this.add(blueButton);

        instructions = new JTextArea(
                """
                        Key:
                         1) Click or click-drag mouse to paint
                         2) Press 1 or 2 to switch square or circle accordingly
                         3) Press 'c' to clear the canvas
                         4) Move a mouse wheel to change the size of a shape
                         5) Click any of the listed colors on the right to paint in any of them"""
        );
        instructions.setBackground(BACKGROUND_COLOR);
        instructions.setForeground(Color.BLACK);
        instructions.setBounds(MARGIN*2, 500, 380, 100);
        instructions.setEnabled(true);
        this.add(instructions);

        this.repaint();
    }
}
