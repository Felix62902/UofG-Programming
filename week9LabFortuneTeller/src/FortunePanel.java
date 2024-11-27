import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class FortunePanel extends JPanel implements ActionListener {
	
	private JButton button1;
	private JTextField text;
	private ArrayList<String> fortunes;
	
	public FortunePanel() {
		this.setLayout(new BorderLayout(0,5));

		// Button1 Configuration
		button1 = new JButton("Tell me my fortune!");
		button1.setBackground(Color.WHITE);
		button1.setBorder(BorderFactory.createLineBorder(Color.blue,3,true));
		button1.setFocusPainted(false);
		button1.setFont(new Font("Arial", Font.PLAIN, 20));
		button1.addActionListener(this);
		button1.setBackground(Color.ORANGE);

		text = new JTextField();

		this.add(button1, BorderLayout.CENTER);
		this.add(text, BorderLayout.SOUTH);
	}

	public void setFortunes(ArrayList<String> fortunes){
		this.fortunes = fortunes;
	}
	
	public void updateText(String s){
		text.setText(s);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1 && !fortunes.isEmpty() && fortunes != null){
			Random rand = new Random();
			int fortNo = rand.nextInt(fortunes.size());
			updateText(fortunes.get(fortNo));
		}
	}
}
