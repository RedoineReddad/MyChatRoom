package client.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterGUI {
    private JPanel mainPanel;
    private JButton returnButton;
    private JButton addButton;
    private JTextField first_nameTextField;
    private JTextField passwordTextField1;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JTextField mailTextField;
    private JButton Closebutton;
    private JButton SizeButton;

    public RegisterGUI() {

        JFrame frame = new JFrame("Chat Room");
        frame.setLayout(new GridLayout());

        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);

        //action sur les bouttons
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

        Closebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        SizeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                frame.setExtendedState(JFrame.ICONIFIED);
            }
        });
        //couleurs bouttons
        Closebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Closebutton.setBackground(new Color(207,0,15));
            }
        });
        Closebutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                Closebutton.setBackground(new Color(240,52,52));
            }
        });
        SizeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                SizeButton.setBackground(new Color(0,101,183));
            }
        });
        SizeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                SizeButton.setBackground(new Color(0,84,104));
            }
        });
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                addButton.setBackground(new Color(0,101,183));
            }
        });
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                addButton.setBackground(new Color(0,84,104));
            }
        });
        returnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                returnButton.setBackground(new Color(207,0,15));
            }
        });
        returnButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                returnButton.setBackground(new Color(240,52,52));
            }
        });
        //apparition et disparition du text
        first_nameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (first_nameTextField.getText().trim().toLowerCase().equals("first_name")){
                    first_nameTextField.setText(" ");
                    first_nameTextField.setForeground(Color.black);
                }
            }
        });
        first_nameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (first_nameTextField.getText().trim().equals("") || first_nameTextField.getText().trim().toLowerCase().equals("firs_name")){
                    first_nameTextField.setText("first_name");
                    first_nameTextField.setForeground(new Color(153,153,153));
                }
            }
        });
        usernameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (usernameTextField.getText().trim().toLowerCase().equals("username")){
                    usernameTextField.setText(" ");
                    usernameTextField.setForeground(Color.black);
                }
            }
        });
        usernameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (usernameTextField.getText().trim().equals("") || usernameTextField.getText().trim().toLowerCase().equals("username")){
                    usernameTextField.setText("username");
                    usernameTextField.setForeground(new Color(153,153,153));
                }
            }
        });
        mailTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (mailTextField.getText().trim().toLowerCase().equals("mail")){
                    mailTextField.setText(" ");
                    mailTextField.setForeground(Color.black);
                }
            }
        });
        mailTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (mailTextField.getText().trim().equals("") || mailTextField.getText().trim().toLowerCase().equals("mail")){
                    mailTextField.setText("mail");
                    mailTextField.setForeground(new Color(153,153,153));
                }
            }
        });
        passwordTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (passwordTextField.getText().trim().toLowerCase().equals("password")){
                    passwordTextField.setText(" ");
                    passwordTextField.setForeground(Color.black);
                }
            }
        });
        passwordTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (passwordTextField.getText().trim().equals("") || passwordTextField.getText().trim().toLowerCase().equals("password")){
                    passwordTextField.setText("password");
                    passwordTextField.setForeground(new Color(153,153,153));
                }
            }
        });
        passwordTextField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (passwordTextField1.getText().trim().toLowerCase().equals("password")){
                    passwordTextField1.setText(" ");
                    passwordTextField1.setForeground(Color.black);
                }
            }
        });
        passwordTextField1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (passwordTextField1.getText().trim().equals("") || passwordTextField1.getText().trim().toLowerCase().equals("password")){
                    passwordTextField1.setText("password");
                    passwordTextField1.setForeground(new Color(153,153,153));
                }
            }
        });
    }

    public static void main(String[] args) {
        new RegisterGUI();
    }

    public void pack() {
    }

    public void setLocationRelativeTo(Object o) {
    }

    public void setVisible(boolean b) {
    }

    public void setDefaultCloseOperation(int exitOnClose) {
    }
}
