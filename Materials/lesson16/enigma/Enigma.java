package lessons.lesson16.enigma;

import javax.swing.JFrame;

public class Enigma {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Enigma");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 300);
		frame.setLocation(1500, 50);
		
		frame.add(new EnigmaPanel());
		frame.setVisible(true);
	}
}
