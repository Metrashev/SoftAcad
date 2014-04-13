package less.lesson17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayoutPanel extends JPanel {
	public GridLayoutPanel() {
		setLayout(new GridLayout(3, 2, 5, 10));
		
		add(new JButton("Button 01"));
		add(new JButton("Button 02"));
//		add(new JButton("Button 03"));
		JPanel panel = new JPanel();
		panel.add(new JButton("Button 03"));
		add(panel);
		
		//add(new JButton("Button 04"));
		add(new JLabel());
		add(new JButton("Button 05"));
		add(new JButton("Button 06"));
//		add(new JButton("Button 07"));
//		add(new JButton("Button 07"));
//		add(new JButton("Button 07"));
//		add(new JButton("Button 07"));
	}
}
