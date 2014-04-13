package lessons.lesson17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutPanel extends JPanel {
	public FlowLayoutPanel() {
//		setLayout(new FlowLayout(FlowLayout.RIGHT));
		//setLayout(new FlowLayout(FlowLayout.LEFT));
//		setLayout(new FlowLayout(FlowLayout.LEFT, 15, 30));
		setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		add(new JTextField(7));
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("ok"));
	}
}
