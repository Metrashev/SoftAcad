package less.lesson15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Task01 {
	public static void main(String[] args) {
		int w = 800;
		int h = 600;
		int side = 100;
		
		String result = JOptionPane.showInputDialog("Enter W");
		w = Integer.parseInt(result);
		result = JOptionPane.showInputDialog("Enter H");
		h = Integer.parseInt(result);
		result = JOptionPane.showInputDialog("Enter side");
		side = Integer.parseInt(result);
		
		JFrame frame = new JFrame("Triangle panel");
		frame.setSize(w, h);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TrianglePanel tp = new TrianglePanel(side);
		frame.add(tp);
		
		frame.setVisible(true);
	}
}
