package less.lesson15;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		
		
		panel.add(new JButton("JButton"));
		panel.add(new JCheckBox());
		panel.add(new JRadioButton());
		panel.add(new JTextField(10));
		panel.add(new JTextArea(3, 10));
		JTextArea jta = new JTextArea(3,  10);
		jta.setEditable(false);
		panel.add(jta);
		
		JButton b = new JButton("button");
		b.setEnabled(false);
		panel.add(b);
		
		JFileChooser jfc = new JFileChooser();
		panel.add(jfc);
		
		JColorChooser jcc = new JColorChooser();
		panel.add(jcc);
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
