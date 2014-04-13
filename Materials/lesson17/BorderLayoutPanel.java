package lessons.lesson17;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutPanel extends JPanel {
	public BorderLayoutPanel() {
		setLayout(new BorderLayout(5, 10));
		
		JButton north = new JButton("NORTH");
		JButton south = new JButton("SOUTH");
		JButton west = new JButton("WEST");
		JButton east = new JButton("EAST");
		JButton center = new JButton("CENTER");
		
		add(north, BorderLayout.NORTH);
		//add(south, BorderLayout.SOUTH);
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 0));
		southPanel.add(south);
		add(southPanel, BorderLayout.SOUTH);
		add(west, BorderLayout.WEST);
		add(west, BorderLayout.WEST);
		add(east, BorderLayout.EAST);
		//add(center, BorderLayout.CENTER);
		JPanel panel =  new JPanel();
		panel.add(center);
		add(panel, BorderLayout.CENTER);
	}
}
