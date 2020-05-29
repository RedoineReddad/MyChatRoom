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
    private JButton fredButton;
    private JButton jamyButton;
    private JButton davidButton;
    private JButton marieButton;
    private JButton angeloButton;
    private JButton jingyangButton;
    private JButton redoineButton;
    private JButton martinButton;
    private JButton lolaButton;
    private JButton eliseButton;
    private JButton valérianButton;
    private JButton filippoButton;
    private JButton antoineButton;
    private JButton julienButton;
    private JButton julieButton;

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

    private void createUIComponents() {
        // TODO: place custom component creation code here
        julieButton = new JButton(new ImageIcon("perso.png"));
        filippoButton = new JButton(new ImageIcon("perso.png"));
        martinButton = new JButton(new ImageIcon("perso.png"));
        jingyangButton = new JButton(new ImageIcon("perso.png"));
        valérianButton = new JButton(new ImageIcon("perso.png"));
        lolaButton = new JButton(new ImageIcon("perso.png"));
        angeloButton = new JButton(new ImageIcon("perso.png"));
        antoineButton = new JButton(new ImageIcon("perso.png"));
        redoineButton = new JButton(new ImageIcon("perso.png"));
        jamyButton = new JButton(new ImageIcon("perso.png"));
        marieButton = new JButton(new ImageIcon("perso.png"));
        julienButton = new JButton(new ImageIcon("perso.png"));
        eliseButton = new JButton(new ImageIcon("perso.png"));
        fredButton = new JButton(new ImageIcon("perso.png"));
        jamyButton = new JButton(new ImageIcon("perso.png"));

    }
}
