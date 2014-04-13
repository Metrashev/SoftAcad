package lessons.lesson16.enigma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EnigmaPanel extends JPanel {
	private static final String[] encDecValues = {"Encrypt", "Decrypt"};
	private static final String encDecLabelStart = "Text to ";
	
	private JComboBox encDecCombo;
	private JLabel encDecLabel;
	private JTextField encDecField;
	private JButton encDecButton;
	private JButton clearButton;
	private JTextArea display;
	private JLabel infoLabel;
	
	public EnigmaPanel() {
		encDecCombo = new JComboBox(encDecValues);
		encDecCombo.addActionListener(new ComboListener());
		add(encDecCombo);
		
		encDecLabel = new JLabel(encDecLabelStart + encDecValues[0].toLowerCase());
		add(encDecLabel);
		
		encDecField = new JTextField(12);
		add(encDecField);
		
		encDecButton = new JButton(encDecValues[0]);
		add(encDecButton);
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ClearButtonListener());
		add(clearButton);
		
		display = new JTextArea(10, 20);
		display.setEditable(false);
		add(display);
		
		infoLabel = new JLabel("Info center");
		add(infoLabel);
	}
	
	private class ComboListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int index = encDecCombo.getSelectedIndex();
			
			encDecLabel.setText(encDecLabelStart + encDecValues[index].toLowerCase());
			encDecButton.setText(encDecValues[index]);
		}
	}
	
	private class ClearButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			encDecField.setText("");
			display.setText("");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
