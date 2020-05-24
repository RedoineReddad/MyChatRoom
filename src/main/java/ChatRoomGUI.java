import javax.swing.*;
import java.awt.*;

public class ChatRoomGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel ecrirePanel;
    private JLabel MessageLabel;
    private JEditorPane editorPanel;
    private JButton sendButton;
    private JPanel topPanel;
    private JTextField searchPanel;
    private JButton searchButton;

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

    }

    public static void main(String[] args){
        new ChatRoomGUI();
    }
}
