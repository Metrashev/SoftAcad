package lessons.lesson17;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxLayoutAndBoxPanel extends JPanel {
	public BoxLayoutAndBoxPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JButton("Button 01"));
		
		Box hb = Box.createHorizontalBox();
		hb.setAlignmentX(Box.LEFT_ALIGNMENT);
		hb.add(new JButton("H Button 01"));
		hb.add(new JButton("H Button 02"));
		hb.add(new JButton("H Button 03"));
		hb.add(new JButton("H Button 04"));
		
		add(hb);
		add(new JButton("Button 02"));
		add(new JButton("Button 03"));
		add(new JButton("Button 04"));
	}

}
