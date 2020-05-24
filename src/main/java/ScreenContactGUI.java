import javax.swing.*;
import java.awt.*;

public class ScreenContactGUI {

    private JPanel mainPanel;
    private JPanel iconPanel;
    private JPanel contactPanel;
    private JTextField searchContactField;
    private JButton searchButton;
    private JPanel listeContactPanel;

    public ScreenContactGUI() {
        JFrame frame = new JFrame("Chat Room");
        frame.setLayout(new GridLayout());


        listeContactPanel = new JPanel(new GridLayout(10, 10));

        frame.add(listeContactPanel);
        frame.setMinimumSize(new Dimension(1040, 780));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ScreenContactGUI();
    }
}
