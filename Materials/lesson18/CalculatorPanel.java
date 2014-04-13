  package less.lesson18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanel extends JPanel {
	private JTextArea display;
	private KeypadPanel keypad;
	private String fLine;
	private String sLine;
	public CalculatorPanel() {
		setLayout(new BorderLayout());
		display = new JTextArea(2, 1);
		display.setEditable(false);
		Font font = new Font(display.getFont().getName(), Font.PLAIN, 30);
		display.setFont(font);
		
		add(display, BorderLayout.NORTH);
		keypad = new KeypadPanel();
		addListeners();
		add(keypad, BorderLayout.CENTER);
		fLine = "";
		sLine = "";
	}
	
	private void addListeners() {
		JButton[] buttons = keypad.getDigitButtons();
		DigitButtonListener dbl = new DigitButtonListener();
		for (JButton jButton : buttons) {
			jButton.addActionListener(dbl);
		}
		
		buttons = keypad.getOpButtons();
		OpButtonListener obl = new OpButtonListener();
		for (JButton jButton : buttons) {
			jButton.addActionListener(obl);
		}
	}
	
	private void refreshDisplay() {
		display.setText(fLine + "\n" + sLine); 
	}
	
	private class DigitButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj instanceof JButton) {
				JButton button = (JButton) obj;
				String digit = button.getText();
				fLine += digit;
				refreshDisplay();
			}
		}
	}
	
	private class OpButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj instanceof JButton) {
				JButton button = (JButton) obj;
				char op = button.getText().charAt(0);
				switch (op) {
				case 'C':
					display.setText("");
					break;
				case '=':
					//...
					break;
				case '*':
					//...
					break;
				case '/':
					//...
					break;
				case '+':
					//...
					break;
				case '-':
					//...
					break;
				}
			}
			
		}
	}
}
