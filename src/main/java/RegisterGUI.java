import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterGUI {
    private JPanel mainPanel;
    private JButton returnButton;
    private JButton addButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton xButton;

    public RegisterGUI() {

        JFrame frame = new JFrame("Chat Room");
        frame.setLayout(new GridLayout());

        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
        xButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                this.setSate(JFrame.ICONIFIED);
            }

            private void setSate(int iconified) {
            }
        });
        returnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                LoginGUI goLogin = new LoginGUI();
                goLogin.setVisible(true);
                goLogin.pack();
                goLogin.setLocationRelativeTo(null);
                goLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ScreenContactGUI goScreen = new ScreenContactGUI();
                goScreen.setVisible(true);
                goScreen.pack();
                goScreen.setLocationRelativeTo(null);
                goScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    public static void main(String[] args) {
        new RegisterGUI();
    }


    public void setVisible(boolean b) {
    }

    public void pack() {
    }

    public void setLocationRelativeTo(Object o) {
    }

    public void setDefaultCloseOperation(int exitOnClose) {
    }
}
