package lessons.lesson16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventPanel extends JPanel {
	private JButton button;
	private JLabel label;
	private JButton button2;
	
	public EventPanel() {
		button = new JButton("Do not click!");
		ButtonListener bl = new ButtonListener();
		//button.addActionListener(new ButtonListener());
		button.addActionListener(bl);
		add(button);
		
		label = new JLabel("");
		add(label);
		
		button2 = new JButton("Button 2");
//		button2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				buttonFunc();
//			}
//		});
		button2.addActionListener(bl);
		add(button2);
	}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			buttonFunc();
		}
	}
	
	private void buttonFunc() {
		String labelText = label.getText();
		if(labelText.length() == 0) {
			label.setText("bravo!");
			button.setText("Click!");
		} else {
			label.setText("");
			button.setText("Do not click!");
		}
	}
}
