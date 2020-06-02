import javax.swing.*;
import java.awt.*;

public class RegisterGUI {
    private JPanel mainPanel;

    public RegisterGUI() {

        JFrame frame = new JFrame("Chat Room");
        frame.setLayout(new GridLayout());

        frame.setMinimumSize(new Dimension(1040, 780));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new RegisterGUI();
    }


}
