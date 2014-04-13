package lessons.lesson16;

import javax.swing.JFrame;

public class EventDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EventPanel ep = new EventPanel();
		frame.add(ep);
		frame.setVisible(true);
	}
}
