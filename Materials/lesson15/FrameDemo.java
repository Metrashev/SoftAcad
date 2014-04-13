package less.lesson15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TITLE HERE");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.add(new JButton("Click me"));
		panel.add(new JTextField(10));
		panel.add(new JRadioButton("123"));
		
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
