import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Ex1 extends JFrame {
    public Ex1() {
        setSize(400,400);
        setLayout(new BorderLayout());
        setTitle("Border layout for JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100,100);;
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Font f = new Font("TimesRoman", Font.PLAIN, 24);


        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("North");
        panel1.add(label1);
//        panel1.setBackground(Color.red);
        panel1.setBorder(blackline);
        label1.setFont(f);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("<html> &nbsp E &nbsp <br> &nbsp A "
                + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
        panel2.add(label2);
//        panel2.setBackground(Color.green);
        panel2.setLayout(new GridBagLayout());
        panel2.setBorder(blackline);
        label2.setFont(f);


        JPanel panel3 = new JPanel();
        JLabel label3 = new JLabel("SOUTH");
        panel3.add(label3);
//        panel3.setBackground(Color.blue);
        panel3.setBorder(blackline);
        label3.setFont(f);


        JPanel panel4 = new JPanel();
        JLabel label4 = new JLabel("<html> &nbsp W &nbsp <br> &nbsp E "
                + "&nbsp <br>&nbsp S &nbsp<br> &nbsp T &nbsp </html>");
        panel4.add(label4);
//        panel4.setBackground(Color.magenta);
        panel4.setLayout(new GridBagLayout());
        panel4.setBorder(blackline);
        label4.setFont(f);


        JPanel panel5 = new JPanel();
        JLabel label5 = new JLabel("CENTER");
//        panel5.setBackground(Color.cyan);
        panel5.add(label5);
        panel5.setLayout(new GridBagLayout());
        panel5.setBorder(blackline);
        label5.setFont(f);


        panel1.setPreferredSize(new Dimension(50,50));
        panel2.setPreferredSize(new Dimension(100,50));
        panel3.setPreferredSize(new Dimension(50,50));
        panel4.setPreferredSize(new Dimension(100,50));
        panel5.setPreferredSize(new Dimension(50,50));

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(panel3, BorderLayout.SOUTH);
        this.add(panel4, BorderLayout.WEST);
        this.add(panel5, BorderLayout.CENTER);

    }
}
