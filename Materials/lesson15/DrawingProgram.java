package less.lesson15;

import javax.swing.JFrame;

public class DrawingProgram {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Drawer");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawingPanel dp = new DrawingPanel();
		frame.add(dp);
		
		frame.setVisible(true);
	}
}
