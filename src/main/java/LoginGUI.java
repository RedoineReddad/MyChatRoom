import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginGUI {


    private JPanel LoginPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton cancelButton;
    private JButton loginButton;
    private JButton createANewAccountButton;
    private JButton button1;
    private JButton xButton;

    public LoginGUI() {

        JFrame frame = new JFrame("Login");
        frame.setLayout(new GridLayout());

        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(LoginPanel);
        frame.pack();
        frame.setVisible(true);

        xButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                ScreenContactGUI goContact = new ScreenContactGUI();
                goContact.setVisible(true);
                goContact.pack();
                goContact.setLocationRelativeTo(null);
                goContact.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
       /* createANewAccountButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                RegisterGUI goRegisterGUI = new RegisterGUI();
                goRegisterGUI.setVisible(true);
                goRegisterGUI.pack();
                goRegisterGUI.setLocationRelativeTo(null);
                goRegisterGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });*/
    }



    public static void main(String[] args) {
        new LoginGUI();
    }


}