import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CipherLab  extends JFrame implements ActionListener, KeyListener {
	
	private Mono mono;
	private JTextArea inputArea,outputArea;
	private JTextField keyword;
	private JButton encodeButton,decodeButton;
	
	public CipherLab() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,500);
		setupFrame();
		this.setVisible(true);
	}
	
	private void setupFrame() {
		/* 
		 * Main panel holds all the components
		 * Grid layout is a fast layout for making things 
		 * that don't look too terrible
		 * here we're saying there are 7 rows and 1 column
		 */
		JPanel mainPanel = new JPanel(new GridLayout(7,1));
		// User will type input text here
		inputArea = new JTextArea(3,200);
		// and output will appear here
		outputArea = new JTextArea(3,200);
		// user will enter keyword in here
		/*
		 * Keywords must be capitals and 
		 * not use any letter more than once
		 * they must also only use the letters A to Z
		 */
		keyword = new JTextField(20);
		mainPanel.add(new JLabel("Keyword (caps only)"));
		mainPanel.add(keyword);
		mainPanel.add(new JLabel("Input text:"));
		mainPanel.add(inputArea);
		mainPanel.add(new JLabel("Output text:"));
		mainPanel.add(outputArea);
		
		/*
		 * make the buttons - they will go in their own
		 * panel in the last grid component
		 * we need the panel to have two things in one place
		 */
		JPanel buttonPanel = new JPanel();
		mainPanel.add(buttonPanel);
		encodeButton = new JButton("Encode");
		decodeButton = new JButton("Decode");
		buttonPanel.add(encodeButton);
		buttonPanel.add(decodeButton);
		this.add(mainPanel,BorderLayout.CENTER);

		encodeButton.addActionListener(this);
		decodeButton.addActionListener(this);

		encodeButton.setEnabled(false);
		decodeButton.setEnabled(false);

		keyword.addKeyListener(this);
	}

	public static void main(String[] args) {
		new CipherLab();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String key = this.keyword.getText();
		if (e.getSource() == encodeButton) {
//			String key = this.keyword.getText();
			mono = new Mono(key);
			String inputText = this.inputArea.getText();
			String outputText = mono.encode(inputText);
			this.outputArea.setText(outputText);
		} else if (e.getSource() == decodeButton) {
//			String key = this.keyword.getText();
			mono = new Mono(key);
			// the previous output becomes the new input to be decoded
			String inputText = this.inputArea.getText();
			String outputText = mono.decode(inputText);
			this.outputArea.setText(outputText);

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		String key = keyword.getText();
		boolean isValidKey = Mono.checkKeyword(key);
		encodeButton.setEnabled(isValidKey);;
		decodeButton.setEnabled(isValidKey);;
	}
}
