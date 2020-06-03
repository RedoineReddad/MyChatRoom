package client.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChatRoomGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel ecrirePanel;
    private JLabel MessageLabel;
    private JButton sendButton;
    private JPanel topPanel;
    private JButton searchButton;
    private JLabel logo;
    private JTextArea textArea1;
    private JLabel label1;


    public ChatRoomGUI(){

        JFrame frame = new JFrame("Chat Room");
        frame.setLayout(new GridLayout());

        ecrirePanel = new JPanel(new  GridLayout(2,2));

        frame.add(ecrirePanel, BorderLayout.SOUTH);
        frame.setMinimumSize(new Dimension(1040,780));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);

        searchButton.addMouseListener(new MouseAdapter() {
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
    }

    public static void main(String[] args){
        new ChatRoomGUI();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        label1 = new JLabel(new ImageIcon("/Image/background.jpg"));
        logo = new JLabel(new ImageIcon("/Image/logo.jpg"));
    }
}

