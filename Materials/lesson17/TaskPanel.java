package lessons.lesson17;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TaskPanel extends JPanel {
	public TaskPanel() {
		setLayout(new BorderLayout());
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		northPanel.add(new JLabel("Test border layoyt"));
		add(northPanel, BorderLayout.NORTH);
		add(new JTextArea(), BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
		southPanel.add(new JButton("Click"));
		add(southPanel, BorderLayout.SOUTH);
		
		JLabel spacer = new JLabel();
		spacer.setPreferredSize(new Dimension(200, 1));
		add(spacer, BorderLayout.WEST);
	}

}
