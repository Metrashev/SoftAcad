package lessons.lesson17;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxLayoutPanel extends JPanel {
	public BoxLayoutPanel() {
		//setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JButton("Button 01"));
		add(new JButton("Button 02"));
		add(new JButton("Button 03"));
		add(new JButton("Button 04"));
		add(new JButton("a4wyetrdjysersyyjdyteysd"));
	}
}
