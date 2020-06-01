import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenContactGUI {

    private JPanel mainPanel;
    private JPanel iconPanel;
    private JPanel contactPanel;
    private JTextField searchContactField;
    private JButton searchButton;
    private JPanel listeContactPanel;
    private JButton julienButton;
    private JButton fredButton;
    private JButton jamyButton;
    private JButton daphnéButton;
    private JButton filippoButton;
    private JButton angeloButton;
    private JButton marieButton;
    private JButton davidButton;
    private JButton redoineButton;
    private JButton valérianButton;
    private JButton jBButton;
    private JButton martinButton;
    private JButton lolaButton;
    private JButton jingyangButton;
    private JButton eliseButton;

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


        jBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jBButtonText = jBButton.getText();
                searchContactField.setText(jBButtonText);
            }
        });

        daphnéButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String daphnéButtonText = daphnéButton.getText();
                searchContactField.setText(daphnéButtonText);
            }
        });

        filippoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filippoBottonText = filippoButton.getText();
                searchContactField.setText(filippoBottonText);
            }
        });

        redoineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String redoineBottonText = redoineButton.getText();
                searchContactField.setText(redoineBottonText);
            }
        });

        julienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String julienBottonText = julienButton.getText();
                searchContactField.setText(julienBottonText);
            }
        });

        martinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String martinBottonText = martinButton.getText();
                searchContactField.setText(martinBottonText);
            }
        });

        valérianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valérianBottonText = valérianButton.getText();
                searchContactField.setText(valérianBottonText);
            }
        });

        jingyangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jingyangBottonText = jingyangButton.getText();
                searchContactField.setText(jingyangBottonText);
            }
        });

        lolaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lolaBottonText = lolaButton.getText();
                searchContactField.setText(lolaBottonText);
            }
        });

        angeloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angeloBottonText = angeloButton.getText();
                searchContactField.setText(angeloBottonText);
            }
        });

        marieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marieBottonText = marieButton.getText();
                searchContactField.setText(marieBottonText);
            }
        });

        fredButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fredBottonText = fredButton.getText();
                searchContactField.setText(fredBottonText);
            }
        });

        jamyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jamyBottonText = jamyButton.getText();
                searchContactField.setText(jamyBottonText);
            }
        });

        davidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String davidBottonText = davidButton.getText();
                searchContactField.setText(davidBottonText);
            }
        });

        eliseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eliseBottonText = eliseButton.getText();
                searchContactField.setText(eliseBottonText);
            }
        });
    }

    public static void main(String[] args) {
        new ScreenContactGUI();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        julienButton = new JButton(new ImageIcon("perso.png"));
        fredButton = new JButton(new ImageIcon("perso.png"));
        jamyButton = new JButton(new ImageIcon("perso.png"));
        daphnéButton = new JButton(new ImageIcon("perso.png"));
        filippoButton = new JButton(new ImageIcon("perso.png"));
        angeloButton = new JButton(new ImageIcon("perso.png"));
        marieButton = new JButton(new ImageIcon("perso.png"));
        davidButton = new JButton(new ImageIcon("perso.png"));
        redoineButton = new JButton(new ImageIcon("perso.png"));
        valérianButton = new JButton(new ImageIcon("perso.png"));
        jBButton = new JButton(new ImageIcon("perso.png"));
        martinButton = new JButton(new ImageIcon("perso.png"));
        lolaButton = new JButton(new ImageIcon("perso.png"));
        jingyangButton = new JButton(new ImageIcon("perso.png"));
        eliseButton = new JButton(new ImageIcon("perso.png"));

    }
}
