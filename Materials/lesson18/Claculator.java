package less.lesson18;

import javax.swing.JFrame;

public class Claculator {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Calculator");
		jf.setSize(300, 400);
		jf.setLocation(1500, 50);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.add(new CalculatorPanel());
		
		jf.setVisible(true);
	}
}
