package lessons.lesson17;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutsDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click");
//		frame.add(button);
		JPanel panel = new JPanel();
		panel.add(button);
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
