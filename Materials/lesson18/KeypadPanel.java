package less.lesson18;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KeypadPanel extends JPanel {
	private static final int GAP = 5;
	private final JButton[] digitButtons;
	private final JButton[] opButtons;
	public KeypadPanel() {
		setLayout(new GridLayout(4, 4, GAP, GAP));
		digitButtons = new JButton[10];
		opButtons = new JButton[6];
		Font font;
		
		opButtons[0] = new JButton("+");
		opButtons[1] = new JButton("-");
		opButtons[2] = new JButton("*");
		opButtons[3] = new JButton("/");
		opButtons[4] = new JButton("=");
		opButtons[5] = new JButton("C");
		font = new Font(opButtons[0].getFont().getName(), Font.BOLD, 30);
		for(int i=0; i<opButtons.length; i++) {
			opButtons[i].setFont(font);
		}

		for(int i=0; i<digitButtons.length; i++) {
			digitButtons[i] = new JButton("" + i);
			digitButtons[i].setFont(font);
		}
		
		
		add(digitButtons[7]);
		add(digitButtons[8]);
		add(digitButtons[9]);
		add(opButtons[0]);
		
		add(digitButtons[4]);
		add(digitButtons[5]);
		add(digitButtons[6]);
		add(opButtons[1]);
		
		add(digitButtons[1]);
		add(digitButtons[2]);
		add(digitButtons[3]);
		add(opButtons[2]);
		
		add(digitButtons[0]);
		add(opButtons[5]);
		add(opButtons[4]);
		add(opButtons[3]);
	}
	
	public JButton[] getOpButtons() {
		return opButtons;
	}
	
	public JButton[] getDigitButtons() {
		return digitButtons;
	}
}
