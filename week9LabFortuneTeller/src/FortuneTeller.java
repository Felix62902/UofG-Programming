import javax.swing.JFrame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FortuneTeller extends JFrame {
	
	private FortunePanel mainPanel;

	public FortuneTeller() {
		setSize(300,300);
		setLocation(20,20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new FortunePanel();
		add(mainPanel);
	}

	public static void main(String[] args) {
		FortuneTeller gui =  new FortuneTeller();
		gui.setVisible(true);

		ArrayList<String> fortunes = readFile();
		// random generator, based ona arraylist size, random based on array list index
		gui.mainPanel.setFortunes(fortunes);
		// random selecting logic will be carried out in the FortunePanel
	}

	public static ArrayList<String> readFile(){
		FileReader fr = null;
		Scanner s;
		ArrayList<String> fortunes = new ArrayList<>();
		try {
			fr = new FileReader("C:\\Users\\User\\Program Hub\\Java Projects\\UofG-Programming\\week9LabFortuneTeller\\src\\fortunes");
			s = new Scanner(fr);
			while(s.hasNextLine()){
				fortunes.add(s.nextLine());
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		return fortunes;
	}

}
