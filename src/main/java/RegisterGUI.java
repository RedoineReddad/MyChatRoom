import javax.swing.*;
import java.awt.*;

public class RegisterGUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton sendButton;
    private JLabel profil1;
    private JLabel profil2;
    private JLabel profil3;

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

    private void createUIComponents() {
        // TODO: place custom component creation code here
        profil1 = new JLabel(new ImageIcon("perso.png"));
        profil2 = new JLabel(new ImageIcon("perso.png"));
        profil3 = new JLabel(new ImageIcon("perso.png"));
    }
}
