import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame {
    private JButton button1, button2;
    private JTextField textField1;
    private JLabel label1;

    public ButtonFrame(){
        this.setSize(350,150);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle(("JFrame with some components"));

        button1 = new JButton("Ok");
        button2 = new JButton("Quit");
        textField1 = new JTextField("initial Text", 15);
        label1 = new JLabel("Click a button");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(button1);
        panel.add(button2);
        panel.add(textField1);

        this.add(panel);
    }
}
