package client.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginGUI {


    private JPanel LoginPanel;
    private JTextField usernameTextField;
    private JButton cancelButton;
    private JButton loginButton;
    private JButton createANewAccountButton;
    private JButton button1;
    private JButton xButton;
    private JPasswordField passwordPasswordField;
    private JCheckBox showPassCheckBox;

    public LoginGUI() {

        JFrame frame = new JFrame("Login");
        frame.setLayout(new GridLayout());

        frame.setMinimumSize(new Dimension(500, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(LoginPanel);
        frame.pack();
        frame.setVisible(true);

        //action sur les bouttons
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
                frame.setExtendedState(JFrame.ICONIFIED);
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

        createANewAccountButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                RegisterGUI goRegister = new RegisterGUI();
                goRegister.setVisible(true);
                goRegister.pack();
                goRegister.setLocationRelativeTo(null);
                goRegister.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        usernameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e); //disparition du texte username et apparition du nouveau texte
                if (usernameTextField.getText().trim().toLowerCase().equals("username")){
                    usernameTextField.setText(" ");
                    usernameTextField.setForeground(Color.black);
                }
            }
        });

        usernameTextField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e); //réapparition du text username
                if (usernameTextField.getText().trim().equals("") || usernameTextField.getText().trim().toLowerCase().equals("username")){
                    usernameTextField.setText("username");
                    usernameTextField.setForeground(new Color(153,153,153));
                }

            }
        });

        passwordPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e); //disparition du text password et apparition du nouveau text
                if (passwordPasswordField.getText().trim().toLowerCase().equals("password")){
                    passwordPasswordField.setText(" ");
                    passwordPasswordField.setForeground(Color.black);
                }
            }
        });
        passwordPasswordField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e); //réaparition du text password
                if(passwordPasswordField.getText().trim().equals("") || passwordPasswordField.getText().trim().toLowerCase().equals("password")){
                    passwordPasswordField.setText("password");
                    passwordPasswordField.setForeground(new Color(153,153,153));
                }
            }
        });
        //changement des couleurs des bouttons
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                loginButton.setBackground(new Color(0,101,183));
            }
        });

        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                loginButton.setBackground(new Color(0,84,104));
            }
        });

        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                cancelButton.setBackground(new Color(207,0,15));
            }
        });

        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                cancelButton.setBackground(new Color(240,52,52));

            }
        });

        xButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                xButton.setBackground(new Color(207,0,15));
            }
        });

        xButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                xButton.setBackground(new Color(240,52,52));
            }
        });

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button1.setBackground(new Color(0,101,183));
            }
        });

        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button1.setBackground(new Color(0,84,104));
            }
        });

        createANewAccountButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                createANewAccountButton.setBackground(new Color(103,128,159));
            }
        });

        createANewAccountButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                createANewAccountButton.setBackground(new Color(46,49,49));
            }
        });
        /*loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PreparedStatement stmt;
                ResultSet rs;

                //cherche le username & password

                String username = usernameTextField.getText();
                String password = String.valueOf(passwordTextField);

                //création de la clefs si user & password sont dans data base

                String query = "SELECT * FROM 'users' WHERE 'username' = ? AND 'password' = ?";



            }
        });*/
        showPassCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPassCheckBox.isSelected()){
                    passwordPasswordField.setEchoChar((char)0);
                }else {
                    passwordPasswordField.setEchoChar('*');
                }
            }
        });
    }

    public static void main(String[] args) {
        new LoginGUI();
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